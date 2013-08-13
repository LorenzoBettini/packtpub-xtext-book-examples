package org.example.smalljava.lib

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.example.smalljava.scoping.SmallJavaIndex
import org.example.smalljava.smallJava.SJClass

import static extension org.example.smalljava.util.SmallJavaModelUtil.*

class SmallJavaLib {
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	@Inject extension SmallJavaIndex
	
	@Inject extension IQualifiedNameProvider
	
	public val static LIB_PACKAGE = "smalljava.lang"
	
	public val static LIB_OBJECT = LIB_PACKAGE + ".Object"
	
	public val static LIB_STRING = LIB_PACKAGE + ".String"
	
	public val static LIB_INTEGER = LIB_PACKAGE + ".Integer"
	
	public val static LIB_BOOLEAN = LIB_PACKAGE + ".Boolean"
	
	public val static MAIN_LIB = "smalljava/lang/mainlib.smalljava"
	
	def loadLib() {
		val stream = getClass().getClassLoader().getResourceAsStream(MAIN_LIB)
		
		resourceSetProvider.get() => [
			resourceSet |
			
			val resource = resourceSet.createResource(URI::createURI(MAIN_LIB))
			resource.load(stream, resourceSet.getLoadOptions())
		]
	}
	
	def getClassHierarchyWithObject(SJClass c) {
		var hierarchy = c.classHierarchy
		if (hierarchy.last?.fullyQualifiedName?.toString != LIB_OBJECT) {
			val smallJavaObjectClass = getSmallJavaObjectClass(c)
			if (smallJavaObjectClass != null)
				hierarchy += smallJavaObjectClass
		}
		hierarchy
	}

	def getSuperclassOrObject(SJClass c) {
		c.superclass ?: getSmallJavaObjectClass(c)
	}

	def getSmallJavaObjectClass(EObject context) {
		val desc = context.getVisibleClassesDescriptions.findFirst[
			qualifiedName.toString == LIB_OBJECT]
		
		if (desc == null)
			return null
		
		var o = desc.EObjectOrProxy
		if (o.eIsProxy)
			o = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
		
		o as SJClass
	}

}