/**
 */
package org.scribble.scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.TypeDecl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.scribble.scribble.TypeDecl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.scribble.scribble.TypeDecl#getFile <em>File</em>}</li>
 *   <li>{@link org.scribble.scribble.TypeDecl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends EObject
{
  /**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.scribble.scribble.ScribblePackage#getTypeDecl_TypeName()
	 * @model
	 * @generated
	 */
  String getTypeName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.TypeDecl#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
  void setTypeName(String value);

  /**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.scribble.scribble.ScribblePackage#getTypeDecl_Schema()
	 * @model
	 * @generated
	 */
  String getSchema();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.TypeDecl#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
  void setSchema(String value);

  /**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.scribble.scribble.ScribblePackage#getTypeDecl_File()
	 * @model
	 * @generated
	 */
  String getFile();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.TypeDecl#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
  void setFile(String value);

  /**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.scribble.scribble.ScribblePackage#getTypeDecl_Alias()
	 * @model
	 * @generated
	 */
  String getAlias();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.TypeDecl#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
  void setAlias(String value);

} // TypeDecl
