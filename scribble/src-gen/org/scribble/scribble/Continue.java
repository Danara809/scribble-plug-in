/**
 */
package org.scribble.scribble;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Continue#getLoopName <em>Loop Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getContinue()
 * @model
 * @generated
 */
public interface Continue extends GlobalInteraction
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
	 * @see org.scribble.scribble.ScribblePackage#getContinue_LoopName()
	 * @model
	 * @generated
	 */
  String getLoopName();

  /**
	 * Sets the value of the '{@link org.scribble.scribble.Continue#getLoopName <em>Loop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Name</em>' attribute.
	 * @see #getLoopName()
	 * @generated
	 */
  void setLoopName(String value);

} // Continue
