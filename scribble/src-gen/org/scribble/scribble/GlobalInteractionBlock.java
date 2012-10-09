/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Interaction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.GlobalInteractionBlock#getInteractionsequence <em>Interactionsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getGlobalInteractionBlock()
 * @model
 * @generated
 */
public interface GlobalInteractionBlock extends EObject
{
  /**
	 * Returns the value of the '<em><b>Interactionsequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.GlobalInteraction}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactionsequence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactionsequence</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getGlobalInteractionBlock_Interactionsequence()
	 * @model containment="true"
	 * @generated
	 */
  EList<GlobalInteraction> getInteractionsequence();

} // GlobalInteractionBlock
