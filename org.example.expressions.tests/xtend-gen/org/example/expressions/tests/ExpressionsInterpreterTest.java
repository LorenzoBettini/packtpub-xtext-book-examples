package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.interpreter.ExpressionsInterpreter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsInterpreterTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ExpressionsInterpreter _expressionsInterpreter;
  
  @Test
  public void intConstant() {
    this.assertInterpret("1", Integer.valueOf(1));
  }
  
  @Test
  public void boolConstant() {
    this.assertInterpret("true", Boolean.valueOf(true));
  }
  
  @Test
  public void stringConstant() {
    this.assertInterpret("\'abc\'", "abc");
  }
  
  @Test
  public void multi() {
    this.assertInterpret("5 * 3", Integer.valueOf(15));
  }
  
  @Test
  public void div() {
    this.assertInterpret("6 / 3", Integer.valueOf(2));
  }
  
  @Test
  public void minus() {
    this.assertInterpret("6 - 2", Integer.valueOf(4));
  }
  
  @Test
  public void intPlus() {
    this.assertInterpret("6 + 2", Integer.valueOf(8));
  }
  
  @Test
  public void stringPlus() {
    this.assertInterpret("\'a\' + \'b\'", "ab");
  }
  
  @Test
  public void intStringPlus() {
    this.assertInterpret("\'a\' + 1", "a1");
  }
  
  @Test
  public void boolStringPlus() {
    this.assertInterpret("\'a\' + true", "atrue");
  }
  
  @Test
  public void lessThanInt() {
    this.assertInterpret("1 < 2", Boolean.valueOf(true));
  }
  
  @Test
  public void lessEqualsThanInt() {
    this.assertInterpret("2 <= 2", Boolean.valueOf(true));
  }
  
  @Test
  public void greaterThanInt() {
    this.assertInterpret("1 > 2", Boolean.valueOf(false));
  }
  
  @Test
  public void greaterEqualsThanInt() {
    this.assertInterpret("2 >= 1", Boolean.valueOf(true));
  }
  
  @Test
  public void lessThanString() {
    this.assertInterpret("\'a\' < \'b\'", Boolean.valueOf(true));
  }
  
  @Test
  public void lessEqualsThanString() {
    this.assertInterpret("\'a\' <= \'ab\'", Boolean.valueOf(true));
  }
  
  @Test
  public void greaterThanString() {
    this.assertInterpret("\'ab\' > \'a\'", Boolean.valueOf(true));
  }
  
  @Test
  public void greaterEqualsThanString() {
    this.assertInterpret("\'a\' >= \'ab\'", Boolean.valueOf(false));
  }
  
  @Test
  public void equalsString() {
    this.assertInterpret("\'a\' == \'a\'", Boolean.valueOf(true));
  }
  
  @Test
  public void notEqualsString() {
    this.assertInterpret("\'a\' != \'b\'", Boolean.valueOf(true));
  }
  
  @Test
  public void equalsInt() {
    this.assertInterpret("1 == 1", Boolean.valueOf(true));
  }
  
  @Test
  public void notEqualsInt() {
    this.assertInterpret("0 != 1", Boolean.valueOf(true));
  }
  
  @Test
  public void equalsBool() {
    this.assertInterpret("true == true", Boolean.valueOf(true));
  }
  
  @Test
  public void notEqualsBool() {
    this.assertInterpret("true != false", Boolean.valueOf(true));
  }
  
  @Test
  public void and() {
    this.assertInterpret("true && !false", Boolean.valueOf(true));
  }
  
  @Test
  public void or() {
    this.assertInterpret("false || true", Boolean.valueOf(true));
  }
  
  @Test
  public void varRef() {
    this.assertInterpret("i = 1 j = i + 2 j+1", Integer.valueOf(4));
  }
  
  @Test
  public void complex() {
    this.assertInterpret("((5 * 3)+1) / (7 + 1)", Integer.valueOf(2));
  }
  
  public ExpressionsModel assertInterpret(final CharSequence input, final Object expected) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      final Procedure1<ExpressionsModel> _function = new Procedure1<ExpressionsModel>() {
          public void apply(final ExpressionsModel it) {
            ExpressionsInterpreterTest.this._validationTestHelper.assertNoErrors(it);
            EList<AbstractElement> _elements = it.getElements();
            AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
            Object _interpret = ExpressionsInterpreterTest.this._expressionsInterpreter.interpret(_last);
            Assert.assertEquals(expected, _interpret);
          }
        };
      ExpressionsModel _doubleArrow = ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
      return _doubleArrow;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
