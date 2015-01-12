/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceCreateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceCreateImpl#getNameofclass <em>Nameofclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassInstanceCreateImpl extends MinimalEObjectImpl.Container implements ClassInstanceCreate
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameofclass() <em>Nameofclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofclass()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class nameofclass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassInstanceCreateImpl()
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
    return MMDSLPackage.eINSTANCE.getClassInstanceCreate();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE_CREATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getNameofclass()
  {
    if (nameofclass != null && nameofclass.eIsProxy())
    {
      InternalEObject oldNameofclass = (InternalEObject)nameofclass;
      nameofclass = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldNameofclass);
      if (nameofclass != oldNameofclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS, oldNameofclass, nameofclass));
      }
    }
    return nameofclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetNameofclass()
  {
    return nameofclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameofclass(org.xtext.nv.dsl.mMDSL.Class newNameofclass)
  {
    org.xtext.nv.dsl.mMDSL.Class oldNameofclass = nameofclass;
    nameofclass = newNameofclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS, oldNameofclass, nameofclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAME:
        return getName();
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS:
        if (resolve) return getNameofclass();
        return basicGetNameofclass();
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
    switch (featureID)
    {
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS:
        setNameofclass((org.xtext.nv.dsl.mMDSL.Class)newValue);
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
    switch (featureID)
    {
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS:
        setNameofclass((org.xtext.nv.dsl.mMDSL.Class)null);
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
    switch (featureID)
    {
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.CLASS_INSTANCE_CREATE__NAMEOFCLASS:
        return nameofclass != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ClassInstanceCreateImpl
