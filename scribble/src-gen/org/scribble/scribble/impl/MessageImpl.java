/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.scribble.scribble.Message;
import org.scribble.scribble.MessageSignature;
import org.scribble.scribble.ScribblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.MessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.MessageImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends GlobalInteractionImpl implements Message
{
  /**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
  protected MessageSignature signature;

  /**
	 * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
  protected static final String SENDER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
  protected String sender = SENDER_EDEFAULT;

  /**
	 * The default value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
  protected static final String RECEIVER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
  protected String receiver = RECEIVER_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MessageImpl()
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
		return ScribblePackage.Literals.MESSAGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MessageSignature getSignature()
  {
		return signature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSignature(MessageSignature newSignature, NotificationChain msgs)
  {
		MessageSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribblePackage.MESSAGE__SIGNATURE, oldSignature, newSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSignature(MessageSignature newSignature)
  {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.MESSAGE__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.MESSAGE__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.MESSAGE__SIGNATURE, newSignature, newSignature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSender()
  {
		return sender;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSender(String newSender)
  {
		String oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.MESSAGE__SENDER, oldSender, sender));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getReceiver()
  {
		return receiver;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReceiver(String newReceiver)
  {
		String oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.MESSAGE__RECEIVER, oldReceiver, receiver));
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
			case ScribblePackage.MESSAGE__SIGNATURE:
				return basicSetSignature(null, msgs);
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
			case ScribblePackage.MESSAGE__SIGNATURE:
				return getSignature();
			case ScribblePackage.MESSAGE__SENDER:
				return getSender();
			case ScribblePackage.MESSAGE__RECEIVER:
				return getReceiver();
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
			case ScribblePackage.MESSAGE__SIGNATURE:
				setSignature((MessageSignature)newValue);
				return;
			case ScribblePackage.MESSAGE__SENDER:
				setSender((String)newValue);
				return;
			case ScribblePackage.MESSAGE__RECEIVER:
				setReceiver((String)newValue);
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
			case ScribblePackage.MESSAGE__SIGNATURE:
				setSignature((MessageSignature)null);
				return;
			case ScribblePackage.MESSAGE__SENDER:
				setSender(SENDER_EDEFAULT);
				return;
			case ScribblePackage.MESSAGE__RECEIVER:
				setReceiver(RECEIVER_EDEFAULT);
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
			case ScribblePackage.MESSAGE__SIGNATURE:
				return signature != null;
			case ScribblePackage.MESSAGE__SENDER:
				return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
			case ScribblePackage.MESSAGE__RECEIVER:
				return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
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
		result.append(" (sender: ");
		result.append(sender);
		result.append(", receiver: ");
		result.append(receiver);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
