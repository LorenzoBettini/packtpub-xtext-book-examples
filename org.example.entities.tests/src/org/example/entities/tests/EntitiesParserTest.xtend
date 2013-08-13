package org.example.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.entities.EntitiesInjectorProvider
import org.example.entities.entities.Model
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.example.entities.entities.EntityType
import org.example.entities.entities.BasicType

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testCorrectParsing() {
		'''
			entity MyEntity {
			    MyEntity attribute;
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testParsing() {
		val model = '''
			entity MyEntity {
			    MyEntity attribute;
			}
		'''.parse
		model.assertNoErrors
		
		val entity = model.entities.get(0)
		Assert::assertEquals("MyEntity", entity.name)
		
		val property = entity.attributes.get(0)
		Assert::assertEquals("attribute", property.name);
		Assert::assertEquals("MyEntity", 
			(property.type.elementType as EntityType).entity.name);
	}

	@Test
	def void testArray() {
		val model = '''
			entity MyEntity {
			    MyEntity[] arrayAttr;
			    MyEntity[10] arrayAttrWithDimension;
			    MyEntity notArrayAttr;
			    string stringAttr;
			    int[] intArrayAttr;
			}
		'''.parse
		model.assertNoErrors
		
		val entity = model.entities.get(0)
		Assert::assertEquals("MyEntity", entity.name)
		
		var property = entity.attributes.get(0)
		Assert::assertEquals("arrayAttr", property.name);
		Assert::assertTrue(property.type.isArray());
		Assert::assertEquals(0, property.type.length);
		
		property = entity.attributes.get(1)
		Assert::assertEquals("arrayAttrWithDimension", property.name);
		Assert::assertTrue(property.type.isArray());
		Assert::assertEquals(10, property.type.length);
		
		property = entity.attributes.get(2)
		Assert::assertEquals("notArrayAttr", property.name);
		Assert::assertFalse(property.type.isArray());
		
		property = entity.attributes.get(3)
		Assert::assertEquals("stringAttr", property.name);
		Assert::assertFalse(property.type.array);
		Assert::assertEquals("string", 
			(property.type.elementType as BasicType).typeName);

		property = entity.attributes.get(4)
		Assert::assertEquals("intArrayAttr", property.name);
		Assert::assertTrue(property.type.array);
		Assert::assertEquals("int", 
			(property.type.elementType as BasicType).typeName);
	}
	
	@Test
	def void testParsingAndLinking() {
		'''
			entity MyEntity {
			    MyEntity2 attribute;
			}
			
			entity MyEntity2 {
			    MyEntity attribute;
			}
		'''.parse.assertNoErrors
	}
}