package org.example.smalljava.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.lib.SmallJavaLib;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSuper;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaFactory;
import org.example.smalljava.smallJava.SmallJavaPackage;
import org.example.smalljava.util.SmallJavaModelUtil;

@SuppressWarnings("all")
public class SmallJavaTypeProvider {
  @Inject
  @Extension
  private SmallJavaLib _smallJavaLib;
  
  private final SmallJavaPackage ep = SmallJavaPackage.eINSTANCE;
  
  public final static SJClass stringType = ObjectExtensions.<SJClass>operator_doubleArrow(
    SmallJavaFactory.eINSTANCE.createSJClass(), new Procedure1<SJClass>() {
    public void apply(final SJClass it) {
      it.setName("stringType");
    }
  });
  
  public final static SJClass intType = ObjectExtensions.<SJClass>operator_doubleArrow(
    SmallJavaFactory.eINSTANCE.createSJClass(), new Procedure1<SJClass>() {
    public void apply(final SJClass it) {
      it.setName("intType");
    }
  });
  
  public final static SJClass booleanType = ObjectExtensions.<SJClass>operator_doubleArrow(
    SmallJavaFactory.eINSTANCE.createSJClass(), new Procedure1<SJClass>() {
    public void apply(final SJClass it) {
      it.setName("booleanType");
    }
  });
  
  public final static SJClass nullType = ObjectExtensions.<SJClass>operator_doubleArrow(
    SmallJavaFactory.eINSTANCE.createSJClass(), new Procedure1<SJClass>() {
    public void apply(final SJClass it) {
      it.setName("nullType");
    }
  });
  
  public SJClass typeFor(final SJExpression e) {
    SJClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof SJThis) {
        _matched=true;
        _switchResult = SmallJavaModelUtil.containingClass(e);
      }
    }
    if (!_matched) {
      if (e instanceof SJSuper) {
        _matched=true;
        SJClass _containingClass = SmallJavaModelUtil.containingClass(e);
        _switchResult = this._smallJavaLib.getSuperclassOrObject(_containingClass);
      }
    }
    if (!_matched) {
      if (e instanceof SJSymbolRef) {
        _matched=true;
        SJSymbol _symbol = ((SJSymbolRef)e).getSymbol();
        SJClass _type = null;
        if (_symbol!=null) {
          _type=_symbol.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJNew) {
        _matched=true;
        _switchResult = ((SJNew)e).getType();
      }
    }
    if (!_matched) {
      if (e instanceof SJMemberSelection) {
        _matched=true;
        SJMember _member = ((SJMemberSelection)e).getMember();
        SJClass _type = null;
        if (_member!=null) {
          _type=_member.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJNull) {
        _matched=true;
        _switchResult = SmallJavaTypeProvider.nullType;
      }
    }
    if (!_matched) {
      if (e instanceof SJStringConstant) {
        _matched=true;
        _switchResult = SmallJavaTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof SJIntConstant) {
        _matched=true;
        _switchResult = SmallJavaTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof SJBoolConstant) {
        _matched=true;
        _switchResult = SmallJavaTypeProvider.booleanType;
      }
    }
    return _switchResult;
  }
  
  public SJClass expectedType(final SJExpression e) {
    SJClass _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      SJClass _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (c instanceof SJVariableDeclaration) {
          EReference _sJVariableDeclaration_Expression = this.ep.getSJVariableDeclaration_Expression();
          boolean _equals = Objects.equal(f, _sJVariableDeclaration_Expression);
          if (_equals) {
            _matched=true;
            _switchResult = ((SJVariableDeclaration)c).getType();
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJAssignment) {
          EReference _sJAssignment_Right = this.ep.getSJAssignment_Right();
          boolean _equals = Objects.equal(f, _sJAssignment_Right);
          if (_equals) {
            _matched=true;
            SJExpression _left = ((SJAssignment)c).getLeft();
            _switchResult = this.typeFor(_left);
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJReturn) {
          EReference _sJReturn_Expression = this.ep.getSJReturn_Expression();
          boolean _equals = Objects.equal(f, _sJReturn_Expression);
          if (_equals) {
            _matched=true;
            SJMethod _containingMethod = SmallJavaModelUtil.containingMethod(c);
            _switchResult = _containingMethod.getType();
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJMemberSelection) {
          EReference _sJMemberSelection_Args = this.ep.getSJMemberSelection_Args();
          boolean _equals = Objects.equal(f, _sJMemberSelection_Args);
          if (_equals) {
            _matched=true;
            SJClass _xtrycatchfinallyexpression = null;
            try {
              SJMember _member = ((SJMemberSelection)c).getMember();
              EList<SJParameter> _params = ((SJMethod) _member).getParams();
              EList<SJExpression> _args = ((SJMemberSelection)c).getArgs();
              int _indexOf = _args.indexOf(e);
              SJParameter _get = _params.get(_indexOf);
              _xtrycatchfinallyexpression = _get.getType();
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                final Throwable t = (Throwable)_t;
                _xtrycatchfinallyexpression = null;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _switchResult = _xtrycatchfinallyexpression;
          }
        }
      }
      if (!_matched) {
        EReference _sJIfStatement_Expression = this.ep.getSJIfStatement_Expression();
        boolean _equals = Objects.equal(f, _sJIfStatement_Expression);
        if (_equals) {
          _matched=true;
          _switchResult = SmallJavaTypeProvider.booleanType;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public String argsTypesAsStrings(final SJMemberSelection sel) {
    EList<SJExpression> _args = sel.getArgs();
    final Function1<SJExpression,String> _function = new Function1<SJExpression,String>() {
      public String apply(final SJExpression it) {
        SJClass _typeFor = SmallJavaTypeProvider.this.typeFor(it);
        String _name = null;
        if (_typeFor!=null) {
          _name=_typeFor.getName();
        }
        return _name;
      }
    };
    List<String> _map = ListExtensions.<SJExpression, String>map(_args, _function);
    String _join = IterableExtensions.join(_map, ", ");
    String _plus = ("(" + _join);
    return (_plus + ")");
  }
  
  public boolean isPrimitive(final SJClass c) {
    Resource _eResource = c.eResource();
    return Objects.equal(_eResource, null);
  }
}
