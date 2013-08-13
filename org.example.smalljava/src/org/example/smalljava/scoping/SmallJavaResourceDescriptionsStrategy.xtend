package org.example.smalljava.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.example.smalljava.smallJava.SJProgram

/*
 * If you enable this strategy, the NamesAreUniqueValidator will not
 * work as expected.
 */
@Singleton
class SmallJavaResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
	
	@Inject extension IQualifiedNameProvider
	
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof SJProgram) {
			(eObject as SJProgram).classes.forEach[
				sjClass |
				val fullyQualifiedName = sjClass.fullyQualifiedName
				if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, sjClass
						)
					)
			]
			true
		} else
			false
	}
}