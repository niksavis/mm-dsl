/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.AlgorithmOperation;
import org.xtext.nv.dsl.mMDSL.AttributeOperation;
import org.xtext.nv.dsl.mMDSL.DirOperation;
import org.xtext.nv.dsl.mMDSL.FileOperation;
import org.xtext.nv.dsl.mMDSL.InstanceOperation;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.ModelOperation;
import org.xtext.nv.dsl.mMDSL.SimpleUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getFileoperation <em>Fileoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getDiroperation <em>Diroperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getSimpleui <em>Simpleui</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getModeloperation <em>Modeloperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getInstanceoperation <em>Instanceoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl#getAttributeoperation <em>Attributeoperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgorithmOperationImpl extends MinimalEObjectImpl.Container implements AlgorithmOperation
{
  /**
   * The cached value of the '{@link #getFileoperation() <em>Fileoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileoperation()
   * @generated
   * @ordered
   */
  protected FileOperation fileoperation;

  /**
   * The cached value of the '{@link #getDiroperation() <em>Diroperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiroperation()
   * @generated
   * @ordered
   */
  protected DirOperation diroperation;

  /**
   * The cached value of the '{@link #getSimpleui() <em>Simpleui</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleui()
   * @generated
   * @ordered
   */
  protected SimpleUI simpleui;

  /**
   * The cached value of the '{@link #getModeloperation() <em>Modeloperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeloperation()
   * @generated
   * @ordered
   */
  protected ModelOperation modeloperation;

  /**
   * The cached value of the '{@link #getInstanceoperation() <em>Instanceoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceoperation()
   * @generated
   * @ordered
   */
  protected InstanceOperation instanceoperation;

  /**
   * The cached value of the '{@link #getAttributeoperation() <em>Attributeoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeoperation()
   * @generated
   * @ordered
   */
  protected AttributeOperation attributeoperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlgorithmOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getAlgorithmOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileOperation getFileoperation()
  {
    return fileoperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileoperation(FileOperation newFileoperation, NotificationChain msgs)
  {
    FileOperation oldFileoperation = fileoperation;
    fileoperation = newFileoperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION, oldFileoperation, newFileoperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileoperation(FileOperation newFileoperation)
  {
    if (newFileoperation != fileoperation)
    {
      NotificationChain msgs = null;
      if (fileoperation != null)
        msgs = ((InternalEObject)fileoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION, null, msgs);
      if (newFileoperation != null)
        msgs = ((InternalEObject)newFileoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION, null, msgs);
      msgs = basicSetFileoperation(newFileoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION, newFileoperation, newFileoperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirOperation getDiroperation()
  {
    return diroperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiroperation(DirOperation newDiroperation, NotificationChain msgs)
  {
    DirOperation oldDiroperation = diroperation;
    diroperation = newDiroperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION, oldDiroperation, newDiroperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiroperation(DirOperation newDiroperation)
  {
    if (newDiroperation != diroperation)
    {
      NotificationChain msgs = null;
      if (diroperation != null)
        msgs = ((InternalEObject)diroperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION, null, msgs);
      if (newDiroperation != null)
        msgs = ((InternalEObject)newDiroperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION, null, msgs);
      msgs = basicSetDiroperation(newDiroperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION, newDiroperation, newDiroperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleUI getSimpleui()
  {
    return simpleui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleui(SimpleUI newSimpleui, NotificationChain msgs)
  {
    SimpleUI oldSimpleui = simpleui;
    simpleui = newSimpleui;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI, oldSimpleui, newSimpleui);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleui(SimpleUI newSimpleui)
  {
    if (newSimpleui != simpleui)
    {
      NotificationChain msgs = null;
      if (simpleui != null)
        msgs = ((InternalEObject)simpleui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI, null, msgs);
      if (newSimpleui != null)
        msgs = ((InternalEObject)newSimpleui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI, null, msgs);
      msgs = basicSetSimpleui(newSimpleui, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI, newSimpleui, newSimpleui));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelOperation getModeloperation()
  {
    return modeloperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModeloperation(ModelOperation newModeloperation, NotificationChain msgs)
  {
    ModelOperation oldModeloperation = modeloperation;
    modeloperation = newModeloperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION, oldModeloperation, newModeloperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeloperation(ModelOperation newModeloperation)
  {
    if (newModeloperation != modeloperation)
    {
      NotificationChain msgs = null;
      if (modeloperation != null)
        msgs = ((InternalEObject)modeloperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION, null, msgs);
      if (newModeloperation != null)
        msgs = ((InternalEObject)newModeloperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION, null, msgs);
      msgs = basicSetModeloperation(newModeloperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION, newModeloperation, newModeloperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOperation getInstanceoperation()
  {
    return instanceoperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstanceoperation(InstanceOperation newInstanceoperation, NotificationChain msgs)
  {
    InstanceOperation oldInstanceoperation = instanceoperation;
    instanceoperation = newInstanceoperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION, oldInstanceoperation, newInstanceoperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstanceoperation(InstanceOperation newInstanceoperation)
  {
    if (newInstanceoperation != instanceoperation)
    {
      NotificationChain msgs = null;
      if (instanceoperation != null)
        msgs = ((InternalEObject)instanceoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION, null, msgs);
      if (newInstanceoperation != null)
        msgs = ((InternalEObject)newInstanceoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION, null, msgs);
      msgs = basicSetInstanceoperation(newInstanceoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION, newInstanceoperation, newInstanceoperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeOperation getAttributeoperation()
  {
    return attributeoperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeoperation(AttributeOperation newAttributeoperation, NotificationChain msgs)
  {
    AttributeOperation oldAttributeoperation = attributeoperation;
    attributeoperation = newAttributeoperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION, oldAttributeoperation, newAttributeoperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeoperation(AttributeOperation newAttributeoperation)
  {
    if (newAttributeoperation != attributeoperation)
    {
      NotificationChain msgs = null;
      if (attributeoperation != null)
        msgs = ((InternalEObject)attributeoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION, null, msgs);
      if (newAttributeoperation != null)
        msgs = ((InternalEObject)newAttributeoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION, null, msgs);
      msgs = basicSetAttributeoperation(newAttributeoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION, newAttributeoperation, newAttributeoperation));
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
      case MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION:
        return basicSetFileoperation(null, msgs);
      case MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION:
        return basicSetDiroperation(null, msgs);
      case MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI:
        return basicSetSimpleui(null, msgs);
      case MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION:
        return basicSetModeloperation(null, msgs);
      case MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION:
        return basicSetInstanceoperation(null, msgs);
      case MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION:
        return basicSetAttributeoperation(null, msgs);
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
      case MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION:
        return getFileoperation();
      case MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION:
        return getDiroperation();
      case MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI:
        return getSimpleui();
      case MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION:
        return getModeloperation();
      case MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION:
        return getInstanceoperation();
      case MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION:
        return getAttributeoperation();
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
      case MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION:
        setFileoperation((FileOperation)newValue);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION:
        setDiroperation((DirOperation)newValue);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI:
        setSimpleui((SimpleUI)newValue);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION:
        setModeloperation((ModelOperation)newValue);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION:
        setInstanceoperation((InstanceOperation)newValue);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION:
        setAttributeoperation((AttributeOperation)newValue);
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
      case MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION:
        setFileoperation((FileOperation)null);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION:
        setDiroperation((DirOperation)null);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI:
        setSimpleui((SimpleUI)null);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION:
        setModeloperation((ModelOperation)null);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION:
        setInstanceoperation((InstanceOperation)null);
        return;
      case MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION:
        setAttributeoperation((AttributeOperation)null);
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
      case MMDSLPackage.ALGORITHM_OPERATION__FILEOPERATION:
        return fileoperation != null;
      case MMDSLPackage.ALGORITHM_OPERATION__DIROPERATION:
        return diroperation != null;
      case MMDSLPackage.ALGORITHM_OPERATION__SIMPLEUI:
        return simpleui != null;
      case MMDSLPackage.ALGORITHM_OPERATION__MODELOPERATION:
        return modeloperation != null;
      case MMDSLPackage.ALGORITHM_OPERATION__INSTANCEOPERATION:
        return instanceoperation != null;
      case MMDSLPackage.ALGORITHM_OPERATION__ATTRIBUTEOPERATION:
        return attributeoperation != null;
    }
    return super.eIsSet(featureID);
  }

} //AlgorithmOperationImpl
