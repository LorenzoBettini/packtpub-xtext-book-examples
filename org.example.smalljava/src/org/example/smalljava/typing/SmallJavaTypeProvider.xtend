package org.example.smalljava.typing

import org.example.smalljava.smallJava.SJAssignment
import org.example.smalljava.smallJava.SJBoolConstant
import org.example.smalljava.smallJava.SJExpression
import org.example.smalljava.smallJava.SJIntConstant
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SJNew
import org.example.smalljava.smallJava.SJNull
import org.example.smalljava.smallJava.SJReturn
import org.example.smalljava.smallJava.SJStringConstant
import org.example.smalljava.smallJava.SJSymbolRef
import org.example.smalljava.smallJava.SJThis
import org.example.smalljava.smallJava.SJVariableDeclaration
import org.example.smalljava.smallJava.SmallJavaFactory
import org.example.smalljava.smallJava.SmallJavaPackage

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import org.example.smalljava.smallJava.SJSuper
import com.google.inject.Inject
import org.example.smalljava.lib.SmallJavaLib
import org.example.smalljava.smallJava.SJClass

class SmallJavaTypeProvider {
	
	@Inject extension SmallJavaLib
	
	val ep = SmallJavaPackage::eINSTANCE
	
	public static val stringType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name = 'stringType']
	public static val intType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name = 'intType']
	public static val booleanType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name = 'booleanType']

	public static val nullType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name = 'nullType']
	
	def typeFor(SJExpression e) {
		switch (e) {
			SJThis : e.containingClass
			SJSuper : e.containingClass.getSuperclassOrObject
			SJSymbolRef: e.symbol?.type
			SJNew: e.type
			SJMemberSelection: e.member?.type
			SJNull: nullType
			SJStringConstant: stringType
			SJIntConstant: intType
			SJBoolConstant: booleanType
		}
	}

	def expectedType(SJExpression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			SJVariableDeclaration case f == ep.SJVariableDeclaration_Expression : 
				c.type
			SJAssignment case f == ep.SJAssignment_Right : 
				c.left.typeFor
			SJReturn case f == ep.SJReturn_Expression :
				c.containingMethod.type
			SJMemberSelection case f == ep.SJMemberSelection_Args : {
				// assume that it refers to a method and that there
				// is a parameter corresponding to the argument
				try {
					(c.member as SJMethod).params.get(c.args.indexOf(e)).type
				} catch (Throwable t) {
					null // otherwise there is no specific expected type
				}
			}
			case f == ep.SJIfStatement_Expression: booleanType
		}
	}

	def argsTypesAsStrings(SJMemberSelection sel) {
		"(" + sel.args.map[typeFor?.name].join(", ") + ")"
	}

	def isPrimitive(SJClass c) {
		c.eResource == null
	}
}