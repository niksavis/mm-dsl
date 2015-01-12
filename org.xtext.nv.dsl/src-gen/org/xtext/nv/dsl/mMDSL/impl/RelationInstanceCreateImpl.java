/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Relation;
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Instance Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl#getNameofrelation <em>Nameofrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl#getClassinstancefrom <em>Classinstancefrom</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl#getClassinstanceto <em>Classinstanceto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationInstanceCreateImpl extends MinimalEObjectImpl.Container implements RelationInstanceCreate
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getClassinstancefrom() <em>Classinstancefrom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstancefrom()
   * @generated
   * @ordered
   */
  protected ClassInstanceCreate classinstancefrom;

  /**
   * The cached value of the '{@link #getClassinstanceto() <em>Classinstanceto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstanceto()
   * @generated
   * @ordered
   */
  protected ClassInstanceCreate classinstanceto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationInstanceCreateImpl()
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
    return MMDSLPackage.eINSTANCE.getRelationInstanceCreate();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_CREATE__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION, oldNameofrelation, nameofrelation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION, oldNameofrelation, nameofrelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate getClassinstancefrom()
  {
    if (classinstancefrom != null && classinstancefrom.eIsProxy())
    {
      InternalEObject oldClassinstancefrom = (InternalEObject)classinstancefrom;
      classinstancefrom = (ClassInstanceCreate)eResolveProxy(oldClassinstancefrom);
      if (classinstancefrom != oldClassinstancefrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM, oldClassinstancefrom, classinstancefrom));
      }
    }
    return classinstancefrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate basicGetClassinstancefrom()
  {
    return classinstancefrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstancefrom(ClassInstanceCreate newClassinstancefrom)
  {
    ClassInstanceCreate oldClassinstancefrom = classinstancefrom;
    classinstancefrom = newClassinstancefrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM, oldClassinstancefrom, classinstancefrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate getClassinstanceto()
  {
    if (classinstanceto != null && classinstanceto.eIsProxy())
    {
      InternalEObject oldClassinstanceto = (InternalEObject)classinstanceto;
      classinstanceto = (ClassInstanceCreate)eResolveProxy(oldClassinstanceto);
      if (classinstanceto != oldClassinstanceto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO, oldClassinstanceto, classinstanceto));
      }
    }
    return classinstanceto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate basicGetClassinstanceto()
  {
    return classinstanceto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstanceto(ClassInstanceCreate newClassinstanceto)
  {
    ClassInstanceCreate oldClassinstanceto = classinstanceto;
    classinstanceto = newClassinstanceto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO, oldClassinstanceto, classinstanceto));
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
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAME:
        return getName();
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION:
        if (resolve) return getNameofrelation();
        return basicGetNameofrelation();
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM:
        if (resolve) return getClassinstancefrom();
        return basicGetClassinstancefrom();
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO:
        if (resolve) return getClassinstanceto();
        return basicGetClassinstanceto();
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
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION:
        setNameofrelation((Relation)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM:
        setClassinstancefrom((ClassInstanceCreate)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO:
        setClassinstanceto((ClassInstanceCreate)newValue);
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
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION:
        setNameofrelation((Relation)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM:
        setClassinstancefrom((ClassInstanceCreate)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO:
        setClassinstanceto((ClassInstanceCreate)null);
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
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.RELATION_INSTANCE_CREATE__NAMEOFRELATION:
        return nameofrelation != null;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM:
        return classinstancefrom != null;
      case MMDSLPackage.RELATION_INSTANCE_CREATE__CLASSINSTANCETO:
        return classinstanceto != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RelationInstanceCreateImpl
