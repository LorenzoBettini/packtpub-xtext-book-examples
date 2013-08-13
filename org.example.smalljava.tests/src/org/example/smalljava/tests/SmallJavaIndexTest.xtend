package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.scoping.SmallJavaIndex
import org.example.smalljava.smallJava.SJProgram
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaIndexTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension SmallJavaIndex
	
	@Test def void testClass() {
		'''class C { }'''.parse.
			classes.get(0).assertDescriptions("C")
	}

	@Test def void testFieldsAndMethods() {
		'''
		class C { 
			C c;
			C m() { return null; }
		}'''.parse.classes.head.members => [
			// fields and methods are not in the index anymore
			// since we changed the resource description strategy
			// in SmallJavaResoureDescriptionsStrategy
			get(0).assertDescriptions("")
			get(1).assertDescriptions("")
		]
	}

	@Test def void testPackage() {
		'''
		package my.pack;
		
		class C { 
			C c;
			C m() { return null; }
		}'''.parse.classes.head.assertDescriptions("my.pack.C")
	}

	@Test def void testMultipleFiles() {
		val first = '''
		package my.first.pack;
		
		class C { 
			C c;
			C m() { return null; }
		}'''.parse
		
		'''
		package my.second.pack;
		class D { }
		'''.parse(first.eResource.resourceSet).
		classes.get(0).assertDescriptions("my.first.pack.C,my.second.pack.D")
	}

	@Test def void testExportedEObjectDescriptions() {
		'''
		class C {
			A f;
			A m(A p) {
				A v = null;
				return null;
			}
		}
		class A {}
		'''.parse.assertExportedEObjectDescriptions
		("C, A")
		// before the custom implementation of DefaultResourceDescriptionStrategy
		// it was "C, C.f, C.m, C.m.p, C.m.v, A"
	}


	@Test def void testAllDescriptionsInFiles() {
		val first = '''
		package my.first.pack;
		
		class C { 
			C c;
			C m() { return null; }
		}'''.parse
		
		'''
		package my.second.pack;
		class D { }
		'''.parse(first.eResource.resourceSet).
		classes.get(0)
		.assertAllDescriptions("my.first.pack.C,my.second.pack.D")
		// before the custom implementation of DefaultResourceDescriptionStrategy
		// it was "my.first.pack,my.first.pack.C,my.first.pack.C.c,my.first.pack.C.m,my.second.pack,my.second.pack.D"
	}

	@Test def void testClassesInIndex() {
		val first = '''
		package my.first.pack;
		class C { }'''.parse
		
		'''
		package my.second.pack;
		class D { }
		'''.parse(first.eResource.resourceSet).
		classes.get(0).assertClassesInIndex("my.first.pack.C,my.second.pack.D")
	}

	def private assertDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(o.eObjectDescriptions)
	}

	def private eObjectDescriptions(EObject o) {
		o.assertNoErrors
		o.getVisibleEObjectDescriptions(o.eClass).
			map[qualifiedName].join(",")
	}

	def private assertAllDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(o.eObjectAllDescriptions)
	}

	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		expected.toString.assertEquals(
			o.exportedEObjectDescriptions.map[qualifiedName].join(", ")
		)
	}

	def private eObjectAllDescriptions(EObject o) {
		o.assertNoErrors
		o.getVisibleEObjectDescriptions.
			map[qualifiedName].join(",")
	}

	def private assertClassesInIndex(EObject o, String expected) {
		o.assertNoErrors
		expected.assertEquals(o.getVisibleClassesDescriptions.
			map[it.qualifiedName].join(","))
	}
}