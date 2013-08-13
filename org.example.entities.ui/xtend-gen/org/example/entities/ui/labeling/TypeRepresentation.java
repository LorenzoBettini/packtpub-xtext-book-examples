package org.example.entities.ui.labeling;

import org.example.entities.entities.AttributeType;
import org.example.entities.entities.BasicType;
import org.example.entities.entities.ElementType;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;

@SuppressWarnings("all")
public class TypeRepresentation {
  public String representation(final AttributeType t) {
    String _xblockexpression = null;
    {
      final ElementType elementType = t.getElementType();
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (elementType instanceof BasicType) {
          final BasicType _basicType = (BasicType)elementType;
          _matched=true;
          String _typeName = _basicType.getTypeName();
          _switchResult = _typeName;
        }
      }
      if (!_matched) {
        if (elementType instanceof EntityType) {
          final EntityType _entityType = (EntityType)elementType;
          _matched=true;
          Entity _entity = null;
          if (_entityType!=null) {
            _entity=_entityType.getEntity();
          }
          String _name = _entity.getName();
          _switchResult = _name;
        }
      }
      final String elementTypeRepr = _switchResult;
      String _xifexpression = null;
      boolean _isArray = t.isArray();
      if (_isArray) {
        _xifexpression = "[]";
      } else {
        _xifexpression = "";
      }
      String _plus = (elementTypeRepr + _xifexpression);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
}
