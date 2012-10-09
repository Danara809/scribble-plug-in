/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.scribble.scribble.Choice;
import org.scribble.scribble.Continue;
import org.scribble.scribble.Do;
import org.scribble.scribble.GlobalInteraction;
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
import org.scribble.scribble.ScribbleFactory;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.Spawn;
import org.scribble.scribble.TypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScribblePackageImpl extends EPackageImpl implements ScribblePackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass scribbleProgramEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass includeDeclEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass instGlobalProtocolDeclEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeDeclEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass globalProtocolDeclEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass globalInteractionBlockEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass globalInteractionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass spawnEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass doEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass interruptibleEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass continueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recursionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parallelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass choiceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageSignatureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass payloadTypeEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.scribble.scribble.ScribblePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ScribblePackageImpl()
  {
		super(eNS_URI, ScribbleFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScribblePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ScribblePackage init()
  {
		if (isInited) return (ScribblePackage)EPackage.Registry.INSTANCE.getEPackage(ScribblePackage.eNS_URI);

		// Obtain or create and register package
		ScribblePackageImpl theScribblePackage = (ScribblePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScribblePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScribblePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theScribblePackage.createPackageContents();

		// Initialize created meta-data
		theScribblePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScribblePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScribblePackage.eNS_URI, theScribblePackage);
		return theScribblePackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getScribbleProgram()
  {
		return scribbleProgramEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getScribbleProgram_IncludeDecl()
  {
		return (EReference)scribbleProgramEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getScribbleProgram_TypeDecl()
  {
		return (EReference)scribbleProgramEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getScribbleProgram_GlobalProtocolDecl()
  {
		return (EReference)scribbleProgramEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getScribbleProgram_InstGlobalProtocolDecl()
  {
		return (EReference)scribbleProgramEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIncludeDecl()
  {
		return includeDeclEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIncludeDecl_ImportURI()
  {
		return (EAttribute)includeDeclEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInstGlobalProtocolDecl()
  {
		return instGlobalProtocolDeclEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInstGlobalProtocolDecl_ProtocolName()
  {
		return (EAttribute)instGlobalProtocolDeclEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInstGlobalProtocolDecl_Roles()
  {
		return (EAttribute)instGlobalProtocolDeclEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInstGlobalProtocolDecl_InstantiatedProtocol()
  {
		return (EAttribute)instGlobalProtocolDeclEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeDecl()
  {
		return typeDeclEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeDecl_TypeName()
  {
		return (EAttribute)typeDeclEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeDecl_Schema()
  {
		return (EAttribute)typeDeclEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeDecl_File()
  {
		return (EAttribute)typeDeclEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeDecl_Alias()
  {
		return (EAttribute)typeDeclEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGlobalProtocolDecl()
  {
		return globalProtocolDeclEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGlobalProtocolDecl_ProtocolName()
  {
		return (EAttribute)globalProtocolDeclEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGlobalProtocolDecl_Parameters()
  {
		return (EAttribute)globalProtocolDeclEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGlobalProtocolDecl_Roles()
  {
		return (EAttribute)globalProtocolDeclEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getGlobalProtocolDecl_Body()
  {
		return (EReference)globalProtocolDeclEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGlobalInteractionBlock()
  {
		return globalInteractionBlockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getGlobalInteractionBlock_Interactionsequence()
  {
		return (EReference)globalInteractionBlockEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGlobalInteraction()
  {
		return globalInteractionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSpawn()
  {
		return spawnEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpawn_RoleName()
  {
		return (EAttribute)spawnEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpawn_TargetProtocolName()
  {
		return (EAttribute)spawnEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpawn_Parameters()
  {
		return (EAttribute)spawnEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpawn_CurrentRoles()
  {
		return (EAttribute)spawnEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSpawn_TargetRoles()
  {
		return (EAttribute)spawnEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDo()
  {
		return doEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDo_TargetProtocolName()
  {
		return (EAttribute)doEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDo_Arguments()
  {
		return (EReference)doEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDo_CurrentRoles()
  {
		return (EAttribute)doEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDo_TargetRoles()
  {
		return (EAttribute)doEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInterruptible()
  {
		return interruptibleEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInterruptible_Body()
  {
		return (EReference)interruptibleEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getInterruptible_RoleNames()
  {
		return (EAttribute)interruptibleEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInterruptible_Signatures()
  {
		return (EReference)interruptibleEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContinue()
  {
		return continueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getContinue_LoopName()
  {
		return (EAttribute)continueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecursion()
  {
		return recursionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRecursion_LoopName()
  {
		return (EAttribute)recursionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecursion_Body()
  {
		return (EReference)recursionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParallel()
  {
		return parallelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getParallel_Branches()
  {
		return (EReference)parallelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getChoice()
  {
		return choiceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getChoice_Role()
  {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getChoice_Branches()
  {
		return (EReference)choiceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMessage()
  {
		return messageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMessage_Signature()
  {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMessage_Sender()
  {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMessage_Receiver()
  {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMessageSignature()
  {
		return messageSignatureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMessageSignature_Operator()
  {
		return (EAttribute)messageSignatureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMessageSignature_PayloadTypes()
  {
		return (EReference)messageSignatureEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPayloadType()
  {
		return payloadTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPayloadType_Payload()
  {
		return (EAttribute)payloadTypeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPayloadType_DataType()
  {
		return (EAttribute)payloadTypeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribbleFactory getScribbleFactory()
  {
		return (ScribbleFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scribbleProgramEClass = createEClass(SCRIBBLE_PROGRAM);
		createEReference(scribbleProgramEClass, SCRIBBLE_PROGRAM__INCLUDE_DECL);
		createEReference(scribbleProgramEClass, SCRIBBLE_PROGRAM__TYPE_DECL);
		createEReference(scribbleProgramEClass, SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL);
		createEReference(scribbleProgramEClass, SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL);

		includeDeclEClass = createEClass(INCLUDE_DECL);
		createEAttribute(includeDeclEClass, INCLUDE_DECL__IMPORT_URI);

		instGlobalProtocolDeclEClass = createEClass(INST_GLOBAL_PROTOCOL_DECL);
		createEAttribute(instGlobalProtocolDeclEClass, INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME);
		createEAttribute(instGlobalProtocolDeclEClass, INST_GLOBAL_PROTOCOL_DECL__ROLES);
		createEAttribute(instGlobalProtocolDeclEClass, INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL);

		typeDeclEClass = createEClass(TYPE_DECL);
		createEAttribute(typeDeclEClass, TYPE_DECL__TYPE_NAME);
		createEAttribute(typeDeclEClass, TYPE_DECL__SCHEMA);
		createEAttribute(typeDeclEClass, TYPE_DECL__FILE);
		createEAttribute(typeDeclEClass, TYPE_DECL__ALIAS);

		globalProtocolDeclEClass = createEClass(GLOBAL_PROTOCOL_DECL);
		createEAttribute(globalProtocolDeclEClass, GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME);
		createEAttribute(globalProtocolDeclEClass, GLOBAL_PROTOCOL_DECL__PARAMETERS);
		createEAttribute(globalProtocolDeclEClass, GLOBAL_PROTOCOL_DECL__ROLES);
		createEReference(globalProtocolDeclEClass, GLOBAL_PROTOCOL_DECL__BODY);

		globalInteractionBlockEClass = createEClass(GLOBAL_INTERACTION_BLOCK);
		createEReference(globalInteractionBlockEClass, GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE);

		globalInteractionEClass = createEClass(GLOBAL_INTERACTION);

		spawnEClass = createEClass(SPAWN);
		createEAttribute(spawnEClass, SPAWN__ROLE_NAME);
		createEAttribute(spawnEClass, SPAWN__TARGET_PROTOCOL_NAME);
		createEAttribute(spawnEClass, SPAWN__PARAMETERS);
		createEAttribute(spawnEClass, SPAWN__CURRENT_ROLES);
		createEAttribute(spawnEClass, SPAWN__TARGET_ROLES);

		doEClass = createEClass(DO);
		createEAttribute(doEClass, DO__TARGET_PROTOCOL_NAME);
		createEReference(doEClass, DO__ARGUMENTS);
		createEAttribute(doEClass, DO__CURRENT_ROLES);
		createEAttribute(doEClass, DO__TARGET_ROLES);

		interruptibleEClass = createEClass(INTERRUPTIBLE);
		createEReference(interruptibleEClass, INTERRUPTIBLE__BODY);
		createEAttribute(interruptibleEClass, INTERRUPTIBLE__ROLE_NAMES);
		createEReference(interruptibleEClass, INTERRUPTIBLE__SIGNATURES);

		continueEClass = createEClass(CONTINUE);
		createEAttribute(continueEClass, CONTINUE__LOOP_NAME);

		recursionEClass = createEClass(RECURSION);
		createEAttribute(recursionEClass, RECURSION__LOOP_NAME);
		createEReference(recursionEClass, RECURSION__BODY);

		parallelEClass = createEClass(PARALLEL);
		createEReference(parallelEClass, PARALLEL__BRANCHES);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__ROLE);
		createEReference(choiceEClass, CHOICE__BRANCHES);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEAttribute(messageEClass, MESSAGE__SENDER);
		createEAttribute(messageEClass, MESSAGE__RECEIVER);

		messageSignatureEClass = createEClass(MESSAGE_SIGNATURE);
		createEAttribute(messageSignatureEClass, MESSAGE_SIGNATURE__OPERATOR);
		createEReference(messageSignatureEClass, MESSAGE_SIGNATURE__PAYLOAD_TYPES);

		payloadTypeEClass = createEClass(PAYLOAD_TYPE);
		createEAttribute(payloadTypeEClass, PAYLOAD_TYPE__PAYLOAD);
		createEAttribute(payloadTypeEClass, PAYLOAD_TYPE__DATA_TYPE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spawnEClass.getESuperTypes().add(this.getGlobalInteraction());
		doEClass.getESuperTypes().add(this.getGlobalInteraction());
		interruptibleEClass.getESuperTypes().add(this.getGlobalInteraction());
		continueEClass.getESuperTypes().add(this.getGlobalInteraction());
		recursionEClass.getESuperTypes().add(this.getGlobalInteraction());
		parallelEClass.getESuperTypes().add(this.getGlobalInteraction());
		choiceEClass.getESuperTypes().add(this.getGlobalInteraction());
		messageEClass.getESuperTypes().add(this.getGlobalInteraction());

		// Initialize classes and features; add operations and parameters
		initEClass(scribbleProgramEClass, ScribbleProgram.class, "ScribbleProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScribbleProgram_IncludeDecl(), this.getIncludeDecl(), null, "includeDecl", null, 0, -1, ScribbleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScribbleProgram_TypeDecl(), this.getTypeDecl(), null, "typeDecl", null, 0, -1, ScribbleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScribbleProgram_GlobalProtocolDecl(), this.getGlobalProtocolDecl(), null, "globalProtocolDecl", null, 0, -1, ScribbleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScribbleProgram_InstGlobalProtocolDecl(), this.getInstGlobalProtocolDecl(), null, "instGlobalProtocolDecl", null, 0, -1, ScribbleProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeDeclEClass, IncludeDecl.class, "IncludeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeDecl_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, IncludeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instGlobalProtocolDeclEClass, InstGlobalProtocolDecl.class, "InstGlobalProtocolDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstGlobalProtocolDecl_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 0, 1, InstGlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstGlobalProtocolDecl_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, InstGlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstGlobalProtocolDecl_InstantiatedProtocol(), ecorePackage.getEString(), "instantiatedProtocol", null, 0, 1, InstGlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDecl_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDecl_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDecl_File(), ecorePackage.getEString(), "file", null, 0, 1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDecl_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalProtocolDeclEClass, GlobalProtocolDecl.class, "GlobalProtocolDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalProtocolDecl_ProtocolName(), ecorePackage.getEString(), "protocolName", null, 0, 1, GlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalProtocolDecl_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, GlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalProtocolDecl_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, GlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalProtocolDecl_Body(), this.getGlobalInteractionBlock(), null, "body", null, 0, 1, GlobalProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalInteractionBlockEClass, GlobalInteractionBlock.class, "GlobalInteractionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalInteractionBlock_Interactionsequence(), this.getGlobalInteraction(), null, "interactionsequence", null, 0, -1, GlobalInteractionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalInteractionEClass, GlobalInteraction.class, "GlobalInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spawnEClass, Spawn.class, "Spawn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpawn_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, Spawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpawn_TargetProtocolName(), ecorePackage.getEString(), "targetProtocolName", null, 0, 1, Spawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpawn_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Spawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpawn_CurrentRoles(), ecorePackage.getEString(), "currentRoles", null, 0, -1, Spawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpawn_TargetRoles(), ecorePackage.getEString(), "targetRoles", null, 0, -1, Spawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doEClass, Do.class, "Do", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDo_TargetProtocolName(), ecorePackage.getEString(), "targetProtocolName", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDo_Arguments(), this.getMessageSignature(), null, "arguments", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDo_CurrentRoles(), ecorePackage.getEString(), "currentRoles", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDo_TargetRoles(), ecorePackage.getEString(), "targetRoles", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptibleEClass, Interruptible.class, "Interruptible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptible_Body(), this.getGlobalInteractionBlock(), null, "body", null, 0, 1, Interruptible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptible_RoleNames(), ecorePackage.getEString(), "roleNames", null, 0, -1, Interruptible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterruptible_Signatures(), this.getMessageSignature(), null, "signatures", null, 0, -1, Interruptible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continueEClass, Continue.class, "Continue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinue_LoopName(), ecorePackage.getEString(), "loopName", null, 0, 1, Continue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursionEClass, Recursion.class, "Recursion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecursion_LoopName(), ecorePackage.getEString(), "loopName", null, 0, 1, Recursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecursion_Body(), this.getGlobalInteractionBlock(), null, "body", null, 0, 1, Recursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallel_Branches(), this.getGlobalInteractionBlock(), null, "branches", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Role(), ecorePackage.getEString(), "role", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoice_Branches(), this.getGlobalInteractionBlock(), null, "branches", null, 0, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Signature(), this.getMessageSignature(), null, "signature", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Sender(), ecorePackage.getEString(), "sender", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Receiver(), ecorePackage.getEString(), "receiver", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSignatureEClass, MessageSignature.class, "MessageSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageSignature_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, MessageSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageSignature_PayloadTypes(), this.getPayloadType(), null, "payloadTypes", null, 0, -1, MessageSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadTypeEClass, PayloadType.class, "PayloadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayloadType_Payload(), ecorePackage.getEString(), "payload", null, 0, 1, PayloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayloadType_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, PayloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScribblePackageImpl
