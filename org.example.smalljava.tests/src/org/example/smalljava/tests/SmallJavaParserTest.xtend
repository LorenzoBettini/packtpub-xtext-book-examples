package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJAccessLevel
import org.example.smalljava.smallJava.SJAssignment
import org.example.smalljava.smallJava.SJIfStatement
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SJNew
import org.example.smalljava.smallJava.SJNull
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SJReturn
import org.example.smalljava.smallJava.SJStatement
import org.example.smalljava.smallJava.SJSymbolRef
import org.example.smalljava.smallJava.SJThis
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaParserTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	
	@Test def testClass() {
		'''class C { }'''.parse.assertNoErrors
	}

	@Test def testClassWithSuperclass() {
		'''class C { } class D extends C { }'''.parse.assertNoErrors
	}

	@Test def testClassWithFieldsAndMethods() {
		'''
		class C { } 
		
		class D extends C {
			C c;
			C m(C p1, D p2) { return null; }
		}'''.parse.assertNoErrors
	}

	@Test def testVariableDecl() {
		'''
		class C { } 
		
		class D extends C {
			C m(C p1, D p2) { 
				D d = null;
				return d;
			}
		}'''.parse.assertNoErrors
	}

	@Test def testMethodInvocation() {
		'''
		class C {
			C m() {
				C c = this.m();
				return this.m();
			}
		}
		'''.parse.
		assertReturnExpressionOfType(typeof(SJMemberSelection))
	}

	@Test def testFieldSelection() {
		'''
		class C {
			C f;
			C m() {
				C c = this.f;
				return this.f;
			}
		}
		'''.parse.
		assertReturnExpressionOfType(typeof(SJMemberSelection))
	}
	
	@Test def void testVisibility() {
		'''
		class C { } 
		
		class D extends C {
			C c1;
			public C c2;
			private C c3;
			protected C c4;
		}'''.parse => [
			assertNoErrors;
			assertAccessLevel(0, SJAccessLevel::PRIVATE)
			assertAccessLevel(1, SJAccessLevel::PUBLIC)
			assertAccessLevel(2, SJAccessLevel::PRIVATE)
			assertAccessLevel(3, SJAccessLevel::PROTECTED)
		]
	}

	@Test def void testElse() {
		'''
		class C {
			C c;
			C m() {
				if (true)
					if (false)
						this.c = null;
					else
						this.c = null;
				return this.c;
			}
		}
		'''.parse => [
			assertNoErrors
			val ifS = ((classes.head.members.get(1) as SJMethod).
				body.statements.head as SJIfStatement)
			ifS.elseBlock.assertNull
			// thus the else is associated to the inner if
		]
	}

	@Test def void testElseWithBlock() {
		'''
		class C {
			C c;
			C m() {
				if (true) {
					if (false)
						this.c = null;
				} else
						this.c = null;
				return this.c;
			}
		}
		'''.parse => [
			assertNoErrors
			val ifS = ((classes.head.members.get(1) as SJMethod).
				body.statements.head as SJIfStatement)
			ifS.elseBlock.assertNotNull
			// thus the else is associated to the outer if
		]
	}

	@Test def void testPackage() {
		'''
		package my.pack;
		'''.parse.assertNoErrors
	}

	@Test def void testInheritanceWithPackage() {
		'''
		package my.pack;
		class C {}
		class D extends C {}
		'''.parse.assertNoErrors
	}

	@Test def void testMemberSelectionLeftAssociativity() {
		'''
		class A {
			A m() { return this.m().m(); }
		}
		'''.parse.classes.head.methods.head.
			body.statements.last.
			assertAssociativity("((this.m).m)")
	}

	@Test def void testAssignmentRightAssociativity() {
		'''
		class A {
			A m() {
				A f = null;
				A g = null;
				f = g = null;
				return null;
			}
		}
		'''.parse.classes.head.methods.head.
			body.statements.get(2).
			assertAssociativity("(f = (g = null))")
	}

	def private assertAccessLevel(SJProgram p, int memberIndex, SJAccessLevel access) {
		access.assertEquals(
			p.classes.last.members.get(memberIndex).access)
	}
	
	def private assertReturnExpressionOfType(SJProgram p, Class<?> type) {
		p.assertNoErrors
		assertTrue(
			type.isAssignableFrom(
				(p.classes.head.members.last as SJMethod).
					returnStatement.expression.class
				)
		)
	}

	def private assertAssociativity(SJStatement s, CharSequence expected) {
		expected.toString.assertEquals(s.stringRepr)
	}

	def private String stringRepr(SJStatement s) {
		switch (s) {
			SJAssignment: '''(«s.left.stringRepr» = «s.right.stringRepr»)'''
			SJMemberSelection: '''(«s.receiver.stringRepr».«s.member.name»)'''
			SJThis: "this"
			SJNew: '''new «s.type.name»()'''
			SJNull: "null"
			SJSymbolRef: s.symbol.name
			SJReturn: s.expression.stringRepr
		}
	}
}