/**
 */
package org.scribble.scribble;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scribble.scribble.Parallel#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scribble.scribble.ScribblePackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends GlobalInteraction
{
  /**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.scribble.scribble.GlobalInteractionBlock}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.scribble.scribble.ScribblePackage#getParallel_Branches()
	 * @model containment="true"
	 * @generated
	 */
  EList<GlobalInteractionBlock> getBranches();

} // Parallel
