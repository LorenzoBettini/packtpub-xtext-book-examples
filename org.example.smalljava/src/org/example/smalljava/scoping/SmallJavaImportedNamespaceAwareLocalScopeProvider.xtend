package org.example.smalljava.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class SmallJavaImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	override getImplicitImports(boolean ignoreCase) {
		newArrayList(new ImportNormalizer(
			QualifiedName::create("smalljava", "lang"), true, ignoreCase
		))
	}
}