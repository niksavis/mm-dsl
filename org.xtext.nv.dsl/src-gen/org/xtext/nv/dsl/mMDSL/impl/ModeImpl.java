/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Mode;
import org.xtext.nv.dsl.mMDSL.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModeImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ModeImpl#getRelationname <em>Relationname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeImpl extends MinimalEObjectImpl.Container implements Mode
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeImpl()
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
    return MMDSLPackage.eINSTANCE.getMode();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.MODE__NAME, oldName, name));
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
      classname = new EObjectResolvingEList<org.xtext.nv.dsl.mMDSL.Class>(org.xtext.nv.dsl.mMDSL.Class.class, this, MMDSLPackage.MODE__CLASSNAME);
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
      relationname = new EObjectResolvingEList<Relation>(Relation.class, this, MMDSLPackage.MODE__RELATIONNAME);
    }
    return relationname;
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
      case MMDSLPackage.MODE__NAME:
        return getName();
      case MMDSLPackage.MODE__CLASSNAME:
        return getClassname();
      case MMDSLPackage.MODE__RELATIONNAME:
        return getRelationname();
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
      case MMDSLPackage.MODE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.MODE__CLASSNAME:
        getClassname().clear();
        getClassname().addAll((Collection<? extends org.xtext.nv.dsl.mMDSL.Class>)newValue);
        return;
      case MMDSLPackage.MODE__RELATIONNAME:
        getRelationname().clear();
        getRelationname().addAll((Collection<? extends Relation>)newValue);
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
      case MMDSLPackage.MODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.MODE__CLASSNAME:
        getClassname().clear();
        return;
      case MMDSLPackage.MODE__RELATIONNAME:
        getRelationname().clear();
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
      case MMDSLPackage.MODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.MODE__CLASSNAME:
        return classname != null && !classname.isEmpty();
      case MMDSLPackage.MODE__RELATIONNAME:
        return relationname != null && !relationname.isEmpty();
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

} //ModeImpl
