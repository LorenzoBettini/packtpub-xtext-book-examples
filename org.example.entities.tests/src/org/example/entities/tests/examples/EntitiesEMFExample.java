package org.example.entities.tests.examples;

import org.example.entities.entities.Attribute;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;
import org.example.entities.entities.Model;

public class EntitiesEMFExample {

	public static void main(String[] args) {
		Entity superEntity = EntitiesFactory.eINSTANCE.createEntity();
		superEntity.setName("MySuperEntity");
		
		Entity entity = EntitiesFactory.eINSTANCE.createEntity();
		entity.setName("MyEntity");
		entity.setSuperType(superEntity);
		
		Attribute attribute = EntitiesFactory.eINSTANCE.createAttribute();
		attribute.setName("myattribute");
		AttributeType attributeType = EntitiesFactory.eINSTANCE.createAttributeType();
		attributeType.setArray(false);
		attributeType.setLength(10);
		EntityType entityType = EntitiesFactory.eINSTANCE.createEntityType();
		entityType.setEntity(superEntity);
		attributeType.setElementType(entityType);
		attribute.setType(attributeType);
		
		entity.getAttributes().add(attribute);

		Model model = EntitiesFactory.eINSTANCE.createModel();
		model.getEntities().add(superEntity);
		model.getEntities().add(entity);
	}
}
