package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;

@SuppressWarnings("all")
public class WithOperator {
  public Entity m() {
    Entity _createEntity = EntitiesFactory.eINSTANCE.createEntity();
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      @Override
      public void apply(final Entity it) {
        it.setName("MyEntity");
      }
    };
    return ObjectExtensions.<Entity>operator_doubleArrow(_createEntity, _function);
  }
  
  public Entity n() {
    final Entity entity = EntitiesFactory.eINSTANCE.createEntity();
    entity.setName("MyEntity");
    return entity;
  }
  
  public static void main(final String[] args) {
  }
}
