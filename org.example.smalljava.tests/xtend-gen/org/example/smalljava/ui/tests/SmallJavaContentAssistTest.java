package org.example.smalljava.ui.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.smalljava.SmallJavaUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaUiInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaContentAssistTest extends AbstractContentAssistTest {
  @Test
  public void testMembers() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A n() { this. ");
      ContentAssistProcessorTestBuilder _append = _newBuilder.append(_builder.toString());
      _append.assertText("f", "m", "n");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testProtectedMembers() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A1 priv;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A1 prot;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A1 pub;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A1 privM() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A1 protM() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A1 pubM() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B1 extends A1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A1 n() { new A1(). ");
      ContentAssistProcessorTestBuilder _append = _newBuilder.append(_builder.toString());
      _append.assertText("prot", "pub", "protM", "pubM");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPrivateMembers() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A1 priv;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A1 prot;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A1 pub;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A1 privM() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A1 protM() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A1 pubM() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A1 n() { new A1(). ");
      ContentAssistProcessorTestBuilder _append = _newBuilder.append(_builder.toString());
      _append.assertText("pub", "pubM");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
