package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.typing.SmallJavaTypeConformance
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import org.example.smalljava.typing.SmallJavaTypeProvider
import org.example.smalljava.lib.SmallJavaLib
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaTypeConformanceTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension SmallJavaTypeConformance
	@Inject extension SmallJavaTypeProvider
	
	@Inject extension SmallJavaLib

	@Test def void testClassConformance() {
		'''
		class A {}
		class B extends A {}
		class C {}
		'''.parse.classes => [
			// A subclass of A
			get(0).isConformant(get(0)).assertTrue
			// B subclass of A
			get(1).isConformant(get(0)).assertTrue
			// C not subclass of A
			get(2).isConformant(get(0)).assertFalse
		]
	}

	@Test def void testNullConformance() {
		'''
		class C {}
		class D {
			C m() { return null; }
		}
		'''.parse.classes => [
			val typeOfNull = last.methods.head.
				returnStatement.expression.typeFor
			
			// null can be assigned to anything
			typeOfNull.isConformant(get(0)).assertTrue
			typeOfNull.isConformant(get(1)).assertTrue
		]
	}

	@Test def void testStringConformance() {
		'''
		class A {
			String m() { return "foo"; }
		}
		'''.parse(loadLib).assertNoErrors
	}

	@Test def void testIntConformance() {
		'''
		class A {
			Integer m() { return 10; }
		}
		'''.parse(loadLib).assertNoErrors
	}

	@Test def void testBooleanConformance() {
		'''
		class A {
			Boolean m() { return true; }
		}
		'''.parse(loadLib).assertNoErrors
	}

	@Test def void testBooleanAcceptedByIfStatement() {
		'''
		class A {
			A m() {
				if (new Boolean()) {
					return null;
				}
				return null;
			}
		}
		'''.parse(loadLib).assertNoErrors
	}

	@Test def void testEveryClassExtendsObject() {
		'''
		class A {
			Object m() {
				return new A();
			}
		}
		'''.parse(loadLib).assertNoErrors
	}

	@Test def void testStringConformantToObject() {
		'''
		class A {
			Object m() {
				return "a";
			}
		}
		'''.parse(loadLib).assertNoErrors
	}

}