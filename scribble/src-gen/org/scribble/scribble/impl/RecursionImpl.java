/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.Recursion;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recursion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.RecursionImpl#getLoopName <em>Loop Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.RecursionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecursionImpl extends GlobalInteractionImpl implements Recursion
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
  protected RecursionImpl()
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
		return ScribblePackage.Literals.RECURSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.RECURSION__LOOP_NAME, oldLoopName, loopName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribblePackage.RECURSION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.RECURSION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.RECURSION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.RECURSION__BODY, newBody, newBody));
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
			case ScribblePackage.RECURSION__BODY:
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
			case ScribblePackage.RECURSION__LOOP_NAME:
				return getLoopName();
			case ScribblePackage.RECURSION__BODY:
				return getBody();
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
			case ScribblePackage.RECURSION__LOOP_NAME:
				setLoopName((String)newValue);
				return;
			case ScribblePackage.RECURSION__BODY:
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
			case ScribblePackage.RECURSION__LOOP_NAME:
				setLoopName(LOOP_NAME_EDEFAULT);
				return;
			case ScribblePackage.RECURSION__BODY:
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
			case ScribblePackage.RECURSION__LOOP_NAME:
				return LOOP_NAME_EDEFAULT == null ? loopName != null : !LOOP_NAME_EDEFAULT.equals(loopName);
			case ScribblePackage.RECURSION__BODY:
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
		result.append(" (loopName: ");
		result.append(loopName);
		result.append(')');
		return result.toString();
	}

} //RecursionImpl
