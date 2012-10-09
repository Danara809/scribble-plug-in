/**
 */
package org.scribble.scribble.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.scribble.scribble.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.scribble.scribble.ScribblePackage
 * @generated
 */
public class ScribbleSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ScribblePackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ScribbleSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ScribblePackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ScribblePackage.SCRIBBLE_PROGRAM: {
				ScribbleProgram scribbleProgram = (ScribbleProgram)theEObject;
				T result = caseScribbleProgram(scribbleProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.INCLUDE_DECL: {
				IncludeDecl includeDecl = (IncludeDecl)theEObject;
				T result = caseIncludeDecl(includeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL: {
				InstGlobalProtocolDecl instGlobalProtocolDecl = (InstGlobalProtocolDecl)theEObject;
				T result = caseInstGlobalProtocolDecl(instGlobalProtocolDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.TYPE_DECL: {
				TypeDecl typeDecl = (TypeDecl)theEObject;
				T result = caseTypeDecl(typeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.GLOBAL_PROTOCOL_DECL: {
				GlobalProtocolDecl globalProtocolDecl = (GlobalProtocolDecl)theEObject;
				T result = caseGlobalProtocolDecl(globalProtocolDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK: {
				GlobalInteractionBlock globalInteractionBlock = (GlobalInteractionBlock)theEObject;
				T result = caseGlobalInteractionBlock(globalInteractionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.GLOBAL_INTERACTION: {
				GlobalInteraction globalInteraction = (GlobalInteraction)theEObject;
				T result = caseGlobalInteraction(globalInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.SPAWN: {
				Spawn spawn = (Spawn)theEObject;
				T result = caseSpawn(spawn);
				if (result == null) result = caseGlobalInteraction(spawn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.DO: {
				Do do_ = (Do)theEObject;
				T result = caseDo(do_);
				if (result == null) result = caseGlobalInteraction(do_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.INTERRUPTIBLE: {
				Interruptible interruptible = (Interruptible)theEObject;
				T result = caseInterruptible(interruptible);
				if (result == null) result = caseGlobalInteraction(interruptible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.CONTINUE: {
				Continue continue_ = (Continue)theEObject;
				T result = caseContinue(continue_);
				if (result == null) result = caseGlobalInteraction(continue_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.RECURSION: {
				Recursion recursion = (Recursion)theEObject;
				T result = caseRecursion(recursion);
				if (result == null) result = caseGlobalInteraction(recursion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseGlobalInteraction(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseGlobalInteraction(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseGlobalInteraction(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.MESSAGE_SIGNATURE: {
				MessageSignature messageSignature = (MessageSignature)theEObject;
				T result = caseMessageSignature(messageSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScribblePackage.PAYLOAD_TYPE: {
				PayloadType payloadType = (PayloadType)theEObject;
				T result = casePayloadType(payloadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseScribbleProgram(ScribbleProgram object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Include Decl</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIncludeDecl(IncludeDecl object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Inst Global Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inst Global Protocol Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInstGlobalProtocolDecl(InstGlobalProtocolDecl object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Decl</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeDecl(TypeDecl object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Global Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Protocol Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGlobalProtocolDecl(GlobalProtocolDecl object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Global Interaction Block</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Interaction Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGlobalInteractionBlock(GlobalInteractionBlock object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Global Interaction</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGlobalInteraction(GlobalInteraction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Spawn</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spawn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSpawn(Spawn object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Do</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDo(Do object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInterruptible(Interruptible object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContinue(Continue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Recursion</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recursion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRecursion(Recursion object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseParallel(Parallel object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseChoice(Choice object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMessage(Message object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Message Signature</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMessageSignature(MessageSignature object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePayloadType(PayloadType object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ScribbleSwitch
