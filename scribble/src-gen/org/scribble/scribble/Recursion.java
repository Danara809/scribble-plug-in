/**
 */
package org.scribble.scribble;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Recursion#getLoopName <em>Loop Name</em>}</li>
 *   <li>{@link org.scribble.scribble.Recursion#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getRecursion()
 * @model
 * @generated
 */
public interface Recursion extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Loop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Name</em>' attribute.
	 * @see #setLoopName(String)
	 * @see org.scribble.scribble.ScribblePackage#getRecursion_LoopName()
	 * @model
	 * @generated
	 */
  String getLoopName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Recursion#getLoopName <em>Loop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Name</em>' attribute.
	 * @see #getLoopName()
	 * @generated
	 */
  void setLoopName(String value);

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
	 * @see org.scribble.scribble.ScribblePackage#getRecursion_Body()
	 * @model containment="true"
	 * @generated
	 */
  GlobalInteractionBlock getBody();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Recursion#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
  void setBody(GlobalInteractionBlock value);

} // Recursion
