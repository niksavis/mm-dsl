/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.RefName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RefNameImpl#getModeltypename <em>Modeltypename</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RefNameImpl#getClassname <em>Classname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefNameImpl extends MinimalEObjectImpl.Container implements RefName
{
  /**
   * The cached value of the '{@link #getModeltypename() <em>Modeltypename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeltypename()
   * @generated
   * @ordered
   */
  protected ModelType modeltypename;

  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class classname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefNameImpl()
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
    return MMDSLPackage.eINSTANCE.getRefName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType getModeltypename()
  {
    if (modeltypename != null && modeltypename.eIsProxy())
    {
      InternalEObject oldModeltypename = (InternalEObject)modeltypename;
      modeltypename = (ModelType)eResolveProxy(oldModeltypename);
      if (modeltypename != oldModeltypename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.REF_NAME__MODELTYPENAME, oldModeltypename, modeltypename));
      }
    }
    return modeltypename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType basicGetModeltypename()
  {
    return modeltypename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeltypename(ModelType newModeltypename)
  {
    ModelType oldModeltypename = modeltypename;
    modeltypename = newModeltypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.REF_NAME__MODELTYPENAME, oldModeltypename, modeltypename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getClassname()
  {
    if (classname != null && classname.eIsProxy())
    {
      InternalEObject oldClassname = (InternalEObject)classname;
      classname = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldClassname);
      if (classname != oldClassname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.REF_NAME__CLASSNAME, oldClassname, classname));
      }
    }
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(org.xtext.nv.dsl.mMDSL.Class newClassname)
  {
    org.xtext.nv.dsl.mMDSL.Class oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.REF_NAME__CLASSNAME, oldClassname, classname));
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
      case MMDSLPackage.REF_NAME__MODELTYPENAME:
        if (resolve) return getModeltypename();
        return basicGetModeltypename();
      case MMDSLPackage.REF_NAME__CLASSNAME:
        if (resolve) return getClassname();
        return basicGetClassname();
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
      case MMDSLPackage.REF_NAME__MODELTYPENAME:
        setModeltypename((ModelType)newValue);
        return;
      case MMDSLPackage.REF_NAME__CLASSNAME:
        setClassname((org.xtext.nv.dsl.mMDSL.Class)newValue);
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
      case MMDSLPackage.REF_NAME__MODELTYPENAME:
        setModeltypename((ModelType)null);
        return;
      case MMDSLPackage.REF_NAME__CLASSNAME:
        setClassname((org.xtext.nv.dsl.mMDSL.Class)null);
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
      case MMDSLPackage.REF_NAME__MODELTYPENAME:
        return modeltypename != null;
      case MMDSLPackage.REF_NAME__CLASSNAME:
        return classname != null;
    }
    return super.eIsSet(featureID);
  }

} //RefNameImpl
