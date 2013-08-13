package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJProgram
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaQualifiedNameTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension IQualifiedNameProvider
	
	@Test def testClass() {
		'''class C { }'''.parse.
			classes.head.assertQualifiedName("C")
	}

	@Test def testField() {
		'''
		class D {}
		class C { D c; }'''.parse.
			classes.get(1).members.head.assertQualifiedName("C.c")
	}

	@Test def testMethod() {
		'''
		class D {}
		class C { D m() {return null;} }'''.parse.
			classes.get(1).members.head.assertQualifiedName("C.m")
	}

	@Test def testFieldWithPackage() {
		'''
		package my.pack;
		class D {}
		class C { D c; }'''.parse.
			classes.get(1).members.head.assertQualifiedName("my.pack.C.c")
	}

	def private assertQualifiedName(EObject o, String expected) {
		o.assertNoErrors
		expected.assertEquals(o.fullyQualifiedName.toString)
	}
}