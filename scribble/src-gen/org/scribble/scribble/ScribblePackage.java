/**
 */
package org.scribble.scribble;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.scribble.scribble.ScribbleFactory
 * @model kind="package"
 * @generated
 */
public interface ScribblePackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "scribble";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.scribble.org/Scribble";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "scribble";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ScribblePackage eINSTANCE = org.scribble.scribble.impl.ScribblePackageImpl.init();

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.ScribbleProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.ScribbleProgramImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getScribbleProgram()
	 * @generated
	 */
  int SCRIBBLE_PROGRAM = 0;

  /**
	 * The feature id for the '<em><b>Include Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SCRIBBLE_PROGRAM__INCLUDE_DECL = 0;

  /**
	 * The feature id for the '<em><b>Type Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SCRIBBLE_PROGRAM__TYPE_DECL = 1;

  /**
	 * The feature id for the '<em><b>Global Protocol Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL = 2;

  /**
	 * The feature id for the '<em><b>Inst Global Protocol Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL = 3;

  /**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SCRIBBLE_PROGRAM_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.IncludeDeclImpl <em>Include Decl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.IncludeDeclImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getIncludeDecl()
	 * @generated
	 */
  int INCLUDE_DECL = 1;

  /**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCLUDE_DECL__IMPORT_URI = 0;

  /**
	 * The number of structural features of the '<em>Include Decl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INCLUDE_DECL_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.InstGlobalProtocolDeclImpl <em>Inst Global Protocol Decl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.InstGlobalProtocolDeclImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getInstGlobalProtocolDecl()
	 * @generated
	 */
  int INST_GLOBAL_PROTOCOL_DECL = 2;

  /**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME = 0;

  /**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INST_GLOBAL_PROTOCOL_DECL__ROLES = 1;

  /**
	 * The feature id for the '<em><b>Instantiated Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL = 2;

  /**
	 * The number of structural features of the '<em>Inst Global Protocol Decl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INST_GLOBAL_PROTOCOL_DECL_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.TypeDeclImpl <em>Type Decl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.TypeDeclImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getTypeDecl()
	 * @generated
	 */
  int TYPE_DECL = 3;

  /**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_DECL__TYPE_NAME = 0;

  /**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_DECL__SCHEMA = 1;

  /**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_DECL__FILE = 2;

  /**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_DECL__ALIAS = 3;

  /**
	 * The number of structural features of the '<em>Type Decl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_DECL_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl <em>Global Protocol Decl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.GlobalProtocolDeclImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalProtocolDecl()
	 * @generated
	 */
  int GLOBAL_PROTOCOL_DECL = 4;

  /**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME = 0;

  /**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_PROTOCOL_DECL__PARAMETERS = 1;

  /**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_PROTOCOL_DECL__ROLES = 2;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_PROTOCOL_DECL__BODY = 3;

  /**
	 * The number of structural features of the '<em>Global Protocol Decl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_PROTOCOL_DECL_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.GlobalInteractionBlockImpl <em>Global Interaction Block</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.GlobalInteractionBlockImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalInteractionBlock()
	 * @generated
	 */
  int GLOBAL_INTERACTION_BLOCK = 5;

  /**
	 * The feature id for the '<em><b>Interactionsequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE = 0;

  /**
	 * The number of structural features of the '<em>Global Interaction Block</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_INTERACTION_BLOCK_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.GlobalInteractionImpl <em>Global Interaction</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.GlobalInteractionImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalInteraction()
	 * @generated
	 */
  int GLOBAL_INTERACTION = 6;

  /**
	 * The number of structural features of the '<em>Global Interaction</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GLOBAL_INTERACTION_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.SpawnImpl <em>Spawn</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.SpawnImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getSpawn()
	 * @generated
	 */
  int SPAWN = 7;

  /**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN__ROLE_NAME = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Target Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN__TARGET_PROTOCOL_NAME = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN__PARAMETERS = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Current Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN__CURRENT_ROLES = GLOBAL_INTERACTION_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Target Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN__TARGET_ROLES = GLOBAL_INTERACTION_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Spawn</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SPAWN_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 5;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.DoImpl <em>Do</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.DoImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getDo()
	 * @generated
	 */
  int DO = 8;

  /**
	 * The feature id for the '<em><b>Target Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO__TARGET_PROTOCOL_NAME = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO__ARGUMENTS = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Current Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO__CURRENT_ROLES = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Target Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO__TARGET_ROLES = GLOBAL_INTERACTION_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Do</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DO_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.InterruptibleImpl <em>Interruptible</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.InterruptibleImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getInterruptible()
	 * @generated
	 */
  int INTERRUPTIBLE = 9;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERRUPTIBLE__BODY = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERRUPTIBLE__ROLE_NAMES = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERRUPTIBLE__SIGNATURES = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Interruptible</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTERRUPTIBLE_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.ContinueImpl <em>Continue</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.ContinueImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getContinue()
	 * @generated
	 */
  int CONTINUE = 10;

  /**
	 * The feature id for the '<em><b>Loop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTINUE__LOOP_NAME = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Continue</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTINUE_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.RecursionImpl <em>Recursion</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.RecursionImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getRecursion()
	 * @generated
	 */
  int RECURSION = 11;

  /**
	 * The feature id for the '<em><b>Loop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECURSION__LOOP_NAME = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECURSION__BODY = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Recursion</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECURSION_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.ParallelImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getParallel()
	 * @generated
	 */
  int PARALLEL = 12;

  /**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARALLEL__BRANCHES = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARALLEL_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.ChoiceImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getChoice()
	 * @generated
	 */
  int CHOICE = 13;

  /**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHOICE__ROLE = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHOICE__BRANCHES = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHOICE_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.MessageImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getMessage()
	 * @generated
	 */
  int MESSAGE = 14;

  /**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE__SIGNATURE = GLOBAL_INTERACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE__SENDER = GLOBAL_INTERACTION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE__RECEIVER = GLOBAL_INTERACTION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE_FEATURE_COUNT = GLOBAL_INTERACTION_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.MessageSignatureImpl <em>Message Signature</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.MessageSignatureImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getMessageSignature()
	 * @generated
	 */
  int MESSAGE_SIGNATURE = 15;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE_SIGNATURE__OPERATOR = 0;

  /**
	 * The feature id for the '<em><b>Payload Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE_SIGNATURE__PAYLOAD_TYPES = 1;

  /**
	 * The number of structural features of the '<em>Message Signature</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESSAGE_SIGNATURE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.scribble.scribble.impl.PayloadTypeImpl <em>Payload Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.scribble.scribble.impl.PayloadTypeImpl
	 * @see org.scribble.scribble.impl.ScribblePackageImpl#getPayloadType()
	 * @generated
	 */
  int PAYLOAD_TYPE = 16;

  /**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAYLOAD_TYPE__PAYLOAD = 0;

  /**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAYLOAD_TYPE__DATA_TYPE = 1;

  /**
	 * The number of structural features of the '<em>Payload Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAYLOAD_TYPE_FEATURE_COUNT = 2;


  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.ScribbleProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.scribble.scribble.ScribbleProgram
	 * @generated
	 */
  EClass getScribbleProgram();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.ScribbleProgram#getIncludeDecl <em>Include Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Decl</em>'.
	 * @see org.scribble.scribble.ScribbleProgram#getIncludeDecl()
	 * @see #getScribbleProgram()
	 * @generated
	 */
  EReference getScribbleProgram_IncludeDecl();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.ScribbleProgram#getTypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Decl</em>'.
	 * @see org.scribble.scribble.ScribbleProgram#getTypeDecl()
	 * @see #getScribbleProgram()
	 * @generated
	 */
  EReference getScribbleProgram_TypeDecl();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.ScribbleProgram#getGlobalProtocolDecl <em>Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Protocol Decl</em>'.
	 * @see org.scribble.scribble.ScribbleProgram#getGlobalProtocolDecl()
	 * @see #getScribbleProgram()
	 * @generated
	 */
  EReference getScribbleProgram_GlobalProtocolDecl();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.ScribbleProgram#getInstGlobalProtocolDecl <em>Inst Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inst Global Protocol Decl</em>'.
	 * @see org.scribble.scribble.ScribbleProgram#getInstGlobalProtocolDecl()
	 * @see #getScribbleProgram()
	 * @generated
	 */
  EReference getScribbleProgram_InstGlobalProtocolDecl();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.IncludeDecl <em>Include Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Decl</em>'.
	 * @see org.scribble.scribble.IncludeDecl
	 * @generated
	 */
  EClass getIncludeDecl();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.IncludeDecl#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.scribble.scribble.IncludeDecl#getImportURI()
	 * @see #getIncludeDecl()
	 * @generated
	 */
  EAttribute getIncludeDecl_ImportURI();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.InstGlobalProtocolDecl <em>Inst Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inst Global Protocol Decl</em>'.
	 * @see org.scribble.scribble.InstGlobalProtocolDecl
	 * @generated
	 */
  EClass getInstGlobalProtocolDecl();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.InstGlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see org.scribble.scribble.InstGlobalProtocolDecl#getProtocolName()
	 * @see #getInstGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getInstGlobalProtocolDecl_ProtocolName();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.InstGlobalProtocolDecl#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.scribble.scribble.InstGlobalProtocolDecl#getRoles()
	 * @see #getInstGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getInstGlobalProtocolDecl_Roles();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.InstGlobalProtocolDecl#getInstantiatedProtocol <em>Instantiated Protocol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiated Protocol</em>'.
	 * @see org.scribble.scribble.InstGlobalProtocolDecl#getInstantiatedProtocol()
	 * @see #getInstGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getInstGlobalProtocolDecl_InstantiatedProtocol();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.TypeDecl <em>Type Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Decl</em>'.
	 * @see org.scribble.scribble.TypeDecl
	 * @generated
	 */
  EClass getTypeDecl();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.TypeDecl#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.scribble.scribble.TypeDecl#getTypeName()
	 * @see #getTypeDecl()
	 * @generated
	 */
  EAttribute getTypeDecl_TypeName();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.TypeDecl#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.scribble.scribble.TypeDecl#getSchema()
	 * @see #getTypeDecl()
	 * @generated
	 */
  EAttribute getTypeDecl_Schema();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.TypeDecl#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.scribble.scribble.TypeDecl#getFile()
	 * @see #getTypeDecl()
	 * @generated
	 */
  EAttribute getTypeDecl_File();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.TypeDecl#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.scribble.scribble.TypeDecl#getAlias()
	 * @see #getTypeDecl()
	 * @generated
	 */
  EAttribute getTypeDecl_Alias();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.GlobalProtocolDecl <em>Global Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Protocol Decl</em>'.
	 * @see org.scribble.scribble.GlobalProtocolDecl
	 * @generated
	 */
  EClass getGlobalProtocolDecl();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.GlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see org.scribble.scribble.GlobalProtocolDecl#getProtocolName()
	 * @see #getGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getGlobalProtocolDecl_ProtocolName();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.GlobalProtocolDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.scribble.scribble.GlobalProtocolDecl#getParameters()
	 * @see #getGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getGlobalProtocolDecl_Parameters();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.GlobalProtocolDecl#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.scribble.scribble.GlobalProtocolDecl#getRoles()
	 * @see #getGlobalProtocolDecl()
	 * @generated
	 */
  EAttribute getGlobalProtocolDecl_Roles();

  /**
	 * Returns the meta object for the containment reference '{@link org.scribble.scribble.GlobalProtocolDecl#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.scribble.scribble.GlobalProtocolDecl#getBody()
	 * @see #getGlobalProtocolDecl()
	 * @generated
	 */
  EReference getGlobalProtocolDecl_Body();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.GlobalInteractionBlock <em>Global Interaction Block</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Interaction Block</em>'.
	 * @see org.scribble.scribble.GlobalInteractionBlock
	 * @generated
	 */
  EClass getGlobalInteractionBlock();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.GlobalInteractionBlock#getInteractionsequence <em>Interactionsequence</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactionsequence</em>'.
	 * @see org.scribble.scribble.GlobalInteractionBlock#getInteractionsequence()
	 * @see #getGlobalInteractionBlock()
	 * @generated
	 */
  EReference getGlobalInteractionBlock_Interactionsequence();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.GlobalInteraction <em>Global Interaction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Interaction</em>'.
	 * @see org.scribble.scribble.GlobalInteraction
	 * @generated
	 */
  EClass getGlobalInteraction();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Spawn <em>Spawn</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spawn</em>'.
	 * @see org.scribble.scribble.Spawn
	 * @generated
	 */
  EClass getSpawn();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Spawn#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.scribble.scribble.Spawn#getRoleName()
	 * @see #getSpawn()
	 * @generated
	 */
  EAttribute getSpawn_RoleName();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Spawn#getTargetProtocolName <em>Target Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Protocol Name</em>'.
	 * @see org.scribble.scribble.Spawn#getTargetProtocolName()
	 * @see #getSpawn()
	 * @generated
	 */
  EAttribute getSpawn_TargetProtocolName();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Spawn#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.scribble.scribble.Spawn#getParameters()
	 * @see #getSpawn()
	 * @generated
	 */
  EAttribute getSpawn_Parameters();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Spawn#getCurrentRoles <em>Current Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current Roles</em>'.
	 * @see org.scribble.scribble.Spawn#getCurrentRoles()
	 * @see #getSpawn()
	 * @generated
	 */
  EAttribute getSpawn_CurrentRoles();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Spawn#getTargetRoles <em>Target Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Roles</em>'.
	 * @see org.scribble.scribble.Spawn#getTargetRoles()
	 * @see #getSpawn()
	 * @generated
	 */
  EAttribute getSpawn_TargetRoles();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Do <em>Do</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do</em>'.
	 * @see org.scribble.scribble.Do
	 * @generated
	 */
  EClass getDo();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Do#getTargetProtocolName <em>Target Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Protocol Name</em>'.
	 * @see org.scribble.scribble.Do#getTargetProtocolName()
	 * @see #getDo()
	 * @generated
	 */
  EAttribute getDo_TargetProtocolName();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.Do#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.scribble.scribble.Do#getArguments()
	 * @see #getDo()
	 * @generated
	 */
  EReference getDo_Arguments();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Do#getCurrentRoles <em>Current Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current Roles</em>'.
	 * @see org.scribble.scribble.Do#getCurrentRoles()
	 * @see #getDo()
	 * @generated
	 */
  EAttribute getDo_CurrentRoles();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Do#getTargetRoles <em>Target Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Roles</em>'.
	 * @see org.scribble.scribble.Do#getTargetRoles()
	 * @see #getDo()
	 * @generated
	 */
  EAttribute getDo_TargetRoles();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Interruptible <em>Interruptible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptible</em>'.
	 * @see org.scribble.scribble.Interruptible
	 * @generated
	 */
  EClass getInterruptible();

  /**
	 * Returns the meta object for the containment reference '{@link org.scribble.scribble.Interruptible#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.scribble.scribble.Interruptible#getBody()
	 * @see #getInterruptible()
	 * @generated
	 */
  EReference getInterruptible_Body();

  /**
	 * Returns the meta object for the attribute list '{@link org.scribble.scribble.Interruptible#getRoleNames <em>Role Names</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Names</em>'.
	 * @see org.scribble.scribble.Interruptible#getRoleNames()
	 * @see #getInterruptible()
	 * @generated
	 */
  EAttribute getInterruptible_RoleNames();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.Interruptible#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see org.scribble.scribble.Interruptible#getSignatures()
	 * @see #getInterruptible()
	 * @generated
	 */
  EReference getInterruptible_Signatures();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue</em>'.
	 * @see org.scribble.scribble.Continue
	 * @generated
	 */
  EClass getContinue();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Continue#getLoopName <em>Loop Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Name</em>'.
	 * @see org.scribble.scribble.Continue#getLoopName()
	 * @see #getContinue()
	 * @generated
	 */
  EAttribute getContinue_LoopName();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Recursion <em>Recursion</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursion</em>'.
	 * @see org.scribble.scribble.Recursion
	 * @generated
	 */
  EClass getRecursion();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Recursion#getLoopName <em>Loop Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Name</em>'.
	 * @see org.scribble.scribble.Recursion#getLoopName()
	 * @see #getRecursion()
	 * @generated
	 */
  EAttribute getRecursion_LoopName();

  /**
	 * Returns the meta object for the containment reference '{@link org.scribble.scribble.Recursion#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.scribble.scribble.Recursion#getBody()
	 * @see #getRecursion()
	 * @generated
	 */
  EReference getRecursion_Body();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.scribble.scribble.Parallel
	 * @generated
	 */
  EClass getParallel();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.Parallel#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.scribble.scribble.Parallel#getBranches()
	 * @see #getParallel()
	 * @generated
	 */
  EReference getParallel_Branches();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org.scribble.scribble.Choice
	 * @generated
	 */
  EClass getChoice();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Choice#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.scribble.scribble.Choice#getRole()
	 * @see #getChoice()
	 * @generated
	 */
  EAttribute getChoice_Role();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.Choice#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.scribble.scribble.Choice#getBranches()
	 * @see #getChoice()
	 * @generated
	 */
  EReference getChoice_Branches();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.scribble.scribble.Message
	 * @generated
	 */
  EClass getMessage();

  /**
	 * Returns the meta object for the containment reference '{@link org.scribble.scribble.Message#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see org.scribble.scribble.Message#getSignature()
	 * @see #getMessage()
	 * @generated
	 */
  EReference getMessage_Signature();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Message#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender</em>'.
	 * @see org.scribble.scribble.Message#getSender()
	 * @see #getMessage()
	 * @generated
	 */
  EAttribute getMessage_Sender();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.Message#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver</em>'.
	 * @see org.scribble.scribble.Message#getReceiver()
	 * @see #getMessage()
	 * @generated
	 */
  EAttribute getMessage_Receiver();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.MessageSignature <em>Message Signature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Signature</em>'.
	 * @see org.scribble.scribble.MessageSignature
	 * @generated
	 */
  EClass getMessageSignature();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.MessageSignature#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.scribble.scribble.MessageSignature#getOperator()
	 * @see #getMessageSignature()
	 * @generated
	 */
  EAttribute getMessageSignature_Operator();

  /**
	 * Returns the meta object for the containment reference list '{@link org.scribble.scribble.MessageSignature#getPayloadTypes <em>Payload Types</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payload Types</em>'.
	 * @see org.scribble.scribble.MessageSignature#getPayloadTypes()
	 * @see #getMessageSignature()
	 * @generated
	 */
  EReference getMessageSignature_PayloadTypes();

  /**
	 * Returns the meta object for class '{@link org.scribble.scribble.PayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Type</em>'.
	 * @see org.scribble.scribble.PayloadType
	 * @generated
	 */
  EClass getPayloadType();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.PayloadType#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see org.scribble.scribble.PayloadType#getPayload()
	 * @see #getPayloadType()
	 * @generated
	 */
  EAttribute getPayloadType_Payload();

  /**
	 * Returns the meta object for the attribute '{@link org.scribble.scribble.PayloadType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.scribble.scribble.PayloadType#getDataType()
	 * @see #getPayloadType()
	 * @generated
	 */
  EAttribute getPayloadType_DataType();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  ScribbleFactory getScribbleFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.ScribbleProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.ScribbleProgramImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getScribbleProgram()
		 * @generated
		 */
    EClass SCRIBBLE_PROGRAM = eINSTANCE.getScribbleProgram();

    /**
		 * The meta object literal for the '<em><b>Include Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SCRIBBLE_PROGRAM__INCLUDE_DECL = eINSTANCE.getScribbleProgram_IncludeDecl();

    /**
		 * The meta object literal for the '<em><b>Type Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SCRIBBLE_PROGRAM__TYPE_DECL = eINSTANCE.getScribbleProgram_TypeDecl();

    /**
		 * The meta object literal for the '<em><b>Global Protocol Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL = eINSTANCE.getScribbleProgram_GlobalProtocolDecl();

    /**
		 * The meta object literal for the '<em><b>Inst Global Protocol Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL = eINSTANCE.getScribbleProgram_InstGlobalProtocolDecl();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.IncludeDeclImpl <em>Include Decl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.IncludeDeclImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getIncludeDecl()
		 * @generated
		 */
    EClass INCLUDE_DECL = eINSTANCE.getIncludeDecl();

    /**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INCLUDE_DECL__IMPORT_URI = eINSTANCE.getIncludeDecl_ImportURI();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.InstGlobalProtocolDeclImpl <em>Inst Global Protocol Decl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.InstGlobalProtocolDeclImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getInstGlobalProtocolDecl()
		 * @generated
		 */
    EClass INST_GLOBAL_PROTOCOL_DECL = eINSTANCE.getInstGlobalProtocolDecl();

    /**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME = eINSTANCE.getInstGlobalProtocolDecl_ProtocolName();

    /**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INST_GLOBAL_PROTOCOL_DECL__ROLES = eINSTANCE.getInstGlobalProtocolDecl_Roles();

    /**
		 * The meta object literal for the '<em><b>Instantiated Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL = eINSTANCE.getInstGlobalProtocolDecl_InstantiatedProtocol();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.TypeDeclImpl <em>Type Decl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.TypeDeclImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getTypeDecl()
		 * @generated
		 */
    EClass TYPE_DECL = eINSTANCE.getTypeDecl();

    /**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TYPE_DECL__TYPE_NAME = eINSTANCE.getTypeDecl_TypeName();

    /**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TYPE_DECL__SCHEMA = eINSTANCE.getTypeDecl_Schema();

    /**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TYPE_DECL__FILE = eINSTANCE.getTypeDecl_File();

    /**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TYPE_DECL__ALIAS = eINSTANCE.getTypeDecl_Alias();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl <em>Global Protocol Decl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.GlobalProtocolDeclImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalProtocolDecl()
		 * @generated
		 */
    EClass GLOBAL_PROTOCOL_DECL = eINSTANCE.getGlobalProtocolDecl();

    /**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME = eINSTANCE.getGlobalProtocolDecl_ProtocolName();

    /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GLOBAL_PROTOCOL_DECL__PARAMETERS = eINSTANCE.getGlobalProtocolDecl_Parameters();

    /**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GLOBAL_PROTOCOL_DECL__ROLES = eINSTANCE.getGlobalProtocolDecl_Roles();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference GLOBAL_PROTOCOL_DECL__BODY = eINSTANCE.getGlobalProtocolDecl_Body();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.GlobalInteractionBlockImpl <em>Global Interaction Block</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.GlobalInteractionBlockImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalInteractionBlock()
		 * @generated
		 */
    EClass GLOBAL_INTERACTION_BLOCK = eINSTANCE.getGlobalInteractionBlock();

    /**
		 * The meta object literal for the '<em><b>Interactionsequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE = eINSTANCE.getGlobalInteractionBlock_Interactionsequence();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.GlobalInteractionImpl <em>Global Interaction</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.GlobalInteractionImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getGlobalInteraction()
		 * @generated
		 */
    EClass GLOBAL_INTERACTION = eINSTANCE.getGlobalInteraction();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.SpawnImpl <em>Spawn</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.SpawnImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getSpawn()
		 * @generated
		 */
    EClass SPAWN = eINSTANCE.getSpawn();

    /**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPAWN__ROLE_NAME = eINSTANCE.getSpawn_RoleName();

    /**
		 * The meta object literal for the '<em><b>Target Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPAWN__TARGET_PROTOCOL_NAME = eINSTANCE.getSpawn_TargetProtocolName();

    /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPAWN__PARAMETERS = eINSTANCE.getSpawn_Parameters();

    /**
		 * The meta object literal for the '<em><b>Current Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPAWN__CURRENT_ROLES = eINSTANCE.getSpawn_CurrentRoles();

    /**
		 * The meta object literal for the '<em><b>Target Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SPAWN__TARGET_ROLES = eINSTANCE.getSpawn_TargetRoles();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.DoImpl <em>Do</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.DoImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getDo()
		 * @generated
		 */
    EClass DO = eINSTANCE.getDo();

    /**
		 * The meta object literal for the '<em><b>Target Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DO__TARGET_PROTOCOL_NAME = eINSTANCE.getDo_TargetProtocolName();

    /**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DO__ARGUMENTS = eINSTANCE.getDo_Arguments();

    /**
		 * The meta object literal for the '<em><b>Current Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DO__CURRENT_ROLES = eINSTANCE.getDo_CurrentRoles();

    /**
		 * The meta object literal for the '<em><b>Target Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DO__TARGET_ROLES = eINSTANCE.getDo_TargetRoles();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.InterruptibleImpl <em>Interruptible</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.InterruptibleImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getInterruptible()
		 * @generated
		 */
    EClass INTERRUPTIBLE = eINSTANCE.getInterruptible();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INTERRUPTIBLE__BODY = eINSTANCE.getInterruptible_Body();

    /**
		 * The meta object literal for the '<em><b>Role Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTERRUPTIBLE__ROLE_NAMES = eINSTANCE.getInterruptible_RoleNames();

    /**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INTERRUPTIBLE__SIGNATURES = eINSTANCE.getInterruptible_Signatures();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.ContinueImpl <em>Continue</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.ContinueImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getContinue()
		 * @generated
		 */
    EClass CONTINUE = eINSTANCE.getContinue();

    /**
		 * The meta object literal for the '<em><b>Loop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTINUE__LOOP_NAME = eINSTANCE.getContinue_LoopName();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.RecursionImpl <em>Recursion</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.RecursionImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getRecursion()
		 * @generated
		 */
    EClass RECURSION = eINSTANCE.getRecursion();

    /**
		 * The meta object literal for the '<em><b>Loop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECURSION__LOOP_NAME = eINSTANCE.getRecursion_LoopName();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECURSION__BODY = eINSTANCE.getRecursion_Body();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.ParallelImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getParallel()
		 * @generated
		 */
    EClass PARALLEL = eINSTANCE.getParallel();

    /**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PARALLEL__BRANCHES = eINSTANCE.getParallel_Branches();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.ChoiceImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getChoice()
		 * @generated
		 */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CHOICE__ROLE = eINSTANCE.getChoice_Role();

    /**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CHOICE__BRANCHES = eINSTANCE.getChoice_Branches();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.MessageImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getMessage()
		 * @generated
		 */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MESSAGE__SIGNATURE = eINSTANCE.getMessage_Signature();

    /**
		 * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

    /**
		 * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESSAGE__RECEIVER = eINSTANCE.getMessage_Receiver();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.MessageSignatureImpl <em>Message Signature</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.MessageSignatureImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getMessageSignature()
		 * @generated
		 */
    EClass MESSAGE_SIGNATURE = eINSTANCE.getMessageSignature();

    /**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESSAGE_SIGNATURE__OPERATOR = eINSTANCE.getMessageSignature_Operator();

    /**
		 * The meta object literal for the '<em><b>Payload Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MESSAGE_SIGNATURE__PAYLOAD_TYPES = eINSTANCE.getMessageSignature_PayloadTypes();

    /**
		 * The meta object literal for the '{@link org.scribble.scribble.impl.PayloadTypeImpl <em>Payload Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.scribble.scribble.impl.PayloadTypeImpl
		 * @see org.scribble.scribble.impl.ScribblePackageImpl#getPayloadType()
		 * @generated
		 */
    EClass PAYLOAD_TYPE = eINSTANCE.getPayloadType();

    /**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAYLOAD_TYPE__PAYLOAD = eINSTANCE.getPayloadType_Payload();

    /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAYLOAD_TYPE__DATA_TYPE = eINSTANCE.getPayloadType_DataType();

  }

} //ScribblePackage
