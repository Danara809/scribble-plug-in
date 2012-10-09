/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.ScribbleProgram#getIncludeDecl <em>Include Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.ScribbleProgram#getTypeDecl <em>Type Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.ScribbleProgram#getGlobalProtocolDecl <em>Global Protocol Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.ScribbleProgram#getInstGlobalProtocolDecl <em>Inst Global Protocol Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getScribbleProgram()
 * @model
 * @generated
 */
public interface ScribbleProgram extends EObject
{
  /**
	 * Returns the value of the '<em><b>Include Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.IncludeDecl}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Decl</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getScribbleProgram_IncludeDecl()
	 * @model containment="true"
	 * @generated
	 */
  EList<IncludeDecl> getIncludeDecl();

  /**
	 * Returns the value of the '<em><b>Type Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.TypeDecl}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Decl</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getScribbleProgram_TypeDecl()
	 * @model containment="true"
	 * @generated
	 */
  EList<TypeDecl> getTypeDecl();

  /**
	 * Returns the value of the '<em><b>Global Protocol Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.GlobalProtocolDecl}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global Protocol Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Protocol Decl</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getScribbleProgram_GlobalProtocolDecl()
	 * @model containment="true"
	 * @generated
	 */
  EList<GlobalProtocolDecl> getGlobalProtocolDecl();

  /**
	 * Returns the value of the '<em><b>Inst Global Protocol Decl</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.InstGlobalProtocolDecl}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst Global Protocol Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Global Protocol Decl</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getScribbleProgram_InstGlobalProtocolDecl()
	 * @model containment="true"
	 * @generated
	 */
  EList<InstGlobalProtocolDecl> getInstGlobalProtocolDecl();

} // ScribbleProgram
