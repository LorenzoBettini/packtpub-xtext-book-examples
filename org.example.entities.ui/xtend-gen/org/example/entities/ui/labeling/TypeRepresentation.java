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
          _matched=true;
          _switchResult = ((BasicType)elementType).getTypeName();
        }
      }
      if (!_matched) {
        if (elementType instanceof EntityType) {
          _matched=true;
          Entity _entity = null;
          if (((EntityType)elementType)!=null) {
            _entity=((EntityType)elementType).getEntity();
          }
          _switchResult = _entity.getName();
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
      _xblockexpression = ((elementTypeRepr + _xifexpression));
    }
    return _xblockexpression;
  }
}
