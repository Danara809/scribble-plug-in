/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inst Global Protocol Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.InstGlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.InstGlobalProtocolDecl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.InstGlobalProtocolDecl#getInstantiatedProtocol <em>Instantiated Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getInstGlobalProtocolDecl()
 * @model
 * @generated
 */
public interface InstGlobalProtocolDecl extends EObject
{
  /**
	 * Returns the value of the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Name</em>' attribute.
	 * @see #setProtocolName(String)
	 * @see org.scribble.scribble.ScribblePackage#getInstGlobalProtocolDecl_ProtocolName()
	 * @model
	 * @generated
	 */
  String getProtocolName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.InstGlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
  void setProtocolName(String value);

  /**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.scribble.scribble.ScribblePackage#getInstGlobalProtocolDecl_Roles()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getRoles();

  /**
	 * Returns the value of the '<em><b>Instantiated Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiated Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Protocol</em>' attribute.
	 * @see #setInstantiatedProtocol(String)
	 * @see org.scribble.scribble.ScribblePackage#getInstGlobalProtocolDecl_InstantiatedProtocol()
	 * @model
	 * @generated
	 */
  String getInstantiatedProtocol();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.InstGlobalProtocolDecl#getInstantiatedProtocol <em>Instantiated Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Protocol</em>' attribute.
	 * @see #getInstantiatedProtocol()
	 * @generated
	 */
  void setInstantiatedProtocol(String value);

} // InstGlobalProtocolDecl
