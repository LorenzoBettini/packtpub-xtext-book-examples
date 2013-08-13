package org.example.smalljava.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SJSymbolRef
import org.example.smalljava.smallJava.SJVariableDeclaration
import org.example.smalljava.smallJava.SmallJavaPackage
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaScopeProviderTest {
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider
	
	@Inject Provider<ResourceSet> resourceSetProvider;

	@Test def void testScopeProvider() {
		'''
		class C {
			A f;
			A m(A p) {
				A v = null;
				return null;
			}
		}
		class A {}
		'''.parse.classes.head.
		methods.last.returnStatement.expression => [
			assertScope
			(SmallJavaPackage::eINSTANCE.SJMemberSelection_Member, 
				"f, m, C.f, C.m")
			assertScope
			(SmallJavaPackage::eINSTANCE.SJSymbolRef_Symbol, 
				"v, p")
			// before the custom scoping it was
			// "p, v, m.p, m.v, C.m.p, C.m.v"
		]
	}

	@Test def void testScopeProviderForMember() {
		'''
		class C {
			C f;
			C m(C p) {
				C v = null;
				return null;
			}
		}
		'''.parse.classes.head.
		methods.last.returnStatement.expression => [
			assertScope
			(SmallJavaPackage::eINSTANCE.SJMemberSelection_Member, 
				"f, m, C.f, C.m")
		]
	}

	@Test def void testScopeProviderForSymbols() {
		'''
		class C {
			A m(A p) {
				A v1 = null;
				if (true) {
					A v2 = null;
					A v3 = null;
				}
				A v4 = null;
				return null;
			}
		}
		class A {}
		'''.parse.classes.head.
		methods.last.body.eAllContents.filter(typeof(SJVariableDeclaration)) => [
			findFirst[name == 'v3'].expression.
			assertScope
			(SmallJavaPackage::eINSTANCE.SJSymbolRef_Symbol, 
				"v2, v1, p")
			// before the custom scoping it was
			// "p, v1, v2, v3, v4, m.p, m.v1, m.v2, m.v3, m.v4, C.m.p, C.m.v1, C.m.v2, C.m.v3, C.m.v4"
			findFirst[name == 'v4'].expression.
			assertScope
			(SmallJavaPackage::eINSTANCE.SJSymbolRef_Symbol, 
				"v1, p")
			// before the custom scoping it was
			// "p, v1, v2, v3, v4, m.p, m.v1, m.v2, m.v3, m.v4, C.m.p, C.m.v1, C.m.v2, C.m.v3, C.m.v4"
			
		]
	}
	
	@Test def void testFieldsScoping() {
		'''
		class C { 
			C a;
		}
		
		class D extends C {
			C b;
			C m(C p1, D p2) { return this.b; }
		}'''.parse.classes.last.methods.get(0).
			returnStatement.expression.
			assertScope
			(SmallJavaPackage::eINSTANCE.SJMemberSelection_Member, "b, m, a")
			// before custom scoping was: "b, m, C.a, D.b, D.m"
	}

	@Test def void testMethodsScoping() {
		'''
		class C { 
			C n() { return null; }
		}
		
		class D extends C {
			C f;
			C m() { return this.m(); }
		}'''.parse.classes.last.methods.get(0).
			returnStatement.expression.
			assertScope
			(SmallJavaPackage::eINSTANCE.SJMemberSelection_Member, "m, f, n")
			// before custom scoping was: "m, C.n, D.m"
	}

	@Test def void testSymbolScoping() {
		'''
		class C {
			C m(C p) {
				C v1 = null;
				if (true) {
					C v2 = p;
					if (true) {
						C v3 = v1;
					}
				} else {
					C v4 = v1;
				}
				C v5 = v1;
			
				return null;
			}
		}
		'''.parse.classes.last.methods.get(0).
			eAllContents.filter(typeof(SJVariableDeclaration)) => [
				findFirst[name == "v3"].expression.assertScope
				(SmallJavaPackage::eINSTANCE.SJSymbolRef_Symbol, 
				"v2, v1, p")
			]
		// before custom scoping was:
		// p, v1, v2, v3, v4, v5, m.p, m.v1, m.v2, m.v3, m.v4, m.v5, C.m.p, C.m.v1, C.m.v2, C.m.v3, C.m.v4, C.m.v5
	}

	@Test def void testFieldScoping() {
		'''
		class A { 
			D a;
			D b;
			D c;
		}
		
		class B extends A {
			D b;
		}
		
		class C extends B {
			D a;
			D m() { return this.a; }
			D n() { return this.b; }
			D p() { return this.c; }
		}
		class D{}
		'''.parse.classes => [
			// a in this.a must refer to C.a
			get(2).fields.get(0).assertSame
				(get(2).methods.get(0).returnExpSel.member)
			// b in this.b must refer to B.b
			get(1).fields.get(0).assertSame
				(get(2).methods.get(1).returnExpSel.member)
			// c in this.c must refer to A.c
			get(0).fields.get(2).assertSame
				(get(2).methods.get(2).returnExpSel.member)
		]
	}

	@Test def void testMethodScoping() {
		'''
		class A { 
			D n() { return null; }
			D m() { return null; }
			D o() { return null; }
		}
		
		class B extends A { 
			D n() { return null; }
		}
		
		class C extends B {
			D m() { return this.m(); }
			D p() { return this.n(); }
			D q() { return this.o(); }
		}
		class D {}
		'''.parse.classes => [
			// m in this.m() must refer to C.m
			get(2).methods.get(0).assertSame
				(get(2).methods.get(0).returnExpSel.member)
			// n in this.n() must refer to B.n
			get(1).methods.get(0).assertSame
				(get(2).methods.get(1).returnExpSel.member)
			// o in this.o() must refer to B.n
			get(0).methods.get(2).assertSame
				(get(2).methods.get(2).returnExpSel.member)
		]
	}

	@Test def void testVariableShadowsParamScoping() {
		'''
		class C {
			A m(A a) {
				A a = null;
				return a;
			}
		}
		class A {}
		'''.parse.classes.head.methods.head => [
			returnStatement.expression.assertScope
				(SmallJavaPackage::eINSTANCE.SJSymbolRef_Symbol, 
				"a")
		]
	}

	@Test def void testFieldsAndMethodsWithTheSameName() {
		'''
		class C {
			A f;
			A f() {
				return this.f(); // must refer to method f
			}
			A m() {
				return this.m; // must refer to field m
			}
			A m;
		}
		class A {}
		'''.parse.classes.head => [
			// must refer to method f()
			methods.head.assertSame(
				methods.head.returnExpSel.member
			)
			// must refer to field m
			fields.last.assertSame(
				methods.last.returnExpSel.member
			)
		]
	}

	@Test def void testVariableShadowsParamLinking() {
		'''
		class A {
			A m(A a) {
				A a = null;
				return a;
			}
		}
		'''.parse.classes.head.methods.head => [
			assertNoErrors
			// the local variable should shadow the param
			body.statements.head.assertSame(
				(returnStatement.expression as SJSymbolRef).symbol)
		]
	}

	@Test def void testSuperScoping() {
		'''
		class B {
			C f;
			C g;
			C m() { return null; }
		}
		
		class C extends B {
			C f;
			C m() { return this.m(); }
			C p() { return super.m(); }
			C m2() { return this.f; }
			C p2() { return super.f; }
		}'''.parse.classes => [
			// m in this.m() must refer to C.m
			get(1).methods.get(0).assertSame
				(get(1).methods.get(0).returnExpSel.member)
			// m in super.m() must refer to B.m
			get(0).methods.get(0).assertSame
				(get(1).methods.get(1).returnExpSel.member)
			// f in this.f must refer to C.f
			get(1).fields.get(0).assertSame
				(get(1).methods.get(2).returnExpSel.member)
			// f in super.f must refer to B.f
			get(0).fields.get(0).assertSame
				(get(1).methods.get(3).returnExpSel.member)
		]
	}

	@Test def void testAccessToOtherFileClass() {
		val first = '''
		package my.first.pack;
		
		class C { 
			C c;
			C m() { return null; }
		}'''.parse
		
		'''
		package my.second.pack;
		class D extends my.first.pack.C { }
		'''.parse(first.eResource.resourceSet).
			assertNoErrors
	}

	@Test def void testImports() {
		val first = '''
		package my.first.pack;
		
		class C1 { }
		class C2 { }'''.parse
		
		'''
		package my.second.pack;
		class D1 { }
		class D2 { }
		'''.parse(first.eResource.resourceSet)
		
		'''
		package my.third.pack;
		
		import my.first.pack.C1;
		import my.second.pack.*;
		
		class E extends C1 { // C1 is imported
			my.first.pack.C2 c; // C2 not imported
			D1 d1; // D1 imported by wildcard
			D2 d2; // D2 imported by wildcard
		}
		'''.parse(first.eResource.resourceSet).
			assertNoErrors
	}

	@Test def void testSymbolReferences() {
		'''
		class C {
			C m(C p) {
				C v1 = null;
				C v2 = null;
				if (true) {
					C v3 = p;
					C v4 = v3;
					C v5 = v2;
					if (true) {
						v1 = null;
						v2 = v5;
					}
				} else {
					v2 = v1;
				}
				C v6 = v2;
			
				return null;
			}
		}
		'''.parse.assertNoErrors
	}

	@Test def void testGlobalScoping() {
		val first = '''
		package my.first.pack;
		class C { }'''.parse
		
		'''
		package my.second.pack;
		class D { }
		'''.parse(first.eResource.resourceSet).
		classes.get(0).assertScope(
			SmallJavaPackage::eINSTANCE.SJClass_Superclass,
			"D, my.second.pack.D, my.first.pack.C"
		)
	}

	@Test def void testTwoFiles() {
		val resourceSet = resourceSetProvider.get
		
		val first = '''
		class B extends A {}
		'''.parse(resourceSet)
		val second = '''
		class A { B b; }
		'''.parse(resourceSet)
		
		first.assertNoErrors
		second.assertNoErrors
		
		second.classes.head.assertSame(first.classes.head.superclass)
	}

	@Test def void testTwoFilesAlternative() {
		val first = '''
		class B extends A {}
		'''.parse
		val second = '''
		class A { B b; }
		'''.parse(first.eResource.resourceSet)
		
		first.assertNoErrors
		second.assertNoErrors
		
		second.classes.head.assertSame(first.classes.head.superclass)
	}

	@Test def void testPackagesAndClassQualifiedNames() {
		val first = '''
		package my.first.pack;
		class B extends my.second.pack.A {}
		'''.parse
		val second = '''
		package my.second.pack;
		class A { 
			my.first.pack.B b;
		}
		'''.parse(first.eResource.resourceSet)
		
		first.assertNoErrors
		second.assertNoErrors
		
		second.classes.head.assertSame(first.classes.head.superclass)
	}

	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		context.assertNoErrors
		expected.toString.assertEquals(
			context.getScope(reference).
				allElements.map[name].join(", "))
//				allElements.map[
//					if (name != qualifiedName)
//						name + "->" + qualifiedName
//					else
//						qualifiedName
//				].join(", "))
	}
	
	def private returnExpSel(SJMethod m) {
		m.returnStatement.expression as SJMemberSelection
	}
}