package org.example.expressions.tests;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.ExpressionsPackage;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeProvider;
import org.example.expressions.validation.ExpressionsValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsValidatorTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testForwardReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = j j = 10");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      EClass _variableRef = ExpressionsPackage.eINSTANCE.getVariableRef();
      this._validationTestHelper.assertError(_parse, _variableRef, 
        ExpressionsValidator.FORWARD_REFERENCE, 
        "variable forward reference not allowed: \'j\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testForwardReferenceInExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 1 j+i j = 10");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<ExpressionsModel> _function = new Procedure1<ExpressionsModel>() {
          public void apply(final ExpressionsModel it) {
            EClass _variableRef = ExpressionsPackage.eINSTANCE.getVariableRef();
            ExpressionsValidatorTest.this._validationTestHelper.assertError(it, _variableRef, 
              ExpressionsValidator.FORWARD_REFERENCE, 
              "variable forward reference not allowed: \'j\'");
            EClass _expression = ExpressionsPackage.eINSTANCE.getExpression();
            ExpressionsValidatorTest.this._validationTestHelper.assertError(it, _expression, 
              ExpressionsValidator.WRONG_TYPE, 
              "null type");
            List<Issue> _validate = ExpressionsValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(2, _size);
          }
        };
      ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongNotType() {
    this.assertType("!10", ExpressionsTypeProvider.intType, ExpressionsTypeProvider.boolType);
  }
  
  @Test
  public void testWrongMulOrDivType() {
    this.assertType("10 * true", ExpressionsTypeProvider.boolType, ExpressionsTypeProvider.intType);
    this.assertType("\'10\' / 10", ExpressionsTypeProvider.stringType, ExpressionsTypeProvider.intType);
  }
  
  @Test
  public void testWrongMinusType() {
    this.assertType("10 - true", ExpressionsTypeProvider.boolType, ExpressionsTypeProvider.intType);
    this.assertType("\'10\' - 10", ExpressionsTypeProvider.stringType, ExpressionsTypeProvider.intType);
  }
  
  @Test
  public void testWrongAndType() {
    this.assertType("10 && true", ExpressionsTypeProvider.intType, ExpressionsTypeProvider.boolType);
    this.assertType("false && \'10\'", ExpressionsTypeProvider.stringType, ExpressionsTypeProvider.boolType);
  }
  
  @Test
  public void testWrongOrType() {
    this.assertType("10 || true", ExpressionsTypeProvider.intType, ExpressionsTypeProvider.boolType);
    this.assertType("false || \'10\'", ExpressionsTypeProvider.stringType, ExpressionsTypeProvider.boolType);
  }
  
  @Test
  public void testWrongEqualityType() {
    this.assertSameType("10 == true", ExpressionsTypeProvider.intType, ExpressionsTypeProvider.boolType);
    this.assertSameType("false != \'10\'", ExpressionsTypeProvider.boolType, ExpressionsTypeProvider.stringType);
  }
  
  @Test
  public void testWrongComparisonType() {
    this.assertSameType("10 < \'1\'", ExpressionsTypeProvider.intType, ExpressionsTypeProvider.stringType);
    this.assertSameType("\'10\' > 10", ExpressionsTypeProvider.stringType, ExpressionsTypeProvider.intType);
  }
  
  @Test
  public void testWrongBooleanComparison() {
    this.assertNotBooleanType("10 < true");
    this.assertNotBooleanType("false > 0");
    this.assertNotBooleanType("false > true");
  }
  
  @Test
  public void testWrongBooleanPlus() {
    this.assertNotBooleanType("10 + true");
    this.assertNotBooleanType("false + 0");
    this.assertNotBooleanType("false + true");
  }
  
  public void assertType(final CharSequence input, final ExpressionsType expectedWrongType, final ExpressionsType expectedActualType) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      EList<AbstractElement> _elements = _parse.getElements();
      AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
      final Procedure1<AbstractElement> _function = new Procedure1<AbstractElement>() {
          public void apply(final AbstractElement it) {
            EClass _expression = ExpressionsPackage.eINSTANCE.getExpression();
            String _plus = ("expected " + expectedActualType);
            String _plus_1 = (_plus + " type, but was ");
            String _plus_2 = (_plus_1 + expectedWrongType);
            ExpressionsValidatorTest.this._validationTestHelper.assertError(it, _expression, 
              ExpressionsValidator.WRONG_TYPE, _plus_2);
          }
        };
      ObjectExtensions.<AbstractElement>operator_doubleArrow(_last, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertSameType(final CharSequence input, final ExpressionsType expectedLeft, final ExpressionsType expectedRight) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      EList<AbstractElement> _elements = _parse.getElements();
      AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
      final Procedure1<AbstractElement> _function = new Procedure1<AbstractElement>() {
          public void apply(final AbstractElement it) {
            EClass _expression = ExpressionsPackage.eINSTANCE.getExpression();
            String _plus = ("expected the same type, but was " + expectedLeft);
            String _plus_1 = (_plus + ", ");
            String _plus_2 = (_plus_1 + expectedRight);
            ExpressionsValidatorTest.this._validationTestHelper.assertError(it, _expression, 
              ExpressionsValidator.WRONG_TYPE, _plus_2);
          }
        };
      ObjectExtensions.<AbstractElement>operator_doubleArrow(_last, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertNotBooleanType(final CharSequence input) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      EList<AbstractElement> _elements = _parse.getElements();
      AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
      final Procedure1<AbstractElement> _function = new Procedure1<AbstractElement>() {
          public void apply(final AbstractElement it) {
            EClass _expression = ExpressionsPackage.eINSTANCE.getExpression();
            ExpressionsValidatorTest.this._validationTestHelper.assertError(it, _expression, 
              ExpressionsValidator.WRONG_TYPE, 
              "cannot be boolean");
          }
        };
      ObjectExtensions.<AbstractElement>operator_doubleArrow(_last, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
