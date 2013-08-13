package org.example.expressions.interpreter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Extension;
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
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeProvider;

@SuppressWarnings("all")
public class ExpressionsInterpreter {
  @Inject
  @Extension
  private ExpressionsTypeProvider _expressionsTypeProvider;
  
  protected Object _interpret(final Expression e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof IntConstant) {
        final IntConstant _intConstant = (IntConstant)e;
        _matched=true;
        int _value = _intConstant.getValue();
        _switchResult = Integer.valueOf(_value);
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        final BoolConstant _boolConstant = (BoolConstant)e;
        _matched=true;
        String _value = _boolConstant.getValue();
        boolean _parseBoolean = Boolean.parseBoolean(_value);
        _switchResult = Boolean.valueOf(_parseBoolean);
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        final StringConstant _stringConstant = (StringConstant)e;
        _matched=true;
        String _value = _stringConstant.getValue();
        _switchResult = _value;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        final Not _not = (Not)e;
        _matched=true;
        Expression _expression = _not.getExpression();
        Object _interpret = this.interpret(_expression);
        boolean _not_1 = (!(((Boolean) _interpret)).booleanValue());
        _switchResult = Boolean.valueOf(_not_1);
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        final MulOrDiv _mulOrDiv = (MulOrDiv)e;
        _matched=true;
        int _xblockexpression = (int) 0;
        {
          Expression _left = _mulOrDiv.getLeft();
          Object _interpret = this.interpret(_left);
          final Integer left = ((Integer) _interpret);
          Expression _right = _mulOrDiv.getRight();
          Object _interpret_1 = this.interpret(_right);
          final Integer right = ((Integer) _interpret_1);
          int _xifexpression = (int) 0;
          String _op = _mulOrDiv.getOp();
          boolean _equals = Objects.equal(_op, "*");
          if (_equals) {
            int _multiply = ((left).intValue() * (right).intValue());
            _xifexpression = _multiply;
          } else {
            int _divide = ((left).intValue() / (right).intValue());
            _xifexpression = _divide;
          }
          _xblockexpression = (_xifexpression);
        }
        _switchResult = Integer.valueOf(_xblockexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        final Minus _minus = (Minus)e;
        _matched=true;
        Expression _left = _minus.getLeft();
        Object _interpret = this.interpret(_left);
        Expression _right = _minus.getRight();
        Object _interpret_1 = this.interpret(_right);
        int _minus_1 = ((((Integer) _interpret)).intValue() - (((Integer) _interpret_1)).intValue());
        _switchResult = Integer.valueOf(_minus_1);
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        final Plus _plus = (Plus)e;
        _matched=true;
        Object _xifexpression = null;
        boolean _or = false;
        Expression _left = _plus.getLeft();
        ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(_left);
        boolean _isString = this._expressionsTypeProvider.isString(_typeFor);
        if (_isString) {
          _or = true;
        } else {
          Expression _right = _plus.getRight();
          ExpressionsType _typeFor_1 = this._expressionsTypeProvider.typeFor(_right);
          boolean _isString_1 = this._expressionsTypeProvider.isString(_typeFor_1);
          _or = (_isString || _isString_1);
        }
        if (_or) {
          Expression _left_1 = _plus.getLeft();
          Object _interpret = this.interpret(_left_1);
          String _string = _interpret.toString();
          Expression _right_1 = _plus.getRight();
          Object _interpret_1 = this.interpret(_right_1);
          String _string_1 = _interpret_1.toString();
          String _plus_1 = (_string + _string_1);
          _xifexpression = _plus_1;
        } else {
          Expression _left_2 = _plus.getLeft();
          Object _interpret_2 = this.interpret(_left_2);
          Expression _right_2 = _plus.getRight();
          Object _interpret_3 = this.interpret(_right_2);
          int _plus_2 = ((((Integer) _interpret_2)).intValue() + (((Integer) _interpret_3)).intValue());
          _xifexpression = Integer.valueOf(_plus_2);
        }
        _switchResult = ((Comparable<Object>)_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        final Equality _equality = (Equality)e;
        _matched=true;
        boolean _xifexpression = false;
        String _op = _equality.getOp();
        boolean _equals = Objects.equal(_op, "==");
        if (_equals) {
          Expression _left = _equality.getLeft();
          Object _interpret = this.interpret(_left);
          Expression _right = _equality.getRight();
          Object _interpret_1 = this.interpret(_right);
          boolean _equals_1 = Objects.equal(_interpret, _interpret_1);
          _xifexpression = _equals_1;
        } else {
          Expression _left_1 = _equality.getLeft();
          Object _interpret_2 = this.interpret(_left_1);
          Expression _right_1 = _equality.getRight();
          Object _interpret_3 = this.interpret(_right_1);
          boolean _notEquals = (!Objects.equal(_interpret_2, _interpret_3));
          _xifexpression = _notEquals;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        final And _and = (And)e;
        _matched=true;
        boolean _and_1 = false;
        Expression _left = _and.getLeft();
        Object _interpret = this.interpret(_left);
        if (!(((Boolean) _interpret)).booleanValue()) {
          _and_1 = false;
        } else {
          Expression _right = _and.getRight();
          Object _interpret_1 = this.interpret(_right);
          _and_1 = ((((Boolean) _interpret)).booleanValue() && (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_and_1);
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        final Or _or = (Or)e;
        _matched=true;
        boolean _or_1 = false;
        Expression _left = _or.getLeft();
        Object _interpret = this.interpret(_left);
        if ((((Boolean) _interpret)).booleanValue()) {
          _or_1 = true;
        } else {
          Expression _right = _or.getRight();
          Object _interpret_1 = this.interpret(_right);
          _or_1 = ((((Boolean) _interpret)).booleanValue() || (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_or_1);
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        final Comparison _comparison = (Comparison)e;
        _matched=true;
        Boolean _xifexpression = null;
        Expression _left = _comparison.getLeft();
        ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(_left);
        boolean _isString = this._expressionsTypeProvider.isString(_typeFor);
        if (_isString) {
          Boolean _xblockexpression = null;
          {
            Expression _left_1 = _comparison.getLeft();
            Object _interpret = this.interpret(_left_1);
            final String left = ((String) _interpret);
            Expression _right = _comparison.getRight();
            Object _interpret_1 = this.interpret(_right);
            final String right = ((String) _interpret_1);
            Boolean _switchResult_1 = null;
            String _op = _comparison.getOp();
            final String _switchValue = _op;
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"<")) {
                _matched_1=true;
                boolean _lessThan = (left.compareTo(right) < 0);
                _switchResult_1 = Boolean.valueOf(_lessThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,">")) {
                _matched_1=true;
                boolean _greaterThan = (left.compareTo(right) > 0);
                _switchResult_1 = Boolean.valueOf(_greaterThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,">=")) {
                _matched_1=true;
                boolean _greaterEqualsThan = (left.compareTo(right) >= 0);
                _switchResult_1 = Boolean.valueOf(_greaterEqualsThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"<=")) {
                _matched_1=true;
                boolean _lessEqualsThan = (left.compareTo(right) <= 0);
                _switchResult_1 = Boolean.valueOf(_lessEqualsThan);
              }
            }
            _xblockexpression = (_switchResult_1);
          }
          _xifexpression = _xblockexpression;
        } else {
          Boolean _xblockexpression_1 = null;
          {
            Expression _left_1 = _comparison.getLeft();
            Object _interpret = this.interpret(_left_1);
            final Integer left = ((Integer) _interpret);
            Expression _right = _comparison.getRight();
            Object _interpret_1 = this.interpret(_right);
            final Integer right = ((Integer) _interpret_1);
            Boolean _switchResult_1 = null;
            String _op = _comparison.getOp();
            final String _switchValue = _op;
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"<")) {
                _matched_1=true;
                boolean _lessThan = (left.compareTo(right) < 0);
                _switchResult_1 = Boolean.valueOf(_lessThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,">")) {
                _matched_1=true;
                boolean _greaterThan = (left.compareTo(right) > 0);
                _switchResult_1 = Boolean.valueOf(_greaterThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,">=")) {
                _matched_1=true;
                boolean _greaterEqualsThan = (left.compareTo(right) >= 0);
                _switchResult_1 = Boolean.valueOf(_greaterEqualsThan);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"<=")) {
                _matched_1=true;
                boolean _lessEqualsThan = (left.compareTo(right) <= 0);
                _switchResult_1 = Boolean.valueOf(_lessEqualsThan);
              }
            }
            _xblockexpression_1 = (_switchResult_1);
          }
          _xifexpression = _xblockexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        final VariableRef _variableRef = (VariableRef)e;
        _matched=true;
        Variable _variable = _variableRef.getVariable();
        Object _interpret = this.interpret(_variable);
        _switchResult = _interpret;
      }
    }
    return _switchResult;
  }
  
  protected Object _interpret(final Variable v) {
    Expression _expression = v.getExpression();
    Object _interpret = this.interpret(_expression);
    return _interpret;
  }
  
  public Object interpret(final AbstractElement e) {
    if (e instanceof Expression) {
      return _interpret((Expression)e);
    } else if (e instanceof Variable) {
      return _interpret((Variable)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
