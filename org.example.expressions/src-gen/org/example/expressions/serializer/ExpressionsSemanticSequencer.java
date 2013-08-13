package org.example.expressions.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.expressions.expressions.And;
import org.example.expressions.expressions.BoolConstant;
import org.example.expressions.expressions.Comparison;
import org.example.expressions.expressions.Equality;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.ExpressionsPackage;
import org.example.expressions.expressions.IntConstant;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Not;
import org.example.expressions.expressions.Or;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.StringConstant;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.example.expressions.services.ExpressionsGrammarAccess;

@SuppressWarnings("all")
public class ExpressionsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionsPackage.AND:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BOOL_CONSTANT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.COMPARISON:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.EQUALITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.EXPRESSIONS_MODEL:
				if(context == grammarAccess.getExpressionsModelRule()) {
					sequence_ExpressionsModel(context, (ExpressionsModel) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.INT_CONSTANT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MINUS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MUL_OR_DIV:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.NOT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.OR:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.PLUS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.STRING_CONSTANT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.VARIABLE_REF:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (VariableRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, IntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(EObject context, VariableRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.VARIABLE_REF__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_ExpressionsModel(EObject context, ExpressionsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Primary)
	 */
	protected void sequence_MulOrDiv(EObject context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.VARIABLE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.VARIABLE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
