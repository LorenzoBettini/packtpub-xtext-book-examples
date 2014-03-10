package org.example.xbase.entities.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.example.xbase.entities.EntitiesInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesCompilerTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testAttributeGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/* my entity */");
      _builder.newLine();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/* my attribute */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr e = new MyEntity; // type is inferred");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* my entity");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyEntity {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("   ");
      _builder_1.append("* my attribute");
      _builder_1.newLine();
      _builder_1.append("   ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("private MyEntity e = new MyEntity();");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public MyEntity getE() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return this.e;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public void setE(final MyEntity e) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("this.e = e;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String toString() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"entity MyEntity {\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    \t");
      _builder_1.append("\"\\te = \" + e.toString() + \"\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"}\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenericSuperType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyList extends java.util.LinkedList<Iterable<String>>  {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import java.util.LinkedList;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyList extends LinkedList<Iterable<String>> {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String toString() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"entity MyList {\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"}\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidGeneratedJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr e = new MyEntity;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          it.getCompiledClass();
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOperationGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.LinkedList");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyList extends LinkedList<String> {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op insert(String s) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("add(s)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import java.util.LinkedList;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyList extends LinkedList<String> {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public boolean insert(final String s) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return this.add(s);");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String toString() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"entity MyList {\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"}\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedToString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr l = newArrayList(1, 2, 3);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr s = \"test\";");
      _builder.newLine();
      _builder.append("}");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import java.util.ArrayList;");
      _builder_1.newLine();
      _builder_1.append("import org.eclipse.xtext.xbase.lib.CollectionLiterals;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class C {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("private ArrayList<Integer> l = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public ArrayList<Integer> getL() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return this.l;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public void setL(final ArrayList<Integer> l) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("this.l = l;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("private String s = \"test\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String getS() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return this.s;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public void setS(final String s) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("this.s = s;");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String toString() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"entity C {\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    \t");
      _builder_1.append("\"\\tl = \" + l.toString() + \"\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    \t");
      _builder_1.append("\"\\ts = \" + s.toString() + \"\\n\" +");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"}\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedToStringExecution() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr l = newArrayList(1, 2, 3);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attr s = \"test\";");
      _builder.newLine();
      _builder.append("}");
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<?> _compiledClass = it.getCompiledClass();
            final Object obj = _compiledClass.newInstance();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("entity C {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("l = [1, 2, 3]");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("s = test");
            _builder.newLine();
            _builder.append("}");
            String _string = _builder.toString();
            Object _invoke = EntitiesCompilerTest.this._reflectExtensions.invoke(obj, "toString");
            Assert.assertEquals(_string, _invoke);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
