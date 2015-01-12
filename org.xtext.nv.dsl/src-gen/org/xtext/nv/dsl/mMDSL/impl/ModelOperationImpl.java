/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.ModelCreate;
import org.xtext.nv.dsl.mMDSL.ModelDelete;
import org.xtext.nv.dsl.mMDSL.ModelDiscard;
import org.xtext.nv.dsl.mMDSL.ModelIsLoaded;
import org.xtext.nv.dsl.mMDSL.ModelLoad;
import org.xtext.nv.dsl.mMDSL.ModelOperation;
import org.xtext.nv.dsl.mMDSL.ModelSave;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModelcreate <em>Modelcreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModeldelete <em>Modeldelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModeldiscard <em>Modeldiscard</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModelsave <em>Modelsave</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModelload <em>Modelload</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl#getModelisloaded <em>Modelisloaded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelOperationImpl extends MinimalEObjectImpl.Container implements ModelOperation
{
  /**
   * The cached value of the '{@link #getModelcreate() <em>Modelcreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelcreate()
   * @generated
   * @ordered
   */
  protected ModelCreate modelcreate;

  /**
   * The cached value of the '{@link #getModeldelete() <em>Modeldelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeldelete()
   * @generated
   * @ordered
   */
  protected ModelDelete modeldelete;

  /**
   * The cached value of the '{@link #getModeldiscard() <em>Modeldiscard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeldiscard()
   * @generated
   * @ordered
   */
  protected ModelDiscard modeldiscard;

  /**
   * The cached value of the '{@link #getModelsave() <em>Modelsave</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelsave()
   * @generated
   * @ordered
   */
  protected ModelSave modelsave;

  /**
   * The cached value of the '{@link #getModelload() <em>Modelload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelload()
   * @generated
   * @ordered
   */
  protected ModelLoad modelload;

  /**
   * The cached value of the '{@link #getModelisloaded() <em>Modelisloaded</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelisloaded()
   * @generated
   * @ordered
   */
  protected ModelIsLoaded modelisloaded;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getModelOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCreate getModelcreate()
  {
    return modelcreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelcreate(ModelCreate newModelcreate, NotificationChain msgs)
  {
    ModelCreate oldModelcreate = modelcreate;
    modelcreate = newModelcreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELCREATE, oldModelcreate, newModelcreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelcreate(ModelCreate newModelcreate)
  {
    if (newModelcreate != modelcreate)
    {
      NotificationChain msgs = null;
      if (modelcreate != null)
        msgs = ((InternalEObject)modelcreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELCREATE, null, msgs);
      if (newModelcreate != null)
        msgs = ((InternalEObject)newModelcreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELCREATE, null, msgs);
      msgs = basicSetModelcreate(newModelcreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELCREATE, newModelcreate, newModelcreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDelete getModeldelete()
  {
    return modeldelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModeldelete(ModelDelete newModeldelete, NotificationChain msgs)
  {
    ModelDelete oldModeldelete = modeldelete;
    modeldelete = newModeldelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELDELETE, oldModeldelete, newModeldelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeldelete(ModelDelete newModeldelete)
  {
    if (newModeldelete != modeldelete)
    {
      NotificationChain msgs = null;
      if (modeldelete != null)
        msgs = ((InternalEObject)modeldelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELDELETE, null, msgs);
      if (newModeldelete != null)
        msgs = ((InternalEObject)newModeldelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELDELETE, null, msgs);
      msgs = basicSetModeldelete(newModeldelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELDELETE, newModeldelete, newModeldelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDiscard getModeldiscard()
  {
    return modeldiscard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModeldiscard(ModelDiscard newModeldiscard, NotificationChain msgs)
  {
    ModelDiscard oldModeldiscard = modeldiscard;
    modeldiscard = newModeldiscard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELDISCARD, oldModeldiscard, newModeldiscard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeldiscard(ModelDiscard newModeldiscard)
  {
    if (newModeldiscard != modeldiscard)
    {
      NotificationChain msgs = null;
      if (modeldiscard != null)
        msgs = ((InternalEObject)modeldiscard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELDISCARD, null, msgs);
      if (newModeldiscard != null)
        msgs = ((InternalEObject)newModeldiscard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELDISCARD, null, msgs);
      msgs = basicSetModeldiscard(newModeldiscard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELDISCARD, newModeldiscard, newModeldiscard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSave getModelsave()
  {
    return modelsave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelsave(ModelSave newModelsave, NotificationChain msgs)
  {
    ModelSave oldModelsave = modelsave;
    modelsave = newModelsave;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELSAVE, oldModelsave, newModelsave);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelsave(ModelSave newModelsave)
  {
    if (newModelsave != modelsave)
    {
      NotificationChain msgs = null;
      if (modelsave != null)
        msgs = ((InternalEObject)modelsave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELSAVE, null, msgs);
      if (newModelsave != null)
        msgs = ((InternalEObject)newModelsave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELSAVE, null, msgs);
      msgs = basicSetModelsave(newModelsave, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELSAVE, newModelsave, newModelsave));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelLoad getModelload()
  {
    return modelload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelload(ModelLoad newModelload, NotificationChain msgs)
  {
    ModelLoad oldModelload = modelload;
    modelload = newModelload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELLOAD, oldModelload, newModelload);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelload(ModelLoad newModelload)
  {
    if (newModelload != modelload)
    {
      NotificationChain msgs = null;
      if (modelload != null)
        msgs = ((InternalEObject)modelload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELLOAD, null, msgs);
      if (newModelload != null)
        msgs = ((InternalEObject)newModelload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELLOAD, null, msgs);
      msgs = basicSetModelload(newModelload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELLOAD, newModelload, newModelload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelIsLoaded getModelisloaded()
  {
    return modelisloaded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelisloaded(ModelIsLoaded newModelisloaded, NotificationChain msgs)
  {
    ModelIsLoaded oldModelisloaded = modelisloaded;
    modelisloaded = newModelisloaded;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELISLOADED, oldModelisloaded, newModelisloaded);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelisloaded(ModelIsLoaded newModelisloaded)
  {
    if (newModelisloaded != modelisloaded)
    {
      NotificationChain msgs = null;
      if (modelisloaded != null)
        msgs = ((InternalEObject)modelisloaded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELISLOADED, null, msgs);
      if (newModelisloaded != null)
        msgs = ((InternalEObject)newModelisloaded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.MODEL_OPERATION__MODELISLOADED, null, msgs);
      msgs = basicSetModelisloaded(newModelisloaded, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_OPERATION__MODELISLOADED, newModelisloaded, newModelisloaded));
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
      case MMDSLPackage.MODEL_OPERATION__MODELCREATE:
        return basicSetModelcreate(null, msgs);
      case MMDSLPackage.MODEL_OPERATION__MODELDELETE:
        return basicSetModeldelete(null, msgs);
      case MMDSLPackage.MODEL_OPERATION__MODELDISCARD:
        return basicSetModeldiscard(null, msgs);
      case MMDSLPackage.MODEL_OPERATION__MODELSAVE:
        return basicSetModelsave(null, msgs);
      case MMDSLPackage.MODEL_OPERATION__MODELLOAD:
        return basicSetModelload(null, msgs);
      case MMDSLPackage.MODEL_OPERATION__MODELISLOADED:
        return basicSetModelisloaded(null, msgs);
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
      case MMDSLPackage.MODEL_OPERATION__MODELCREATE:
        return getModelcreate();
      case MMDSLPackage.MODEL_OPERATION__MODELDELETE:
        return getModeldelete();
      case MMDSLPackage.MODEL_OPERATION__MODELDISCARD:
        return getModeldiscard();
      case MMDSLPackage.MODEL_OPERATION__MODELSAVE:
        return getModelsave();
      case MMDSLPackage.MODEL_OPERATION__MODELLOAD:
        return getModelload();
      case MMDSLPackage.MODEL_OPERATION__MODELISLOADED:
        return getModelisloaded();
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
      case MMDSLPackage.MODEL_OPERATION__MODELCREATE:
        setModelcreate((ModelCreate)newValue);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELDELETE:
        setModeldelete((ModelDelete)newValue);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELDISCARD:
        setModeldiscard((ModelDiscard)newValue);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELSAVE:
        setModelsave((ModelSave)newValue);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELLOAD:
        setModelload((ModelLoad)newValue);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELISLOADED:
        setModelisloaded((ModelIsLoaded)newValue);
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
      case MMDSLPackage.MODEL_OPERATION__MODELCREATE:
        setModelcreate((ModelCreate)null);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELDELETE:
        setModeldelete((ModelDelete)null);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELDISCARD:
        setModeldiscard((ModelDiscard)null);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELSAVE:
        setModelsave((ModelSave)null);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELLOAD:
        setModelload((ModelLoad)null);
        return;
      case MMDSLPackage.MODEL_OPERATION__MODELISLOADED:
        setModelisloaded((ModelIsLoaded)null);
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
      case MMDSLPackage.MODEL_OPERATION__MODELCREATE:
        return modelcreate != null;
      case MMDSLPackage.MODEL_OPERATION__MODELDELETE:
        return modeldelete != null;
      case MMDSLPackage.MODEL_OPERATION__MODELDISCARD:
        return modeldiscard != null;
      case MMDSLPackage.MODEL_OPERATION__MODELSAVE:
        return modelsave != null;
      case MMDSLPackage.MODEL_OPERATION__MODELLOAD:
        return modelload != null;
      case MMDSLPackage.MODEL_OPERATION__MODELISLOADED:
        return modelisloaded != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelOperationImpl
