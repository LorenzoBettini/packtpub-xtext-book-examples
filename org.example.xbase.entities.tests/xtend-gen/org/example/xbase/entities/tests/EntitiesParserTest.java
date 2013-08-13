package org.example.xbase.entities.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xbase.entities.EntitiesInjectorProvider;
import org.example.xbase.entities.entities.Model;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCorrectParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("attr String attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeWithType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("attr MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeWithoutType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("attr attribute = new MyEntity();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testImport() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import java.util.LinkedList");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("attr List<String> list = new LinkedList<String>();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
