/**
 */
package org.scribble.scribble;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.scribble.scribble.ScribblePackage
 * @generated
 */
public interface ScribbleFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ScribbleFactory eINSTANCE = org.scribble.scribble.impl.ScribbleFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
  ScribbleProgram createScribbleProgram();

  /**
	 * Returns a new object of class '<em>Include Decl</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Decl</em>'.
	 * @generated
	 */
  IncludeDecl createIncludeDecl();

  /**
	 * Returns a new object of class '<em>Inst Global Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inst Global Protocol Decl</em>'.
	 * @generated
	 */
  InstGlobalProtocolDecl createInstGlobalProtocolDecl();

  /**
	 * Returns a new object of class '<em>Type Decl</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Decl</em>'.
	 * @generated
	 */
  TypeDecl createTypeDecl();

  /**
	 * Returns a new object of class '<em>Global Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Protocol Decl</em>'.
	 * @generated
	 */
  GlobalProtocolDecl createGlobalProtocolDecl();

  /**
	 * Returns a new object of class '<em>Global Interaction Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Interaction Block</em>'.
	 * @generated
	 */
  GlobalInteractionBlock createGlobalInteractionBlock();

  /**
	 * Returns a new object of class '<em>Global Interaction</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Interaction</em>'.
	 * @generated
	 */
  GlobalInteraction createGlobalInteraction();

  /**
	 * Returns a new object of class '<em>Spawn</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spawn</em>'.
	 * @generated
	 */
  Spawn createSpawn();

  /**
	 * Returns a new object of class '<em>Do</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do</em>'.
	 * @generated
	 */
  Do createDo();

  /**
	 * Returns a new object of class '<em>Interruptible</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interruptible</em>'.
	 * @generated
	 */
  Interruptible createInterruptible();

  /**
	 * Returns a new object of class '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue</em>'.
	 * @generated
	 */
  Continue createContinue();

  /**
	 * Returns a new object of class '<em>Recursion</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recursion</em>'.
	 * @generated
	 */
  Recursion createRecursion();

  /**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
  Parallel createParallel();

  /**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
  Choice createChoice();

  /**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
  Message createMessage();

  /**
	 * Returns a new object of class '<em>Message Signature</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Signature</em>'.
	 * @generated
	 */
  MessageSignature createMessageSignature();

  /**
	 * Returns a new object of class '<em>Payload Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload Type</em>'.
	 * @generated
	 */
  PayloadType createPayloadType();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ScribblePackage getScribblePackage();

} //ScribbleFactory
