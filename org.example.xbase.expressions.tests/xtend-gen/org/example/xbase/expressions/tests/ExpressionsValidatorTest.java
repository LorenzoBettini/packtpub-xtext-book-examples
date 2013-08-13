package org.example.xbase.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xbase.expressions.ExpressionsInjectorProvider;
import org.example.xbase.expressions.expressions.ExpressionsModel;
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
      _builder.append("val j = i + 1 // forward reference");
      _builder.newLine();
      _builder.append("val i = 10");
      _builder.newLine();
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
      this._validationTestHelper.assertError(_parse, _xFeatureCall, 
        Diagnostic.LINKING_DIAGNOSTIC, 
        "Couldn\'t resolve reference to JvmIdentifiableElement \'i\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
