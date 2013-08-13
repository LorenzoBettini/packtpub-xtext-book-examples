package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.example.expressions.ExpressionsInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsGeneratorTest {
	
	@Inject extension CompilationTestHelper

	@Test def void testEvaluateExpressions() {
		'''
i = 0

j = (i >0 && (1) < (i+1))

j || true

(1 + 10) < (2 * (3 + 5))

(1 + 10) < (2 / (3 * 2))
		'''.assertCompilesTo(
'''
i = 0 ~> 0
j = (i >0 && (1) < (i+1)) ~> false
j || true ~> true
(1 + 10) < (2 * (3 + 5)) ~> true
(1 + 10) < (2 / (3 * 2)) ~> false'''			
		)
	}

}