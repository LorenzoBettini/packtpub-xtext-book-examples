package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.lib.SmallJavaLib
import org.example.smalljava.smallJava.SJClass
import org.example.smalljava.smallJava.SJProgram
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaLibTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper

	@Inject extension SmallJavaLib
	
	@Test def void testLib() {
		'''
		import smalljava.lang.*;
		class C extends Object {
			String s;
		}
		'''.loadLibAndParse.assertNoErrors
	}

	@Test def void testImplicitImports() {
		'''
		class C extends Object {
			String s;
			Object m(Object o) { return o.toString(); }
		}
		'''.loadLibAndParse.assertNoErrors
	}

	@Test def void testSmallJavaObjectClass() {
		val C = '''class C {}'''.loadLibAndParse
		C.getSmallJavaObjectClass.assertNotNull
	}

	@Test def void testImplicitExtendObject() {
		'''
		class C {
			Object m(Object o) { return this.toString(); }
		}
		'''.loadLibAndParse.assertNoErrors
	}

	@Test def void testClassHierarchyWithObject() {
		'''
		class A { }
		class B extends A { }
		class C extends Object { }
		class D extends C { }
		'''.loadLibAndParse => [
			assertNoErrors
			classes => [
				get(0).assertHierarchyWithObject("Object")
				get(1).assertHierarchyWithObject("A, Object")
				get(3).assertHierarchyWithObject("C, Object")
			]
		]
	}

	@Test def void testSuperclassOrObject() {
		'''
		class A { }
		class B extends A { }
		class C extends Object { }
		class D extends C { }
		'''.loadLibAndParse => [
			assertNoErrors
			classes => [
				val objClass = head.getSmallJavaObjectClass
				objClass.assertNotNull
			
				objClass.assertSame(get(0).getSuperclassOrObject)
				get(0).assertSame(get(1).getSuperclassOrObject)
				objClass.assertSame(get(2).getSuperclassOrObject)
			]
		]
	}

	@Test
	def void testAccessToSuperWithImplicitExtendsObject() {
		'''
		class A {
			String toString() {
				return super.toString();
			}
		}
		'''.loadLibAndParse.assertNoErrors
	}
	
	@Test def void testLibHasNoError() {
		loadLibrary
	}
	
	def private loadLibAndParse(CharSequence p) {
		p.parse(loadLibrary)
	}
	
	def private loadLibrary() {
		loadLib => [
			resources.forEach [
				contents.get(0).assertNoErrors
			]
		]
	}

	def private assertHierarchyWithObject(SJClass c, CharSequence expected) {
		expected.toString.assertEquals(
			c.getClassHierarchyWithObject.map[name].join(", "))
	}

}