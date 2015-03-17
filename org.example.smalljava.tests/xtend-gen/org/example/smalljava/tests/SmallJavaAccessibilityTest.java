package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.example.smalljava.validation.SmallJavaAccessibility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaAccessibilityTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private SmallJavaAccessibility _smallJavaAccessibility;
  
  @Test
  public void testFieldAccessibility() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private D priv;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected D prot;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public D pub;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv; // private field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub; // public field");
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
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv; // private field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub; // public field");
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
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).priv; // private field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).prot; // protected field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).pub; // public field");
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
      _builder.append("class D {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        @Override
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(0);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_get);
          SJMethod _get_1 = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
          SJMethodBody _body = _get_1.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          final Procedure1<EList<SJStatement>> _function = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, true);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, true);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements, _function);
          SJClass _get_2 = it.get(1);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(_get_2);
          SJMethod _get_3 = ((SJMethod[])Conversions.unwrapArray(_methods_1, SJMethod.class))[0];
          SJMethodBody _body_1 = _get_3.getBody();
          EList<SJStatement> _statements_1 = _body_1.getStatements();
          final Procedure1<EList<SJStatement>> _function_1 = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, false);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, true);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements_1, _function_1);
          SJClass _get_4 = it.get(2);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(_get_4);
          SJMethod _get_5 = ((SJMethod[])Conversions.unwrapArray(_methods_2, SJMethod.class))[0];
          SJMethodBody _body_2 = _get_5.getBody();
          EList<SJStatement> _statements_2 = _body_2.getStatements();
          final Procedure1<EList<SJStatement>> _function_2 = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, false);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, false);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements_2, _function_2);
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
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
      _builder.append("private D priv() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected D prot() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public D pub() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv(); // private method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub(); // public method");
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
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.priv(); // private method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.pub(); // public method");
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
      _builder.append("D m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).priv(); // private method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).prot(); // protected method");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(new A()).pub(); // public method");
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
      _builder.append("class D {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        @Override
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(0);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_get);
          SJMethod _last = IterableExtensions.<SJMethod>last(_methods);
          SJMethodBody _body = _last.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          final Procedure1<EList<SJStatement>> _function = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, true);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, true);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements, _function);
          SJClass _get_1 = it.get(1);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(_get_1);
          SJMethod _last_1 = IterableExtensions.<SJMethod>last(_methods_1);
          SJMethodBody _body_1 = _last_1.getBody();
          EList<SJStatement> _statements_1 = _body_1.getStatements();
          final Procedure1<EList<SJStatement>> _function_1 = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, false);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, true);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements_1, _function_1);
          SJClass _get_2 = it.get(2);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(_get_2);
          SJMethod _last_2 = IterableExtensions.<SJMethod>last(_methods_2);
          SJMethodBody _body_2 = _last_2.getBody();
          EList<SJStatement> _statements_2 = _body_2.getStatements();
          final Procedure1<EList<SJStatement>> _function_2 = new Procedure1<EList<SJStatement>>() {
            @Override
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get, false);
              SJStatement _get_1 = it.get(1);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_1, false);
              SJStatement _get_2 = it.get(2);
              SmallJavaAccessibilityTest.this.assertMemberAccessible(_get_2, true);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements_2, _function_2);
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertMemberAccessible(final SJStatement s, final boolean expected) {
    final SJMemberSelection sel = ((SJMemberSelection) s);
    SJMember _member = sel.getMember();
    boolean _isAccessibleFrom = this._smallJavaAccessibility.isAccessibleFrom(_member, sel);
    Assert.assertEquals(Boolean.valueOf(expected), Boolean.valueOf(_isAccessibleFrom));
  }
}
