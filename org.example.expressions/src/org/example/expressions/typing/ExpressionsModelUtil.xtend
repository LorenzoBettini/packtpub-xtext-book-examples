package org.example.expressions.typing

import org.example.expressions.expressions.AbstractElement
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.expressions.Variable

import static org.eclipse.emf.ecore.util.EcoreUtil.*

import static extension org.eclipse.xtext.EcoreUtil2.*

class ExpressionsModelUtil {
	def static variablesDefinedBefore(AbstractElement e) {
		val allElements = 
			e.getContainerOfType(typeof(ExpressionsModel)).
				elements
		val containingElement = allElements.findFirst[isAncestor(it, e)]
		allElements.subList(0, allElements.indexOf(containingElement)).
			typeSelect(typeof(Variable))
	}
}