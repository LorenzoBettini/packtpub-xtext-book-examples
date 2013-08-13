package org.example.expressions.tests;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.Variable;
import org.example.expressions.typing.ExpressionsModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsModelUtilTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Test
  public void variablesBeforeVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("true\t// (0)");
      _builder.newLine();
      _builder.append("i = 0\t// (1)");
      _builder.newLine();
      _builder.append("i + 10\t// (2)");
      _builder.newLine();
      _builder.append("j = i\t// (3)");
      _builder.newLine();
      _builder.append("i + j\t// (4)");
      _builder.newLine();
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<ExpressionsModel> _function = new Procedure1<ExpressionsModel>() {
          public void apply(final ExpressionsModel it) {
            ExpressionsModelUtilTest.this.assertVariablesDefinedBefore(it, 0, "");
            ExpressionsModelUtilTest.this.assertVariablesDefinedBefore(it, 1, "");
            ExpressionsModelUtilTest.this.assertVariablesDefinedBefore(it, 2, "i");
            ExpressionsModelUtilTest.this.assertVariablesDefinedBefore(it, 3, "i");
            ExpressionsModelUtilTest.this.assertVariablesDefinedBefore(it, 4, "i,j");
          }
        };
      ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertVariablesDefinedBefore(final ExpressionsModel model, final int elemIndex, final CharSequence expectedVars) {
    EList<AbstractElement> _elements = model.getElements();
    AbstractElement _get = _elements.get(elemIndex);
    List<Variable> _variablesDefinedBefore = ExpressionsModelUtil.variablesDefinedBefore(_get);
    final Function1<Variable,String> _function = new Function1<Variable,String>() {
        public String apply(final Variable it) {
          String _name = it.getName();
          return _name;
        }
      };
    List<String> _map = ListExtensions.<Variable, String>map(_variablesDefinedBefore, _function);
    String _join = IterableExtensions.join(_map, ",");
    Assert.assertEquals(expectedVars, _join);
  }
}
