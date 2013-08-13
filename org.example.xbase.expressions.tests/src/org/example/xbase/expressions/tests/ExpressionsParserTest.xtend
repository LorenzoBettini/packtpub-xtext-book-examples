package org.example.xbase.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.xbase.expressions.ExpressionsInjectorProvider
import org.example.xbase.expressions.expressions.ExpressionsModel
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsParserTest {
	
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testSimpleExpression() {
		'''println(10)'''.parse.assertNoErrors
	}
	
	@Test
	def void testVariableExpressions() {
		'''
		val i = 10
		val j = i + 1
		val b = (i > j)
		'''.parse.assertNoErrors
	}

}
