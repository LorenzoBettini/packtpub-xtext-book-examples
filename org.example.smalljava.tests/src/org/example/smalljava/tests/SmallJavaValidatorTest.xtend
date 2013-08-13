package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.lib.SmallJavaLib
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SmallJavaPackage
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import org.example.smalljava.validation.SmallJavaValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaValidatorTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension SmallJavaLib

	@Test def void testClassHierarchyCycle() {
		'''
		class A extends C {}
		class C extends B {}
		class B extends A {}
		'''.parse => [
			assertHierarchyCycle("A")
			assertHierarchyCycle("B")
			assertHierarchyCycle("C")
		]
	}

	def private void assertHierarchyCycle(SJProgram p, String expectedClassName) {
		p.assertError(
			SmallJavaPackage::eINSTANCE.SJClass,
			SmallJavaValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of class '" + expectedClassName + "'"
		)
	}

	@Test def void testUnreachableCode() {
		'''
		class C {
			C m() {
				return null;
				this.m();
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::UNREACHABLE_CODE,
			"Unreachable code"
		)
	}

	@Test def void testMissingFinalReturn() {
		'''
		class C {
			C m() {
				this.m();
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMethod,
			SmallJavaValidator::MISSING_FINAL_RETURN,
			"Method must end with a return statement"
		)
	}

	@Test def void testDuplicateMethods() {
		'''
		class C {
			C m() { return null; }
			C m() { return null; }
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMethod,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate member 'm'"
		)
	}

	@Test def void testDuplicateFields() {
		'''
		class C {
			C f;
			C f;
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJField,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate member 'f'"
		)
	}

	@Test def void testFieldAndMethodWithTheSameNameAreOK() {
		'''
		class C {
			C f;
			C f() { return null; }
		}
		'''.parse.assertNoErrors
	}

	@Test def void testDuplicateClasses() {
		'''
		class C {}
		class C {}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJClass,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate class 'C'"
		)
	}
	
	@Test def void testDuplicateClassesInFiles() {
		val first = '''
		package my.first.pack;
		
		class C {}'''.parse
		
		'''
		package my.first.pack;
		class D {}
		class C {}
		'''.parse(first.eResource.resourceSet).assertError(
				SmallJavaPackage::eINSTANCE.SJClass,
				SmallJavaValidator::DUPLICATE_CLASS,
				"The type C is already defined"
		)
		
		first.assertError(
			SmallJavaPackage::eINSTANCE.SJClass,
			SmallJavaValidator::DUPLICATE_CLASS,
			"The type C is already defined"
		)
	}

	@Test def void testDuplicateClassesWithDifferentQNAreOK() {
		val first = '''
		package my.first.pack;
		
		class C {}'''.parse
		
		'''
		package my.second.pack;
		class C {}
		'''.parse(first.eResource.resourceSet).assertNoErrors
	}

	@Test def void testDuplicateVariables() {
		'''
		class C {
			C m() {
				C v1 = null;
				if (true) {
					C v1 = null;
				}
				return null;
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJVariableDeclaration,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate variable declaration 'v1'"
		)
	}

	@Test def void testVariableForwardReferences() {
		'''
		class C {
			C m(C p) {
				C v1 = null;
				C v2 = null;
				if (true) {
					C v3 = p;
					C v4 = v5; // defined after
					C v5 = v2;
				} else {
					v6 = null; // defined after
				}
				C v6 = null;
			
				return null;
			}
		}
		'''.parse => [
			assertError(
				SmallJavaPackage::eINSTANCE.SJSymbolRef,
				Diagnostic::LINKING_DIAGNOSTIC,
				"Couldn't resolve reference to SJSymbol 'v6'"
			)
			assertError(
				SmallJavaPackage::eINSTANCE.SJSymbolRef,
				Diagnostic::LINKING_DIAGNOSTIC,
				"Couldn't resolve reference to SJSymbol 'v5'"
			)
		]
	}

	@Test def void testFieldAccessibility() {
		'''
		class A {
			private A priv;
			protected A prot;
			public A pub;
			A m() {
				this.priv = null; // private field
				this.prot = null; // protected field
				this.pub = null; // public field
				return null;
			}
		}
		
		class B extends A {
			A m() {
				this.priv = null; // private field ERROR
				this.prot = null; // protected field
				this.pub = null; // public field
				return null;
			}
		}
		'''.parse => [
			1.assertEquals(validate.size)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The private member priv is not accessible here"
			)
		]
	}
	
	@Test def void testFieldAccessibilityInSubclass() {
		'''
		class A {
			private A priv;
			protected A prot;
			public A pub;
			A m() {
				this.priv = null; // private field
				this.prot = null; // protected field
				this.pub = null; // public field
				return null;
			}
		}
		
		class C {
			A m() {
				(new A()).priv = null; // private field ERROR
				(new A()).prot = null; // protected field ERROR
				(new A()).pub = null; // public field
				return null;
			}
		}
		'''.parse => [
			2.assertEquals(validate.size)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The private member priv is not accessible here"
			)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The protected member prot is not accessible here"
			)
		]
	}

	@Test def void testMethodAccessibility() {
		'''
		class A {
			private A priv() { return null; }
			protected A prot() { return null; }
			public A pub() { return null; }
			A m() {
				A a = null;
				a = this.priv(); // private method
				a = this.prot(); // protected method
				a = this.pub(); // public method
				return null;
			}
		}
		
		class B extends A {
			A m() {
				A a = null;
				a = this.priv(); // private method ERROR
				a = this.prot(); // protected method
				a = this.pub(); // public method
				return null;
			}
		}
		'''.parse => [
			1.assertEquals(validate.size)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The private member priv is not accessible here"
			)
		]
	}
	
	@Test def void testMethodAccessibilityInSubclass() {
		'''
		class A {
			private A priv() { return null; }
			protected A prot() { return null; }
			public A pub() { return null; }
			A m() {
				A a = null;
				a = this.priv(); // private method
				a = this.prot(); // protected method
				a = this.pub(); // public method
				return null;
			}
		}
		
		class C {
			A m() {
				A a = null;
				a = (new A()).priv(); // private method ERROR
				a = (new A()).prot(); // protected method ERROR
				a = (new A()).pub(); // public method
				return null;
			}
		}
		'''.parse => [
			2.assertEquals(validate.size)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The private member priv is not accessible here"
			)
			assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::MEMBER_NOT_ACCESSIBLE,
				"The protected member prot is not accessible here"
			)
		]
	}

	@Test def void invocationOnField() {
		'''
		class A {
			A f;
			A m() {
				return this.f();
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::METHOD_INVOCATION_ON_FIELD,
			"Method invocation on a field"
		)
	}

	@Test def void fieldSelectionOnMethod() {
		'''
		class A {
			A m() {
				return this.m;
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::FIELD_SELECTION_ON_METHOD,
			"Field selection on a method"
		)
	}

	@Test def void selectionOnPrimitiveType() {
		'''
		class A {
			A m() {
				return "a".m();
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			Diagnostic::LINKING_DIAGNOSTIC,
			"Couldn't resolve reference to SJMember 'm'"
		)
	}
	
	@Test def void testNoExpectedType() {
		'''
		class A {
			A a;
			A m() { this.a; this.m(); return null; }
		}
		'''.parse.assertNoErrors
	}

	@Test def void assertVariableDeclExpIncompatibleTypes() {
		"V v = new P();".
		assertIncompatibleTypes(
			SmallJavaPackage::eINSTANCE.SJNew,
			"V", "P"
		)
	}

	@Test def void assertAssignmentExpIncompatibleTypes() {
		"V v = null; v = new P();".
		assertIncompatibleTypes(
			SmallJavaPackage::eINSTANCE.SJNew,
			"V", "P"
		)
	}

	@Test def void assertReturnExpIncompatibleTypes() {
		"return p;".
		assertIncompatibleTypes(
			SmallJavaPackage::eINSTANCE.SJSymbolRef,
			"R", "P"
		)
	}

	@Test def void assertArgExpIncompatibleTypes() {
		"this.n(new F(), new V());" => [
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew,
				"P1", "F"
			)
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew,
				"P2", "V"
			)
		]
	}

	@Test def void assertIfExpressionIncompatibleTypes() {
		"if (new F()) { return null; } ".
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew,
				"booleanType", "F"
			)
	}
	
	def void assertIncompatibleTypes(CharSequence methodBody, EClass c, String expectedType, String actualType) {
		'''
		class F {}
		class R {}
		class P {}
		class P1 {}
		class P2 {}
		class V {}
		class C {
			F f;
			R m(P p) {
				«methodBody»
			}
			R n(P1 p1, P2 p2) { return null; }
		}
		'''.parse.assertIncompatibleTypes(c, expectedType, actualType)
	}

	@Test def void testInvalidNumberOfArgs() {
		'''
		class A {}
		class B {}
		class C {
			C m(A a, B b) { return this.m(new B()); }
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::INVALID_ARGS,
			'''Invalid number of arguments. The method m(A, B) : C is not applicable for the arguments (B)'''
		)
	}

	@Test def void testWrongMethodOverride() {
		'''
		class A {
			A m(A a) { return null; }
		}
		
		class B extends A {
			// parameters must have the same type
			A m(B a) { return null; }
		}
		
		class C extends A {
			// return type can be a subtype
			B m(A a) { return null; }
		}
		'''.parse => [
			assertError(SmallJavaPackage::eINSTANCE.SJMethod,
				SmallJavaValidator::WRONG_METHOD_OVERRIDE,
				"The method 'm' must override a superclass method"
			)
			1.assertEquals(validate.size)
		]
	}

	@Test def void testWrongSuperUsage() {
		'''
		class C {
			C m() {
				return super;
			}
		}
		'''.parse.assertError(SmallJavaPackage::eINSTANCE.SJSuper,
			SmallJavaValidator::WRONG_SUPER_USAGE,
			"'super' can be used only as member selection receiver"
		)
	}

	@Test def void testWrongBooleanStringConformance() {
		'''
		class A {
			Boolean m() { return "a"; }
		}
		'''.parse(loadLib).assertIncompatibleTypes(
			SmallJavaPackage::eINSTANCE.SJStringConstant,
			"Boolean", "stringType"
		)
	}
	
	def private assertIncompatibleTypes(EObject o, EClass c, String expectedType, String actualType) {
		o.assertError(
			c, SmallJavaValidator::INCOMPATIBLE_TYPES,
			"Incompatible types. Expected '" + expectedType
					+ "' but was '" + actualType + "'"
		)
	}
}