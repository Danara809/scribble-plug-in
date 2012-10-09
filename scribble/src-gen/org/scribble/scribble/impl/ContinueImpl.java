/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.scribble.scribble.Continue;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.ContinueImpl#getLoopName <em>Loop Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinueImpl extends GlobalInteractionImpl implements Continue
{
  /**
	 * The default value of the '{@link #getLoopName() <em>Loop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLoopName()
	 * @generated
	 * @ordered
	 */
  protected static final String LOOP_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLoopName() <em>Loop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLoopName()
	 * @generated
	 * @ordered
	 */
  protected String loopName = LOOP_NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContinueImpl()
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
		return ScribblePackage.Literals.CONTINUE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLoopName()
  {
		return loopName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLoopName(String newLoopName)
  {
		String oldLoopName = loopName;
		loopName = newLoopName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.CONTINUE__LOOP_NAME, oldLoopName, loopName));
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
			case ScribblePackage.CONTINUE__LOOP_NAME:
				return getLoopName();
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
			case ScribblePackage.CONTINUE__LOOP_NAME:
				setLoopName((String)newValue);
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
			case ScribblePackage.CONTINUE__LOOP_NAME:
				setLoopName(LOOP_NAME_EDEFAULT);
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
			case ScribblePackage.CONTINUE__LOOP_NAME:
				return LOOP_NAME_EDEFAULT == null ? loopName != null : !LOOP_NAME_EDEFAULT.equals(loopName);
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
		result.append(" (loopName: ");
		result.append(loopName);
		result.append(')');
		return result.toString();
	}

} //ContinueImpl
