package org.example.smalljava.tests;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaModelUtilTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Test
  public void testValidHierarchy() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class E extends D {}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(0);
          SmallJavaModelUtilTest.this.assertHierarchy(_get, "");
          SJClass _get_1 = it.get(1);
          SmallJavaModelUtilTest.this.assertHierarchy(_get_1, "C");
          SJClass _get_2 = it.get(2);
          SmallJavaModelUtilTest.this.assertHierarchy(_get_2, "D, C");
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCyclicHierarchy() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C extends E {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class E extends D {}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(0);
          SmallJavaModelUtilTest.this.assertHierarchy(_get, "E, D, C");
          SJClass _get_1 = it.get(1);
          SmallJavaModelUtilTest.this.assertHierarchy(_get_1, "C, E, D");
          SJClass _get_2 = it.get(2);
          SmallJavaModelUtilTest.this.assertHierarchy(_get_2, "D, C, E");
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testReturnStatement() {
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
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
      final Procedure1<SJMethod> _function = new Procedure1<SJMethod>() {
        public void apply(final SJMethod it) {
          SJMethodBody _body = it.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          SJStatement _get = _statements.get(1);
          SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(it);
          Assert.assertSame(_get, _returnStatement);
        }
      };
      ObjectExtensions.<SJMethod>operator_doubleArrow(_head_1, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodAsStringWithType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {}");
      _builder.newLine();
      _builder.append("class B {}");
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A n(B b, C c) { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A p(Foo b, C c) { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _last = IterableExtensions.<SJClass>last(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
      final Procedure1<Iterable<SJMethod>> _function = new Procedure1<Iterable<SJMethod>>() {
        public void apply(final Iterable<SJMethod> it) {
          SJMethod _get = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[0];
          String _memberAsStringWithType = SmallJavaModelUtil.memberAsStringWithType(_get);
          Assert.assertEquals("m() : A", _memberAsStringWithType);
          SJMethod _get_1 = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[1];
          String _memberAsStringWithType_1 = SmallJavaModelUtil.memberAsStringWithType(_get_1);
          Assert.assertEquals("n(B, C) : A", _memberAsStringWithType_1);
          SJMethod _get_2 = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[2];
          String _memberAsStringWithType_2 = SmallJavaModelUtil.memberAsStringWithType(_get_2);
          Assert.assertEquals("p(null, C) : A", _memberAsStringWithType_2);
        }
      };
      ObjectExtensions.<Iterable<SJMethod>>operator_doubleArrow(_methods, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertHierarchy(final SJClass c, final CharSequence expected) {
    String _string = expected.toString();
    ArrayList<SJClass> _classHierarchy = SmallJavaModelUtil.classHierarchy(c);
    final Function1<SJClass, String> _function = new Function1<SJClass, String>() {
      public String apply(final SJClass it) {
        return it.getName();
      }
    };
    List<String> _map = ListExtensions.<SJClass, String>map(_classHierarchy, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
}
