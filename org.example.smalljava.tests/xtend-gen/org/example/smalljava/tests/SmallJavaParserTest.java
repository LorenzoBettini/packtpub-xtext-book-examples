package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJAccessLevel;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJIfBlock;
import org.example.smalljava.smallJava.SJIfStatement;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaParserTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassWithSuperclass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { } class D extends C { }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassWithFieldsAndMethods() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { } ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(C p1, D p2) { return null; }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableDecl() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { } ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m(C p1, D p2) { ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("D d = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return d;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodInvocation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C c = this.m();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.m();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this.assertReturnExpressionOfType(_parse, SJMemberSelection.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldSelection() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("C c = this.f;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this.assertReturnExpressionOfType(_parse, SJMemberSelection.class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVisibility() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { } ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class D extends C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c1;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public C c2;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private C c3;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected C c4;");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaParserTest.this._validationTestHelper.assertNoErrors(it);
            SmallJavaParserTest.this.assertAccessLevel(it, 0, SJAccessLevel.PRIVATE);
            SmallJavaParserTest.this.assertAccessLevel(it, 1, SJAccessLevel.PUBLIC);
            SmallJavaParserTest.this.assertAccessLevel(it, 2, SJAccessLevel.PRIVATE);
            SmallJavaParserTest.this.assertAccessLevel(it, 3, SJAccessLevel.PROTECTED);
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testElse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (false)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("else");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaParserTest.this._validationTestHelper.assertNoErrors(it);
            EList<SJClass> _classes = it.getClasses();
            SJClass _head = IterableExtensions.<SJClass>head(_classes);
            EList<SJMember> _members = _head.getMembers();
            SJMember _get = _members.get(1);
            SJMethodBody _body = ((SJMethod) _get).getBody();
            EList<SJStatement> _statements = _body.getStatements();
            SJStatement _head_1 = IterableExtensions.<SJStatement>head(_statements);
            final SJIfStatement ifS = ((SJIfStatement) _head_1);
            SJIfBlock _elseBlock = ifS.getElseBlock();
            Assert.assertNull(_elseBlock);
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testElseWithBlock() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if (false)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("this.c = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaParserTest.this._validationTestHelper.assertNoErrors(it);
            EList<SJClass> _classes = it.getClasses();
            SJClass _head = IterableExtensions.<SJClass>head(_classes);
            EList<SJMember> _members = _head.getMembers();
            SJMember _get = _members.get(1);
            SJMethodBody _body = ((SJMethod) _get).getBody();
            EList<SJStatement> _statements = _body.getStatements();
            SJStatement _head_1 = IterableExtensions.<SJStatement>head(_statements);
            final SJIfStatement ifS = ((SJIfStatement) _head_1);
            SJIfBlock _elseBlock = ifS.getElseBlock();
            Assert.assertNotNull(_elseBlock);
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPackage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.pack;");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInheritanceWithPackage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.pack;");
      _builder.newLine();
      _builder.append("class C {}");
      _builder.newLine();
      _builder.append("class D extends C {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMemberSelectionLeftAssociativity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { return this.m().m(); }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
      SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
      SJMethodBody _body = _head_1.getBody();
      EList<SJStatement> _statements = _body.getStatements();
      SJStatement _last = IterableExtensions.<SJStatement>last(_statements);
      this.assertAssociativity(_last, "((this.m).m)");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssignmentRightAssociativity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A f = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A g = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("f = g = null;");
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
      SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
      SJMethodBody _body = _head_1.getBody();
      EList<SJStatement> _statements = _body.getStatements();
      SJStatement _get = _statements.get(2);
      this.assertAssociativity(_get, "(f = (g = null))");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertAccessLevel(final SJProgram p, final int memberIndex, final SJAccessLevel access) {
    EList<SJClass> _classes = p.getClasses();
    SJClass _last = IterableExtensions.<SJClass>last(_classes);
    EList<SJMember> _members = _last.getMembers();
    SJMember _get = _members.get(memberIndex);
    SJAccessLevel _access = _get.getAccess();
    Assert.assertEquals(access, _access);
  }
  
  private void assertReturnExpressionOfType(final SJProgram p, final Class<? extends Object> type) {
    this._validationTestHelper.assertNoErrors(p);
    EList<SJClass> _classes = p.getClasses();
    SJClass _head = IterableExtensions.<SJClass>head(_classes);
    EList<SJMember> _members = _head.getMembers();
    SJMember _last = IterableExtensions.<SJMember>last(_members);
    SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(((SJMethod) _last));
    SJExpression _expression = _returnStatement.getExpression();
    Class<? extends SJExpression> _class = _expression.getClass();
    boolean _isAssignableFrom = type.isAssignableFrom(_class);
    Assert.assertTrue(_isAssignableFrom);
  }
  
  private void assertAssociativity(final SJStatement s, final CharSequence expected) {
    String _string = expected.toString();
    String _stringRepr = this.stringRepr(s);
    Assert.assertEquals(_string, _stringRepr);
  }
  
  private String stringRepr(final SJStatement s) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (s instanceof SJAssignment) {
        final SJAssignment _sJAssignment = (SJAssignment)s;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        SJExpression _left = _sJAssignment.getLeft();
        String _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" = ");
        SJExpression _right = _sJAssignment.getRight();
        String _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SJMemberSelection) {
        final SJMemberSelection _sJMemberSelection = (SJMemberSelection)s;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        SJExpression _receiver = _sJMemberSelection.getReceiver();
        String _stringRepr = this.stringRepr(_receiver);
        _builder.append(_stringRepr, "");
        _builder.append(".");
        SJMember _member = _sJMemberSelection.getMember();
        String _name = _member.getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SJThis) {
        final SJThis _sJThis = (SJThis)s;
        _matched=true;
        _switchResult = "this";
      }
    }
    if (!_matched) {
      if (s instanceof SJNew) {
        final SJNew _sJNew = (SJNew)s;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new ");
        SJClass _type = _sJNew.getType();
        String _name = _type.getName();
        _builder.append(_name, "");
        _builder.append("()");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SJNull) {
        final SJNull _sJNull = (SJNull)s;
        _matched=true;
        _switchResult = "null";
      }
    }
    if (!_matched) {
      if (s instanceof SJSymbolRef) {
        final SJSymbolRef _sJSymbolRef = (SJSymbolRef)s;
        _matched=true;
        SJSymbol _symbol = _sJSymbolRef.getSymbol();
        String _name = _symbol.getName();
        _switchResult = _name;
      }
    }
    if (!_matched) {
      if (s instanceof SJReturn) {
        final SJReturn _sJReturn = (SJReturn)s;
        _matched=true;
        SJExpression _expression = _sJReturn.getExpression();
        String _stringRepr = this.stringRepr(_expression);
        _switchResult = _stringRepr;
      }
    }
    return _switchResult;
  }
}
