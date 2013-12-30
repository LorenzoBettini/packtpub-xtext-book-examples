package org.example.smalljava.tests;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaPackage;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testScopeProvider() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A v = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _last = IterableExtensions.<SJMethod>last(_methods);
      SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(_last);
      SJExpression _expression = _returnStatement.getExpression();
      final Procedure1<SJExpression> _function = new Procedure1<SJExpression>() {
        public void apply(final SJExpression it) {
          EReference _sJMemberSelection_Member = SmallJavaPackage.eINSTANCE.getSJMemberSelection_Member();
          SmallJavaScopeProviderTest.this.assertScope(it, _sJMemberSelection_Member, 
            "f, m, C.f, C.m");
          EReference _sJSymbolRef_Symbol = SmallJavaPackage.eINSTANCE.getSJSymbolRef_Symbol();
          SmallJavaScopeProviderTest.this.assertScope(it, _sJSymbolRef_Symbol, 
            "v, p");
        }
      };
      ObjectExtensions.<SJExpression>operator_doubleArrow(_expression, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeProviderForMember() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(C p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v = null;");
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
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _last = IterableExtensions.<SJMethod>last(_methods);
      SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(_last);
      SJExpression _expression = _returnStatement.getExpression();
      final Procedure1<SJExpression> _function = new Procedure1<SJExpression>() {
        public void apply(final SJExpression it) {
          EReference _sJMemberSelection_Member = SmallJavaPackage.eINSTANCE.getSJMemberSelection_Member();
          SmallJavaScopeProviderTest.this.assertScope(it, _sJMemberSelection_Member, 
            "f, m, C.f, C.m");
        }
      };
      ObjectExtensions.<SJExpression>operator_doubleArrow(_expression, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeProviderForSymbols() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A v1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("A v2 = null;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("A v3 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A v4 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _last = IterableExtensions.<SJMethod>last(_methods);
      SJMethodBody _body = _last.getBody();
      TreeIterator<EObject> _eAllContents = _body.eAllContents();
      Iterator<SJVariableDeclaration> _filter = Iterators.<SJVariableDeclaration>filter(_eAllContents, SJVariableDeclaration.class);
      final Procedure1<Iterator<SJVariableDeclaration>> _function = new Procedure1<Iterator<SJVariableDeclaration>>() {
        public void apply(final Iterator<SJVariableDeclaration> it) {
          final Function1<SJVariableDeclaration,Boolean> _function = new Function1<SJVariableDeclaration,Boolean>() {
            public Boolean apply(final SJVariableDeclaration it) {
              String _name = it.getName();
              boolean _equals = Objects.equal(_name, "v3");
              return Boolean.valueOf(_equals);
            }
          };
          SJVariableDeclaration _findFirst = IteratorExtensions.<SJVariableDeclaration>findFirst(it, _function);
          SJExpression _expression = _findFirst.getExpression();
          EReference _sJSymbolRef_Symbol = SmallJavaPackage.eINSTANCE.getSJSymbolRef_Symbol();
          SmallJavaScopeProviderTest.this.assertScope(_expression, _sJSymbolRef_Symbol, 
            "v2, v1, p");
          final Function1<SJVariableDeclaration,Boolean> _function_1 = new Function1<SJVariableDeclaration,Boolean>() {
            public Boolean apply(final SJVariableDeclaration it) {
              String _name = it.getName();
              boolean _equals = Objects.equal(_name, "v4");
              return Boolean.valueOf(_equals);
            }
          };
          SJVariableDeclaration _findFirst_1 = IteratorExtensions.<SJVariableDeclaration>findFirst(it, _function_1);
          SJExpression _expression_1 = _findFirst_1.getExpression();
          EReference _sJSymbolRef_Symbol_1 = SmallJavaPackage.eINSTANCE.getSJSymbolRef_Symbol();
          SmallJavaScopeProviderTest.this.assertScope(_expression_1, _sJSymbolRef_Symbol_1, 
            "v1, p");
        }
      };
      ObjectExtensions.<Iterator<SJVariableDeclaration>>operator_doubleArrow(_filter, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldsScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C a;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(C p1, D p2) { return this.b; }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _last = IterableExtensions.<SJClass>last(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
      SJMethod _get = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
      SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(_get);
      SJExpression _expression = _returnStatement.getExpression();
      EReference _sJMemberSelection_Member = SmallJavaPackage.eINSTANCE.getSJMemberSelection_Member();
      this.assertScope(_expression, _sJMemberSelection_Member, "b, m, a");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodsScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C n() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return this.m(); }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _last = IterableExtensions.<SJClass>last(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
      SJMethod _get = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
      SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(_get);
      SJExpression _expression = _returnStatement.getExpression();
      EReference _sJMemberSelection_Member = SmallJavaPackage.eINSTANCE.getSJMemberSelection_Member();
      this.assertScope(_expression, _sJMemberSelection_Member, "m, f, n");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSymbolScoping() {
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
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v2 = p;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("C v3 = v1;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v4 = v1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v5 = v1;");
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
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _last = IterableExtensions.<SJClass>last(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
      SJMethod _get = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
      TreeIterator<EObject> _eAllContents = _get.eAllContents();
      Iterator<SJVariableDeclaration> _filter = Iterators.<SJVariableDeclaration>filter(_eAllContents, SJVariableDeclaration.class);
      final Procedure1<Iterator<SJVariableDeclaration>> _function = new Procedure1<Iterator<SJVariableDeclaration>>() {
        public void apply(final Iterator<SJVariableDeclaration> it) {
          final Function1<SJVariableDeclaration,Boolean> _function = new Function1<SJVariableDeclaration,Boolean>() {
            public Boolean apply(final SJVariableDeclaration it) {
              String _name = it.getName();
              boolean _equals = Objects.equal(_name, "v3");
              return Boolean.valueOf(_equals);
            }
          };
          SJVariableDeclaration _findFirst = IteratorExtensions.<SJVariableDeclaration>findFirst(it, _function);
          SJExpression _expression = _findFirst.getExpression();
          EReference _sJSymbolRef_Symbol = SmallJavaPackage.eINSTANCE.getSJSymbolRef_Symbol();
          SmallJavaScopeProviderTest.this.assertScope(_expression, _sJSymbolRef_Symbol, 
            "v2, v1, p");
        }
      };
      ObjectExtensions.<Iterator<SJVariableDeclaration>>operator_doubleArrow(_filter, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D c;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B extends A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D b;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D m() { return this.a; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D n() { return this.b; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D p() { return this.c; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class D{}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(2);
          Iterable<SJField> _fields = SmallJavaModelUtil.fields(_get);
          SJField _get_1 = ((SJField[])Conversions.unwrapArray(_fields, SJField.class))[0];
          SJClass _get_2 = it.get(2);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_get_2);
          SJMethod _get_3 = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
          SJMemberSelection _returnExpSel = SmallJavaScopeProviderTest.this.returnExpSel(_get_3);
          SJMember _member = _returnExpSel.getMember();
          Assert.assertSame(_get_1, _member);
          SJClass _get_4 = it.get(1);
          Iterable<SJField> _fields_1 = SmallJavaModelUtil.fields(_get_4);
          SJField _get_5 = ((SJField[])Conversions.unwrapArray(_fields_1, SJField.class))[0];
          SJClass _get_6 = it.get(2);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(_get_6);
          SJMethod _get_7 = ((SJMethod[])Conversions.unwrapArray(_methods_1, SJMethod.class))[1];
          SJMemberSelection _returnExpSel_1 = SmallJavaScopeProviderTest.this.returnExpSel(_get_7);
          SJMember _member_1 = _returnExpSel_1.getMember();
          Assert.assertSame(_get_5, _member_1);
          SJClass _get_8 = it.get(0);
          Iterable<SJField> _fields_2 = SmallJavaModelUtil.fields(_get_8);
          SJField _get_9 = ((SJField[])Conversions.unwrapArray(_fields_2, SJField.class))[2];
          SJClass _get_10 = it.get(2);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(_get_10);
          SJMethod _get_11 = ((SJMethod[])Conversions.unwrapArray(_methods_2, SJMethod.class))[2];
          SJMemberSelection _returnExpSel_2 = SmallJavaScopeProviderTest.this.returnExpSel(_get_11);
          SJMember _member_2 = _returnExpSel_2.getMember();
          Assert.assertSame(_get_9, _member_2);
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D n() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D m() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D o() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class B extends A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D n() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D m() { return this.m(); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D p() { return this.n(); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("D q() { return this.o(); }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class D {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(2);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_get);
          SJMethod _get_1 = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
          SJClass _get_2 = it.get(2);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(_get_2);
          SJMethod _get_3 = ((SJMethod[])Conversions.unwrapArray(_methods_1, SJMethod.class))[0];
          SJMemberSelection _returnExpSel = SmallJavaScopeProviderTest.this.returnExpSel(_get_3);
          SJMember _member = _returnExpSel.getMember();
          Assert.assertSame(_get_1, _member);
          SJClass _get_4 = it.get(1);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(_get_4);
          SJMethod _get_5 = ((SJMethod[])Conversions.unwrapArray(_methods_2, SJMethod.class))[0];
          SJClass _get_6 = it.get(2);
          Iterable<SJMethod> _methods_3 = SmallJavaModelUtil.methods(_get_6);
          SJMethod _get_7 = ((SJMethod[])Conversions.unwrapArray(_methods_3, SJMethod.class))[1];
          SJMemberSelection _returnExpSel_1 = SmallJavaScopeProviderTest.this.returnExpSel(_get_7);
          SJMember _member_1 = _returnExpSel_1.getMember();
          Assert.assertSame(_get_5, _member_1);
          SJClass _get_8 = it.get(0);
          Iterable<SJMethod> _methods_4 = SmallJavaModelUtil.methods(_get_8);
          SJMethod _get_9 = ((SJMethod[])Conversions.unwrapArray(_methods_4, SJMethod.class))[2];
          SJClass _get_10 = it.get(2);
          Iterable<SJMethod> _methods_5 = SmallJavaModelUtil.methods(_get_10);
          SJMethod _get_11 = ((SJMethod[])Conversions.unwrapArray(_methods_5, SJMethod.class))[2];
          SJMemberSelection _returnExpSel_2 = SmallJavaScopeProviderTest.this.returnExpSel(_get_11);
          SJMember _member_2 = _returnExpSel_2.getMember();
          Assert.assertSame(_get_9, _member_2);
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableShadowsParamScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A a) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
      final Procedure1<SJMethod> _function = new Procedure1<SJMethod>() {
        public void apply(final SJMethod it) {
          SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(it);
          SJExpression _expression = _returnStatement.getExpression();
          EReference _sJSymbolRef_Symbol = SmallJavaPackage.eINSTANCE.getSJSymbolRef_Symbol();
          SmallJavaScopeProviderTest.this.assertScope(_expression, _sJSymbolRef_Symbol, 
            "a");
        }
      };
      ObjectExtensions.<SJMethod>operator_doubleArrow(_head_1, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldsAndMethodsWithTheSameName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.f(); // must refer to method f");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.m; // must refer to field m");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
        public void apply(final SJClass it) {
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(it);
          SJMethod _head = IterableExtensions.<SJMethod>head(_methods);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(it);
          SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods_1);
          SJMemberSelection _returnExpSel = SmallJavaScopeProviderTest.this.returnExpSel(_head_1);
          SJMember _member = _returnExpSel.getMember();
          Assert.assertSame(_head, _member);
          Iterable<SJField> _fields = SmallJavaModelUtil.fields(it);
          SJField _last = IterableExtensions.<SJField>last(_fields);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(it);
          SJMethod _last_1 = IterableExtensions.<SJMethod>last(_methods_2);
          SJMemberSelection _returnExpSel_1 = SmallJavaScopeProviderTest.this.returnExpSel(_last_1);
          SJMember _member_1 = _returnExpSel_1.getMember();
          Assert.assertSame(_last, _member_1);
        }
      };
      ObjectExtensions.<SJClass>operator_doubleArrow(_head, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableShadowsParamLinking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A a) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A a = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return a;");
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
          SmallJavaScopeProviderTest.this._validationTestHelper.assertNoErrors(it);
          SJMethodBody _body = it.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          SJStatement _head = IterableExtensions.<SJStatement>head(_statements);
          SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(it);
          SJExpression _expression = _returnStatement.getExpression();
          SJSymbol _symbol = ((SJSymbolRef) _expression).getSymbol();
          Assert.assertSame(_head, _symbol);
        }
      };
      ObjectExtensions.<SJMethod>operator_doubleArrow(_head_1, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSuperScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C g;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return this.m(); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C p() { return super.m(); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m2() { return this.f; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C p2() { return super.f; }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
        public void apply(final EList<SJClass> it) {
          SJClass _get = it.get(1);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_get);
          SJMethod _get_1 = ((SJMethod[])Conversions.unwrapArray(_methods, SJMethod.class))[0];
          SJClass _get_2 = it.get(1);
          Iterable<SJMethod> _methods_1 = SmallJavaModelUtil.methods(_get_2);
          SJMethod _get_3 = ((SJMethod[])Conversions.unwrapArray(_methods_1, SJMethod.class))[0];
          SJMemberSelection _returnExpSel = SmallJavaScopeProviderTest.this.returnExpSel(_get_3);
          SJMember _member = _returnExpSel.getMember();
          Assert.assertSame(_get_1, _member);
          SJClass _get_4 = it.get(0);
          Iterable<SJMethod> _methods_2 = SmallJavaModelUtil.methods(_get_4);
          SJMethod _get_5 = ((SJMethod[])Conversions.unwrapArray(_methods_2, SJMethod.class))[0];
          SJClass _get_6 = it.get(1);
          Iterable<SJMethod> _methods_3 = SmallJavaModelUtil.methods(_get_6);
          SJMethod _get_7 = ((SJMethod[])Conversions.unwrapArray(_methods_3, SJMethod.class))[1];
          SJMemberSelection _returnExpSel_1 = SmallJavaScopeProviderTest.this.returnExpSel(_get_7);
          SJMember _member_1 = _returnExpSel_1.getMember();
          Assert.assertSame(_get_5, _member_1);
          SJClass _get_8 = it.get(1);
          Iterable<SJField> _fields = SmallJavaModelUtil.fields(_get_8);
          SJField _get_9 = ((SJField[])Conversions.unwrapArray(_fields, SJField.class))[0];
          SJClass _get_10 = it.get(1);
          Iterable<SJMethod> _methods_4 = SmallJavaModelUtil.methods(_get_10);
          SJMethod _get_11 = ((SJMethod[])Conversions.unwrapArray(_methods_4, SJMethod.class))[2];
          SJMemberSelection _returnExpSel_2 = SmallJavaScopeProviderTest.this.returnExpSel(_get_11);
          SJMember _member_2 = _returnExpSel_2.getMember();
          Assert.assertSame(_get_9, _member_2);
          SJClass _get_12 = it.get(0);
          Iterable<SJField> _fields_1 = SmallJavaModelUtil.fields(_get_12);
          SJField _get_13 = ((SJField[])Conversions.unwrapArray(_fields_1, SJField.class))[0];
          SJClass _get_14 = it.get(1);
          Iterable<SJMethod> _methods_5 = SmallJavaModelUtil.methods(_get_14);
          SJMethod _get_15 = ((SJMethod[])Conversions.unwrapArray(_methods_5, SJMethod.class))[3];
          SJMemberSelection _returnExpSel_3 = SmallJavaScopeProviderTest.this.returnExpSel(_get_15);
          SJMember _member_3 = _returnExpSel_3.getMember();
          Assert.assertSame(_get_13, _member_3);
        }
      };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessToOtherFileClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D extends my.first.pack.C { }");
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
  public void testImports() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C1 { }");
      _builder.newLine();
      _builder.append("class C2 { }");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D1 { }");
      _builder_1.newLine();
      _builder_1.append("class D2 { }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      this._parseHelper.parse(_builder_1, _resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("package my.third.pack;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import my.first.pack.C1;");
      _builder_2.newLine();
      _builder_2.append("import my.second.pack.*;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("class E extends C1 { // C1 is imported");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("my.first.pack.C2 c; // C2 not imported");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("D1 d1; // D1 imported by wildcard");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("D2 d2; // D2 imported by wildcard");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      Resource _eResource_1 = first.eResource();
      ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_2, _resourceSet_1);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSymbolReferences() {
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
      _builder.append("C v4 = v3;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C v5 = v2;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("v1 = null;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("v2 = v5;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("v2 = v1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C v6 = v2;");
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
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGlobalScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.append("class C { }");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D { }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(0);
      EReference _sJClass_Superclass = SmallJavaPackage.eINSTANCE.getSJClass_Superclass();
      this.assertScope(_get, _sJClass_Superclass, 
        "D, my.second.pack.D, my.first.pack.C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTwoFiles() {
    try {
      final ResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class B extends A {}");
      _builder.newLine();
      final SJProgram first = this._parseHelper.parse(_builder, resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("class A { B b; }");
      _builder_1.newLine();
      final SJProgram second = this._parseHelper.parse(_builder_1, resourceSet);
      this._validationTestHelper.assertNoErrors(first);
      this._validationTestHelper.assertNoErrors(second);
      EList<SJClass> _classes = second.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      EList<SJClass> _classes_1 = first.getClasses();
      SJClass _head_1 = IterableExtensions.<SJClass>head(_classes_1);
      SJClass _superclass = _head_1.getSuperclass();
      Assert.assertSame(_head, _superclass);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTwoFilesAlternative() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class B extends A {}");
      _builder.newLine();
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("class A { B b; }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final SJProgram second = this._parseHelper.parse(_builder_1, _resourceSet);
      this._validationTestHelper.assertNoErrors(first);
      this._validationTestHelper.assertNoErrors(second);
      EList<SJClass> _classes = second.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      EList<SJClass> _classes_1 = first.getClasses();
      SJClass _head_1 = IterableExtensions.<SJClass>head(_classes_1);
      SJClass _superclass = _head_1.getSuperclass();
      Assert.assertSame(_head, _superclass);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPackagesAndClassQualifiedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.append("class B extends my.second.pack.A {}");
      _builder.newLine();
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class A { ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("my.first.pack.B b;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final SJProgram second = this._parseHelper.parse(_builder_1, _resourceSet);
      this._validationTestHelper.assertNoErrors(first);
      this._validationTestHelper.assertNoErrors(second);
      EList<SJClass> _classes = second.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      EList<SJClass> _classes_1 = first.getClasses();
      SJClass _head_1 = IterableExtensions.<SJClass>head(_classes_1);
      SJClass _superclass = _head_1.getSuperclass();
      Assert.assertSame(_head, _superclass);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertScope(final EObject context, final EReference reference, final CharSequence expected) {
    this._validationTestHelper.assertNoErrors(context);
    String _string = expected.toString();
    IScope _scope = this._iScopeProvider.getScope(context, reference);
    Iterable<IEObjectDescription> _allElements = _scope.getAllElements();
    final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
      public QualifiedName apply(final IEObjectDescription it) {
        QualifiedName _name = it.getName();
        return _name;
      }
    };
    Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_allElements, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
  
  private SJMemberSelection returnExpSel(final SJMethod m) {
    SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(m);
    SJExpression _expression = _returnStatement.getExpression();
    return ((SJMemberSelection) _expression);
  }
}
