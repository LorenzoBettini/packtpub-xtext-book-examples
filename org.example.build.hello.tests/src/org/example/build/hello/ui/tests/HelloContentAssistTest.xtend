package org.example.build.hello.ui.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.junit.Test
import org.junit.runner.RunWith
import org.example.build.hello.HelloUiInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloUiInjectorProvider))
class HelloContentAssistTest extends AbstractContentAssistTest {

	@Test
	def void testEmptyProgram() {
		newBuilder.append("").
			assertText('Hello')
	}

	@Test
	def void testAfterName() {
		newBuilder.append("Hello test ").
			assertText('!')
	}

}