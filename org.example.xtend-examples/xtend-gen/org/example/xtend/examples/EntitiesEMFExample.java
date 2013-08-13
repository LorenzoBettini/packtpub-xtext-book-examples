package org.example.xtend.examples;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.entities.entities.Attribute;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;

@SuppressWarnings("all")
public class EntitiesEMFExample {
  public static void main(final String[] args) {
    final Entity superEntity = EntitiesFactory.eINSTANCE.createEntity();
    superEntity.setName("MySuperEntity");
    Entity _createEntity = EntitiesFactory.eINSTANCE.createEntity();
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
        public void apply(final Entity it) {
          it.setName("MyEntity");
          it.setSuperType(superEntity);
          EList<Attribute> _attributes = it.getAttributes();
          Attribute _createAttribute = EntitiesFactory.eINSTANCE.createAttribute();
          final Procedure1<Attribute> _function = new Procedure1<Attribute>() {
              public void apply(final Attribute it) {
                it.setName("myattribute");
                AttributeType _createAttributeType = EntitiesFactory.eINSTANCE.createAttributeType();
                final Procedure1<AttributeType> _function = new Procedure1<AttributeType>() {
                    public void apply(final AttributeType it) {
                      it.setArray(false);
                      it.setLength(10);
                      EntityType _createEntityType = EntitiesFactory.eINSTANCE.createEntityType();
                      final Procedure1<EntityType> _function = new Procedure1<EntityType>() {
                          public void apply(final EntityType it) {
                            it.setEntity(superEntity);
                          }
                        };
                      EntityType _doubleArrow = ObjectExtensions.<EntityType>operator_doubleArrow(_createEntityType, _function);
                      it.setElementType(_doubleArrow);
                    }
                  };
                AttributeType _doubleArrow = ObjectExtensions.<AttributeType>operator_doubleArrow(_createAttributeType, _function);
                it.setType(_doubleArrow);
              }
            };
          Attribute _doubleArrow = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function);
          _attributes.add(_doubleArrow);
        }
      };
    ObjectExtensions.<Entity>operator_doubleArrow(_createEntity, _function);
  }
}
