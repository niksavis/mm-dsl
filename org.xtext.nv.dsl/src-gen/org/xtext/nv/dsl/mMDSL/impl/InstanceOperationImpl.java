/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ClassInstance;
import org.xtext.nv.dsl.mMDSL.InstanceOperation;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RelationInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.InstanceOperationImpl#getClassinstance <em>Classinstance</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.InstanceOperationImpl#getRelationinstance <em>Relationinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceOperationImpl extends MinimalEObjectImpl.Container implements InstanceOperation
{
  /**
   * The cached value of the '{@link #getClassinstance() <em>Classinstance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstance()
   * @generated
   * @ordered
   */
  protected ClassInstance classinstance;

  /**
   * The cached value of the '{@link #getRelationinstance() <em>Relationinstance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstance()
   * @generated
   * @ordered
   */
  protected RelationInstance relationinstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getInstanceOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstance getClassinstance()
  {
    return classinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstance(ClassInstance newClassinstance, NotificationChain msgs)
  {
    ClassInstance oldClassinstance = classinstance;
    classinstance = newClassinstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE, oldClassinstance, newClassinstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstance(ClassInstance newClassinstance)
  {
    if (newClassinstance != classinstance)
    {
      NotificationChain msgs = null;
      if (classinstance != null)
        msgs = ((InternalEObject)classinstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE, null, msgs);
      if (newClassinstance != null)
        msgs = ((InternalEObject)newClassinstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE, null, msgs);
      msgs = basicSetClassinstance(newClassinstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE, newClassinstance, newClassinstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstance getRelationinstance()
  {
    return relationinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstance(RelationInstance newRelationinstance, NotificationChain msgs)
  {
    RelationInstance oldRelationinstance = relationinstance;
    relationinstance = newRelationinstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE, oldRelationinstance, newRelationinstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstance(RelationInstance newRelationinstance)
  {
    if (newRelationinstance != relationinstance)
    {
      NotificationChain msgs = null;
      if (relationinstance != null)
        msgs = ((InternalEObject)relationinstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE, null, msgs);
      if (newRelationinstance != null)
        msgs = ((InternalEObject)newRelationinstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE, null, msgs);
      msgs = basicSetRelationinstance(newRelationinstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE, newRelationinstance, newRelationinstance));
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
      case MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE:
        return basicSetClassinstance(null, msgs);
      case MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE:
        return basicSetRelationinstance(null, msgs);
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
      case MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE:
        return getClassinstance();
      case MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE:
        return getRelationinstance();
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
      case MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE:
        setClassinstance((ClassInstance)newValue);
        return;
      case MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE:
        setRelationinstance((RelationInstance)newValue);
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
      case MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE:
        setClassinstance((ClassInstance)null);
        return;
      case MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE:
        setRelationinstance((RelationInstance)null);
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
      case MMDSLPackage.INSTANCE_OPERATION__CLASSINSTANCE:
        return classinstance != null;
      case MMDSLPackage.INSTANCE_OPERATION__RELATIONINSTANCE:
        return relationinstance != null;
    }
    return super.eIsSet(featureID);
  }

} //InstanceOperationImpl
