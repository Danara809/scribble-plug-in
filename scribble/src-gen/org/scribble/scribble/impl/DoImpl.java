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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scribble.scribble.Do;
import org.scribble.scribble.MessageSignature;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.DoImpl#getTargetProtocolName <em>Target Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.DoImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.DoImpl#getCurrentRoles <em>Current Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.DoImpl#getTargetRoles <em>Target Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoImpl extends GlobalInteractionImpl implements Do
{
  /**
	 * The default value of the '{@link #getTargetProtocolName() <em>Target Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetProtocolName()
	 * @generated
	 * @ordered
	 */
  protected static final String TARGET_PROTOCOL_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTargetProtocolName() <em>Target Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetProtocolName()
	 * @generated
	 * @ordered
	 */
  protected String targetProtocolName = TARGET_PROTOCOL_NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
  protected EList<MessageSignature> arguments;

  /**
	 * The cached value of the '{@link #getCurrentRoles() <em>Current Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentRoles()
	 * @generated
	 * @ordered
	 */
  protected EList<String> currentRoles;

  /**
	 * The cached value of the '{@link #getTargetRoles() <em>Target Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetRoles()
	 * @generated
	 * @ordered
	 */
  protected EList<String> targetRoles;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DoImpl()
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
		return ScribblePackage.Literals.DO;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTargetProtocolName()
  {
		return targetProtocolName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTargetProtocolName(String newTargetProtocolName)
  {
		String oldTargetProtocolName = targetProtocolName;
		targetProtocolName = newTargetProtocolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.DO__TARGET_PROTOCOL_NAME, oldTargetProtocolName, targetProtocolName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MessageSignature> getArguments()
  {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<MessageSignature>(MessageSignature.class, this, ScribblePackage.DO__ARGUMENTS);
		}
		return arguments;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getCurrentRoles()
  {
		if (currentRoles == null) {
			currentRoles = new EDataTypeEList<String>(String.class, this, ScribblePackage.DO__CURRENT_ROLES);
		}
		return currentRoles;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getTargetRoles()
  {
		if (targetRoles == null) {
			targetRoles = new EDataTypeEList<String>(String.class, this, ScribblePackage.DO__TARGET_ROLES);
		}
		return targetRoles;
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
			case ScribblePackage.DO__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case ScribblePackage.DO__TARGET_PROTOCOL_NAME:
				return getTargetProtocolName();
			case ScribblePackage.DO__ARGUMENTS:
				return getArguments();
			case ScribblePackage.DO__CURRENT_ROLES:
				return getCurrentRoles();
			case ScribblePackage.DO__TARGET_ROLES:
				return getTargetRoles();
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
			case ScribblePackage.DO__TARGET_PROTOCOL_NAME:
				setTargetProtocolName((String)newValue);
				return;
			case ScribblePackage.DO__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends MessageSignature>)newValue);
				return;
			case ScribblePackage.DO__CURRENT_ROLES:
				getCurrentRoles().clear();
				getCurrentRoles().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.DO__TARGET_ROLES:
				getTargetRoles().clear();
				getTargetRoles().addAll((Collection<? extends String>)newValue);
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
			case ScribblePackage.DO__TARGET_PROTOCOL_NAME:
				setTargetProtocolName(TARGET_PROTOCOL_NAME_EDEFAULT);
				return;
			case ScribblePackage.DO__ARGUMENTS:
				getArguments().clear();
				return;
			case ScribblePackage.DO__CURRENT_ROLES:
				getCurrentRoles().clear();
				return;
			case ScribblePackage.DO__TARGET_ROLES:
				getTargetRoles().clear();
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
			case ScribblePackage.DO__TARGET_PROTOCOL_NAME:
				return TARGET_PROTOCOL_NAME_EDEFAULT == null ? targetProtocolName != null : !TARGET_PROTOCOL_NAME_EDEFAULT.equals(targetProtocolName);
			case ScribblePackage.DO__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case ScribblePackage.DO__CURRENT_ROLES:
				return currentRoles != null && !currentRoles.isEmpty();
			case ScribblePackage.DO__TARGET_ROLES:
				return targetRoles != null && !targetRoles.isEmpty();
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
		result.append(" (targetProtocolName: ");
		result.append(targetProtocolName);
		result.append(", currentRoles: ");
		result.append(currentRoles);
		result.append(", targetRoles: ");
		result.append(targetRoles);
		result.append(')');
		return result.toString();
	}

} //DoImpl
