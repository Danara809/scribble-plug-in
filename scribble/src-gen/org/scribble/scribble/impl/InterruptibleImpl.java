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

import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.Interruptible;
import org.scribble.scribble.MessageSignature;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.InterruptibleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.InterruptibleImpl#getRoleNames <em>Role Names</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.InterruptibleImpl#getSignatures <em>Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleImpl extends GlobalInteractionImpl implements Interruptible
{
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
	 * The cached value of the '{@link #getRoleNames() <em>Role Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRoleNames()
	 * @generated
	 * @ordered
	 */
  protected EList<String> roleNames;

  /**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
  protected EList<MessageSignature> signatures;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InterruptibleImpl()
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
		return ScribblePackage.Literals.INTERRUPTIBLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribblePackage.INTERRUPTIBLE__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.INTERRUPTIBLE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.INTERRUPTIBLE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.INTERRUPTIBLE__BODY, newBody, newBody));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getRoleNames()
  {
		if (roleNames == null) {
			roleNames = new EDataTypeEList<String>(String.class, this, ScribblePackage.INTERRUPTIBLE__ROLE_NAMES);
		}
		return roleNames;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MessageSignature> getSignatures()
  {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<MessageSignature>(MessageSignature.class, this, ScribblePackage.INTERRUPTIBLE__SIGNATURES);
		}
		return signatures;
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
			case ScribblePackage.INTERRUPTIBLE__BODY:
				return basicSetBody(null, msgs);
			case ScribblePackage.INTERRUPTIBLE__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
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
			case ScribblePackage.INTERRUPTIBLE__BODY:
				return getBody();
			case ScribblePackage.INTERRUPTIBLE__ROLE_NAMES:
				return getRoleNames();
			case ScribblePackage.INTERRUPTIBLE__SIGNATURES:
				return getSignatures();
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
			case ScribblePackage.INTERRUPTIBLE__BODY:
				setBody((GlobalInteractionBlock)newValue);
				return;
			case ScribblePackage.INTERRUPTIBLE__ROLE_NAMES:
				getRoleNames().clear();
				getRoleNames().addAll((Collection<? extends String>)newValue);
				return;
			case ScribblePackage.INTERRUPTIBLE__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends MessageSignature>)newValue);
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
			case ScribblePackage.INTERRUPTIBLE__BODY:
				setBody((GlobalInteractionBlock)null);
				return;
			case ScribblePackage.INTERRUPTIBLE__ROLE_NAMES:
				getRoleNames().clear();
				return;
			case ScribblePackage.INTERRUPTIBLE__SIGNATURES:
				getSignatures().clear();
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
			case ScribblePackage.INTERRUPTIBLE__BODY:
				return body != null;
			case ScribblePackage.INTERRUPTIBLE__ROLE_NAMES:
				return roleNames != null && !roleNames.isEmpty();
			case ScribblePackage.INTERRUPTIBLE__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
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
		result.append(" (roleNames: ");
		result.append(roleNames);
		result.append(')');
		return result.toString();
	}

} //InterruptibleImpl
