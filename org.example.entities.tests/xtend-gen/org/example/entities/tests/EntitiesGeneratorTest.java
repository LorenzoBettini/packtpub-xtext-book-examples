package org.example.entities.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.example.entities.EntitiesInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesGeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package entities;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MyEntity {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String myAttribute;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getMyAttribute() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return myAttribute;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setMyAttribute(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.myAttribute = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedCode2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package entities;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public class MyEntity {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private String myAttribute;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public String getMyAttribute() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return myAttribute;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setMyAttribute(String _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.myAttribute = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          String _string = _builder.toString();
          String _singleGeneratedCode = it.getSingleGeneratedCode();
          Assert.assertEquals(_string, _singleGeneratedCode);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedValidJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string myAttribute;");
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
  public void testTwoCompiledClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity FirstEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondEntity myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity SecondEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<? extends Object> _compiledClass = it.getCompiledClass("entities.FirstEntity");
          Assert.assertNotNull(_compiledClass);
          Class<? extends Object> _compiledClass_1 = it.getCompiledClass("entities.SecondEntity");
          Assert.assertNotNull(_compiledClass_1);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity E {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Procedure1<Object> _function = new Procedure1<Object>() {
              public void apply(final Object it) {
                try {
                  Object _invoke = EntitiesGeneratorTest.this._reflectExtensions.invoke(it, "getMyAttribute");
                  Assert.assertNull(_invoke);
                  EntitiesGeneratorTest.this._reflectExtensions.invoke(it, "setMyAttribute", "testvalue");
                  Object _invoke_1 = EntitiesGeneratorTest.this._reflectExtensions.invoke(it, "getMyAttribute");
                  Assert.assertEquals("testvalue", _invoke_1);
                } catch (Throwable _e) {
                  throw Exceptions.sneakyThrow(_e);
                }
              }
            };
            ObjectExtensions.<Object>operator_doubleArrow(_newInstance, _function);
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
  
  @Test
  public void testGeneratedCodeWithTwoEntites() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity FirstEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondEntity myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity SecondEntity { }");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package entities;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public class FirstEntity {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private SecondEntity myAttribute;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public SecondEntity getMyAttribute() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return myAttribute;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setMyAttribute(SecondEntity _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.myAttribute = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          String _string = _builder.toString();
          String _generatedCode = it.getGeneratedCode("entities.FirstEntity");
          Assert.assertEquals(_string, _generatedCode);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("package entities;");
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.append("public class SecondEntity {");
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          String _string_1 = _builder_1.toString();
          String _generatedCode_1 = it.getGeneratedCode("entities.SecondEntity");
          Assert.assertEquals(_string_1, _generatedCode_1);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCodeWithTwoClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity FirstEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondEntity myAttribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity SecondEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string s;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass("entities.FirstEntity");
            final Object FirstEntity = _compiledClass.newInstance();
            Class<? extends Object> _compiledClass_1 = it.getCompiledClass("entities.SecondEntity");
            final Object SecondEntity = _compiledClass_1.newInstance();
            EntitiesGeneratorTest.this._reflectExtensions.invoke(SecondEntity, "setS", "testvalue");
            EntitiesGeneratorTest.this._reflectExtensions.invoke(FirstEntity, "setMyAttribute", SecondEntity);
            Object _invoke = EntitiesGeneratorTest.this._reflectExtensions.invoke(FirstEntity, "getMyAttribute");
            Assert.assertSame(SecondEntity, _invoke);
            Object _invoke_1 = EntitiesGeneratorTest.this._reflectExtensions.invoke(FirstEntity, "getMyAttribute");
            Object _invoke_2 = EntitiesGeneratorTest.this._reflectExtensions.invoke(_invoke_1, "getS");
            Assert.assertEquals("testvalue", _invoke_2);
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
  
  @Test
  public void testGeneratedCodeComplex() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity[] arrayAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity[10] arrayAttrWithDimension;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity notArrayAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("string stringAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("boolean booleanAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("int[] intArrayAttr;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package entities;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public class MyEntity {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private MyEntity[] arrayAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private MyEntity[] arrayAttrWithDimension;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private MyEntity notArrayAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private String stringAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private boolean booleanAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("private int[] intArrayAttr;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public MyEntity[] getArrayAttr() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return arrayAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setArrayAttr(MyEntity[] _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.arrayAttr = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public MyEntity[] getArrayAttrWithDimension() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return arrayAttrWithDimension;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setArrayAttrWithDimension(MyEntity[] _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.arrayAttrWithDimension = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public MyEntity getNotArrayAttr() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return notArrayAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setNotArrayAttr(MyEntity _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.notArrayAttr = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public String getStringAttr() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return stringAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setStringAttr(String _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.stringAttr = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public boolean getBooleanAttr() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return booleanAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setBooleanAttr(boolean _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.booleanAttr = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public int[] getIntArrayAttr() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return intArrayAttr;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setIntArrayAttr(int[] _arg) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("this.intArrayAttr = _arg;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          String _string = _builder.toString();
          String _singleGeneratedCode = it.getSingleGeneratedCode();
          Assert.assertEquals(_string, _singleGeneratedCode);
          it.getCompiledClass();
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
