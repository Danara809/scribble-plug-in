/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Choice#getRole <em>Role</em>}</li>
 *   <li>{@link org.scribble.scribble.Choice#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.scribble.scribble.ScribblePackage#getChoice_Role()
	 * @model
	 * @generated
	 */
  String getRole();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Choice#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
  void setRole(String value);

  /**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.GlobalInteractionBlock}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getChoice_Branches()
	 * @model containment="true"
	 * @generated
	 */
  EList<GlobalInteractionBlock> getBranches();

} // Choice
