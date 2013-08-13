package org.example.smalljava.util

import org.eclipse.emf.ecore.EObject
import org.example.smalljava.smallJava.SJBlock
import org.example.smalljava.smallJava.SJClass
import org.example.smalljava.smallJava.SJField
import org.example.smalljava.smallJava.SJMember
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SJReturn

import static extension org.eclipse.xtext.EcoreUtil2.*

class SmallJavaModelUtil {

	def static classHierarchy(SJClass c) {
		val visited = <SJClass>newArrayList()

		var current = c.superclass
		while (current != null && !visited.contains(current)) {
			visited.add(current)
			current = current.superclass
		}

		visited
	}

	def static fields(SJClass c) {
		c.members.filter(typeof(SJField))
	}

	def static methods(SJClass c) {
		c.members.filter(typeof(SJMethod))
	}

	def static returnStatement(SJMethod m) {
		m.body.statements.typeSelect(typeof(SJReturn)).head
	}

	def static containingClass(EObject e) {
		e.getContainerOfType(typeof(SJClass))
	}

	def static containingMethod(EObject e) {
		e.getContainerOfType(typeof(SJMethod))
	}

	def static containingProgram(EObject e) {
		e.getContainerOfType(typeof(SJProgram))
	}

	def static containingBlock(EObject e) {
		e.getContainerOfType(typeof(SJBlock))
	}

	def static memberAsString(SJMember m) {
		switch (m) {
			SJField: m.name
			SJMethod: m.name + "(" +
				m.paramsTypesAsString + ")"
		}
	}
	
	def static paramsTypesAsString(SJMethod m) {
		m.params.map[type?.name].join(", ")
	}

	def static memberAsStringWithType(SJMember m) {
		m.memberAsString + " : " + m.type.name
	}

}
