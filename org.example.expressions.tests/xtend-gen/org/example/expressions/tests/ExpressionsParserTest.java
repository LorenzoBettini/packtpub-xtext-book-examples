package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
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
import org.example.expressions.expressions.And;
import org.example.expressions.expressions.BoolConstant;
import org.example.expressions.expressions.Comparison;
import org.example.expressions.expressions.Equality;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.IntConstant;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Not;
import org.example.expressions.expressions.Or;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.StringConstant;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsParserTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSimpleExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("10");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringConstantExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"test\"");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBooleanConstantExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("true");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10");
      _builder.newLine();
      _builder.append("i");
      _builder.newLine();
      final ExpressionsModel e = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(e);
      EList<AbstractElement> _elements = e.getElements();
      AbstractElement _get = _elements.get(1);
      Variable _variable = ((VariableRef) _get).getVariable();
      EList<AbstractElement> _elements_1 = e.getElements();
      AbstractElement _get_1 = _elements_1.get(0);
      Assert.assertSame(_variable, _get_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParenthesis() {
    try {
      ExpressionsModel _parse = this._parseHelper.parse("(10)");
      EList<AbstractElement> _elements = _parse.getElements();
      _elements.get(0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPlus() {
    this.assertRepr("10 + 5 + 1 + 2", "(((10 + 5) + 1) + 2)");
  }
  
  @Test
  public void testPlusWithParenthesis() {
    this.assertRepr("( 10 + 5 ) + ( 1 + 2 )", "((10 + 5) + (1 + 2))");
  }
  
  @Test
  public void testMinus() {
    this.assertRepr("10 + 5 - 1 - 2", "(((10 + 5) - 1) - 2)");
  }
  
  @Test
  public void testMulOrDiv() {
    this.assertRepr("10 * 5 / 1 * 2", "(((10 * 5) / 1) * 2)");
  }
  
  @Test
  public void testPlusMulPrecedence() {
    this.assertRepr("10 + 5 * 2 - 5 / 1", "((10 + (5 * 2)) - (5 / 1))");
  }
  
  @Test
  public void testComparison() {
    this.assertReprNoValidation("10 <= 5 < 2 > 5", "(((10 <= 5) < 2) > 5)");
  }
  
  @Test
  public void testEqualityAndComparison() {
    this.assertRepr("true == 5 <= 2", "(true == (5 <= 2))");
  }
  
  @Test
  public void testAndOr() {
    this.assertRepr("true || false && 1 < 0", "(true || (false && (1 < 0)))");
  }
  
  @Test
  public void testNot() {
    this.assertRepr("!true||false", "((!true) || false)");
  }
  
  @Test
  public void testNotWithParentheses() {
    this.assertRepr("!(true||false)", "(!(true || false))");
  }
  
  @Test
  public void testPrecedences() {
    this.assertRepr("!true||false&&1>(1/3+5*2)", "((!true) || (false && (1 > ((1 / 3) + (5 * 2)))))");
  }
  
  public ExpressionsModel assertRepr(final CharSequence input, final CharSequence expected) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      final Procedure1<ExpressionsModel> _function = new Procedure1<ExpressionsModel>() {
        @Override
        public void apply(final ExpressionsModel it) {
          ExpressionsParserTest.this._validationTestHelper.assertNoErrors(it);
          EList<AbstractElement> _elements = it.getElements();
          AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
          String _stringRepr = ExpressionsParserTest.this.stringRepr(((Expression) _last));
          Assert.assertEquals(expected, _stringRepr);
        }
      };
      return ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ExpressionsModel assertReprNoValidation(final CharSequence input, final CharSequence expected) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      final Procedure1<ExpressionsModel> _function = new Procedure1<ExpressionsModel>() {
        @Override
        public void apply(final ExpressionsModel it) {
          EList<AbstractElement> _elements = it.getElements();
          AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
          String _stringRepr = ExpressionsParserTest.this.stringRepr(((Expression) _last));
          Assert.assertEquals(expected, _stringRepr);
        }
      };
      return ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String stringRepr(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Plus)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        Expression _right = ((Plus)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Minus)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        Expression _right = ((Minus)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((MulOrDiv)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((MulOrDiv)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((MulOrDiv)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Comparison)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Comparison)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Comparison)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Equality)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = ((Equality)e).getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = ((Equality)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((And)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" && ");
        Expression _right = ((And)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = ((Or)e).getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" || ");
        Expression _right = ((Or)e).getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(!");
        Expression _expression = ((Not)e).getExpression();
        String _stringRepr = this.stringRepr(_expression);
        _builder.append(_stringRepr, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = ((IntConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((StringConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = ((BoolConstant)e).getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Variable _variable = ((VariableRef)e).getVariable();
        String _name = _variable.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
}
