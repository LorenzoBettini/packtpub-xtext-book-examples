package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.expressions.ExpressionsInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsGeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testEvaluateExpressions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 0");
      _builder.newLine();
      _builder.newLine();
      _builder.append("j = (i >0 && (1) < (i+1))");
      _builder.newLine();
      _builder.newLine();
      _builder.append("j || true");
      _builder.newLine();
      _builder.newLine();
      _builder.append("(1 + 10) < (2 * (3 + 5))");
      _builder.newLine();
      _builder.newLine();
      _builder.append("(1 + 10) < (2 / (3 * 2))");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("i = 0 ~> 0");
      _builder_1.newLine();
      _builder_1.append("j = (i >0 && (1) < (i+1)) ~> false");
      _builder_1.newLine();
      _builder_1.append("j || true ~> true");
      _builder_1.newLine();
      _builder_1.append("(1 + 10) < (2 * (3 + 5)) ~> true");
      _builder_1.newLine();
      _builder_1.append("(1 + 10) < (2 / (3 * 2)) ~> false");
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
