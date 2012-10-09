/**
 */
package org.scribble.scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.scribble.scribble.InstGlobalProtocolDecl;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inst Global Protocol Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.InstGlobalProtocolDeclImpl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.InstGlobalProtocolDeclImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.InstGlobalProtocolDeclImpl#getInstantiatedProtocol <em>Instantiated Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstGlobalProtocolDeclImpl extends MinimalEObjectImpl.Container implements InstGlobalProtocolDecl
{
  /**
	 * The default value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
  protected static final String PROTOCOL_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
  protected String protocolName = PROTOCOL_NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
  protected EList<String> roles;

  /**
	 * The default value of the '{@link #getInstantiatedProtocol() <em>Instantiated Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstantiatedProtocol()
	 * @generated
	 * @ordered
	 */
  protected static final String INSTANTIATED_PROTOCOL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getInstantiatedProtocol() <em>Instantiated Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstantiatedProtocol()
	 * @generated
	 * @ordered
	 */
  protected String instantiatedProtocol = INSTANTIATED_PROTOCOL_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InstGlobalProtocolDeclImpl()
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
		return ScribblePackage.Literals.INST_GLOBAL_PROTOCOL_DECL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getProtocolName()
  {
		return protocolName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProtocolName(String newProtocolName)
  {
		String oldProtocolName = protocolName;
		protocolName = newProtocolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME, oldProtocolName, protocolName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getRoles()
  {
		if (roles == null) {
			roles = new EDataTypeEList<String>(String.class, this, ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__ROLES);
		}
		return roles;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getInstantiatedProtocol()
  {
		return instantiatedProtocol;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstantiatedProtocol(String newInstantiatedProtocol)
  {
		String oldInstantiatedProtocol = instantiatedProtocol;
		instantiatedProtocol = newInstantiatedProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL, oldInstantiatedProtocol, instantiatedProtocol));
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
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				return getProtocolName();
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__ROLES:
				return getRoles();
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL:
				return getInstantiatedProtocol();
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
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				setProtocolName((String)newValue);
				return;
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL:
				setInstantiatedProtocol((String)newValue);
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
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				setProtocolName(PROTOCOL_NAME_EDEFAULT);
				return;
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__ROLES:
				getRoles().clear();
				return;
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL:
				setInstantiatedProtocol(INSTANTIATED_PROTOCOL_EDEFAULT);
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
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				return PROTOCOL_NAME_EDEFAULT == null ? protocolName != null : !PROTOCOL_NAME_EDEFAULT.equals(protocolName);
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__ROLES:
				return roles != null && !roles.isEmpty();
			case ScribblePackage.INST_GLOBAL_PROTOCOL_DECL__INSTANTIATED_PROTOCOL:
				return INSTANTIATED_PROTOCOL_EDEFAULT == null ? instantiatedProtocol != null : !INSTANTIATED_PROTOCOL_EDEFAULT.equals(instantiatedProtocol);
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
		result.append(" (protocolName: ");
		result.append(protocolName);
		result.append(", roles: ");
		result.append(roles);
		result.append(", instantiatedProtocol: ");
		result.append(instantiatedProtocol);
		result.append(')');
		return result.toString();
	}

} //InstGlobalProtocolDeclImpl
