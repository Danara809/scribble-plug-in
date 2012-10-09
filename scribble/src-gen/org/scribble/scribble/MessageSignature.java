/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.MessageSignature#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.scribble.scribble.MessageSignature#getPayloadTypes <em>Payload Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getMessageSignature()
 * @model
 * @generated
 */
public interface MessageSignature extends EObject
{
  /**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.scribble.scribble.ScribblePackage#getMessageSignature_Operator()
	 * @model
	 * @generated
	 */
  String getOperator();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.MessageSignature#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
  void setOperator(String value);

  /**
	 * Returns the value of the '<em><b>Payload Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.PayloadType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Payload Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Types</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getMessageSignature_PayloadTypes()
	 * @model containment="true"
	 * @generated
	 */
  EList<PayloadType> getPayloadTypes();

} // MessageSignature
