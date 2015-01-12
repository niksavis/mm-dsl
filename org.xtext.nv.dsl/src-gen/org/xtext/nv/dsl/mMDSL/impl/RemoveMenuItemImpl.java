/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.InsertMenuItem;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RemoveMenuItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RemoveMenuItemImpl#getMenuitemname <em>Menuitemname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveMenuItemImpl extends MinimalEObjectImpl.Container implements RemoveMenuItem
{
  /**
   * The cached value of the '{@link #getMenuitemname() <em>Menuitemname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenuitemname()
   * @generated
   * @ordered
   */
  protected InsertMenuItem menuitemname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveMenuItemImpl()
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
    return MMDSLPackage.eINSTANCE.getRemoveMenuItem();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMenuItem getMenuitemname()
  {
    if (menuitemname != null && menuitemname.eIsProxy())
    {
      InternalEObject oldMenuitemname = (InternalEObject)menuitemname;
      menuitemname = (InsertMenuItem)eResolveProxy(oldMenuitemname);
      if (menuitemname != oldMenuitemname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME, oldMenuitemname, menuitemname));
      }
    }
    return menuitemname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMenuItem basicGetMenuitemname()
  {
    return menuitemname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMenuitemname(InsertMenuItem newMenuitemname)
  {
    InsertMenuItem oldMenuitemname = menuitemname;
    menuitemname = newMenuitemname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME, oldMenuitemname, menuitemname));
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
      case MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME:
        if (resolve) return getMenuitemname();
        return basicGetMenuitemname();
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
      case MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME:
        setMenuitemname((InsertMenuItem)newValue);
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
      case MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME:
        setMenuitemname((InsertMenuItem)null);
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
      case MMDSLPackage.REMOVE_MENU_ITEM__MENUITEMNAME:
        return menuitemname != null;
    }
    return super.eIsSet(featureID);
  }

} //RemoveMenuItemImpl
