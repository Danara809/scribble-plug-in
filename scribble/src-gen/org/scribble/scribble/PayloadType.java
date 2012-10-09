/**
 */
package org.scribble.scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.PayloadType#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.scribble.scribble.PayloadType#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getPayloadType()
 * @model
 * @generated
 */
public interface PayloadType extends EObject
{
  /**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Payload</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(String)
	 * @see org.scribble.scribble.ScribblePackage#getPayloadType_Payload()
	 * @model
	 * @generated
	 */
  String getPayload();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.PayloadType#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
  void setPayload(String value);

  /**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.scribble.scribble.ScribblePackage#getPayloadType_DataType()
	 * @model
	 * @generated
	 */
  String getDataType();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.PayloadType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
  void setDataType(String value);

} // PayloadType
