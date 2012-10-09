/**
 */
package org.scribble.scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scribble.scribble.Choice;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.ChoiceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.ChoiceImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends GlobalInteractionImpl implements Choice
{
  /**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
  protected static final String ROLE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
  protected String role = ROLE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
  protected EList<GlobalInteractionBlock> branches;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ChoiceImpl()
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
		return ScribblePackage.Literals.CHOICE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRole()
  {
		return role;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRole(String newRole)
  {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.CHOICE__ROLE, oldRole, role));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<GlobalInteractionBlock> getBranches()
  {
		if (branches == null) {
			branches = new EObjectContainmentEList<GlobalInteractionBlock>(GlobalInteractionBlock.class, this, ScribblePackage.CHOICE__BRANCHES);
		}
		return branches;
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
			case ScribblePackage.CHOICE__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
			case ScribblePackage.CHOICE__ROLE:
				return getRole();
			case ScribblePackage.CHOICE__BRANCHES:
				return getBranches();
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
			case ScribblePackage.CHOICE__ROLE:
				setRole((String)newValue);
				return;
			case ScribblePackage.CHOICE__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends GlobalInteractionBlock>)newValue);
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
			case ScribblePackage.CHOICE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ScribblePackage.CHOICE__BRANCHES:
				getBranches().clear();
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
			case ScribblePackage.CHOICE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case ScribblePackage.CHOICE__BRANCHES:
				return branches != null && !branches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
