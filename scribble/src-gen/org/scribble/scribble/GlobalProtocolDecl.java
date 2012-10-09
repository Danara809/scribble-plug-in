/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Protocol Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.GlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.GlobalProtocolDecl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scribble.scribble.GlobalProtocolDecl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.GlobalProtocolDecl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getGlobalProtocolDecl()
 * @model
 * @generated
 */
public interface GlobalProtocolDecl extends EObject
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
	 * @see org.scribble.scribble.ScribblePackage#getGlobalProtocolDecl_ProtocolName()
	 * @model
	 * @generated
	 */
  String getProtocolName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.GlobalProtocolDecl#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
  void setProtocolName(String value);

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
	 * @see org.scribble.scribble.ScribblePackage#getGlobalProtocolDecl_Parameters()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getParameters();

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
	 * @see org.scribble.scribble.ScribblePackage#getGlobalProtocolDecl_Roles()
	 * @model unique="false"
	 * @generated
	 */
  EList<String> getRoles();

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
	 * @see org.scribble.scribble.ScribblePackage#getGlobalProtocolDecl_Body()
	 * @model containment="true"
	 * @generated
	 */
  GlobalInteractionBlock getBody();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.GlobalProtocolDecl#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
  void setBody(GlobalInteractionBlock value);

} // GlobalProtocolDecl
