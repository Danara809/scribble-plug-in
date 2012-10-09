/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spawn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Spawn#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.scribble.scribble.Spawn#getTargetProtocolName <em>Target Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.Spawn#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scribble.scribble.Spawn#getCurrentRoles <em>Current Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.Spawn#getTargetRoles <em>Target Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getSpawn()
 * @model
 * @generated
 */
public interface Spawn extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see org.scribble.scribble.ScribblePackage#getSpawn_RoleName()
	 * @model
	 * @generated
	 */
  String getRoleName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Spawn#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
  void setRoleName(String value);

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
	 * @see org.scribble.scribble.ScribblePackage#getSpawn_TargetProtocolName()
	 * @model
	 * @generated
	 */
  String getTargetProtocolName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Spawn#getTargetProtocolName <em>Target Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Protocol Name</em>' attribute.
	 * @see #getTargetProtocolName()
	 * @generated
	 */
  void setTargetProtocolName(String value);

  /**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.scribble.scribble.ScribblePackage#getSpawn_Parameters()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getParameters();

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
	 * @see org.scribble.scribble.ScribblePackage#getSpawn_CurrentRoles()
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
	 * @see org.scribble.scribble.ScribblePackage#getSpawn_TargetRoles()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getTargetRoles();

} // Spawn
