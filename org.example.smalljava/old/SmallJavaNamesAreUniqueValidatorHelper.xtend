package org.example.smalljava.validation

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper
import org.example.smalljava.smallJava.SJVariableDeclaration

class SmallJavaNamesAreUniqueValidatorHelper extends NamesAreUniqueValidationHelper {
	override getDuplicateNameErrorMessage(IEObjectDescription description, EClass clusterType, EStructuralFeature feature) {
		val object = description.EObjectOrProxy
		if (object instanceof SJVariableDeclaration) {
			"Duplicate variable declaration '" + 
				(object as SJVariableDeclaration).name + "'"
		} else {
			super.getDuplicateNameErrorMessage(description, clusterType, feature)			
		}
	}
}