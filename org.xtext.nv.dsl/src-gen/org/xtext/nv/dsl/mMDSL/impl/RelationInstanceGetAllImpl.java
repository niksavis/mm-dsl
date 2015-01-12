/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Relation;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Instance Get All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceGetAllImpl#getNameofrelation <em>Nameofrelation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationInstanceGetAllImpl extends MinimalEObjectImpl.Container implements RelationInstanceGetAll
{
  /**
   * The cached value of the '{@link #getNameofrelation() <em>Nameofrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofrelation()
   * @generated
   * @ordered
   */
  protected Relation nameofrelation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationInstanceGetAllImpl()
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
    return MMDSLPackage.eINSTANCE.getRelationInstanceGetAll();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation getNameofrelation()
  {
    if (nameofrelation != null && nameofrelation.eIsProxy())
    {
      InternalEObject oldNameofrelation = (InternalEObject)nameofrelation;
      nameofrelation = (Relation)eResolveProxy(oldNameofrelation);
      if (nameofrelation != oldNameofrelation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION, oldNameofrelation, nameofrelation));
      }
    }
    return nameofrelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation basicGetNameofrelation()
  {
    return nameofrelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameofrelation(Relation newNameofrelation)
  {
    Relation oldNameofrelation = nameofrelation;
    nameofrelation = newNameofrelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION, oldNameofrelation, nameofrelation));
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
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION:
        if (resolve) return getNameofrelation();
        return basicGetNameofrelation();
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
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION:
        setNameofrelation((Relation)newValue);
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
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION:
        setNameofrelation((Relation)null);
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
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL__NAMEOFRELATION:
        return nameofrelation != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationInstanceGetAllImpl
