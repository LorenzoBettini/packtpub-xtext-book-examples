package org.example.smalljava.validation

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.example.smalljava.smallJava.SJAccessLevel
import org.example.smalljava.smallJava.SJMember
import org.example.smalljava.typing.SmallJavaTypeConformance

import static extension org.example.smalljava.util.SmallJavaModelUtil.*

class SmallJavaAccessibility {
	
	@Inject extension SmallJavaTypeConformance
	
	def isAccessibleFrom(SJMember member, EObject context) {
		val contextClass = context.containingClass
		val memberClass = member.containingClass
		switch (contextClass) {
			case contextClass == memberClass : true
			case contextClass.isSubclassOf(memberClass) :
				member.access != SJAccessLevel::PRIVATE
			default:
				member.access == SJAccessLevel::PUBLIC
		}
	}
}