/**
 */
package org.scribble.scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scribble.scribble.GlobalInteraction;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Interaction Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.GlobalInteractionBlockImpl#getInteractionsequence <em>Interactionsequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalInteractionBlockImpl extends MinimalEObjectImpl.Container implements GlobalInteractionBlock
{
  /**
	 * The cached value of the '{@link #getInteractionsequence() <em>Interactionsequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInteractionsequence()
	 * @generated
	 * @ordered
	 */
  protected EList<GlobalInteraction> interactionsequence;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GlobalInteractionBlockImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ScribblePackage.Literals.GLOBAL_INTERACTION_BLOCK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<GlobalInteraction> getInteractionsequence()
  {
		if (interactionsequence == null) {
			interactionsequence = new EObjectContainmentEList<GlobalInteraction>(GlobalInteraction.class, this, ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE);
		}
		return interactionsequence;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE:
				return ((InternalEList<?>)getInteractionsequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE:
				return getInteractionsequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE:
				getInteractionsequence().clear();
				getInteractionsequence().addAll((Collection<? extends GlobalInteraction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE:
				getInteractionsequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ScribblePackage.GLOBAL_INTERACTION_BLOCK__INTERACTIONSEQUENCE:
				return interactionsequence != null && !interactionsequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalInteractionBlockImpl
