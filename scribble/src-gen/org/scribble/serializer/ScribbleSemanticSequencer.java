package org.scribble.serializer;

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
import org.scribble.scribble.Choice;
import org.scribble.scribble.Continue;
import org.scribble.scribble.Do;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.IncludeDecl;
import org.scribble.scribble.InstGlobalProtocolDecl;
import org.scribble.scribble.Interruptible;
import org.scribble.scribble.Message;
import org.scribble.scribble.MessageSignature;
import org.scribble.scribble.Parallel;
import org.scribble.scribble.PayloadType;
import org.scribble.scribble.Recursion;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.Spawn;
import org.scribble.scribble.TypeDecl;
import org.scribble.services.ScribbleGrammarAccess;

@SuppressWarnings("all")
public class ScribbleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScribbleGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ScribblePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScribblePackage.CHOICE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getGlobalInteractionRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.CONTINUE:
				if(context == grammarAccess.getContinueRule() ||
				   context == grammarAccess.getGlobalInteractionRule()) {
					sequence_Continue(context, (Continue) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.DO:
				if(context == grammarAccess.getDoRule() ||
				   context == grammarAccess.getGlobalInteractionRule()) {
					sequence_Do(context, (Do) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK:
				if(context == grammarAccess.getGlobalInteractionBlockRule()) {
					sequence_GlobalInteractionBlock(context, (GlobalInteractionBlock) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL:
				if(context == grammarAccess.getGlobalProtocolDeclRule()) {
					sequence_GlobalProtocolDecl(context, (GlobalProtocolDecl) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.INCLUDE_DECL:
				if(context == grammarAccess.getIncludeDeclRule()) {
					sequence_IncludeDecl(context, (IncludeDecl) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL:
				if(context == grammarAccess.getInstGlobalProtocolDeclRule()) {
					sequence_InstGlobalProtocolDecl(context, (InstGlobalProtocolDecl) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.INTERRUPTIBLE:
				if(context == grammarAccess.getGlobalInteractionRule() ||
				   context == grammarAccess.getInterruptibleRule()) {
					sequence_Interruptible(context, (Interruptible) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.MESSAGE:
				if(context == grammarAccess.getGlobalInteractionRule() ||
				   context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.MESSAGE_SIGNATURE:
				if(context == grammarAccess.getMessageSignatureRule()) {
					sequence_MessageSignature(context, (MessageSignature) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.PARALLEL:
				if(context == grammarAccess.getGlobalInteractionRule() ||
				   context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.PAYLOAD_TYPE:
				if(context == grammarAccess.getPayloadTypeRule()) {
					sequence_PayloadType(context, (PayloadType) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.RECURSION:
				if(context == grammarAccess.getGlobalInteractionRule() ||
				   context == grammarAccess.getRecursionRule()) {
					sequence_Recursion(context, (Recursion) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.SCRIBBLE_PROGRAM:
				if(context == grammarAccess.getScribbleProgramRule()) {
					sequence_ScribbleProgram(context, (ScribbleProgram) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.SPAWN:
				if(context == grammarAccess.getGlobalInteractionRule() ||
				   context == grammarAccess.getSpawnRule()) {
					sequence_Spawn(context, (Spawn) semanticObject); 
					return; 
				}
				else break;
			case ScribblePackage.TYPE_DECL:
				if(context == grammarAccess.getTypeDeclRule()) {
					sequence_TypeDecl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (role=ID branches+=GlobalInteractionBlock branches+=GlobalInteractionBlock*)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     loopName=ID
	 */
	protected void sequence_Continue(EObject context, Continue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.CONTINUE__LOOP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.CONTINUE__LOOP_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContinueAccess().getLoopNameIDTerminalRuleCall_1_0(), semanticObject.getLoopName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         targetProtocolName=ID 
	 *         (arguments+=MessageSignature arguments+=MessageSignature*)? 
	 *         currentRoles+=ID 
	 *         targetRoles+=ID 
	 *         (currentRoles+=ID targetRoles+=ID)*
	 *     )
	 */
	protected void sequence_Do(EObject context, Do semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     interactionsequence+=GlobalInteraction+
	 */
	protected void sequence_GlobalInteractionBlock(EObject context, GlobalInteractionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (protocolName=ID (parameters+=ID parameters+=ID*)? (roles+=ID roles+=ID*)? body=GlobalInteractionBlock)
	 */
	protected void sequence_GlobalProtocolDecl(EObject context, GlobalProtocolDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_IncludeDecl(EObject context, IncludeDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.INCLUDE_DECL__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.INCLUDE_DECL__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeDeclAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (protocolName=ID roles+=ID roles+=ID* instantiatedProtocol=ID)
	 */
	protected void sequence_InstGlobalProtocolDecl(EObject context, InstGlobalProtocolDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=GlobalInteractionBlock roleNames+=ID signatures+=MessageSignature (roleNames+=ID signatures+=MessageSignature)*)
	 */
	protected void sequence_Interruptible(EObject context, Interruptible semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=ID (payloadTypes+=PayloadType payloadTypes+=PayloadType*)?)
	 */
	protected void sequence_MessageSignature(EObject context, MessageSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signature=MessageSignature sender=ID receiver=ID)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.MESSAGE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.MESSAGE__SIGNATURE));
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.MESSAGE__SENDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.MESSAGE__SENDER));
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.MESSAGE__RECEIVER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.MESSAGE__RECEIVER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageAccess().getSignatureMessageSignatureParserRuleCall_0_0(), semanticObject.getSignature());
		feeder.accept(grammarAccess.getMessageAccess().getSenderIDTerminalRuleCall_2_0(), semanticObject.getSender());
		feeder.accept(grammarAccess.getMessageAccess().getReceiverIDTerminalRuleCall_4_0(), semanticObject.getReceiver());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (branches+=GlobalInteractionBlock branches+=GlobalInteractionBlock*)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (payload=ID dataType=ID?)
	 */
	protected void sequence_PayloadType(EObject context, PayloadType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (loopName=ID body=GlobalInteractionBlock)
	 */
	protected void sequence_Recursion(EObject context, Recursion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.RECURSION__LOOP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.RECURSION__LOOP_NAME));
			if(transientValues.isValueTransient(semanticObject, ScribblePackage.Literals.RECURSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScribblePackage.Literals.RECURSION__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecursionAccess().getLoopNameIDTerminalRuleCall_1_0(), semanticObject.getLoopName());
		feeder.accept(grammarAccess.getRecursionAccess().getBodyGlobalInteractionBlockParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (includeDecl+=IncludeDecl* typeDecl+=TypeDecl* globalProtocolDecl+=GlobalProtocolDecl+ instGlobalProtocolDecl+=InstGlobalProtocolDecl*)
	 */
	protected void sequence_ScribbleProgram(EObject context, ScribbleProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         roleName=ID 
	 *         targetProtocolName=ID 
	 *         (parameters+=ID parameters+=ID*)? 
	 *         currentRoles+=ID 
	 *         targetRoles+=ID 
	 *         (currentRoles+=ID targetRoles+=ID)*
	 *     )
	 */
	protected void sequence_Spawn(EObject context, Spawn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeName=ID schema=ID file=ID alias=ID?)
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
