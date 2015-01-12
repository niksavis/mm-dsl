/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ContextItem;
import org.xtext.nv.dsl.mMDSL.ItemOperation;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.MenuItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ItemOperationImpl#getMenuitem <em>Menuitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ItemOperationImpl#getContextitem <em>Contextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemOperationImpl extends MinimalEObjectImpl.Container implements ItemOperation
{
  /**
   * The cached value of the '{@link #getMenuitem() <em>Menuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenuitem()
   * @generated
   * @ordered
   */
  protected MenuItem menuitem;

  /**
   * The cached value of the '{@link #getContextitem() <em>Contextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextitem()
   * @generated
   * @ordered
   */
  protected ContextItem contextitem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getItemOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuItem getMenuitem()
  {
    return menuitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMenuitem(MenuItem newMenuitem, NotificationChain msgs)
  {
    MenuItem oldMenuitem = menuitem;
    menuitem = newMenuitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ITEM_OPERATION__MENUITEM, oldMenuitem, newMenuitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenuitem(MenuItem newMenuitem)
  {
    if (newMenuitem != menuitem)
    {
      NotificationChain msgs = null;
      if (menuitem != null)
        msgs = ((InternalEObject)menuitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ITEM_OPERATION__MENUITEM, null, msgs);
      if (newMenuitem != null)
        msgs = ((InternalEObject)newMenuitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ITEM_OPERATION__MENUITEM, null, msgs);
      msgs = basicSetMenuitem(newMenuitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ITEM_OPERATION__MENUITEM, newMenuitem, newMenuitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextItem getContextitem()
  {
    return contextitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextitem(ContextItem newContextitem, NotificationChain msgs)
  {
    ContextItem oldContextitem = contextitem;
    contextitem = newContextitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ITEM_OPERATION__CONTEXTITEM, oldContextitem, newContextitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextitem(ContextItem newContextitem)
  {
    if (newContextitem != contextitem)
    {
      NotificationChain msgs = null;
      if (contextitem != null)
        msgs = ((InternalEObject)contextitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ITEM_OPERATION__CONTEXTITEM, null, msgs);
      if (newContextitem != null)
        msgs = ((InternalEObject)newContextitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ITEM_OPERATION__CONTEXTITEM, null, msgs);
      msgs = basicSetContextitem(newContextitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ITEM_OPERATION__CONTEXTITEM, newContextitem, newContextitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MMDSLPackage.ITEM_OPERATION__MENUITEM:
        return basicSetMenuitem(null, msgs);
      case MMDSLPackage.ITEM_OPERATION__CONTEXTITEM:
        return basicSetContextitem(null, msgs);
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
    switch (featureID)
    {
      case MMDSLPackage.ITEM_OPERATION__MENUITEM:
        return getMenuitem();
      case MMDSLPackage.ITEM_OPERATION__CONTEXTITEM:
        return getContextitem();
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
      case MMDSLPackage.ITEM_OPERATION__MENUITEM:
        setMenuitem((MenuItem)newValue);
        return;
      case MMDSLPackage.ITEM_OPERATION__CONTEXTITEM:
        setContextitem((ContextItem)newValue);
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
      case MMDSLPackage.ITEM_OPERATION__MENUITEM:
        setMenuitem((MenuItem)null);
        return;
      case MMDSLPackage.ITEM_OPERATION__CONTEXTITEM:
        setContextitem((ContextItem)null);
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
      case MMDSLPackage.ITEM_OPERATION__MENUITEM:
        return menuitem != null;
      case MMDSLPackage.ITEM_OPERATION__CONTEXTITEM:
        return contextitem != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemOperationImpl
