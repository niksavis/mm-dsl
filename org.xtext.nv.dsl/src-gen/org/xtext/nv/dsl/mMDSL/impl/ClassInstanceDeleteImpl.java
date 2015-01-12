/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceDeleteImpl#getNameofclassinstance <em>Nameofclassinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassInstanceDeleteImpl extends MinimalEObjectImpl.Container implements ClassInstanceDelete
{
  /**
   * The cached value of the '{@link #getNameofclassinstance() <em>Nameofclassinstance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofclassinstance()
   * @generated
   * @ordered
   */
  protected ClassInstanceCreate nameofclassinstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassInstanceDeleteImpl()
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
    return MMDSLPackage.eINSTANCE.getClassInstanceDelete();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate getNameofclassinstance()
  {
    if (nameofclassinstance != null && nameofclassinstance.eIsProxy())
    {
      InternalEObject oldNameofclassinstance = (InternalEObject)nameofclassinstance;
      nameofclassinstance = (ClassInstanceCreate)eResolveProxy(oldNameofclassinstance);
      if (nameofclassinstance != oldNameofclassinstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE, oldNameofclassinstance, nameofclassinstance));
      }
    }
    return nameofclassinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate basicGetNameofclassinstance()
  {
    return nameofclassinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameofclassinstance(ClassInstanceCreate newNameofclassinstance)
  {
    ClassInstanceCreate oldNameofclassinstance = nameofclassinstance;
    nameofclassinstance = newNameofclassinstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE, oldNameofclassinstance, nameofclassinstance));
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
      case MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE:
        if (resolve) return getNameofclassinstance();
        return basicGetNameofclassinstance();
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
      case MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE:
        setNameofclassinstance((ClassInstanceCreate)newValue);
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
      case MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE:
        setNameofclassinstance((ClassInstanceCreate)null);
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
      case MMDSLPackage.CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE:
        return nameofclassinstance != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassInstanceDeleteImpl
