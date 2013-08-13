package org.example.xtend.examples;

import com.google.common.base.Objects;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.BasicType;
import org.example.entities.entities.ElementType;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;

@SuppressWarnings("all")
public class XtendSwitch {
  public String toString(final AttributeType attributeType) {
    String _xblockexpression = null;
    {
      final ElementType elementType = attributeType.getElementType();
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
          Entity _entity = _entityType.getEntity();
          String _name = _entity.getName();
          _switchResult = _name;
        }
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public String switchExample(final Entity e, final Entity specialEntity) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      String _name = e.getName();
      int _length = _name.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _matched=true;
        _switchResult = "has a name";
      }
    }
    if (!_matched) {
      Entity _superType = e.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _matched=true;
        _switchResult = "has a super type";
      }
    }
    if (!_matched) {
      if (Objects.equal(e,specialEntity)) {
        _matched=true;
        _switchResult = "special entity";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
}
