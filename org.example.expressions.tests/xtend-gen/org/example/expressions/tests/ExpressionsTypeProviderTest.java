package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsTypeProviderTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ExpressionsTypeProvider _expressionsTypeProvider;
  
  @Test
  public void intConstant() {
    this.assertIntType("10");
  }
  
  @Test
  public void stringConstant() {
    this.assertStringType("\'foo\'");
  }
  
  @Test
  public void boolConstant() {
    this.assertBoolType("true");
  }
  
  @Test
  public void varWithoutExpression() {
    this.assertUnknownType("i = ");
  }
  
  @Test
  public void varWithExpression() {
    this.assertIntType("i = 0");
  }
  
  @Test
  public void varRef() {
    this.assertIntType("i = 0 j = \'s\' i");
  }
  
  @Test
  public void varRefToVarDefinedAfter() {
    this.assertUnknownType("i = j j = i i");
  }
  
  @Test
  public void notExp() {
    this.assertBoolType("!true");
  }
  
  @Test
  public void multiExp() {
    this.assertIntType("1 * 2");
  }
  
  @Test
  public void divExp() {
    this.assertIntType("1 / 2");
  }
  
  @Test
  public void minusExp() {
    this.assertIntType("1 - 2");
  }
  
  @Test
  public void numericPlus() {
    this.assertIntType("1 + 2");
  }
  
  @Test
  public void stringPlus() {
    this.assertStringType("\'a\' + \'b\'");
  }
  
  @Test
  public void numAndStringPlus() {
    this.assertStringType("\'a\' + 2");
  }
  
  @Test
  public void numAndStringPlus2() {
    this.assertStringType("2 + \'a\'");
  }
  
  @Test
  public void boolAndStringPlus() {
    this.assertStringType("\'a\' + true");
  }
  
  @Test
  public void boolAndStringPlus2() {
    this.assertStringType("false + \'a\'");
  }
  
  @Test
  public void comparisonExp() {
    this.assertBoolType("1 < 2");
  }
  
  @Test
  public void equalityExp() {
    this.assertBoolType("1 == 2");
  }
  
  @Test
  public void andExp() {
    this.assertBoolType("true && false");
  }
  
  @Test
  public void orExp() {
    this.assertBoolType("true || false");
  }
  
  @Test
  public void testIsInt() {
    boolean _isInt = this._expressionsTypeProvider.isInt(ExpressionsTypeProvider.intType);
    Assert.assertTrue(_isInt);
  }
  
  @Test
  public void testIsString() {
    boolean _isString = this._expressionsTypeProvider.isString(ExpressionsTypeProvider.stringType);
    Assert.assertTrue(_isString);
  }
  
  @Test
  public void testIsBool() {
    boolean _isBoolean = this._expressionsTypeProvider.isBoolean(ExpressionsTypeProvider.boolType);
    Assert.assertTrue(_isBoolean);
  }
  
  public void assertStringType(final CharSequence input) {
    this.assertType(input, ExpressionsTypeProvider.stringType);
  }
  
  public void assertIntType(final CharSequence input) {
    this.assertType(input, ExpressionsTypeProvider.intType);
  }
  
  public void assertBoolType(final CharSequence input) {
    this.assertType(input, ExpressionsTypeProvider.boolType);
  }
  
  public void assertUnknownType(final CharSequence input) {
    this.assertType(input, null);
  }
  
  public void assertType(final CharSequence input, final ExpressionsType expectedType) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      EList<AbstractElement> _elements = _parse.getElements();
      AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
      ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(_last);
      Assert.assertSame(expectedType, _typeFor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
