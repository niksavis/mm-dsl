/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Metamodel;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl#getModeltype <em>Modeltype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.nv.dsl.mMDSL.Class> class_;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected EList<Relation> relation;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attribute;

  /**
   * The cached value of the '{@link #getModeltype() <em>Modeltype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeltype()
   * @generated
   * @ordered
   */
  protected EList<ModelType> modeltype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelImpl()
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
    return MMDSLPackage.eINSTANCE.getMetamodel();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.nv.dsl.mMDSL.Class> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EObjectContainmentEList<org.xtext.nv.dsl.mMDSL.Class>(org.xtext.nv.dsl.mMDSL.Class.class, this, MMDSLPackage.METAMODEL__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelation()
  {
    if (relation == null)
    {
      relation = new EObjectContainmentEList<Relation>(Relation.class, this, MMDSLPackage.METAMODEL__RELATION);
    }
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, MMDSLPackage.METAMODEL__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelType> getModeltype()
  {
    if (modeltype == null)
    {
      modeltype = new EObjectContainmentEList<ModelType>(ModelType.class, this, MMDSLPackage.METAMODEL__MODELTYPE);
    }
    return modeltype;
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
      case MMDSLPackage.METAMODEL__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METAMODEL__RELATION:
        return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METAMODEL__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METAMODEL__MODELTYPE:
        return ((InternalEList<?>)getModeltype()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.METAMODEL__CLASS:
        return getClass_();
      case MMDSLPackage.METAMODEL__RELATION:
        return getRelation();
      case MMDSLPackage.METAMODEL__ATTRIBUTE:
        return getAttribute();
      case MMDSLPackage.METAMODEL__MODELTYPE:
        return getModeltype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MMDSLPackage.METAMODEL__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends org.xtext.nv.dsl.mMDSL.Class>)newValue);
        return;
      case MMDSLPackage.METAMODEL__RELATION:
        getRelation().clear();
        getRelation().addAll((Collection<? extends Relation>)newValue);
        return;
      case MMDSLPackage.METAMODEL__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
        return;
      case MMDSLPackage.METAMODEL__MODELTYPE:
        getModeltype().clear();
        getModeltype().addAll((Collection<? extends ModelType>)newValue);
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
      case MMDSLPackage.METAMODEL__CLASS:
        getClass_().clear();
        return;
      case MMDSLPackage.METAMODEL__RELATION:
        getRelation().clear();
        return;
      case MMDSLPackage.METAMODEL__ATTRIBUTE:
        getAttribute().clear();
        return;
      case MMDSLPackage.METAMODEL__MODELTYPE:
        getModeltype().clear();
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
      case MMDSLPackage.METAMODEL__CLASS:
        return class_ != null && !class_.isEmpty();
      case MMDSLPackage.METAMODEL__RELATION:
        return relation != null && !relation.isEmpty();
      case MMDSLPackage.METAMODEL__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case MMDSLPackage.METAMODEL__MODELTYPE:
        return modeltype != null && !modeltype.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MetamodelImpl
