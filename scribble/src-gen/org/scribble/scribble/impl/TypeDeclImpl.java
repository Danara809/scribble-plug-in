/**
 */
package org.scribble.scribble.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.TypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scribble.scribble.impl.TypeDeclImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.TypeDeclImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.TypeDeclImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.scribble.scribble.impl.TypeDeclImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclImpl extends MinimalEObjectImpl.Container implements TypeDecl
{
  /**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
  protected String typeName = TYPE_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
  protected static final String SCHEMA_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
  protected String schema = SCHEMA_EDEFAULT;

  /**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
  protected static final String FILE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
  protected String file = FILE_EDEFAULT;

  /**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
  protected static final String ALIAS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
  protected String alias = ALIAS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypeDeclImpl()
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
		return ScribblePackage.Literals.TYPE_DECL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTypeName()
  {
		return typeName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeName(String newTypeName)
  {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TYPE_DECL__TYPE_NAME, oldTypeName, typeName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSchema()
  {
		return schema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSchema(String newSchema)
  {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TYPE_DECL__SCHEMA, oldSchema, schema));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFile()
  {
		return file;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFile(String newFile)
  {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TYPE_DECL__FILE, oldFile, file));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getAlias()
  {
		return alias;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAlias(String newAlias)
  {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TYPE_DECL__ALIAS, oldAlias, alias));
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
			case ScribblePackage.TYPE_DECL__TYPE_NAME:
				return getTypeName();
			case ScribblePackage.TYPE_DECL__SCHEMA:
				return getSchema();
			case ScribblePackage.TYPE_DECL__FILE:
				return getFile();
			case ScribblePackage.TYPE_DECL__ALIAS:
				return getAlias();
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
			case ScribblePackage.TYPE_DECL__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ScribblePackage.TYPE_DECL__SCHEMA:
				setSchema((String)newValue);
				return;
			case ScribblePackage.TYPE_DECL__FILE:
				setFile((String)newValue);
				return;
			case ScribblePackage.TYPE_DECL__ALIAS:
				setAlias((String)newValue);
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
			case ScribblePackage.TYPE_DECL__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ScribblePackage.TYPE_DECL__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case ScribblePackage.TYPE_DECL__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ScribblePackage.TYPE_DECL__ALIAS:
				setAlias(ALIAS_EDEFAULT);
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
			case ScribblePackage.TYPE_DECL__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ScribblePackage.TYPE_DECL__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case ScribblePackage.TYPE_DECL__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ScribblePackage.TYPE_DECL__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", schema: ");
		result.append(schema);
		result.append(", file: ");
		result.append(file);
		result.append(", alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //TypeDeclImpl
