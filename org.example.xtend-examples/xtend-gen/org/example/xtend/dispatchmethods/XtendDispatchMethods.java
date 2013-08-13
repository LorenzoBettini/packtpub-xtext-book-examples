package org.example.xtend.dispatchmethods;

import java.util.Arrays;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.BasicType;
import org.example.entities.entities.ElementType;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;

@SuppressWarnings("all")
public class XtendDispatchMethods {
  public String toString(final AttributeType attributeType) {
    ElementType _elementType = attributeType.getElementType();
    String _typeToString = this.typeToString(_elementType);
    return _typeToString;
  }
  
  protected String _typeToString(final BasicType type) {
    String _typeName = type.getTypeName();
    return _typeName;
  }
  
  protected String _typeToString(final EntityType type) {
    Entity _entity = type.getEntity();
    String _name = _entity.getName();
    return _name;
  }
  
  public String typeToString(final ElementType type) {
    if (type instanceof BasicType) {
      return _typeToString((BasicType)type);
    } else if (type instanceof EntityType) {
      return _typeToString((EntityType)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
