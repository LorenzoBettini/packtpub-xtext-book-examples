package org.example.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.entities.EntitiesInjectorProvider
import org.example.entities.entities.Model
import org.junit.Test
import org.junit.runner.RunWith
import org.example.entities.entities.EntitiesPackage
import org.example.entities.validation.EntitiesValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesValidatorTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testDuplicateAttributesInDifferentEntitiesOK() {
		val model = '''
			entity MyEntity {
			    MyEntity attribute;
			}
			
			entity MyEntity2 {
			    MyEntity attribute;
			}
		'''.parse
		
		model.assertNoErrors
	}

	@Test
	def void testDuplicateEntities() {
		val model = '''
			entity MyEntity {}
			
			entity MyEntity {}
		'''.parse
		
		model.assertError(EntitiesPackage::eINSTANCE.entity, null,
			"Duplicate Entity 'MyEntity'"
		)
	}

	@Test
	def void testDuplicateAttributes() {
		val model = '''
			entity MyEntity {
			    MyEntity attribute;
			    MyEntity attribute2;
			    MyEntity attribute;
			}
		'''.parse
		
		model.assertError(EntitiesPackage::eINSTANCE.attribute, null,
			"Duplicate Attribute 'attribute'"
		)
	}

	@Test
	def void testAttributeWithTheSameNameOfAnEntityOK() {
		val model = '''
			entity MyEntity {
			    MyEntity MyEntity;
			}
		'''.parse
		
		model.assertNoErrors
	}

	@Test
	def void testEntityExtendsItself() {
		'''
			entity MyEntity extends MyEntity {
			    
			}
		'''.parse.assertError(EntitiesPackage::eINSTANCE.entity,
			EntitiesValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'MyEntity'"
		)
	}

	@Test
	def void testCycleInEntityHierarchy() {
		val model = '''
			entity A extends B {}
			entity B extends C {}
			entity C extends A {}
		'''.parse
		
		model.assertError(EntitiesPackage::eINSTANCE.entity,
			EntitiesValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'A'"
		)
		model.assertError(EntitiesPackage::eINSTANCE.entity,
			EntitiesValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'B'"
		)
		model.assertError(EntitiesPackage::eINSTANCE.entity,
			EntitiesValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'C'"
		)
	}

	@Test
	def void testEntityName() {
		'''entity myEntity {} '''.parse.
			assertWarning(
				EntitiesPackage::eINSTANCE.entity,
				EntitiesValidator::INVALID_ENTITY_NAME,
				"Entity name should start with a capital"
			)
	}

	@Test
	def void testAttributeName() {
		'''entity MyEntity { string S; } '''.parse.
			assertWarning(
				EntitiesPackage::eINSTANCE.attribute,
				EntitiesValidator::INVALID_ATTRIBUTE_NAME,
				"Attribute name should start with a lowercase"
			)
	}
}