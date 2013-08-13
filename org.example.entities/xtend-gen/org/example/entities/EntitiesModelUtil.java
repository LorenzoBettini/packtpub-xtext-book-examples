package org.example.entities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.Model;

@SuppressWarnings("all")
public class EntitiesModelUtil {
  public static Entity addEntityAfter(final Entity entity, final String nameOfEntityToAdd) {
    Entity _xblockexpression = null;
    {
      EObject _eContainer = entity.eContainer();
      final Model model = ((Model) _eContainer);
      Entity _createEntity = EntitiesFactory.eINSTANCE.createEntity();
      final Procedure1<Entity> _function = new Procedure1<Entity>() {
          public void apply(final Entity it) {
            it.setName(nameOfEntityToAdd);
            EList<Entity> _entities = model.getEntities();
            EList<Entity> _entities_1 = model.getEntities();
            int _indexOf = _entities_1.indexOf(entity);
            int _plus = (_indexOf + 1);
            _entities.add(_plus, it);
          }
        };
      Entity _doubleArrow = ObjectExtensions.<Entity>operator_doubleArrow(_createEntity, _function);
      _xblockexpression = (_doubleArrow);
    }
    return _xblockexpression;
  }
}
