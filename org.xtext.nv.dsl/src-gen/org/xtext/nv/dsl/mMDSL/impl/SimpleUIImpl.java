/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.EditBox;
import org.xtext.nv.dsl.mMDSL.ErrorBox;
import org.xtext.nv.dsl.mMDSL.InfoBox;
import org.xtext.nv.dsl.mMDSL.ItemOperation;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.SimpleUI;
import org.xtext.nv.dsl.mMDSL.ViewBox;
import org.xtext.nv.dsl.mMDSL.WarningBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getEditbox <em>Editbox</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getInfobox <em>Infobox</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getErrorbox <em>Errorbox</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getWarningbox <em>Warningbox</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getViewbox <em>Viewbox</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl#getItemoperation <em>Itemoperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleUIImpl extends MinimalEObjectImpl.Container implements SimpleUI
{
  /**
   * The cached value of the '{@link #getEditbox() <em>Editbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditbox()
   * @generated
   * @ordered
   */
  protected EditBox editbox;

  /**
   * The cached value of the '{@link #getInfobox() <em>Infobox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfobox()
   * @generated
   * @ordered
   */
  protected InfoBox infobox;

  /**
   * The cached value of the '{@link #getErrorbox() <em>Errorbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorbox()
   * @generated
   * @ordered
   */
  protected ErrorBox errorbox;

  /**
   * The cached value of the '{@link #getWarningbox() <em>Warningbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarningbox()
   * @generated
   * @ordered
   */
  protected WarningBox warningbox;

  /**
   * The cached value of the '{@link #getViewbox() <em>Viewbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewbox()
   * @generated
   * @ordered
   */
  protected ViewBox viewbox;

  /**
   * The cached value of the '{@link #getItemoperation() <em>Itemoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemoperation()
   * @generated
   * @ordered
   */
  protected ItemOperation itemoperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleUIImpl()
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
    return MMDSLPackage.eINSTANCE.getSimpleUI();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditBox getEditbox()
  {
    return editbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEditbox(EditBox newEditbox, NotificationChain msgs)
  {
    EditBox oldEditbox = editbox;
    editbox = newEditbox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__EDITBOX, oldEditbox, newEditbox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditbox(EditBox newEditbox)
  {
    if (newEditbox != editbox)
    {
      NotificationChain msgs = null;
      if (editbox != null)
        msgs = ((InternalEObject)editbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__EDITBOX, null, msgs);
      if (newEditbox != null)
        msgs = ((InternalEObject)newEditbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__EDITBOX, null, msgs);
      msgs = basicSetEditbox(newEditbox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__EDITBOX, newEditbox, newEditbox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfoBox getInfobox()
  {
    return infobox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfobox(InfoBox newInfobox, NotificationChain msgs)
  {
    InfoBox oldInfobox = infobox;
    infobox = newInfobox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__INFOBOX, oldInfobox, newInfobox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfobox(InfoBox newInfobox)
  {
    if (newInfobox != infobox)
    {
      NotificationChain msgs = null;
      if (infobox != null)
        msgs = ((InternalEObject)infobox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__INFOBOX, null, msgs);
      if (newInfobox != null)
        msgs = ((InternalEObject)newInfobox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__INFOBOX, null, msgs);
      msgs = basicSetInfobox(newInfobox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__INFOBOX, newInfobox, newInfobox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorBox getErrorbox()
  {
    return errorbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorbox(ErrorBox newErrorbox, NotificationChain msgs)
  {
    ErrorBox oldErrorbox = errorbox;
    errorbox = newErrorbox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__ERRORBOX, oldErrorbox, newErrorbox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorbox(ErrorBox newErrorbox)
  {
    if (newErrorbox != errorbox)
    {
      NotificationChain msgs = null;
      if (errorbox != null)
        msgs = ((InternalEObject)errorbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__ERRORBOX, null, msgs);
      if (newErrorbox != null)
        msgs = ((InternalEObject)newErrorbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__ERRORBOX, null, msgs);
      msgs = basicSetErrorbox(newErrorbox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__ERRORBOX, newErrorbox, newErrorbox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WarningBox getWarningbox()
  {
    return warningbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWarningbox(WarningBox newWarningbox, NotificationChain msgs)
  {
    WarningBox oldWarningbox = warningbox;
    warningbox = newWarningbox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__WARNINGBOX, oldWarningbox, newWarningbox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWarningbox(WarningBox newWarningbox)
  {
    if (newWarningbox != warningbox)
    {
      NotificationChain msgs = null;
      if (warningbox != null)
        msgs = ((InternalEObject)warningbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__WARNINGBOX, null, msgs);
      if (newWarningbox != null)
        msgs = ((InternalEObject)newWarningbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__WARNINGBOX, null, msgs);
      msgs = basicSetWarningbox(newWarningbox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__WARNINGBOX, newWarningbox, newWarningbox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewBox getViewbox()
  {
    return viewbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetViewbox(ViewBox newViewbox, NotificationChain msgs)
  {
    ViewBox oldViewbox = viewbox;
    viewbox = newViewbox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__VIEWBOX, oldViewbox, newViewbox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewbox(ViewBox newViewbox)
  {
    if (newViewbox != viewbox)
    {
      NotificationChain msgs = null;
      if (viewbox != null)
        msgs = ((InternalEObject)viewbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__VIEWBOX, null, msgs);
      if (newViewbox != null)
        msgs = ((InternalEObject)newViewbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__VIEWBOX, null, msgs);
      msgs = basicSetViewbox(newViewbox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__VIEWBOX, newViewbox, newViewbox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemOperation getItemoperation()
  {
    return itemoperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItemoperation(ItemOperation newItemoperation, NotificationChain msgs)
  {
    ItemOperation oldItemoperation = itemoperation;
    itemoperation = newItemoperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__ITEMOPERATION, oldItemoperation, newItemoperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItemoperation(ItemOperation newItemoperation)
  {
    if (newItemoperation != itemoperation)
    {
      NotificationChain msgs = null;
      if (itemoperation != null)
        msgs = ((InternalEObject)itemoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__ITEMOPERATION, null, msgs);
      if (newItemoperation != null)
        msgs = ((InternalEObject)newItemoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SIMPLE_UI__ITEMOPERATION, null, msgs);
      msgs = basicSetItemoperation(newItemoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SIMPLE_UI__ITEMOPERATION, newItemoperation, newItemoperation));
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
      case MMDSLPackage.SIMPLE_UI__EDITBOX:
        return basicSetEditbox(null, msgs);
      case MMDSLPackage.SIMPLE_UI__INFOBOX:
        return basicSetInfobox(null, msgs);
      case MMDSLPackage.SIMPLE_UI__ERRORBOX:
        return basicSetErrorbox(null, msgs);
      case MMDSLPackage.SIMPLE_UI__WARNINGBOX:
        return basicSetWarningbox(null, msgs);
      case MMDSLPackage.SIMPLE_UI__VIEWBOX:
        return basicSetViewbox(null, msgs);
      case MMDSLPackage.SIMPLE_UI__ITEMOPERATION:
        return basicSetItemoperation(null, msgs);
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
      case MMDSLPackage.SIMPLE_UI__EDITBOX:
        return getEditbox();
      case MMDSLPackage.SIMPLE_UI__INFOBOX:
        return getInfobox();
      case MMDSLPackage.SIMPLE_UI__ERRORBOX:
        return getErrorbox();
      case MMDSLPackage.SIMPLE_UI__WARNINGBOX:
        return getWarningbox();
      case MMDSLPackage.SIMPLE_UI__VIEWBOX:
        return getViewbox();
      case MMDSLPackage.SIMPLE_UI__ITEMOPERATION:
        return getItemoperation();
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
      case MMDSLPackage.SIMPLE_UI__EDITBOX:
        setEditbox((EditBox)newValue);
        return;
      case MMDSLPackage.SIMPLE_UI__INFOBOX:
        setInfobox((InfoBox)newValue);
        return;
      case MMDSLPackage.SIMPLE_UI__ERRORBOX:
        setErrorbox((ErrorBox)newValue);
        return;
      case MMDSLPackage.SIMPLE_UI__WARNINGBOX:
        setWarningbox((WarningBox)newValue);
        return;
      case MMDSLPackage.SIMPLE_UI__VIEWBOX:
        setViewbox((ViewBox)newValue);
        return;
      case MMDSLPackage.SIMPLE_UI__ITEMOPERATION:
        setItemoperation((ItemOperation)newValue);
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
      case MMDSLPackage.SIMPLE_UI__EDITBOX:
        setEditbox((EditBox)null);
        return;
      case MMDSLPackage.SIMPLE_UI__INFOBOX:
        setInfobox((InfoBox)null);
        return;
      case MMDSLPackage.SIMPLE_UI__ERRORBOX:
        setErrorbox((ErrorBox)null);
        return;
      case MMDSLPackage.SIMPLE_UI__WARNINGBOX:
        setWarningbox((WarningBox)null);
        return;
      case MMDSLPackage.SIMPLE_UI__VIEWBOX:
        setViewbox((ViewBox)null);
        return;
      case MMDSLPackage.SIMPLE_UI__ITEMOPERATION:
        setItemoperation((ItemOperation)null);
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
      case MMDSLPackage.SIMPLE_UI__EDITBOX:
        return editbox != null;
      case MMDSLPackage.SIMPLE_UI__INFOBOX:
        return infobox != null;
      case MMDSLPackage.SIMPLE_UI__ERRORBOX:
        return errorbox != null;
      case MMDSLPackage.SIMPLE_UI__WARNINGBOX:
        return warningbox != null;
      case MMDSLPackage.SIMPLE_UI__VIEWBOX:
        return viewbox != null;
      case MMDSLPackage.SIMPLE_UI__ITEMOPERATION:
        return itemoperation != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleUIImpl
