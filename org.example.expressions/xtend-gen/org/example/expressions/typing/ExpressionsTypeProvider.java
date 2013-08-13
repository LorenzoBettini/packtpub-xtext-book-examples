package org.example.expressions.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.And;
import org.example.expressions.expressions.BoolConstant;
import org.example.expressions.expressions.Comparison;
import org.example.expressions.expressions.Equality;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.IntConstant;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Not;
import org.example.expressions.expressions.Or;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.StringConstant;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.example.expressions.typing.BoolType;
import org.example.expressions.typing.ExpressionsModelUtil;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.IntType;
import org.example.expressions.typing.StringType;

@SuppressWarnings("all")
public class ExpressionsTypeProvider {
  public final static StringType stringType = new Function0<StringType>() {
    public StringType apply() {
      StringType _stringType = new StringType();
      return _stringType;
    }
  }.apply();
  
  public final static IntType intType = new Function0<IntType>() {
    public IntType apply() {
      IntType _intType = new IntType();
      return _intType;
    }
  }.apply();
  
  public final static BoolType boolType = new Function0<BoolType>() {
    public BoolType apply() {
      BoolType _boolType = new BoolType();
      return _boolType;
    }
  }.apply();
  
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof StringConstant) {
        final StringConstant _stringConstant = (StringConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        final IntConstant _intConstant = (IntConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        final BoolConstant _boolConstant = (BoolConstant)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        final Not _not = (Not)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        final MulOrDiv _mulOrDiv = (MulOrDiv)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        final Minus _minus = (Minus)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        final Comparison _comparison = (Comparison)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        final Equality _equality = (Equality)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        final And _and = (And)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        final Or _or = (Or)e;
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    return _switchResult;
  }
  
  protected ExpressionsType _typeFor(final Plus e) {
    ExpressionsType _xblockexpression = null;
    {
      Expression _left = e.getLeft();
      final ExpressionsType leftType = this.typeFor(_left);
      ExpressionsType _typeFor = null;
      Expression _right = e.getRight();
      if (_right!=null) {
        _typeFor=this.typeFor(_right);
      }
      final ExpressionsType rightType = _typeFor;
      ExpressionsType _xifexpression = null;
      boolean _or = false;
      boolean _equals = Objects.equal(leftType, ExpressionsTypeProvider.stringType);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = Objects.equal(rightType, ExpressionsTypeProvider.stringType);
        _or = (_equals || _equals_1);
      }
      if (_or) {
        _xifexpression = ExpressionsTypeProvider.stringType;
      } else {
        _xifexpression = ExpressionsTypeProvider.intType;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected ExpressionsType _typeFor(final Variable variable) {
    ExpressionsType _typeFor = null;
    Expression _expression = null;
    if (variable!=null) {
      _expression=variable.getExpression();
    }
    if (_expression!=null) {
      _typeFor=this.typeFor(_expression);
    }
    return _typeFor;
  }
  
  protected ExpressionsType _typeFor(final VariableRef varRef) {
    boolean _or = false;
    Variable _variable = varRef.getVariable();
    boolean _equals = Objects.equal(_variable, null);
    if (_equals) {
      _or = true;
    } else {
      List<Variable> _variablesDefinedBefore = ExpressionsModelUtil.variablesDefinedBefore(varRef);
      Variable _variable_1 = varRef.getVariable();
      boolean _contains = _variablesDefinedBefore.contains(_variable_1);
      boolean _not = (!_contains);
      _or = (_equals || _not);
    }
    if (_or) {
      return null;
    } else {
      Variable _variable_2 = varRef.getVariable();
      return this.typeFor(_variable_2);
    }
  }
  
  public boolean isInt(final ExpressionsType type) {
    boolean _equals = Objects.equal(type, ExpressionsTypeProvider.intType);
    return _equals;
  }
  
  public boolean isString(final ExpressionsType type) {
    boolean _equals = Objects.equal(type, ExpressionsTypeProvider.stringType);
    return _equals;
  }
  
  public boolean isBoolean(final ExpressionsType type) {
    boolean _equals = Objects.equal(type, ExpressionsTypeProvider.boolType);
    return _equals;
  }
  
  public ExpressionsType typeFor(final AbstractElement e) {
    if (e instanceof Plus) {
      return _typeFor((Plus)e);
    } else if (e instanceof VariableRef) {
      return _typeFor((VariableRef)e);
    } else if (e instanceof Expression) {
      return _typeFor((Expression)e);
    } else if (e instanceof Variable) {
      return _typeFor((Variable)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
