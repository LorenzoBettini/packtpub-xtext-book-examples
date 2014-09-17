package org.example.smalljava.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.example.smalljava.smallJava.SJBlock;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;

@SuppressWarnings("all")
public class SmallJavaModelUtil {
  public static ArrayList<SJClass> classHierarchy(final SJClass c) {
    ArrayList<SJClass> _xblockexpression = null;
    {
      final ArrayList<SJClass> visited = CollectionLiterals.<SJClass>newArrayList();
      SJClass current = c.getSuperclass();
      while (((!Objects.equal(current, null)) && (!visited.contains(current)))) {
        {
          visited.add(current);
          SJClass _superclass = current.getSuperclass();
          current = _superclass;
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public static Iterable<SJField> fields(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    return Iterables.<SJField>filter(_members, SJField.class);
  }
  
  public static Iterable<SJMethod> methods(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    return Iterables.<SJMethod>filter(_members, SJMethod.class);
  }
  
  public static SJReturn returnStatement(final SJMethod m) {
    SJMethodBody _body = m.getBody();
    EList<SJStatement> _statements = _body.getStatements();
    List<SJReturn> _typeSelect = EcoreUtil2.<SJReturn>typeSelect(_statements, SJReturn.class);
    return IterableExtensions.<SJReturn>head(_typeSelect);
  }
  
  public static SJClass containingClass(final EObject e) {
    return EcoreUtil2.<SJClass>getContainerOfType(e, SJClass.class);
  }
  
  public static SJMethod containingMethod(final EObject e) {
    return EcoreUtil2.<SJMethod>getContainerOfType(e, SJMethod.class);
  }
  
  public static SJProgram containingProgram(final EObject e) {
    return EcoreUtil2.<SJProgram>getContainerOfType(e, SJProgram.class);
  }
  
  public static SJBlock containingBlock(final EObject e) {
    return EcoreUtil2.<SJBlock>getContainerOfType(e, SJBlock.class);
  }
  
  public static String memberAsString(final SJMember m) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (m instanceof SJField) {
        _matched=true;
        _switchResult = ((SJField)m).getName();
      }
    }
    if (!_matched) {
      if (m instanceof SJMethod) {
        _matched=true;
        String _name = ((SJMethod)m).getName();
        String _plus = (_name + "(");
        String _paramsTypesAsString = SmallJavaModelUtil.paramsTypesAsString(((SJMethod)m));
        String _plus_1 = (_plus + _paramsTypesAsString);
        _switchResult = (_plus_1 + ")");
      }
    }
    return _switchResult;
  }
  
  public static String paramsTypesAsString(final SJMethod m) {
    EList<SJParameter> _params = m.getParams();
    final Function1<SJParameter, String> _function = new Function1<SJParameter, String>() {
      public String apply(final SJParameter it) {
        SJClass _type = it.getType();
        String _name = null;
        if (_type!=null) {
          _name=_type.getName();
        }
        return _name;
      }
    };
    List<String> _map = ListExtensions.<SJParameter, String>map(_params, _function);
    return IterableExtensions.join(_map, ", ");
  }
  
  public static String memberAsStringWithType(final SJMember m) {
    String _memberAsString = SmallJavaModelUtil.memberAsString(m);
    String _plus = (_memberAsString + " : ");
    SJClass _type = m.getType();
    String _name = _type.getName();
    return (_plus + _name);
  }
}
