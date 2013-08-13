package org.example.smalljava.ui.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.junit.Test
import org.junit.runner.RunWith
import org.example.smalljava.SmallJavaUiInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaUiInjectorProvider))
class SmallJavaContentAssistTest extends AbstractContentAssistTest {

	@Test
	def void testMembers() {
		newBuilder.append(
		'''
		class A {
			A f;
			A m() { return null; }
			A n() { this. '''
		).assertText('f', 'm', 'n')
	}

	@Test
	def void testProtectedMembers() {
		newBuilder.append(
		'''
		class A1 {
			private A1 priv;
			protected A1 prot;
			public A1 pub;
			
			private A1 privM() { return null; }
			protected A1 protM() { return null; }
			public A1 pubM() { return null; }
		}
		
		class B1 extends A1 {
			A1 n() { new A1(). '''
		).assertText('prot', 'pub', 'protM', 'pubM')
	}

	@Test
	def void testPrivateMembers() {
		newBuilder.append(
		'''
		class A1 {
			private A1 priv;
			protected A1 prot;
			public A1 pub;
			
			private A1 privM() { return null; }
			protected A1 protM() { return null; }
			public A1 pubM() { return null; }
		}
		
		class B1 {
			A1 n() { new A1(). '''
		).assertText('pub', 'pubM')
	}

}