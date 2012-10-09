/**
 */
package org.scribble.scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.IncludeDecl#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getIncludeDecl()
 * @model
 * @generated
 */
public interface IncludeDecl extends EObject
{
  /**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see org.scribble.scribble.ScribblePackage#getIncludeDecl_ImportURI()
	 * @model
	 * @generated
	 */
  String getImportURI();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.IncludeDecl#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
  void setImportURI(String value);

} // IncludeDecl
