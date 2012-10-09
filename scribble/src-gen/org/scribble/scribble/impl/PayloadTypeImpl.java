/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.scribble.scribble.PayloadType;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.PayloadTypeImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.PayloadTypeImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayloadTypeImpl extends MinimalEObjectImpl.Container implements PayloadType
{
  /**
	 * The default value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
  protected static final String PAYLOAD_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
  protected String payload = PAYLOAD_EDEFAULT;

  /**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
  protected static final String DATA_TYPE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
  protected String dataType = DATA_TYPE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PayloadTypeImpl()
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
		return ScribblePackage.Literals.PAYLOAD_TYPE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPayload()
  {
		return payload;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPayload(String newPayload)
  {
		String oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.PAYLOAD_TYPE__PAYLOAD, oldPayload, payload));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDataType()
  {
		return dataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataType(String newDataType)
  {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.PAYLOAD_TYPE__DATA_TYPE, oldDataType, dataType));
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
			case ScribblePackage.PAYLOAD_TYPE__PAYLOAD:
				return getPayload();
			case ScribblePackage.PAYLOAD_TYPE__DATA_TYPE:
				return getDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ScribblePackage.PAYLOAD_TYPE__PAYLOAD:
				setPayload((String)newValue);
				return;
			case ScribblePackage.PAYLOAD_TYPE__DATA_TYPE:
				setDataType((String)newValue);
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
			case ScribblePackage.PAYLOAD_TYPE__PAYLOAD:
				setPayload(PAYLOAD_EDEFAULT);
				return;
			case ScribblePackage.PAYLOAD_TYPE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
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
			case ScribblePackage.PAYLOAD_TYPE__PAYLOAD:
				return PAYLOAD_EDEFAULT == null ? payload != null : !PAYLOAD_EDEFAULT.equals(payload);
			case ScribblePackage.PAYLOAD_TYPE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
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
		result.append(" (payload: ");
		result.append(payload);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //PayloadTypeImpl
