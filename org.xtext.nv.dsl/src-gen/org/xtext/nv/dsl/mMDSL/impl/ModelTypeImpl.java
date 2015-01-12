/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Mode;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl#getRelationname <em>Relationname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl#getModename <em>Modename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends MinimalEObjectImpl.Container implements ModelType
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
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.nv.dsl.mMDSL.Class> classname;

  /**
   * The cached value of the '{@link #getRelationname() <em>Relationname</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationname()
   * @generated
   * @ordered
   */
  protected EList<Relation> relationname;

  /**
   * The cached value of the '{@link #getModename() <em>Modename</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModename()
   * @generated
   * @ordered
   */
  protected EList<Mode> modename;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelTypeImpl()
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
    return MMDSLPackage.eINSTANCE.getModelType();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODEL_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.nv.dsl.mMDSL.Class> getClassname()
  {
    if (classname == null)
    {
      classname = new EObjectResolvingEList<org.xtext.nv.dsl.mMDSL.Class>(org.xtext.nv.dsl.mMDSL.Class.class, this, MMDSLPackage.MODEL_TYPE__CLASSNAME);
    }
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelationname()
  {
    if (relationname == null)
    {
      relationname = new EObjectResolvingEList<Relation>(Relation.class, this, MMDSLPackage.MODEL_TYPE__RELATIONNAME);
    }
    return relationname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mode> getModename()
  {
    if (modename == null)
    {
      modename = new EObjectContainmentEList<Mode>(Mode.class, this, MMDSLPackage.MODEL_TYPE__MODENAME);
    }
    return modename;
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
      case MMDSLPackage.MODEL_TYPE__MODENAME:
        return ((InternalEList<?>)getModename()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.MODEL_TYPE__NAME:
        return getName();
      case MMDSLPackage.MODEL_TYPE__CLASSNAME:
        return getClassname();
      case MMDSLPackage.MODEL_TYPE__RELATIONNAME:
        return getRelationname();
      case MMDSLPackage.MODEL_TYPE__MODENAME:
        return getModename();
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
      case MMDSLPackage.MODEL_TYPE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.MODEL_TYPE__CLASSNAME:
        getClassname().clear();
        getClassname().addAll((Collection<? extends org.xtext.nv.dsl.mMDSL.Class>)newValue);
        return;
      case MMDSLPackage.MODEL_TYPE__RELATIONNAME:
        getRelationname().clear();
        getRelationname().addAll((Collection<? extends Relation>)newValue);
        return;
      case MMDSLPackage.MODEL_TYPE__MODENAME:
        getModename().clear();
        getModename().addAll((Collection<? extends Mode>)newValue);
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
      case MMDSLPackage.MODEL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.MODEL_TYPE__CLASSNAME:
        getClassname().clear();
        return;
      case MMDSLPackage.MODEL_TYPE__RELATIONNAME:
        getRelationname().clear();
        return;
      case MMDSLPackage.MODEL_TYPE__MODENAME:
        getModename().clear();
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
      case MMDSLPackage.MODEL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.MODEL_TYPE__CLASSNAME:
        return classname != null && !classname.isEmpty();
      case MMDSLPackage.MODEL_TYPE__RELATIONNAME:
        return relationname != null && !relationname.isEmpty();
      case MMDSLPackage.MODEL_TYPE__MODENAME:
        return modename != null && !modename.isEmpty();
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

} //ModelTypeImpl
