/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate;
import org.xtext.nv.dsl.mMDSL.RelationInstanceDelete;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Instance Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceDeleteImpl#getNameofrelationinstance <em>Nameofrelationinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationInstanceDeleteImpl extends MinimalEObjectImpl.Container implements RelationInstanceDelete
{
  /**
   * The cached value of the '{@link #getNameofrelationinstance() <em>Nameofrelationinstance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofrelationinstance()
   * @generated
   * @ordered
   */
  protected RelationInstanceCreate nameofrelationinstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationInstanceDeleteImpl()
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
    return MMDSLPackage.eINSTANCE.getRelationInstanceDelete();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceCreate getNameofrelationinstance()
  {
    if (nameofrelationinstance != null && nameofrelationinstance.eIsProxy())
    {
      InternalEObject oldNameofrelationinstance = (InternalEObject)nameofrelationinstance;
      nameofrelationinstance = (RelationInstanceCreate)eResolveProxy(oldNameofrelationinstance);
      if (nameofrelationinstance != oldNameofrelationinstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE, oldNameofrelationinstance, nameofrelationinstance));
      }
    }
    return nameofrelationinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceCreate basicGetNameofrelationinstance()
  {
    return nameofrelationinstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameofrelationinstance(RelationInstanceCreate newNameofrelationinstance)
  {
    RelationInstanceCreate oldNameofrelationinstance = nameofrelationinstance;
    nameofrelationinstance = newNameofrelationinstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE, oldNameofrelationinstance, nameofrelationinstance));
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
      case MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE:
        if (resolve) return getNameofrelationinstance();
        return basicGetNameofrelationinstance();
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
      case MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE:
        setNameofrelationinstance((RelationInstanceCreate)newValue);
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
      case MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE:
        setNameofrelationinstance((RelationInstanceCreate)null);
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
      case MMDSLPackage.RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE:
        return nameofrelationinstance != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationInstanceDeleteImpl
