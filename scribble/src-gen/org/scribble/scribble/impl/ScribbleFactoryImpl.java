/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.scribble.scribble.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScribbleFactoryImpl extends EFactoryImpl implements ScribbleFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ScribbleFactory init()
  {
		try {
			ScribbleFactory theScribbleFactory = (ScribbleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.scribble.org/Scribble"); 
			if (theScribbleFactory != null) {
				return theScribbleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScribbleFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribbleFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ScribblePackage.SCRIBBLE_PROGRAM: return createScribbleProgram();
			case ScribblePackage.INCLUDE_DECL: return createIncludeDecl();
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL: return createInstGlobalProtocolDecl();
			case ScribblePackage.TYPE_DECL: return createTypeDecl();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL: return createGlobalProtocolDecl();
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK: return createGlobalInteractionBlock();
			case ScribblePackage.GLOBAL_INTERACTION: return createGlobalInteraction();
			case ScribblePackage.SPAWN: return createSpawn();
			case ScribblePackage.DO: return createDo();
			case ScribblePackage.INTERRUPTIBLE: return createInterruptible();
			case ScribblePackage.CONTINUE: return createContinue();
			case ScribblePackage.RECURSION: return createRecursion();
			case ScribblePackage.PARALLEL: return createParallel();
			case ScribblePackage.CHOICE: return createChoice();
			case ScribblePackage.MESSAGE: return createMessage();
			case ScribblePackage.MESSAGE_SIGNATURE: return createMessageSignature();
			case ScribblePackage.PAYLOAD_TYPE: return createPayloadType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribbleProgram createScribbleProgram()
  {
		ScribbleProgramImpl scribbleProgram = new ScribbleProgramImpl();
		return scribbleProgram;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IncludeDecl createIncludeDecl()
  {
		IncludeDeclImpl includeDecl = new IncludeDeclImpl();
		return includeDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InstGlobalProtocolDecl createInstGlobalProtocolDecl()
  {
		InstGlobalProtocolDeclImpl instGlobalProtocolDecl = new InstGlobalProtocolDeclImpl();
		return instGlobalProtocolDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeDecl createTypeDecl()
  {
		TypeDeclImpl typeDecl = new TypeDeclImpl();
		return typeDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GlobalProtocolDecl createGlobalProtocolDecl()
  {
		GlobalProtocolDeclImpl globalProtocolDecl = new GlobalProtocolDeclImpl();
		return globalProtocolDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GlobalInteractionBlock createGlobalInteractionBlock()
  {
		GlobalInteractionBlockImpl globalInteractionBlock = new GlobalInteractionBlockImpl();
		return globalInteractionBlock;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GlobalInteraction createGlobalInteraction()
  {
		GlobalInteractionImpl globalInteraction = new GlobalInteractionImpl();
		return globalInteraction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Spawn createSpawn()
  {
		SpawnImpl spawn = new SpawnImpl();
		return spawn;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Do createDo()
  {
		DoImpl do_ = new DoImpl();
		return do_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Interruptible createInterruptible()
  {
		InterruptibleImpl interruptible = new InterruptibleImpl();
		return interruptible;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Continue createContinue()
  {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recursion createRecursion()
  {
		RecursionImpl recursion = new RecursionImpl();
		return recursion;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parallel createParallel()
  {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Choice createChoice()
  {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Message createMessage()
  {
		MessageImpl message = new MessageImpl();
		return message;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MessageSignature createMessageSignature()
  {
		MessageSignatureImpl messageSignature = new MessageSignatureImpl();
		return messageSignature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PayloadType createPayloadType()
  {
		PayloadTypeImpl payloadType = new PayloadTypeImpl();
		return payloadType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribblePackage getScribblePackage()
  {
		return (ScribblePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ScribblePackage getPackage()
  {
		return ScribblePackage.eINSTANCE;
	}

} //ScribbleFactoryImpl
