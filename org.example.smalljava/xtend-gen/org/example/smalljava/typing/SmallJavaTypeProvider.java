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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
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
  
  public final static SJClass stringType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("stringType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass intType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("intType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass booleanType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("booleanType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass nullType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("nullType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public SJClass typeFor(final SJExpression e) {
    SJClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof SJThis) {
        final SJThis _sJThis = (SJThis)e;
        _matched=true;
        SJClass _containingClass = SmallJavaModelUtil.containingClass(_sJThis);
        _switchResult = _containingClass;
      }
    }
    if (!_matched) {
      if (e instanceof SJSuper) {
        final SJSuper _sJSuper = (SJSuper)e;
        _matched=true;
        SJClass _containingClass = SmallJavaModelUtil.containingClass(_sJSuper);
        SJClass _superclassOrObject = this._smallJavaLib.getSuperclassOrObject(_containingClass);
        _switchResult = _superclassOrObject;
      }
    }
    if (!_matched) {
      if (e instanceof SJSymbolRef) {
        final SJSymbolRef _sJSymbolRef = (SJSymbolRef)e;
        _matched=true;
        SJSymbol _symbol = _sJSymbolRef.getSymbol();
        SJClass _type = null;
        if (_symbol!=null) {
          _type=_symbol.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJNew) {
        final SJNew _sJNew = (SJNew)e;
        _matched=true;
        SJClass _type = _sJNew.getType();
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJMemberSelection) {
        final SJMemberSelection _sJMemberSelection = (SJMemberSelection)e;
        _matched=true;
        SJMember _member = _sJMemberSelection.getMember();
        SJClass _type = null;
        if (_member!=null) {
          _type=_member.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJNull) {
        final SJNull _sJNull = (SJNull)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.nullType;
      }
    }
    if (!_matched) {
      if (e instanceof SJStringConstant) {
        final SJStringConstant _sJStringConstant = (SJStringConstant)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof SJIntConstant) {
        final SJIntConstant _sJIntConstant = (SJIntConstant)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof SJBoolConstant) {
        final SJBoolConstant _sJBoolConstant = (SJBoolConstant)e;
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
          final SJVariableDeclaration _sJVariableDeclaration = (SJVariableDeclaration)c;
          EReference _sJVariableDeclaration_Expression = this.ep.getSJVariableDeclaration_Expression();
          boolean _equals = Objects.equal(f, _sJVariableDeclaration_Expression);
          if (_equals) {
            _matched=true;
            SJClass _type = _sJVariableDeclaration.getType();
            _switchResult = _type;
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJAssignment) {
          final SJAssignment _sJAssignment = (SJAssignment)c;
          EReference _sJAssignment_Right = this.ep.getSJAssignment_Right();
          boolean _equals = Objects.equal(f, _sJAssignment_Right);
          if (_equals) {
            _matched=true;
            SJExpression _left = _sJAssignment.getLeft();
            SJClass _typeFor = this.typeFor(_left);
            _switchResult = _typeFor;
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJReturn) {
          final SJReturn _sJReturn = (SJReturn)c;
          EReference _sJReturn_Expression = this.ep.getSJReturn_Expression();
          boolean _equals = Objects.equal(f, _sJReturn_Expression);
          if (_equals) {
            _matched=true;
            SJMethod _containingMethod = SmallJavaModelUtil.containingMethod(_sJReturn);
            SJClass _type = _containingMethod.getType();
            _switchResult = _type;
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJMemberSelection) {
          final SJMemberSelection _sJMemberSelection = (SJMemberSelection)c;
          EReference _sJMemberSelection_Args = this.ep.getSJMemberSelection_Args();
          boolean _equals = Objects.equal(f, _sJMemberSelection_Args);
          if (_equals) {
            _matched=true;
            SJClass _xtrycatchfinallyexpression = null;
            try {
              SJMember _member = _sJMemberSelection.getMember();
              EList<SJParameter> _params = ((SJMethod) _member).getParams();
              EList<SJExpression> _args = _sJMemberSelection.getArgs();
              int _indexOf = _args.indexOf(e);
              SJParameter _get = _params.get(_indexOf);
              SJClass _type = _get.getType();
              _xtrycatchfinallyexpression = _type;
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
      _xblockexpression = (_switchResult);
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
    String _plus_1 = (_plus + ")");
    return _plus_1;
  }
  
  public boolean isPrimitive(final SJClass c) {
    Resource _eResource = c.eResource();
    boolean _equals = Objects.equal(_eResource, null);
    return _equals;
  }
}
