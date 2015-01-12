/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.DirCreate;
import org.xtext.nv.dsl.mMDSL.DirDelete;
import org.xtext.nv.dsl.mMDSL.DirGetWorking;
import org.xtext.nv.dsl.mMDSL.DirList;
import org.xtext.nv.dsl.mMDSL.DirOperation;
import org.xtext.nv.dsl.mMDSL.DirSetWorking;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dir Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl#getDirsetworking <em>Dirsetworking</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl#getDirgetworking <em>Dirgetworking</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl#getDircreate <em>Dircreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl#getDirdelete <em>Dirdelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirOperationImpl extends MinimalEObjectImpl.Container implements DirOperation
{
  /**
   * The cached value of the '{@link #getDirsetworking() <em>Dirsetworking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirsetworking()
   * @generated
   * @ordered
   */
  protected DirSetWorking dirsetworking;

  /**
   * The cached value of the '{@link #getDirgetworking() <em>Dirgetworking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirgetworking()
   * @generated
   * @ordered
   */
  protected DirGetWorking dirgetworking;

  /**
   * The cached value of the '{@link #getDircreate() <em>Dircreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDircreate()
   * @generated
   * @ordered
   */
  protected DirCreate dircreate;

  /**
   * The cached value of the '{@link #getDirdelete() <em>Dirdelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirdelete()
   * @generated
   * @ordered
   */
  protected DirDelete dirdelete;

  /**
   * The cached value of the '{@link #getDirlist() <em>Dirlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirlist()
   * @generated
   * @ordered
   */
  protected DirList dirlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getDirOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirSetWorking getDirsetworking()
  {
    return dirsetworking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirsetworking(DirSetWorking newDirsetworking, NotificationChain msgs)
  {
    DirSetWorking oldDirsetworking = dirsetworking;
    dirsetworking = newDirsetworking;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRSETWORKING, oldDirsetworking, newDirsetworking);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirsetworking(DirSetWorking newDirsetworking)
  {
    if (newDirsetworking != dirsetworking)
    {
      NotificationChain msgs = null;
      if (dirsetworking != null)
        msgs = ((InternalEObject)dirsetworking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRSETWORKING, null, msgs);
      if (newDirsetworking != null)
        msgs = ((InternalEObject)newDirsetworking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRSETWORKING, null, msgs);
      msgs = basicSetDirsetworking(newDirsetworking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRSETWORKING, newDirsetworking, newDirsetworking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirGetWorking getDirgetworking()
  {
    return dirgetworking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirgetworking(DirGetWorking newDirgetworking, NotificationChain msgs)
  {
    DirGetWorking oldDirgetworking = dirgetworking;
    dirgetworking = newDirgetworking;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRGETWORKING, oldDirgetworking, newDirgetworking);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirgetworking(DirGetWorking newDirgetworking)
  {
    if (newDirgetworking != dirgetworking)
    {
      NotificationChain msgs = null;
      if (dirgetworking != null)
        msgs = ((InternalEObject)dirgetworking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRGETWORKING, null, msgs);
      if (newDirgetworking != null)
        msgs = ((InternalEObject)newDirgetworking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRGETWORKING, null, msgs);
      msgs = basicSetDirgetworking(newDirgetworking, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRGETWORKING, newDirgetworking, newDirgetworking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirCreate getDircreate()
  {
    return dircreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDircreate(DirCreate newDircreate, NotificationChain msgs)
  {
    DirCreate oldDircreate = dircreate;
    dircreate = newDircreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRCREATE, oldDircreate, newDircreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDircreate(DirCreate newDircreate)
  {
    if (newDircreate != dircreate)
    {
      NotificationChain msgs = null;
      if (dircreate != null)
        msgs = ((InternalEObject)dircreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRCREATE, null, msgs);
      if (newDircreate != null)
        msgs = ((InternalEObject)newDircreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRCREATE, null, msgs);
      msgs = basicSetDircreate(newDircreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRCREATE, newDircreate, newDircreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirDelete getDirdelete()
  {
    return dirdelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirdelete(DirDelete newDirdelete, NotificationChain msgs)
  {
    DirDelete oldDirdelete = dirdelete;
    dirdelete = newDirdelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRDELETE, oldDirdelete, newDirdelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirdelete(DirDelete newDirdelete)
  {
    if (newDirdelete != dirdelete)
    {
      NotificationChain msgs = null;
      if (dirdelete != null)
        msgs = ((InternalEObject)dirdelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRDELETE, null, msgs);
      if (newDirdelete != null)
        msgs = ((InternalEObject)newDirdelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRDELETE, null, msgs);
      msgs = basicSetDirdelete(newDirdelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRDELETE, newDirdelete, newDirdelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirList getDirlist()
  {
    return dirlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirlist(DirList newDirlist, NotificationChain msgs)
  {
    DirList oldDirlist = dirlist;
    dirlist = newDirlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRLIST, oldDirlist, newDirlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirlist(DirList newDirlist)
  {
    if (newDirlist != dirlist)
    {
      NotificationChain msgs = null;
      if (dirlist != null)
        msgs = ((InternalEObject)dirlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRLIST, null, msgs);
      if (newDirlist != null)
        msgs = ((InternalEObject)newDirlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.DIR_OPERATION__DIRLIST, null, msgs);
      msgs = basicSetDirlist(newDirlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.DIR_OPERATION__DIRLIST, newDirlist, newDirlist));
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
      case MMDSLPackage.DIR_OPERATION__DIRSETWORKING:
        return basicSetDirsetworking(null, msgs);
      case MMDSLPackage.DIR_OPERATION__DIRGETWORKING:
        return basicSetDirgetworking(null, msgs);
      case MMDSLPackage.DIR_OPERATION__DIRCREATE:
        return basicSetDircreate(null, msgs);
      case MMDSLPackage.DIR_OPERATION__DIRDELETE:
        return basicSetDirdelete(null, msgs);
      case MMDSLPackage.DIR_OPERATION__DIRLIST:
        return basicSetDirlist(null, msgs);
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
      case MMDSLPackage.DIR_OPERATION__DIRSETWORKING:
        return getDirsetworking();
      case MMDSLPackage.DIR_OPERATION__DIRGETWORKING:
        return getDirgetworking();
      case MMDSLPackage.DIR_OPERATION__DIRCREATE:
        return getDircreate();
      case MMDSLPackage.DIR_OPERATION__DIRDELETE:
        return getDirdelete();
      case MMDSLPackage.DIR_OPERATION__DIRLIST:
        return getDirlist();
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
      case MMDSLPackage.DIR_OPERATION__DIRSETWORKING:
        setDirsetworking((DirSetWorking)newValue);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRGETWORKING:
        setDirgetworking((DirGetWorking)newValue);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRCREATE:
        setDircreate((DirCreate)newValue);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRDELETE:
        setDirdelete((DirDelete)newValue);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRLIST:
        setDirlist((DirList)newValue);
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
      case MMDSLPackage.DIR_OPERATION__DIRSETWORKING:
        setDirsetworking((DirSetWorking)null);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRGETWORKING:
        setDirgetworking((DirGetWorking)null);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRCREATE:
        setDircreate((DirCreate)null);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRDELETE:
        setDirdelete((DirDelete)null);
        return;
      case MMDSLPackage.DIR_OPERATION__DIRLIST:
        setDirlist((DirList)null);
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
      case MMDSLPackage.DIR_OPERATION__DIRSETWORKING:
        return dirsetworking != null;
      case MMDSLPackage.DIR_OPERATION__DIRGETWORKING:
        return dirgetworking != null;
      case MMDSLPackage.DIR_OPERATION__DIRCREATE:
        return dircreate != null;
      case MMDSLPackage.DIR_OPERATION__DIRDELETE:
        return dirdelete != null;
      case MMDSLPackage.DIR_OPERATION__DIRLIST:
        return dirlist != null;
    }
    return super.eIsSet(featureID);
  }

} //DirOperationImpl
