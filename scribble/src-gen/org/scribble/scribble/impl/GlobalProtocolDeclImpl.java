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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Protocol Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.GlobalProtocolDeclImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalProtocolDeclImpl extends MinimalEObjectImpl.Container implements GlobalProtocolDecl
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
  protected EList<String> parameters;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
  protected GlobalInteractionBlock body;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GlobalProtocolDeclImpl()
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
		return ScribblePackage.Literals.GLOBAL_PROTOCOL_DECL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME, oldProtocolName, protocolName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getParameters()
  {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, ScribblePackage.GLOBAL_PROTOCOL_DECL__PARAMETERS);
		}
		return parameters;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getRoles()
  {
		if (roles == null) {
			roles = new EDataTypeEList<String>(String.class, this, ScribblePackage.GLOBAL_PROTOCOL_DECL__ROLES);
		}
		return roles;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GlobalInteractionBlock getBody()
  {
		return body;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBody(GlobalInteractionBlock newBody, NotificationChain msgs)
  {
		GlobalInteractionBlock oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBody(GlobalInteractionBlock newBody)
  {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY, newBody, newBody));
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
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY:
				return basicSetBody(null, msgs);
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
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				return getProtocolName();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PARAMETERS:
				return getParameters();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__ROLES:
				return getRoles();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY:
				return getBody();
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
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				setProtocolName((String)newValue);
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY:
				setBody((GlobalInteractionBlock)newValue);
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
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				setProtocolName(PROTOCOL_NAME_EDEFAULT);
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PARAMETERS:
				getParameters().clear();
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__ROLES:
				getRoles().clear();
				return;
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY:
				setBody((GlobalInteractionBlock)null);
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
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PROTOCOL_NAME:
				return PROTOCOL_NAME_EDEFAULT == null ? protocolName != null : !PROTOCOL_NAME_EDEFAULT.equals(protocolName);
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__ROLES:
				return roles != null && !roles.isEmpty();
			case ScribblePackage.GLOBAL_PROTOCOL_DECL__BODY:
				return body != null;
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
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", roles: ");
		result.append(roles);
		result.append(')');
		return result.toString();
	}

} //GlobalProtocolDeclImpl
