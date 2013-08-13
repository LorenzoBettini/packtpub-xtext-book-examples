package org.example.xbase.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.xbase.entities.EntitiesInjectorProvider
import org.example.xbase.entities.entities.Model
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testCorrectParsing() {
		'''
			entity MyEntity {
			    attr String attribute;
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testAttributeWithType() {
		'''
			entity MyEntity {
			    attr MyEntity attribute;
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testAttributeWithoutType() {
		'''
			entity MyEntity {
			    attr attribute = new MyEntity();
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testImport() {
		'''
			import java.util.List
			import java.util.LinkedList
			
			entity MyEntity {
			    attr List<String> list = new LinkedList<String>();
			}
		'''.parse.assertNoErrors
	}
}