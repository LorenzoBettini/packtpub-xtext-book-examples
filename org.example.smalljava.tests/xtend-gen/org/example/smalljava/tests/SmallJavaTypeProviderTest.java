package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.typing.SmallJavaTypeProvider;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaTypeProviderTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private SmallJavaTypeProvider _smallJavaTypeProvider;
  
  private SJProgram assertType(final CharSequence testExp, final String expectedClassName) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class R { public V v; }");
      _builder.newLine();
      _builder.append("class P extends R { public R m() { return null; } }");
      _builder.newLine();
      _builder.append("class V extends R { public N n; }");
      _builder.newLine();
      _builder.append("class N extends R {}");
      _builder.newLine();
      _builder.append("class F extends R {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends R {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("F f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("V v = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(testExp, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
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
          SmallJavaTypeProviderTest.this._validationTestHelper.assertNoErrors(it);
          EList<SJClass> _classes = it.getClasses();
          SJClass _last = IterableExtensions.<SJClass>last(_classes);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
          SJMethod _last_1 = IterableExtensions.<SJMethod>last(_methods);
          SJMethodBody _body = _last_1.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          SJStatement _get = _statements.get(1);
          SJClass _statementExpressionType = SmallJavaTypeProviderTest.this.statementExpressionType(_get);
          String _name = _statementExpressionType.getName();
          Assert.assertEquals(expectedClassName, _name);
        }
      };
      return ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private SJClass statementExpressionType(final SJStatement s) {
    return this._smallJavaTypeProvider.typeFor(((SJExpression) s));
  }
  
  @Test
  public void thisType() {
    this.assertType("this", "C");
  }
  
  @Test
  public void paramRefType() {
    this.assertType("p", "P");
  }
  
  @Test
  public void varRefType() {
    this.assertType("v", "V");
  }
  
  @Test
  public void newType() {
    this.assertType("new N()", "N");
  }
  
  @Test
  public void fieldSelectionType() {
    this.assertType("this.f", "F");
  }
  
  @Test
  public void methodInvocationType() {
    this.assertType("this.m(new P())", "R");
  }
  
  @Test
  public void complexExpressionType() {
    this.assertType("p.m().v.n", "N");
  }
  
  @Test
  public void stringConstantType() {
    this.assertType("\"foo\"", "stringType");
  }
  
  @Test
  public void intConstantType() {
    this.assertType("10", "intType");
  }
  
  @Test
  public void boolConstantType() {
    this.assertType("true", "booleanType");
  }
  
  @Test
  public void nullType() {
    this.assertType("null", "nullType");
  }
  
  @Test
  public void testTypeForUnresolvedReferences() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("U m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("f ; // unresolved symbol");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.n(); // unresolved method ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.f; // unresolved field");
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
          EList<SJClass> _classes = it.getClasses();
          SJClass _head = IterableExtensions.<SJClass>head(_classes);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
          SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
          SJMethodBody _body = _head_1.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          final Procedure1<EList<SJStatement>> _function = new Procedure1<EList<SJStatement>>() {
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SJClass _statementExpressionType = SmallJavaTypeProviderTest.this.statementExpressionType(_get);
              Assert.assertNull(_statementExpressionType);
              SJStatement _get_1 = it.get(1);
              SJClass _statementExpressionType_1 = SmallJavaTypeProviderTest.this.statementExpressionType(_get_1);
              Assert.assertNull(_statementExpressionType_1);
              SJStatement _get_2 = it.get(2);
              SJClass _statementExpressionType_2 = SmallJavaTypeProviderTest.this.statementExpressionType(_get_2);
              Assert.assertNull(_statementExpressionType_2);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements, _function);
        }
      };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private EList<SJStatement> testStatements(final CharSequence statement) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class R {  }");
      _builder.newLine();
      _builder.append("class P1 {  }");
      _builder.newLine();
      _builder.append("class P2 {  }");
      _builder.newLine();
      _builder.append("class V {  }");
      _builder.newLine();
      _builder.append("class F {  }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("F f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P1 p1, P2 p2) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(statement, "\t\t");
      _builder.newLineIfNotEmpty();
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
      SJMethod _last_1 = IterableExtensions.<SJMethod>last(_methods);
      SJMethodBody _body = _last_1.getBody();
      return _body.getStatements();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertExpectedType(final SJExpression exp, final String expectedClassName) {
    SJClass _expectedType = this._smallJavaTypeProvider.expectedType(exp);
    String _name = _expectedType.getName();
    Assert.assertEquals(expectedClassName, _name);
  }
  
  @Test
  public void testVarDeclExpectedType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("V v = null;");
    EList<SJStatement> _testStatements = this.testStatements(_builder);
    SJStatement _head = IterableExtensions.<SJStatement>head(_testStatements);
    SJExpression _expression = ((SJVariableDeclaration) _head).getExpression();
    this.assertExpectedType(_expression, "V");
  }
  
  @Test
  public void testAssignmentExpectedType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.f = null;");
    EList<SJStatement> _testStatements = this.testStatements(_builder);
    SJStatement _head = IterableExtensions.<SJStatement>head(_testStatements);
    SJExpression _right = ((SJAssignment) _head).getRight();
    this.assertExpectedType(_right, "F");
  }
  
  @Test
  public void testReturnExpectedType() {
    EList<SJStatement> _testStatements = this.testStatements("");
    SJStatement _last = IterableExtensions.<SJStatement>last(_testStatements);
    SJExpression _expression = ((SJReturn) _last).getExpression();
    this.assertExpectedType(_expression, "R");
  }
  
  @Test
  public void testMethodInvocationArgsExpectedType() {
    EList<SJStatement> _testStatements = this.testStatements("this.m(new P1(), new P2());");
    SJStatement _head = IterableExtensions.<SJStatement>head(_testStatements);
    EList<SJExpression> _args = ((SJMemberSelection) _head).getArgs();
    final Procedure1<EList<SJExpression>> _function = new Procedure1<EList<SJExpression>>() {
      public void apply(final EList<SJExpression> it) {
        SJExpression _get = it.get(0);
        SmallJavaTypeProviderTest.this.assertExpectedType(_get, "P1");
        SJExpression _get_1 = it.get(1);
        SmallJavaTypeProviderTest.this.assertExpectedType(_get_1, "P2");
      }
    };
    ObjectExtensions.<EList<SJExpression>>operator_doubleArrow(_args, _function);
  }
  
  @Test
  public void testStandaloneMemberSelectionExpectedType() {
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
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
        public void apply(final SJProgram it) {
          SmallJavaTypeProviderTest.this._validationTestHelper.assertNoErrors(it);
          EList<SJClass> _classes = it.getClasses();
          SJClass _head = IterableExtensions.<SJClass>head(_classes);
          Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_head);
          SJMethod _head_1 = IterableExtensions.<SJMethod>head(_methods);
          SJMethodBody _body = _head_1.getBody();
          EList<SJStatement> _statements = _body.getStatements();
          final Procedure1<EList<SJStatement>> _function = new Procedure1<EList<SJStatement>>() {
            public void apply(final EList<SJStatement> it) {
              SJStatement _get = it.get(0);
              SJClass _expectedType = SmallJavaTypeProviderTest.this._smallJavaTypeProvider.expectedType(((SJExpression) _get));
              Assert.assertNull(_expectedType);
              SJStatement _get_1 = it.get(1);
              SJClass _expectedType_1 = SmallJavaTypeProviderTest.this._smallJavaTypeProvider.expectedType(((SJExpression) _get_1));
              Assert.assertNull(_expectedType_1);
            }
          };
          ObjectExtensions.<EList<SJStatement>>operator_doubleArrow(_statements, _function);
        }
      };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongMethodInvocationArgsExpectedType() {
    EList<SJStatement> _testStatements = this.testStatements("this.n(new P1(), new P2());");
    SJStatement _head = IterableExtensions.<SJStatement>head(_testStatements);
    EList<SJExpression> _args = ((SJMemberSelection) _head).getArgs();
    final Procedure1<EList<SJExpression>> _function = new Procedure1<EList<SJExpression>>() {
      public void apply(final EList<SJExpression> it) {
        SJExpression _get = it.get(0);
        SJClass _expectedType = SmallJavaTypeProviderTest.this._smallJavaTypeProvider.expectedType(_get);
        Assert.assertNull(_expectedType);
        SJExpression _get_1 = it.get(1);
        SJClass _expectedType_1 = SmallJavaTypeProviderTest.this._smallJavaTypeProvider.expectedType(_get_1);
        Assert.assertNull(_expectedType_1);
      }
    };
    ObjectExtensions.<EList<SJExpression>>operator_doubleArrow(_args, _function);
    EList<SJStatement> _testStatements_1 = this.testStatements("this.m(new P1(), new P2(), new P1());");
    SJStatement _head_1 = IterableExtensions.<SJStatement>head(_testStatements_1);
    EList<SJExpression> _args_1 = ((SJMemberSelection) _head_1).getArgs();
    SJExpression _get = _args_1.get(2);
    SJClass _expectedType = this._smallJavaTypeProvider.expectedType(_get);
    Assert.assertNull(_expectedType);
  }
  
  @Test
  public void testArgsTypesAsString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {}");
      _builder.newLine();
      _builder.append("class B {}");
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() { return this.m(); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A n(B b, C c) { return this.n(new B(), new C()); }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A p(Foo b, C c) { return this.p(new Foo(), new C()); }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _last = IterableExtensions.<SJClass>last(_classes);
      Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
      final Procedure1<Iterable<SJMethod>> _function = new Procedure1<Iterable<SJMethod>>() {
        public void apply(final Iterable<SJMethod> it) {
          SJMethod _get = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[0];
          String _methodInvocationArgsTypesAsString = SmallJavaTypeProviderTest.this.methodInvocationArgsTypesAsString(_get);
          Assert.assertEquals("()", _methodInvocationArgsTypesAsString);
          SJMethod _get_1 = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[1];
          String _methodInvocationArgsTypesAsString_1 = SmallJavaTypeProviderTest.this.methodInvocationArgsTypesAsString(_get_1);
          Assert.assertEquals("(B, C)", _methodInvocationArgsTypesAsString_1);
          SJMethod _get_2 = ((SJMethod[])Conversions.unwrapArray(it, SJMethod.class))[2];
          String _methodInvocationArgsTypesAsString_2 = SmallJavaTypeProviderTest.this.methodInvocationArgsTypesAsString(_get_2);
          Assert.assertEquals("(null, C)", _methodInvocationArgsTypesAsString_2);
        }
      };
      ObjectExtensions.<Iterable<SJMethod>>operator_doubleArrow(_methods, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String methodInvocationArgsTypesAsString(final SJMethod m) {
    SJReturn _returnStatement = SmallJavaModelUtil.returnStatement(m);
    SJExpression _expression = _returnStatement.getExpression();
    return this._smallJavaTypeProvider.argsTypesAsStrings(((SJMemberSelection) _expression));
  }
}
