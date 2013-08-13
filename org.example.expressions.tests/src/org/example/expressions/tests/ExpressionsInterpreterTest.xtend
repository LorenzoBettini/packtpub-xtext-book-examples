package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.expressions.ExpressionsInjectorProvider
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.interpreter.ExpressionsInterpreter
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsInterpreterTest {
	
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper
	@Inject extension ExpressionsInterpreter

	@Test def void intConstant() { "1".assertInterpret(1)}	
	@Test def void boolConstant() { "true".assertInterpret(true)}
	@Test def void stringConstant() { "'abc'".assertInterpret("abc")}

	@Test def void multi() { "5 * 3".assertInterpret(15)}
	@Test def void div() { "6 / 3".assertInterpret(2)}
	@Test def void minus() { "6 - 2".assertInterpret(4)}
	
	@Test def void intPlus() { "6 + 2".assertInterpret(8)}
	@Test def void stringPlus() { "'a' + 'b'".assertInterpret('ab')}
	@Test def void intStringPlus() { "'a' + 1".assertInterpret('a1')}
	@Test def void boolStringPlus() { "'a' + true".assertInterpret('atrue')}
	
	@Test def void lessThanInt() { "1 < 2".assertInterpret(true)}
	@Test def void lessEqualsThanInt() { "2 <= 2".assertInterpret(true)}
	@Test def void greaterThanInt() { "1 > 2".assertInterpret(false)}
	@Test def void greaterEqualsThanInt() { "2 >= 1".assertInterpret(true)}

	@Test def void lessThanString() { "'a' < 'b'".assertInterpret(true)}
	@Test def void lessEqualsThanString() { "'a' <= 'ab'".assertInterpret(true)}
	@Test def void greaterThanString() { "'ab' > 'a'".assertInterpret(true)}
	@Test def void greaterEqualsThanString() { "'a' >= 'ab'".assertInterpret(false)}
	
	@Test def void equalsString() { "'a' == 'a'".assertInterpret(true)}
	@Test def void notEqualsString() { "'a' != 'b'".assertInterpret(true)}
	@Test def void equalsInt() { "1 == 1".assertInterpret(true)}
	@Test def void notEqualsInt() { "0 != 1".assertInterpret(true)}
	@Test def void equalsBool() { "true == true".assertInterpret(true)}
	@Test def void notEqualsBool() { "true != false".assertInterpret(true)}
	
	@Test def void and() { "true && !false".assertInterpret(true)}
	@Test def void or() { "false || true".assertInterpret(true)}
	
	@Test def void varRef() { "i = 1 j = i + 2 j+1".assertInterpret(4)}
	
	@Test def void complex() { "((5 * 3)+1) / (7 + 1)".assertInterpret(2)}

	def assertInterpret(CharSequence input, Object expected) {
		input.parse => [
			assertNoErrors
			expected.assertEquals(elements.last.interpret)
		]
	}
}