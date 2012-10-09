/**
 */
package org.scribble.scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.Spawn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spawn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.SpawnImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.SpawnImpl#getTargetProtocolName <em>Target Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.SpawnImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.SpawnImpl#getCurrentRoles <em>Current Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.SpawnImpl#getTargetRoles <em>Target Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpawnImpl extends GlobalInteractionImpl implements Spawn
{
  /**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
  protected static final String ROLE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
  protected String roleName = ROLE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
  protected EList<String> parameters;

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
  protected SpawnImpl()
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
		return ScribblePackage.Literals.SPAWN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRoleName()
  {
		return roleName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRoleName(String newRoleName)
  {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.SPAWN__ROLE_NAME, oldRoleName, roleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.SPAWN__TARGET_PROTOCOL_NAME, oldTargetProtocolName, targetProtocolName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getParameters()
  {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, ScribblePackage.SPAWN__PARAMETERS);
		}
		return parameters;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getCurrentRoles()
  {
		if (currentRoles == null) {
			currentRoles = new EDataTypeEList<String>(String.class, this, ScribblePackage.SPAWN__CURRENT_ROLES);
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
			targetRoles = new EDataTypeEList<String>(String.class, this, ScribblePackage.SPAWN__TARGET_ROLES);
		}
		return targetRoles;
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
			case ScribblePackage.SPAWN__ROLE_NAME:
				return getRoleName();
			case ScribblePackage.SPAWN__TARGET_PROTOCOL_NAME:
				return getTargetProtocolName();
			case ScribblePackage.SPAWN__PARAMETERS:
				return getParameters();
			case ScribblePackage.SPAWN__CURRENT_ROLES:
				return getCurrentRoles();
			case ScribblePackage.SPAWN__TARGET_ROLES:
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
			case ScribblePackage.SPAWN__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case ScribblePackage.SPAWN__TARGET_PROTOCOL_NAME:
				setTargetProtocolName((String)newValue);
				return;
			case ScribblePackage.SPAWN__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.SPAWN__CURRENT_ROLES:
				getCurrentRoles().clear();
				getCurrentRoles().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.SPAWN__TARGET_ROLES:
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
			case ScribblePackage.SPAWN__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case ScribblePackage.SPAWN__TARGET_PROTOCOL_NAME:
				setTargetProtocolName(TARGET_PROTOCOL_NAME_EDEFAULT);
				return;
			case ScribblePackage.SPAWN__PARAMETERS:
				getParameters().clear();
				return;
			case ScribblePackage.SPAWN__CURRENT_ROLES:
				getCurrentRoles().clear();
				return;
			case ScribblePackage.SPAWN__TARGET_ROLES:
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
			case ScribblePackage.SPAWN__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case ScribblePackage.SPAWN__TARGET_PROTOCOL_NAME:
				return TARGET_PROTOCOL_NAME_EDEFAULT == null ? targetProtocolName != null : !TARGET_PROTOCOL_NAME_EDEFAULT.equals(targetProtocolName);
			case ScribblePackage.SPAWN__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ScribblePackage.SPAWN__CURRENT_ROLES:
				return currentRoles != null && !currentRoles.isEmpty();
			case ScribblePackage.SPAWN__TARGET_ROLES:
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
		result.append(" (roleName: ");
		result.append(roleName);
		result.append(", targetProtocolName: ");
		result.append(targetProtocolName);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", currentRoles: ");
		result.append(currentRoles);
		result.append(", targetRoles: ");
		result.append(targetRoles);
		result.append(')');
		return result.toString();
	}

} //SpawnImpl
