package org.example.smalljava.serializer;

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
import org.example.smalljava.services.SmallJavaGrammarAccess;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJIfBlock;
import org.example.smalljava.smallJava.SJIfStatement;
import org.example.smalljava.smallJava.SJImport;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSuper;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaPackage;

@SuppressWarnings("all")
public class SmallJavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmallJavaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmallJavaPackage.SJ_ASSIGNMENT:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJAssignment(context, (SJAssignment) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_BOOL_CONSTANT:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJBoolConstant) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_CLASS:
				if(context == grammarAccess.getSJClassRule()) {
					sequence_SJClass(context, (SJClass) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_FIELD:
				if(context == grammarAccess.getSJFieldRule() ||
				   context == grammarAccess.getSJMemberRule()) {
					sequence_SJField(context, (SJField) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_IF_BLOCK:
				if(context == grammarAccess.getSJBlockRule() ||
				   context == grammarAccess.getSJIfBlockRule()) {
					sequence_SJIfBlock(context, (SJIfBlock) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_IF_STATEMENT:
				if(context == grammarAccess.getSJIfStatementRule() ||
				   context == grammarAccess.getSJStatementRule()) {
					sequence_SJIfStatement(context, (SJIfStatement) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_IMPORT:
				if(context == grammarAccess.getSJImportRule()) {
					sequence_SJImport(context, (SJImport) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_INT_CONSTANT:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJIntConstant) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_MEMBER_SELECTION:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJSelectionExpression(context, (SJMemberSelection) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_METHOD:
				if(context == grammarAccess.getSJMemberRule() ||
				   context == grammarAccess.getSJMethodRule()) {
					sequence_SJMethod(context, (SJMethod) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_METHOD_BODY:
				if(context == grammarAccess.getSJBlockRule() ||
				   context == grammarAccess.getSJMethodBodyRule()) {
					sequence_SJMethodBody(context, (SJMethodBody) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_NEW:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJNew) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_NULL:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJNull) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_PARAMETER:
				if(context == grammarAccess.getSJParameterRule() ||
				   context == grammarAccess.getSJSymbolRule()) {
					sequence_SJParameter(context, (SJParameter) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_PROGRAM:
				if(context == grammarAccess.getSJProgramRule()) {
					sequence_SJProgram(context, (SJProgram) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_RETURN:
				if(context == grammarAccess.getSJReturnRule() ||
				   context == grammarAccess.getSJStatementRule()) {
					sequence_SJReturn(context, (SJReturn) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_STRING_CONSTANT:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJStringConstant) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_SUPER:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJSuper) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_SYMBOL_REF:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJSymbolRef) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_THIS:
				if(context == grammarAccess.getSJAssignmentRule() ||
				   context == grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getSJExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionRule() ||
				   context == grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0() ||
				   context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJTerminalExpressionRule()) {
					sequence_SJTerminalExpression(context, (SJThis) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_VARIABLE_DECLARATION:
				if(context == grammarAccess.getSJStatementRule() ||
				   context == grammarAccess.getSJSymbolRule() ||
				   context == grammarAccess.getSJVariableDeclarationRule()) {
					sequence_SJVariableDeclaration(context, (SJVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=SJAssignment_SJAssignment_1_0 right=SJExpression)
	 */
	protected void sequence_SJAssignment(EObject context, SJAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superclass=[SJClass|QualifiedName]? members+=SJMember*)
	 */
	protected void sequence_SJClass(EObject context, SJClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (access=SJAccessLevel? type=[SJClass|QualifiedName] name=ID)
	 */
	protected void sequence_SJField(EObject context, SJField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=SJStatement | statements+=SJStatement+)
	 */
	protected void sequence_SJIfBlock(EObject context, SJIfBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SJExpression thenBlock=SJIfBlock elseBlock=SJIfBlock?)
	 */
	protected void sequence_SJIfStatement(EObject context, SJIfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_SJImport(EObject context, SJImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=SJStatement*)
	 */
	protected void sequence_SJMethodBody(EObject context, SJMethodBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (access=SJAccessLevel? type=[SJClass|QualifiedName] name=ID (params+=SJParameter params+=SJParameter*)? body=SJMethodBody)
	 */
	protected void sequence_SJMethod(EObject context, SJMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[SJClass|QualifiedName] name=ID)
	 */
	protected void sequence_SJParameter(EObject context, SJParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE));
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJParameterAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getSJParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName? imports+=SJImport* classes+=SJClass*)
	 */
	protected void sequence_SJProgram(EObject context, SJProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SJExpression
	 */
	protected void sequence_SJReturn(EObject context, SJReturn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_RETURN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_RETURN__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (receiver=SJSelectionExpression_SJMemberSelection_1_0 member=[SJMember|ID] (methodinvocation?='(' (args+=SJExpression args+=SJExpression*)?)?)
	 */
	protected void sequence_SJSelectionExpression(EObject context, SJMemberSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJBoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJIntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[SJClass|QualifiedName]
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJNew semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_NEW__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_NEW__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassQualifiedNameParserRuleCall_7_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SJNull}
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJStringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SJSuper}
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJSuper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     symbol=[SJSymbol|ID]
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJSymbolRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL_REF__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL_REF__SYMBOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_6_1_0_1(), semanticObject.getSymbol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SJThis}
	 */
	protected void sequence_SJTerminalExpression(EObject context, SJThis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[SJClass|QualifiedName] name=ID expression=SJExpression)
	 */
	protected void sequence_SJVariableDeclaration(EObject context, SJVariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE));
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__NAME));
			if(transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_VARIABLE_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_VARIABLE_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getSJVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
