package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJAssignment
import org.example.smalljava.smallJava.SJExpression
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SJVariableDeclaration
import org.example.smalljava.typing.SmallJavaTypeProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*
import org.example.smalljava.smallJava.SJReturn
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SJStatement

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaTypeProviderTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension SmallJavaTypeProvider
	
	def private assertType(CharSequence testExp, String expectedClassName) {
		'''
		class R { public V v; }
		class P extends R { public R m() { return null; } }
		class V extends R { public N n; }
		class N extends R {}
		class F extends R {}
		
		class C extends R {
			F f;
			
			R m(P p) {
				V v = null;
				«testExp»;
				return null;
			}
		}
		'''.parse => [
			assertNoErrors
			expectedClassName.assertEquals(
				classes.last.methods.last.
					body.statements.get(1).
						statementExpressionType.name
			)
		]
	}

	def private statementExpressionType(SJStatement s) {
		(s as SJExpression).typeFor
	}
	
	@Test def void thisType() {
		"this".assertType("C")
	}
	
	@Test def void paramRefType() {
		"p".assertType("P")
	}
	
	@Test def void varRefType() {
		"v".assertType("V")
	}

	@Test def void newType() {
		"new N()".assertType("N")
	}

	@Test def void fieldSelectionType() {
		"this.f".assertType("F")
	}

	@Test def void methodInvocationType() {
		"this.m(new P())".assertType("R")
	}

	@Test def void complexExpressionType() {
		"p.m().v.n".assertType("N")
	}

	@Test def void stringConstantType() {
		'"foo"'.assertType("stringType")
	}

	@Test def void intConstantType() {
		'10'.assertType("intType")
	}

	@Test def void boolConstantType() {
		'true'.assertType("booleanType")
	}

	@Test def void nullType() {
		'null'.assertType("nullType")
	}

	@Test def void testTypeForUnresolvedReferences() {
		'''
		class C {
			U m() {
				f ; // unresolved symbol
				this.n(); // unresolved method 
				this.f; // unresolved field
				return null;
			}
		}
		'''.parse => [
			classes.head.methods.head.body.statements => [
				get(0).statementExpressionType.assertNull
				get(1).statementExpressionType.assertNull
				get(2).statementExpressionType.assertNull
			]
		]
	}

	def private testStatements(CharSequence statement) {
		'''
		class R {  }
		class P1 {  }
		class P2 {  }
		class V {  }
		class F {  }
		
		class C {
			F f;
			R m(P1 p1, P2 p2) {
				«statement»
				return null;
			}
		}
		'''.parse.classes.last.methods.last.body.statements
	}

	def private assertExpectedType(SJExpression exp, String expectedClassName) {
		expectedClassName.assertEquals(exp.expectedType.name)
	}

	@Test def void testVarDeclExpectedType() {
		('''V v = null;'''.testStatements.head as SJVariableDeclaration).
			expression.assertExpectedType("V")
	}

	@Test def void testAssignmentExpectedType() {
		('''this.f = null;'''.testStatements.head as SJAssignment).
			right.assertExpectedType("F")
	}

	@Test def void testReturnExpectedType() {
		("".testStatements.last as SJReturn).
			expression.assertExpectedType("R")
	}

	@Test def void testMethodInvocationArgsExpectedType() {
		("this.m(new P1(), new P2());".testStatements.head as SJMemberSelection).
			args => [
				get(0).assertExpectedType("P1")
				get(1).assertExpectedType("P2")
			]
	}

	@Test def void testStandaloneMemberSelectionExpectedType() {
		// a standalone method invocation has no expected type
		'''
		class A {
			A a;
			A m() { this.a; this.m(); return null; }
		}
		'''.parse => [
			assertNoErrors
			classes.head.methods.head.body.statements => [
				(get(0) as SJExpression).expectedType.assertNull;
				(get(1) as SJExpression).expectedType.assertNull
			]
		]
	}

	@Test def void testWrongMethodInvocationArgsExpectedType() {
		// method n does not exist
		("this.n(new P1(), new P2());".testStatements.head as SJMemberSelection).
			args => [
				get(0).expectedType.assertNull
				get(1).expectedType.assertNull
			]
		
		// too many arguments
		("this.m(new P1(), new P2(), new P1());".testStatements.head as SJMemberSelection).
			args.get(2).expectedType.assertNull
	}

	@Test def void testArgsTypesAsString() {
		'''
		class A {}
		class B {}
		class C {
			A m() { return this.m(); }
			A n(B b, C c) { return this.n(new B(), new C()); }
			A p(Foo b, C c) { return this.p(new Foo(), new C()); }
		}'''.parse.classes.last.methods => [
			"()".assertEquals(get(0).methodInvocationArgsTypesAsString)
			"(B, C)".assertEquals(get(1).methodInvocationArgsTypesAsString)
			"(null, C)".assertEquals(get(2).methodInvocationArgsTypesAsString)
		]
	}
	
	def private methodInvocationArgsTypesAsString(SJMethod m) {
		(m.returnStatement.expression as SJMemberSelection).
			argsTypesAsStrings
	}
}