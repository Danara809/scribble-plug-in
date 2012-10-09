/**
 */
package org.scribble.scribble;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Message#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.scribble.scribble.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.scribble.scribble.Message#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(MessageSignature)
	 * @see org.scribble.scribble.ScribblePackage#getMessage_Signature()
	 * @model containment="true"
	 * @generated
	 */
  MessageSignature getSignature();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Message#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
  void setSignature(MessageSignature value);

  /**
	 * Returns the value of the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' attribute.
	 * @see #setSender(String)
	 * @see org.scribble.scribble.ScribblePackage#getMessage_Sender()
	 * @model
	 * @generated
	 */
  String getSender();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Message#getSender <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' attribute.
	 * @see #getSender()
	 * @generated
	 */
  void setSender(String value);

  /**
	 * Returns the value of the '<em><b>Receiver</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' attribute.
	 * @see #setReceiver(String)
	 * @see org.scribble.scribble.ScribblePackage#getMessage_Receiver()
	 * @model
	 * @generated
	 */
  String getReceiver();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Message#getReceiver <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' attribute.
	 * @see #getReceiver()
	 * @generated
	 */
  void setReceiver(String value);

} // Message
