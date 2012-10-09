/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Do#getTargetProtocolName <em>Target Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.Do#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.scribble.scribble.Do#getCurrentRoles <em>Current Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.Do#getTargetRoles <em>Target Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getDo()
 * @model
 * @generated
 */
public interface Do extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Target Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Protocol Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Protocol Name</em>' attribute.
	 * @see #setTargetProtocolName(String)
	 * @see org.scribble.scribble.ScribblePackage#getDo_TargetProtocolName()
	 * @model
	 * @generated
	 */
  String getTargetProtocolName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Do#getTargetProtocolName <em>Target Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Protocol Name</em>' attribute.
	 * @see #getTargetProtocolName()
	 * @generated
	 */
  void setTargetProtocolName(String value);

  /**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.MessageSignature}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getDo_Arguments()
	 * @model containment="true"
	 * @generated
	 */
  EList<MessageSignature> getArguments();

  /**
	 * Returns the value of the '<em><b>Current Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Roles</em>' attribute list.
	 * @see org.scribble.scribble.ScribblePackage#getDo_CurrentRoles()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getCurrentRoles();

  /**
	 * Returns the value of the '<em><b>Target Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Roles</em>' attribute list.
	 * @see org.scribble.scribble.ScribblePackage#getDo_TargetRoles()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getTargetRoles();

} // Do
