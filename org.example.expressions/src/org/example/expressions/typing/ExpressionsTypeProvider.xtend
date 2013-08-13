package org.example.expressions.typing

import org.example.expressions.expressions.And
import org.example.expressions.expressions.BoolConstant
import org.example.expressions.expressions.Comparison
import org.example.expressions.expressions.Equality
import org.example.expressions.expressions.Expression
import org.example.expressions.expressions.IntConstant
import org.example.expressions.expressions.Minus
import org.example.expressions.expressions.MulOrDiv
import org.example.expressions.expressions.Not
import org.example.expressions.expressions.Or
import org.example.expressions.expressions.Plus
import org.example.expressions.expressions.StringConstant
import org.example.expressions.expressions.Variable
import org.example.expressions.expressions.VariableRef

import static extension org.example.expressions.typing.ExpressionsModelUtil.*

class ExpressionsTypeProvider {
	public static val stringType = new StringType
	public static val intType = new IntType
	public static val boolType = new BoolType
	
	def dispatch ExpressionsType typeFor(Expression e) {
		switch (e) {
			StringConstant: stringType
			IntConstant: intType
			BoolConstant: boolType
			Not: boolType
			MulOrDiv: intType
			Minus: intType
			Comparison: boolType
			Equality: boolType
			And: boolType
			Or: boolType
		}
	}

	def dispatch ExpressionsType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		if (leftType == stringType || rightType == stringType)
			stringType
		else
			intType
	}
	
	def dispatch ExpressionsType typeFor(Variable variable) {
		variable?.expression?.typeFor
	}
	
	def dispatch ExpressionsType typeFor(VariableRef varRef) {
		if (varRef.variable == null || 
				!(varRef.variablesDefinedBefore.contains(varRef.variable)))
			return null
		else
			return varRef.variable.typeFor
	}
	
	def isInt(ExpressionsType type) { type == intType }
	def isString(ExpressionsType type) { type == stringType }
	def isBoolean(ExpressionsType type) { type == boolType }

}