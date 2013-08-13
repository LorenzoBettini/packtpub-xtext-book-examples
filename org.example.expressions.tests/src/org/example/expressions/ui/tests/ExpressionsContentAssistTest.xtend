package org.example.expressions.ui.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.example.expressions.ExpressionsUiInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsUiInjectorProvider))
class ExpressionsContentAssistTest extends AbstractContentAssistTest {

	@Test
	def void testVariableReference() {
		newBuilder.append("i = 10 1+").
			assertText('!', '"Value"', '(', '+', '1', 'false', 'i', 'true')
	}

	@Test
	def void testForwardVariableReference() {
		newBuilder.append(" i = 10 ").
			assertTextAtCursorPosition(" ",
			'!', '"Value"', '(', '1', 'Name', 'false', 'true')
		// i must not be present in proposals, before its definition
	}

	@Test
	def void testForwardVariableReference2() {
		newBuilder.append("k= 0 j=1 1+  i = 10 ").
			//                        ^
			assertTextAtCursorPosition("+", 1,
			'!', '"Value"', '(', '+', '1', 'false', 'j', 'k', 'true')
		// i must not be present in proposals, before its definition
		// but j and k must be there
	}

}