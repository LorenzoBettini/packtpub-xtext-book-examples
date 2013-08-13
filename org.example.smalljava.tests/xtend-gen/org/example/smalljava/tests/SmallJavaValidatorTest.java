package org.example.smalljava.tests;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.lib.SmallJavaLib;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SmallJavaPackage;
import org.example.smalljava.validation.SmallJavaValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaValidatorTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private SmallJavaLib _smallJavaLib;
  
  @Test
  public void testClassHierarchyCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A extends C {}");
      _builder.newLine();
      _builder.append("class C extends B {}");
      _builder.newLine();
      _builder.append("class B extends A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "A");
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "B");
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "C");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertHierarchyCycle(final SJProgram p, final String expectedClassName) {
    EClass _sJClass = SmallJavaPackage.eINSTANCE.getSJClass();
    String _plus = ("cycle in hierarchy of class \'" + expectedClassName);
    String _plus_1 = (_plus + "\'");
    this._validationTestHelper.assertError(p, _sJClass, 
      SmallJavaValidator.HIERARCHY_CYCLE, _plus_1);
  }
  
  @Test
  public void testUnreachableCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.m();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.UNREACHABLE_CODE, 
        "Unreachable code");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingFinalReturn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.m();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMethod = SmallJavaPackage.eINSTANCE.getSJMethod();
      this._validationTestHelper.assertError(_parse, _sJMethod, 
        SmallJavaValidator.MISSING_FINAL_RETURN, 
        "Method must end with a return statement");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateMethods() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMethod = SmallJavaPackage.eINSTANCE.getSJMethod();
      this._validationTestHelper.assertError(_parse, _sJMethod, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'m\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateFields() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJField = SmallJavaPackage.eINSTANCE.getSJField();
      this._validationTestHelper.assertError(_parse, _sJField, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'f\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldAndMethodWithTheSameNameAreOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {}");
      _builder.newLine();
      _builder.append("class C {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJClass = SmallJavaPackage.eINSTANCE.getSJClass();
      this._validationTestHelper.assertError(_parse, _sJClass, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate class \'C\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateClassesInFiles() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {}");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.first.pack;");
      _builder_1.newLine();
      _builder_1.append("class D {}");
      _builder_1.newLine();
      _builder_1.append("class C {}");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      EClass _sJClass = SmallJavaPackage.eINSTANCE.getSJClass();
      this._validationTestHelper.assertError(_parse, _sJClass, 
        SmallJavaValidator.DUPLICATE_CLASS, 
        "The type C is already defined");
      EClass _sJClass_1 = SmallJavaPackage.eINSTANCE.getSJClass();
      this._validationTestHelper.assertError(first, _sJClass_1, 
        SmallJavaValidator.DUPLICATE_CLASS, 
        "The type C is already defined");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateClassesWithDifferentQNAreOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {}");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class C {}");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateVariables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJVariableDeclaration = SmallJavaPackage.eINSTANCE.getSJVariableDeclaration();
      this._validationTestHelper.assertError(_parse, _sJVariableDeclaration, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate variable declaration \'v1\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableForwardReferences() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(C p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v2 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v3 = p;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v4 = v5; // defined after");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v5 = v2;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("v6 = null; // defined after");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v6 = null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            EClass _sJSymbolRef = SmallJavaPackage.eINSTANCE.getSJSymbolRef();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJSymbolRef, 
              Diagnostic.LINKING_DIAGNOSTIC, 
              "Couldn\'t resolve reference to SJSymbol \'v6\'");
            EClass _sJSymbolRef_1 = SmallJavaPackage.eINSTANCE.getSJSymbolRef();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJSymbolRef_1, 
              Diagnostic.LINKING_DIAGNOSTIC, 
              "Couldn\'t resolve reference to SJSymbol \'v5\'");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldAccessibility() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A priv;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A prot;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A pub;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv = null; // private field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot = null; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub = null; // public field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B extends A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv = null; // private field ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot = null; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub = null; // public field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            List<Issue> _validate = SmallJavaValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(1, _size);
            EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The private member priv is not accessible here");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldAccessibilityInSubclass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A priv;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A prot;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A pub;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv = null; // private field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot = null; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub = null; // public field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).priv = null; // private field ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).prot = null; // protected field ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).pub = null; // public field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            List<Issue> _validate = SmallJavaValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(2, _size);
            EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The private member priv is not accessible here");
            EClass _sJMemberSelection_1 = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection_1, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The protected member prot is not accessible here");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodAccessibility() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A priv() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A prot() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A pub() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.priv(); // private method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.pub(); // public method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B extends A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.priv(); // private method ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.pub(); // public method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            List<Issue> _validate = SmallJavaValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(1, _size);
            EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The private member priv is not accessible here");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodAccessibilityInSubclass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private A priv() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected A prot() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public A pub() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.priv(); // private method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = this.pub(); // public method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = (new A()).priv(); // private method ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = (new A()).prot(); // protected method ERROR");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("a = (new A()).pub(); // public method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            List<Issue> _validate = SmallJavaValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(2, _size);
            EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The private member priv is not accessible here");
            EClass _sJMemberSelection_1 = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMemberSelection_1, 
              SmallJavaValidator.MEMBER_NOT_ACCESSIBLE, 
              "The protected member prot is not accessible here");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void invocationOnField() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.f();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.METHOD_INVOCATION_ON_FIELD, 
        "Method invocation on a field");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void fieldSelectionOnMethod() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.m;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.FIELD_SELECTION_ON_METHOD, 
        "Field selection on a method");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void selectionOnPrimitiveType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return \"a\".m();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        Diagnostic.LINKING_DIAGNOSTIC, 
        "Couldn\'t resolve reference to SJMember \'m\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNoExpectedType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { this.a; this.m(); return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void assertVariableDeclExpIncompatibleTypes() {
    EClass _sJNew = SmallJavaPackage.eINSTANCE.getSJNew();
    this.assertIncompatibleTypes("V v = new P();", _sJNew, 
      "V", "P");
  }
  
  @Test
  public void assertAssignmentExpIncompatibleTypes() {
    EClass _sJNew = SmallJavaPackage.eINSTANCE.getSJNew();
    this.assertIncompatibleTypes("V v = null; v = new P();", _sJNew, 
      "V", "P");
  }
  
  @Test
  public void assertReturnExpIncompatibleTypes() {
    EClass _sJSymbolRef = SmallJavaPackage.eINSTANCE.getSJSymbolRef();
    this.assertIncompatibleTypes("return p;", _sJSymbolRef, 
      "R", "P");
  }
  
  @Test
  public void assertArgExpIncompatibleTypes() {
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          EClass _sJNew = SmallJavaPackage.eINSTANCE.getSJNew();
          SmallJavaValidatorTest.this.assertIncompatibleTypes(it, _sJNew, 
            "P1", "F");
          EClass _sJNew_1 = SmallJavaPackage.eINSTANCE.getSJNew();
          SmallJavaValidatorTest.this.assertIncompatibleTypes(it, _sJNew_1, 
            "P2", "V");
        }
      };
    ObjectExtensions.<String>operator_doubleArrow(
      "this.n(new F(), new V());", _function);
  }
  
  @Test
  public void assertIfExpressionIncompatibleTypes() {
    EClass _sJNew = SmallJavaPackage.eINSTANCE.getSJNew();
    this.assertIncompatibleTypes("if (new F()) { return null; } ", _sJNew, 
      "booleanType", "F");
  }
  
  public void assertIncompatibleTypes(final CharSequence methodBody, final EClass c, final String expectedType, final String actualType) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class F {}");
      _builder.newLine();
      _builder.append("class R {}");
      _builder.newLine();
      _builder.append("class P {}");
      _builder.newLine();
      _builder.append("class P1 {}");
      _builder.newLine();
      _builder.append("class P2 {}");
      _builder.newLine();
      _builder.append("class V {}");
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("F f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(methodBody, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R n(P1 p1, P2 p2) { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this.assertIncompatibleTypes(_parse, c, expectedType, actualType);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidNumberOfArgs() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {}");
      _builder.newLine();
      _builder.append("class B {}");
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(A a, B b) { return this.m(new B()); }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Invalid number of arguments. The method m(A, B) : C is not applicable for the arguments (B)");
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.INVALID_ARGS, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongMethodOverride() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A a) { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B extends A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// parameters must have the same type");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(B a) { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// return type can be a subtype");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("B m(A a) { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            EClass _sJMethod = SmallJavaPackage.eINSTANCE.getSJMethod();
            SmallJavaValidatorTest.this._validationTestHelper.assertError(it, _sJMethod, 
              SmallJavaValidator.WRONG_METHOD_OVERRIDE, 
              "The method \'m\' must override a superclass method");
            List<Issue> _validate = SmallJavaValidatorTest.this._validationTestHelper.validate(it);
            int _size = _validate.size();
            Assert.assertEquals(1, _size);
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongSuperUsage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return super;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJSuper = SmallJavaPackage.eINSTANCE.getSJSuper();
      this._validationTestHelper.assertError(_parse, _sJSuper, 
        SmallJavaValidator.WRONG_SUPER_USAGE, 
        "\'super\' can be used only as member selection receiver");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongBooleanStringConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Boolean m() { return \"a\"; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _loadLib = this._smallJavaLib.loadLib();
      SJProgram _parse = this._parseHelper.parse(_builder, _loadLib);
      EClass _sJStringConstant = SmallJavaPackage.eINSTANCE.getSJStringConstant();
      this.assertIncompatibleTypes(_parse, _sJStringConstant, 
        "Boolean", "stringType");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertIncompatibleTypes(final EObject o, final EClass c, final String expectedType, final String actualType) {
    String _plus = ("Incompatible types. Expected \'" + expectedType);
    String _plus_1 = (_plus + "\' but was \'");
    String _plus_2 = (_plus_1 + actualType);
    String _plus_3 = (_plus_2 + "\'");
    this._validationTestHelper.assertError(o, c, SmallJavaValidator.INCOMPATIBLE_TYPES, _plus_3);
  }
}
