package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.example.expressions.ExpressionsInjectorProvider
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.typing.ExpressionsType
import org.example.expressions.typing.ExpressionsTypeProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsTypeProviderTest {
	
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ExpressionsTypeProvider
	
	@Test def void intConstant() { "10".assertIntType }
	@Test def void stringConstant() { "'foo'".assertStringType }
	@Test def void boolConstant() { "true".assertBoolType }
	
	@Test def void varWithoutExpression() { "i = ".assertUnknownType }
	@Test def void varWithExpression() { "i = 0".assertIntType }
	
	@Test def void varRef() { "i = 0 j = 's' i".assertIntType }
	@Test def void varRefToVarDefinedAfter() { "i = j j = i i".assertUnknownType }
	
	@Test def void notExp() { "!true".assertBoolType }
	
	@Test def void multiExp() { "1 * 2".assertIntType }
	@Test def void divExp() { "1 / 2".assertIntType }
	
	@Test def void minusExp() { "1 - 2".assertIntType }
	
	@Test def void numericPlus() { "1 + 2".assertIntType }
	@Test def void stringPlus() { "'a' + 'b'".assertStringType }
	@Test def void numAndStringPlus() { "'a' + 2".assertStringType }
	@Test def void numAndStringPlus2() { "2 + 'a'".assertStringType }
	@Test def void boolAndStringPlus() { "'a' + true".assertStringType }
	@Test def void boolAndStringPlus2() { "false + 'a'".assertStringType }
	
	@Test def void comparisonExp() { "1 < 2".assertBoolType }
	@Test def void equalityExp() { "1 == 2".assertBoolType }
	@Test def void andExp() { "true && false".assertBoolType }
	@Test def void orExp() { "true || false".assertBoolType }
	
	@Test def void testIsInt() { 
		(ExpressionsTypeProvider::intType).isInt.assertTrue
	}

	@Test def void testIsString() { 
		(ExpressionsTypeProvider::stringType).isString.assertTrue
	}

	@Test def void testIsBool() { 
		(ExpressionsTypeProvider::boolType).isBoolean.assertTrue
	}
	
	def assertStringType(CharSequence input) {
		input.assertType(ExpressionsTypeProvider::stringType)
	}
	
	def assertIntType(CharSequence input) {
		input.assertType(ExpressionsTypeProvider::intType)
	}

	def assertBoolType(CharSequence input) {
		input.assertType(ExpressionsTypeProvider::boolType)		
	}

	def assertUnknownType(CharSequence input) {
		input.assertType(null)		
	}

	def assertType(CharSequence input, ExpressionsType expectedType) {
		expectedType.assertSame
			(input.parse.elements.last.typeFor)
	}
}