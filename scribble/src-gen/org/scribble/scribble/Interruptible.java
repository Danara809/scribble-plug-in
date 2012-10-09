/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Interruptible#getBody <em>Body</em>}</li>
 *   <li>{@link org.scribble.scribble.Interruptible#getRoleNames <em>Role Names</em>}</li>
 *   <li>{@link org.scribble.scribble.Interruptible#getSignatures <em>Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getInterruptible()
 * @model
 * @generated
 */
public interface Interruptible extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(GlobalInteractionBlock)
	 * @see org.scribble.scribble.ScribblePackage#getInterruptible_Body()
	 * @model containment="true"
	 * @generated
	 */
  GlobalInteractionBlock getBody();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Interruptible#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
  void setBody(GlobalInteractionBlock value);

  /**
	 * Returns the value of the '<em><b>Role Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Names</em>' attribute list.
	 * @see org.scribble.scribble.ScribblePackage#getInterruptible_RoleNames()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getRoleNames();

  /**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.MessageSignature}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getInterruptible_Signatures()
	 * @model containment="true"
	 * @generated
	 */
  EList<MessageSignature> getSignatures();

} // Interruptible
