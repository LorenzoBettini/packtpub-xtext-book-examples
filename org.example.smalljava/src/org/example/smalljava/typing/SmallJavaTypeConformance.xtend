package org.example.smalljava.typing

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.example.smalljava.lib.SmallJavaLib
import org.example.smalljava.smallJava.SJClass

import static org.example.smalljava.typing.SmallJavaTypeProvider.*

import static extension org.example.smalljava.util.SmallJavaModelUtil.*

class SmallJavaTypeConformance {
	
	@Inject extension IQualifiedNameProvider
	
	def isConformant(SJClass c1, SJClass c2) {
		c1 == nullType || // null can be assigned to everything
		(conformToLibraryTypes(c1, c2)) ||
		c1 == c2 ||
		c2.fullyQualifiedName.toString == SmallJavaLib::LIB_OBJECT ||
		c1.isSubclassOf(c2)
	}

	def conformToLibraryTypes(SJClass c1, SJClass c2) {
		(c1.conformsToString && c2.conformsToString) ||
		(c1.conformsToInt && c2.conformsToInt) ||
		(c1.conformsToBoolean && c2.conformsToBoolean)
	}

	def conformsToString(SJClass c) {
		c == stringType ||
		c.fullyQualifiedName.toString == SmallJavaLib::LIB_STRING
	}

	def conformsToInt(SJClass c) {
		c == intType ||
		c.fullyQualifiedName.toString == SmallJavaLib::LIB_INTEGER
	}

	def conformsToBoolean(SJClass c) {
		c == booleanType ||
		c.fullyQualifiedName.toString == SmallJavaLib::LIB_BOOLEAN
	}

	def isSubclassOf(SJClass c1, SJClass c2) {
		c1.classHierarchy.contains(c2)
	}

}