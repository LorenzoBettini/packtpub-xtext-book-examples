package org.example.expressions.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
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
  public final static StringType stringType = new StringType();
  
  public final static IntType intType = new IntType();
  
  public final static BoolType boolType = new BoolType();
  
  protected ExpressionsType _typeFor(final Expression e) {
    ExpressionsType _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = ExpressionsTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
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
      Expression _right = e.getRight();
      ExpressionsType _typeFor = null;
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
        _or = _equals_1;
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
    Expression _expression = null;
    if (variable!=null) {
      _expression=variable.getExpression();
    }
    ExpressionsType _typeFor = null;
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
      _or = _not;
    }
    if (_or) {
      return null;
    } else {
      Variable _variable_2 = varRef.getVariable();
      return this.typeFor(_variable_2);
    }
  }
  
  public boolean isInt(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.intType);
  }
  
  public boolean isString(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.stringType);
  }
  
  public boolean isBoolean(final ExpressionsType type) {
    return Objects.equal(type, ExpressionsTypeProvider.boolType);
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
