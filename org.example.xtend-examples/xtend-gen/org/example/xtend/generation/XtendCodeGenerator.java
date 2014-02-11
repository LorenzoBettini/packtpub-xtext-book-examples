package org.example.xtend.generation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class XtendCodeGenerator {
  public CharSequence generateBody(final String name, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* body of ");
    _builder.append(name, "");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateMethod(final String name, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void ");
    _builder.append(name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBody = this.generateBody(name, body);
    _builder.append(_generateBody, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static void main(final String[] args) {
    final XtendCodeGenerator generator = new XtendCodeGenerator();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Hello\");");
    _builder.newLine();
    _builder.append("return;");
    _builder.newLine();
    CharSequence _generateMethod = generator.generateMethod("m", _builder.toString());
    InputOutput.<CharSequence>println(_generateMethod);
  }
}
