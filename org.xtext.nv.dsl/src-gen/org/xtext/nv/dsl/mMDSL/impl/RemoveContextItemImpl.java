/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.InsertContextItem;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RemoveContextItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Context Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RemoveContextItemImpl#getContextitem <em>Contextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveContextItemImpl extends MinimalEObjectImpl.Container implements RemoveContextItem
{
  /**
   * The cached value of the '{@link #getContextitem() <em>Contextitem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextitem()
   * @generated
   * @ordered
   */
  protected InsertContextItem contextitem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveContextItemImpl()
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
    return MMDSLPackage.eINSTANCE.getRemoveContextItem();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertContextItem getContextitem()
  {
    if (contextitem != null && contextitem.eIsProxy())
    {
      InternalEObject oldContextitem = (InternalEObject)contextitem;
      contextitem = (InsertContextItem)eResolveProxy(oldContextitem);
      if (contextitem != oldContextitem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM, oldContextitem, contextitem));
      }
    }
    return contextitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertContextItem basicGetContextitem()
  {
    return contextitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextitem(InsertContextItem newContextitem)
  {
    InsertContextItem oldContextitem = contextitem;
    contextitem = newContextitem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM, oldContextitem, contextitem));
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
      case MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM:
        if (resolve) return getContextitem();
        return basicGetContextitem();
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
      case MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM:
        setContextitem((InsertContextItem)newValue);
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
      case MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM:
        setContextitem((InsertContextItem)null);
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
      case MMDSLPackage.REMOVE_CONTEXT_ITEM__CONTEXTITEM:
        return contextitem != null;
    }
    return super.eIsSet(featureID);
  }

} //RemoveContextItemImpl
