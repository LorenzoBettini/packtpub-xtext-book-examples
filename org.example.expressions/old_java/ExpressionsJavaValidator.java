package org.example.expressions.validation;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.example.expressions.expressions.And;
import org.example.expressions.expressions.Comparison;
import org.example.expressions.expressions.Equality;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionsPackage;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Not;
import org.example.expressions.expressions.Or;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.example.expressions.typing.ExpressionsModelUtil;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeProvider;

import com.google.inject.Inject;

public class ExpressionsJavaValidator extends AbstractExpressionsJavaValidator {

	public static final String FORWARD_REFERENCE = "org.example.expressions.ForwardReference";

	public static final String WRONG_TYPE = "org.example.expressions.WrongType";

	@Inject
	private ExpressionsTypeProvider typeProvider;

	@Check
	public void checkForwardReference(VariableRef varRef) {
		Variable variable = varRef.getVariable();
		if (variable == null)
			return; // it is a linking error (reported elsewhere)

		if (!ExpressionsModelUtil.variablesDefinedBefore(varRef).contains(
				variable)) {
			error("variable forward reference not allowed: '"
					+ variable.getName() + "'",
					ExpressionsPackage.Literals.VARIABLE_REF__VARIABLE,
					FORWARD_REFERENCE, variable.getName());
		}
	}

	@Check
	public void checkType(Not not) {
		checkExpectedBoolean(not.getExpression(),
				ExpressionsPackage.Literals.NOT__EXPRESSION);
	}

	@Check
	public void checkType(MulOrDiv mulOrDiv) {
		checkExpectedInt(mulOrDiv.getLeft(),
				ExpressionsPackage.Literals.MUL_OR_DIV__LEFT);
		checkExpectedInt(mulOrDiv.getRight(),
				ExpressionsPackage.Literals.MUL_OR_DIV__RIGHT);
	}

	@Check
	public void checkType(Minus minus) {
		checkExpectedInt(minus.getLeft(),
				ExpressionsPackage.Literals.MINUS__LEFT);
		checkExpectedInt(minus.getRight(),
				ExpressionsPackage.Literals.MINUS__RIGHT);
	}

	@Check
	public void checkType(And and) {
		checkExpectedBoolean(and.getLeft(),
				ExpressionsPackage.Literals.AND__LEFT);
		checkExpectedBoolean(and.getRight(),
				ExpressionsPackage.Literals.AND__RIGHT);
	}

	@Check
	public void checkType(Or or) {
		checkExpectedBoolean(or.getLeft(), ExpressionsPackage.Literals.OR__LEFT);
		checkExpectedBoolean(or.getRight(),
				ExpressionsPackage.Literals.OR__RIGHT);
	}

	@Check
	public void checkType(Equality equality) {
		ExpressionsType left = getTypeAndCheckNotNull(equality.getLeft(),
				ExpressionsPackage.Literals.EQUALITY__LEFT);
		ExpressionsType right = getTypeAndCheckNotNull(equality.getRight(),
				ExpressionsPackage.Literals.EQUALITY__RIGHT);
		checkExpectedSame(left, right);
	}

	@Check
	public void checkType(Comparison comparison) {
		ExpressionsType left = getTypeAndCheckNotNull(comparison.getLeft(),
				ExpressionsPackage.Literals.COMPARISON__LEFT);
		ExpressionsType right = getTypeAndCheckNotNull(comparison.getRight(),
				ExpressionsPackage.Literals.COMPARISON__RIGHT);
		checkExpectedSame(left, right);
		checkNotBoolean(left, ExpressionsPackage.Literals.COMPARISON__LEFT);
		checkNotBoolean(right, ExpressionsPackage.Literals.COMPARISON__RIGHT);
	}

	@Check
	public void checkType(Plus plus) {
		ExpressionsType left = getTypeAndCheckNotNull(plus.getLeft(),
				ExpressionsPackage.Literals.PLUS__LEFT);
		ExpressionsType right = getTypeAndCheckNotNull(plus.getRight(),
				ExpressionsPackage.Literals.PLUS__RIGHT);
		if (left == ExpressionsTypeProvider.intType
				|| right == ExpressionsTypeProvider.intType
				|| (left != ExpressionsTypeProvider.stringType && right != ExpressionsTypeProvider.stringType)) {
			checkNotBoolean(left, ExpressionsPackage.Literals.PLUS__LEFT);
			checkNotBoolean(right, ExpressionsPackage.Literals.PLUS__RIGHT);
		}
	}

	private void checkExpectedSame(ExpressionsType left, ExpressionsType right) {
		if (right != null && left != null && right != left) {
			error("expected the same type, but was " + left + ", " + right,
					ExpressionsPackage.Literals.EQUALITY.getEIDAttribute(),
					WRONG_TYPE);
		}
	}

	private void checkNotBoolean(ExpressionsType type, EReference reference) {
		if (type == ExpressionsTypeProvider.boolType) {
			error("cannot be boolean", reference, WRONG_TYPE);
		}
	}

	private void checkExpectedBoolean(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionsTypeProvider.boolType, reference);
	}

	private void checkExpectedInt(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionsTypeProvider.intType, reference);
	}

	private void checkExpectedType(Expression exp,
			ExpressionsType expectedType, EReference reference) {
		ExpressionsType actualType = getTypeAndCheckNotNull(exp, reference);
		if (actualType != expectedType)
			error("expected " + expectedType + " type, but was " + actualType,
					reference, WRONG_TYPE);
	}

	private ExpressionsType getTypeAndCheckNotNull(Expression exp,
			EReference reference) {
		ExpressionsType type = null;
		if (exp != null)
			type = typeProvider.typeFor(exp);
		if (type == null)
			error("null type", reference, WRONG_TYPE);
		return type;
	}

}
