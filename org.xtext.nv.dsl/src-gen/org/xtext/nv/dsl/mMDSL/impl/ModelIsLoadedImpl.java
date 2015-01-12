/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.ModelCreate;
import org.xtext.nv.dsl.mMDSL.ModelIsLoaded;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Is Loaded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelIsLoadedImpl#getModelname <em>Modelname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelIsLoadedImpl extends MinimalEObjectImpl.Container implements ModelIsLoaded
{
  /**
   * The cached value of the '{@link #getModelname() <em>Modelname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelname()
   * @generated
   * @ordered
   */
  protected ModelCreate modelname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelIsLoadedImpl()
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
    return MMDSLPackage.eINSTANCE.getModelIsLoaded();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCreate getModelname()
  {
    if (modelname != null && modelname.eIsProxy())
    {
      InternalEObject oldModelname = (InternalEObject)modelname;
      modelname = (ModelCreate)eResolveProxy(oldModelname);
      if (modelname != oldModelname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.MODEL_IS_LOADED__MODELNAME, oldModelname, modelname));
      }
    }
    return modelname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCreate basicGetModelname()
  {
    return modelname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelname(ModelCreate newModelname)
  {
    ModelCreate oldModelname = modelname;
    modelname = newModelname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_IS_LOADED__MODELNAME, oldModelname, modelname));
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
      case MMDSLPackage.MODEL_IS_LOADED__MODELNAME:
        if (resolve) return getModelname();
        return basicGetModelname();
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
      case MMDSLPackage.MODEL_IS_LOADED__MODELNAME:
        setModelname((ModelCreate)newValue);
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
      case MMDSLPackage.MODEL_IS_LOADED__MODELNAME:
        setModelname((ModelCreate)null);
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
      case MMDSLPackage.MODEL_IS_LOADED__MODELNAME:
        return modelname != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelIsLoadedImpl
