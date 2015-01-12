/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.InsertMenuItem;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.MenuItem;
import org.xtext.nv.dsl.mMDSL.RemoveMenuItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MenuItemImpl#getInsertmenuitem <em>Insertmenuitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MenuItemImpl#getRemovemenuitem <em>Removemenuitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuItemImpl extends MinimalEObjectImpl.Container implements MenuItem
{
  /**
   * The cached value of the '{@link #getInsertmenuitem() <em>Insertmenuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertmenuitem()
   * @generated
   * @ordered
   */
  protected InsertMenuItem insertmenuitem;

  /**
   * The cached value of the '{@link #getRemovemenuitem() <em>Removemenuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovemenuitem()
   * @generated
   * @ordered
   */
  protected RemoveMenuItem removemenuitem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenuItemImpl()
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
    return MMDSLPackage.eINSTANCE.getMenuItem();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMenuItem getInsertmenuitem()
  {
    return insertmenuitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsertmenuitem(InsertMenuItem newInsertmenuitem, NotificationChain msgs)
  {
    InsertMenuItem oldInsertmenuitem = insertmenuitem;
    insertmenuitem = newInsertmenuitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MENU_ITEM__INSERTMENUITEM, oldInsertmenuitem, newInsertmenuitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertmenuitem(InsertMenuItem newInsertmenuitem)
  {
    if (newInsertmenuitem != insertmenuitem)
    {
      NotificationChain msgs = null;
      if (insertmenuitem != null)
        msgs = ((InternalEObject)insertmenuitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MENU_ITEM__INSERTMENUITEM, null, msgs);
      if (newInsertmenuitem != null)
        msgs = ((InternalEObject)newInsertmenuitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MENU_ITEM__INSERTMENUITEM, null, msgs);
      msgs = basicSetInsertmenuitem(newInsertmenuitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MENU_ITEM__INSERTMENUITEM, newInsertmenuitem, newInsertmenuitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveMenuItem getRemovemenuitem()
  {
    return removemenuitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemovemenuitem(RemoveMenuItem newRemovemenuitem, NotificationChain msgs)
  {
    RemoveMenuItem oldRemovemenuitem = removemenuitem;
    removemenuitem = newRemovemenuitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MENU_ITEM__REMOVEMENUITEM, oldRemovemenuitem, newRemovemenuitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemovemenuitem(RemoveMenuItem newRemovemenuitem)
  {
    if (newRemovemenuitem != removemenuitem)
    {
      NotificationChain msgs = null;
      if (removemenuitem != null)
        msgs = ((InternalEObject)removemenuitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MENU_ITEM__REMOVEMENUITEM, null, msgs);
      if (newRemovemenuitem != null)
        msgs = ((InternalEObject)newRemovemenuitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MENU_ITEM__REMOVEMENUITEM, null, msgs);
      msgs = basicSetRemovemenuitem(newRemovemenuitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MENU_ITEM__REMOVEMENUITEM, newRemovemenuitem, newRemovemenuitem));
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
      case MMDSLPackage.MENU_ITEM__INSERTMENUITEM:
        return basicSetInsertmenuitem(null, msgs);
      case MMDSLPackage.MENU_ITEM__REMOVEMENUITEM:
        return basicSetRemovemenuitem(null, msgs);
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
      case MMDSLPackage.MENU_ITEM__INSERTMENUITEM:
        return getInsertmenuitem();
      case MMDSLPackage.MENU_ITEM__REMOVEMENUITEM:
        return getRemovemenuitem();
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
      case MMDSLPackage.MENU_ITEM__INSERTMENUITEM:
        setInsertmenuitem((InsertMenuItem)newValue);
        return;
      case MMDSLPackage.MENU_ITEM__REMOVEMENUITEM:
        setRemovemenuitem((RemoveMenuItem)newValue);
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
      case MMDSLPackage.MENU_ITEM__INSERTMENUITEM:
        setInsertmenuitem((InsertMenuItem)null);
        return;
      case MMDSLPackage.MENU_ITEM__REMOVEMENUITEM:
        setRemovemenuitem((RemoveMenuItem)null);
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
      case MMDSLPackage.MENU_ITEM__INSERTMENUITEM:
        return insertmenuitem != null;
      case MMDSLPackage.MENU_ITEM__REMOVEMENUITEM:
        return removemenuitem != null;
    }
    return super.eIsSet(featureID);
  }

} //MenuItemImpl
