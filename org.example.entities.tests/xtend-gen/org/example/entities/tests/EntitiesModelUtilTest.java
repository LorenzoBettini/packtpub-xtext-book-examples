package org.example.entities.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.entities.EntitiesModelUtil;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.Model;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class EntitiesModelUtilTest {
  private final EntitiesFactory factory = EntitiesFactory.eINSTANCE;
  
  @Test
  public void testAddEntityAfter() {
    Entity _createEntity = this.factory.createEntity();
    final Procedure1<Entity> _function = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        it.setName("First");
      }
    };
    final Entity e1 = ObjectExtensions.<Entity>operator_doubleArrow(_createEntity, _function);
    Entity _createEntity_1 = this.factory.createEntity();
    final Procedure1<Entity> _function_1 = new Procedure1<Entity>() {
      public void apply(final Entity it) {
        it.setName("Second");
      }
    };
    final Entity e2 = ObjectExtensions.<Entity>operator_doubleArrow(_createEntity_1, _function_1);
    Model _createModel = this.factory.createModel();
    final Procedure1<Model> _function_2 = new Procedure1<Model>() {
      public void apply(final Model it) {
        EList<Entity> _entities = it.getEntities();
        _entities.add(e1);
        EList<Entity> _entities_1 = it.getEntities();
        _entities_1.add(e2);
      }
    };
    final Model model = ObjectExtensions.<Model>operator_doubleArrow(_createModel, _function_2);
    Entity _addEntityAfter = EntitiesModelUtil.addEntityAfter(e1, "Added");
    Assert.assertNotNull(_addEntityAfter);
    EList<Entity> _entities = model.getEntities();
    int _size = _entities.size();
    Assert.assertEquals(3, _size);
    EList<Entity> _entities_1 = model.getEntities();
    Entity _get = _entities_1.get(0);
    String _name = _get.getName();
    Assert.assertEquals("First", _name);
    EList<Entity> _entities_2 = model.getEntities();
    Entity _get_1 = _entities_2.get(1);
    String _name_1 = _get_1.getName();
    Assert.assertEquals("Added", _name_1);
    EList<Entity> _entities_3 = model.getEntities();
    Entity _get_2 = _entities_3.get(2);
    String _name_2 = _get_2.getName();
    Assert.assertEquals("Second", _name_2);
  }
}
