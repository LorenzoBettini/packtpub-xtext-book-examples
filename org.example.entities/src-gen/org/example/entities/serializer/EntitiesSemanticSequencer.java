package org.example.entities.serializer;

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
import org.example.entities.entities.Attribute;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.BasicType;
import org.example.entities.entities.EntitiesPackage;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;
import org.example.entities.entities.Model;
import org.example.entities.services.EntitiesGrammarAccess;

@SuppressWarnings("all")
public class EntitiesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntitiesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EntitiesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EntitiesPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case EntitiesPackage.ATTRIBUTE_TYPE:
				if(context == grammarAccess.getAttributeTypeRule()) {
					sequence_AttributeType(context, (AttributeType) semanticObject); 
					return; 
				}
				else break;
			case EntitiesPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getElementTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case EntitiesPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case EntitiesPackage.ENTITY_TYPE:
				if(context == grammarAccess.getElementTypeRule() ||
				   context == grammarAccess.getEntityTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case EntitiesPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elementType=ElementType (array?='[' length=INT?)?)
	 */
	protected void sequence_AttributeType(EObject context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AttributeType name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.ATTRIBUTE__TYPE));
			if(transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (typeName='string' | typeName='int' | typeName='boolean')
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entity=[Entity|ID]
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.ENTITY_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.ENTITY_TYPE__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entities+=Entity*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
