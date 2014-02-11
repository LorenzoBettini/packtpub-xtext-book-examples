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
        _matched=true;
        _switchResult = Integer.valueOf(((IntConstant)e).getValue());
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        String _value = ((BoolConstant)e).getValue();
        _switchResult = Boolean.valueOf(Boolean.parseBoolean(_value));
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = ((StringConstant)e).getValue();
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Expression _expression = ((Not)e).getExpression();
        Object _interpret = this.interpret(_expression);
        _switchResult = Boolean.valueOf((!(((Boolean) _interpret)).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        int _xblockexpression = (int) 0;
        {
          Expression _left = ((MulOrDiv)e).getLeft();
          Object _interpret = this.interpret(_left);
          final Integer left = ((Integer) _interpret);
          Expression _right = ((MulOrDiv)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          final Integer right = ((Integer) _interpret_1);
          int _xifexpression = (int) 0;
          String _op = ((MulOrDiv)e).getOp();
          boolean _equals = Objects.equal(_op, "*");
          if (_equals) {
            _xifexpression = ((left).intValue() * (right).intValue());
          } else {
            _xifexpression = ((left).intValue() / (right).intValue());
          }
          _xblockexpression = (_xifexpression);
        }
        _switchResult = Integer.valueOf(_xblockexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        Expression _left = ((Minus)e).getLeft();
        Object _interpret = this.interpret(_left);
        Expression _right = ((Minus)e).getRight();
        Object _interpret_1 = this.interpret(_right);
        _switchResult = Integer.valueOf(((((Integer) _interpret)).intValue() - (((Integer) _interpret_1)).intValue()));
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        Object _xifexpression = null;
        boolean _or = false;
        Expression _left = ((Plus)e).getLeft();
        ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(_left);
        boolean _isString = this._expressionsTypeProvider.isString(_typeFor);
        if (_isString) {
          _or = true;
        } else {
          Expression _right = ((Plus)e).getRight();
          ExpressionsType _typeFor_1 = this._expressionsTypeProvider.typeFor(_right);
          boolean _isString_1 = this._expressionsTypeProvider.isString(_typeFor_1);
          _or = _isString_1;
        }
        if (_or) {
          Expression _left_1 = ((Plus)e).getLeft();
          Object _interpret = this.interpret(_left_1);
          String _string = _interpret.toString();
          Expression _right_1 = ((Plus)e).getRight();
          Object _interpret_1 = this.interpret(_right_1);
          String _string_1 = _interpret_1.toString();
          _xifexpression = (_string + _string_1);
        } else {
          Expression _left_2 = ((Plus)e).getLeft();
          Object _interpret_2 = this.interpret(_left_2);
          Expression _right_2 = ((Plus)e).getRight();
          Object _interpret_3 = this.interpret(_right_2);
          _xifexpression = Integer.valueOf(((((Integer) _interpret_2)).intValue() + (((Integer) _interpret_3)).intValue()));
        }
        _switchResult = ((Comparable<Object>)_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        boolean _xifexpression = false;
        String _op = ((Equality)e).getOp();
        boolean _equals = Objects.equal(_op, "==");
        if (_equals) {
          Expression _left = ((Equality)e).getLeft();
          Object _interpret = this.interpret(_left);
          Expression _right = ((Equality)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          _xifexpression = Objects.equal(_interpret, _interpret_1);
        } else {
          Expression _left_1 = ((Equality)e).getLeft();
          Object _interpret_2 = this.interpret(_left_1);
          Expression _right_1 = ((Equality)e).getRight();
          Object _interpret_3 = this.interpret(_right_1);
          _xifexpression = (!Objects.equal(_interpret_2, _interpret_3));
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        boolean _and = false;
        Expression _left = ((And)e).getLeft();
        Object _interpret = this.interpret(_left);
        if (!(((Boolean) _interpret)).booleanValue()) {
          _and = false;
        } else {
          Expression _right = ((And)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          _and = (((Boolean) _interpret_1)).booleanValue();
        }
        _switchResult = Boolean.valueOf(_and);
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        boolean _or = false;
        Expression _left = ((Or)e).getLeft();
        Object _interpret = this.interpret(_left);
        if ((((Boolean) _interpret)).booleanValue()) {
          _or = true;
        } else {
          Expression _right = ((Or)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          _or = (((Boolean) _interpret_1)).booleanValue();
        }
        _switchResult = Boolean.valueOf(_or);
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        boolean _xifexpression = false;
        Expression _left = ((Comparison)e).getLeft();
        ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(_left);
        boolean _isString = this._expressionsTypeProvider.isString(_typeFor);
        if (_isString) {
          boolean _xblockexpression = false;
          {
            Expression _left_1 = ((Comparison)e).getLeft();
            Object _interpret = this.interpret(_left_1);
            final String left = ((String) _interpret);
            Expression _right = ((Comparison)e).getRight();
            Object _interpret_1 = this.interpret(_right);
            final String right = ((String) _interpret_1);
            boolean _switchResult_1 = false;
            String _op = ((Comparison)e).getOp();
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (Objects.equal(_op,"<")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) < 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,">")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) > 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,">=")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) >= 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,"<=")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) <= 0);
              }
            }
            _xblockexpression = (_switchResult_1);
          }
          _xifexpression = _xblockexpression;
        } else {
          boolean _xblockexpression_1 = false;
          {
            Expression _left_1 = ((Comparison)e).getLeft();
            Object _interpret = this.interpret(_left_1);
            final Integer left = ((Integer) _interpret);
            Expression _right = ((Comparison)e).getRight();
            Object _interpret_1 = this.interpret(_right);
            final Integer right = ((Integer) _interpret_1);
            boolean _switchResult_1 = false;
            String _op = ((Comparison)e).getOp();
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (Objects.equal(_op,"<")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) < 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,">")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) > 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,">=")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) >= 0);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_op,"<=")) {
                _matched_1=true;
                _switchResult_1 = (left.compareTo(right) <= 0);
              }
            }
            _xblockexpression_1 = (_switchResult_1);
          }
          _xifexpression = _xblockexpression_1;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        _matched=true;
        Variable _variable = ((VariableRef)e).getVariable();
        _switchResult = this.interpret(_variable);
      }
    }
    return _switchResult;
  }
  
  protected Object _interpret(final Variable v) {
    Expression _expression = v.getExpression();
    return this.interpret(_expression);
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
