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
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(current, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _contains = visited.contains(current);
        boolean _not = (!_contains);
        _and = (_notEquals && _not);
      }
      boolean _while = _and;
      while (_while) {
        {
          visited.add(current);
          SJClass _superclass = current.getSuperclass();
          current = _superclass;
        }
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(current, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          boolean _contains_1 = visited.contains(current);
          boolean _not_1 = (!_contains_1);
          _and_1 = (_notEquals_1 && _not_1);
        }
        _while = _and_1;
      }
      _xblockexpression = (visited);
    }
    return _xblockexpression;
  }
  
  public static Iterable<SJField> fields(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    Iterable<SJField> _filter = Iterables.<SJField>filter(_members, SJField.class);
    return _filter;
  }
  
  public static Iterable<SJMethod> methods(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    Iterable<SJMethod> _filter = Iterables.<SJMethod>filter(_members, SJMethod.class);
    return _filter;
  }
  
  public static SJReturn returnStatement(final SJMethod m) {
    SJMethodBody _body = m.getBody();
    EList<SJStatement> _statements = _body.getStatements();
    List<SJReturn> _typeSelect = EcoreUtil2.<SJReturn>typeSelect(_statements, SJReturn.class);
    SJReturn _head = IterableExtensions.<SJReturn>head(_typeSelect);
    return _head;
  }
  
  public static SJClass containingClass(final EObject e) {
    SJClass _containerOfType = EcoreUtil2.<SJClass>getContainerOfType(e, SJClass.class);
    return _containerOfType;
  }
  
  public static SJMethod containingMethod(final EObject e) {
    SJMethod _containerOfType = EcoreUtil2.<SJMethod>getContainerOfType(e, SJMethod.class);
    return _containerOfType;
  }
  
  public static SJProgram containingProgram(final EObject e) {
    SJProgram _containerOfType = EcoreUtil2.<SJProgram>getContainerOfType(e, SJProgram.class);
    return _containerOfType;
  }
  
  public static SJBlock containingBlock(final EObject e) {
    SJBlock _containerOfType = EcoreUtil2.<SJBlock>getContainerOfType(e, SJBlock.class);
    return _containerOfType;
  }
  
  public static String memberAsString(final SJMember m) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (m instanceof SJField) {
        final SJField _sJField = (SJField)m;
        _matched=true;
        String _name = _sJField.getName();
        _switchResult = _name;
      }
    }
    if (!_matched) {
      if (m instanceof SJMethod) {
        final SJMethod _sJMethod = (SJMethod)m;
        _matched=true;
        String _name = _sJMethod.getName();
        String _plus = (_name + "(");
        String _paramsTypesAsString = SmallJavaModelUtil.paramsTypesAsString(_sJMethod);
        String _plus_1 = (_plus + _paramsTypesAsString);
        String _plus_2 = (_plus_1 + ")");
        _switchResult = _plus_2;
      }
    }
    return _switchResult;
  }
  
  public static String paramsTypesAsString(final SJMethod m) {
    EList<SJParameter> _params = m.getParams();
    final Function1<SJParameter,String> _function = new Function1<SJParameter,String>() {
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
    String _join = IterableExtensions.join(_map, ", ");
    return _join;
  }
  
  public static String memberAsStringWithType(final SJMember m) {
    String _memberAsString = SmallJavaModelUtil.memberAsString(m);
    String _plus = (_memberAsString + " : ");
    SJClass _type = m.getType();
    String _name = _type.getName();
    String _plus_1 = (_plus + _name);
    return _plus_1;
  }
}
