package org.example.xbase.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage
import org.example.xbase.expressions.ExpressionsInjectorProvider
import org.example.xbase.expressions.expressions.ExpressionsModel
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsValidatorTest {
	
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testForwardReference() {
		'''
		val j = i + 1 // forward reference
		val i = 10
		'''.parse.assertError(
			XbasePackage::eINSTANCE.XFeatureCall,
			Diagnostic::LINKING_DIAGNOSTIC,
			"Couldn't resolve reference to JvmIdentifiableElement 'i'"
		)
	}

}
