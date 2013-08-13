package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJClass
import org.example.smalljava.smallJava.SJProgram
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaModelUtilTest {
	@Inject extension ParseHelper<SJProgram>
	
	@Test def void testValidHierarchy() {
		'''
		class C {}
		
		class D extends C {}
		
		class E extends D {}'''.parse.classes => [
			get(0).assertHierarchy("")
			get(1).assertHierarchy("C")
			get(2).assertHierarchy("D, C")
		]
	}

	@Test def void testCyclicHierarchy() {
		'''
		class C extends E {}
		
		class D extends C {}
		
		class E extends D {}'''.parse.classes => [
			get(0).assertHierarchy("E, D, C")
			get(1).assertHierarchy("C, E, D")
			get(2).assertHierarchy("D, C, E")
		]
	}

	@Test def void testReturnStatement() {
		'''
		class C {
			C m() {
				this.m();
				return null;
				this.m();
			}
		}
		'''.parse.classes.head.methods.head => [
			body.statements.get(1).
				assertSame(returnStatement)
		]
	}

	@Test def void testMethodAsStringWithType() {
		'''
		class A {}
		class B {}
		class C {
			A m() { return null; }
			A n(B b, C c) { return null; }
			A p(Foo b, C c) { return null; }
		}
		'''.parse.classes.last.methods => [
			"m() : A".assertEquals(get(0).memberAsStringWithType)
			"n(B, C) : A".assertEquals(get(1).memberAsStringWithType)
			"p(null, C) : A".assertEquals(get(2).memberAsStringWithType)
		]
	}

	def private assertHierarchy(SJClass c, CharSequence expected) {
		expected.toString.assertEquals(
			c.classHierarchy.map[name].join(", "))
	}
	


}