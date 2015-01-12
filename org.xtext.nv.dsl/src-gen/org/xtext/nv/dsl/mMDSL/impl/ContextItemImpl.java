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
import org.xtext.nv.dsl.mMDSL.InsertContextItem;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RemoveContextItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ContextItemImpl#getInsertcontextitem <em>Insertcontextitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ContextItemImpl#getRemovecontextitem <em>Removecontextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextItemImpl extends MinimalEObjectImpl.Container implements ContextItem
{
  /**
   * The cached value of the '{@link #getInsertcontextitem() <em>Insertcontextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertcontextitem()
   * @generated
   * @ordered
   */
  protected InsertContextItem insertcontextitem;

  /**
   * The cached value of the '{@link #getRemovecontextitem() <em>Removecontextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovecontextitem()
   * @generated
   * @ordered
   */
  protected RemoveContextItem removecontextitem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextItemImpl()
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
    return MMDSLPackage.eINSTANCE.getContextItem();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertContextItem getInsertcontextitem()
  {
    return insertcontextitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsertcontextitem(InsertContextItem newInsertcontextitem, NotificationChain msgs)
  {
    InsertContextItem oldInsertcontextitem = insertcontextitem;
    insertcontextitem = newInsertcontextitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM, oldInsertcontextitem, newInsertcontextitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertcontextitem(InsertContextItem newInsertcontextitem)
  {
    if (newInsertcontextitem != insertcontextitem)
    {
      NotificationChain msgs = null;
      if (insertcontextitem != null)
        msgs = ((InternalEObject)insertcontextitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM, null, msgs);
      if (newInsertcontextitem != null)
        msgs = ((InternalEObject)newInsertcontextitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM, null, msgs);
      msgs = basicSetInsertcontextitem(newInsertcontextitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM, newInsertcontextitem, newInsertcontextitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveContextItem getRemovecontextitem()
  {
    return removecontextitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemovecontextitem(RemoveContextItem newRemovecontextitem, NotificationChain msgs)
  {
    RemoveContextItem oldRemovecontextitem = removecontextitem;
    removecontextitem = newRemovecontextitem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM, oldRemovecontextitem, newRemovecontextitem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemovecontextitem(RemoveContextItem newRemovecontextitem)
  {
    if (newRemovecontextitem != removecontextitem)
    {
      NotificationChain msgs = null;
      if (removecontextitem != null)
        msgs = ((InternalEObject)removecontextitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM, null, msgs);
      if (newRemovecontextitem != null)
        msgs = ((InternalEObject)newRemovecontextitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM, null, msgs);
      msgs = basicSetRemovecontextitem(newRemovecontextitem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM, newRemovecontextitem, newRemovecontextitem));
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
      case MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM:
        return basicSetInsertcontextitem(null, msgs);
      case MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM:
        return basicSetRemovecontextitem(null, msgs);
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
      case MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM:
        return getInsertcontextitem();
      case MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM:
        return getRemovecontextitem();
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
      case MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM:
        setInsertcontextitem((InsertContextItem)newValue);
        return;
      case MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM:
        setRemovecontextitem((RemoveContextItem)newValue);
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
      case MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM:
        setInsertcontextitem((InsertContextItem)null);
        return;
      case MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM:
        setRemovecontextitem((RemoveContextItem)null);
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
      case MMDSLPackage.CONTEXT_ITEM__INSERTCONTEXTITEM:
        return insertcontextitem != null;
      case MMDSLPackage.CONTEXT_ITEM__REMOVECONTEXTITEM:
        return removecontextitem != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextItemImpl
