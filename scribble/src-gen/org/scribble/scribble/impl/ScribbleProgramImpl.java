/**
 */
package org.scribble.scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scribble.scribble.GlobalProtocolDecl;
import org.scribble.scribble.IncludeDecl;
import org.scribble.scribble.InstGlobalProtocolDecl;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.scribble.TypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.ScribbleProgramImpl#getIncludeDecl <em>Include Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.ScribbleProgramImpl#getTypeDecl <em>Type Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.ScribbleProgramImpl#getGlobalProtocolDecl <em>Global Protocol Decl</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.ScribbleProgramImpl#getInstGlobalProtocolDecl <em>Inst Global Protocol Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScribbleProgramImpl extends MinimalEObjectImpl.Container implements ScribbleProgram
{
  /**
	 * The cached value of the '{@link #getIncludeDecl() <em>Include Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIncludeDecl()
	 * @generated
	 * @ordered
	 */
  protected EList<IncludeDecl> includeDecl;

  /**
	 * The cached value of the '{@link #getTypeDecl() <em>Type Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeDecl()
	 * @generated
	 * @ordered
	 */
  protected EList<TypeDecl> typeDecl;

  /**
	 * The cached value of the '{@link #getGlobalProtocolDecl() <em>Global Protocol Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGlobalProtocolDecl()
	 * @generated
	 * @ordered
	 */
  protected EList<GlobalProtocolDecl> globalProtocolDecl;

  /**
	 * The cached value of the '{@link #getInstGlobalProtocolDecl() <em>Inst Global Protocol Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstGlobalProtocolDecl()
	 * @generated
	 * @ordered
	 */
  protected EList<InstGlobalProtocolDecl> instGlobalProtocolDecl;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ScribbleProgramImpl()
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
		return ScribblePackage.Literals.SCRIBBLE_PROGRAM;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<IncludeDecl> getIncludeDecl()
  {
		if (includeDecl == null) {
			includeDecl = new EObjectContainmentEList<IncludeDecl>(IncludeDecl.class, this, ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL);
		}
		return includeDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TypeDecl> getTypeDecl()
  {
		if (typeDecl == null) {
			typeDecl = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL);
		}
		return typeDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<GlobalProtocolDecl> getGlobalProtocolDecl()
  {
		if (globalProtocolDecl == null) {
			globalProtocolDecl = new EObjectContainmentEList<GlobalProtocolDecl>(GlobalProtocolDecl.class, this, ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL);
		}
		return globalProtocolDecl;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<InstGlobalProtocolDecl> getInstGlobalProtocolDecl()
  {
		if (instGlobalProtocolDecl == null) {
			instGlobalProtocolDecl = new EObjectContainmentEList<InstGlobalProtocolDecl>(InstGlobalProtocolDecl.class, this, ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL);
		}
		return instGlobalProtocolDecl;
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
			case ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL:
				return ((InternalEList<?>)getIncludeDecl()).basicRemove(otherEnd, msgs);
			case ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL:
				return ((InternalEList<?>)getTypeDecl()).basicRemove(otherEnd, msgs);
			case ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL:
				return ((InternalEList<?>)getGlobalProtocolDecl()).basicRemove(otherEnd, msgs);
			case ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL:
				return ((InternalEList<?>)getInstGlobalProtocolDecl()).basicRemove(otherEnd, msgs);
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
			case ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL:
				return getIncludeDecl();
			case ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL:
				return getTypeDecl();
			case ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL:
				return getGlobalProtocolDecl();
			case ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL:
				return getInstGlobalProtocolDecl();
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
			case ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL:
				getIncludeDecl().clear();
				getIncludeDecl().addAll((Collection<? extends IncludeDecl>)newValue);
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL:
				getTypeDecl().clear();
				getTypeDecl().addAll((Collection<? extends TypeDecl>)newValue);
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL:
				getGlobalProtocolDecl().clear();
				getGlobalProtocolDecl().addAll((Collection<? extends GlobalProtocolDecl>)newValue);
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL:
				getInstGlobalProtocolDecl().clear();
				getInstGlobalProtocolDecl().addAll((Collection<? extends InstGlobalProtocolDecl>)newValue);
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
			case ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL:
				getIncludeDecl().clear();
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL:
				getTypeDecl().clear();
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL:
				getGlobalProtocolDecl().clear();
				return;
			case ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL:
				getInstGlobalProtocolDecl().clear();
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
			case ScribblePackage.SCRIBBLE_PROGRAM__INCLUDE_DECL:
				return includeDecl != null && !includeDecl.isEmpty();
			case ScribblePackage.SCRIBBLE_PROGRAM__TYPE_DECL:
				return typeDecl != null && !typeDecl.isEmpty();
			case ScribblePackage.SCRIBBLE_PROGRAM__GLOBAL_PROTOCOL_DECL:
				return globalProtocolDecl != null && !globalProtocolDecl.isEmpty();
			case ScribblePackage.SCRIBBLE_PROGRAM__INST_GLOBAL_PROTOCOL_DECL:
				return instGlobalProtocolDecl != null && !instGlobalProtocolDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScribbleProgramImpl
