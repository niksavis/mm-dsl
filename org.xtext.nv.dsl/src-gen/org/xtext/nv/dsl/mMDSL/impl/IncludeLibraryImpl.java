/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.IncludeLibrary;
import org.xtext.nv.dsl.mMDSL.IncludeLibraryType;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryImpl#getIncludelibrarytype <em>Includelibrarytype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeLibraryImpl extends MinimalEObjectImpl.Container implements IncludeLibrary
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
   * The cached value of the '{@link #getIncludelibrarytype() <em>Includelibrarytype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludelibrarytype()
   * @generated
   * @ordered
   */
  protected IncludeLibraryType includelibrarytype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludeLibraryImpl()
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
    return MMDSLPackage.eINSTANCE.getIncludeLibrary();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.INCLUDE_LIBRARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeLibraryType getIncludelibrarytype()
  {
    if (includelibrarytype != null && includelibrarytype.eIsProxy())
    {
      InternalEObject oldIncludelibrarytype = (InternalEObject)includelibrarytype;
      includelibrarytype = (IncludeLibraryType)eResolveProxy(oldIncludelibrarytype);
      if (includelibrarytype != oldIncludelibrarytype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE, oldIncludelibrarytype, includelibrarytype));
      }
    }
    return includelibrarytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeLibraryType basicGetIncludelibrarytype()
  {
    return includelibrarytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludelibrarytype(IncludeLibraryType newIncludelibrarytype)
  {
    IncludeLibraryType oldIncludelibrarytype = includelibrarytype;
    includelibrarytype = newIncludelibrarytype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE, oldIncludelibrarytype, includelibrarytype));
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
      case MMDSLPackage.INCLUDE_LIBRARY__NAME:
        return getName();
      case MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE:
        if (resolve) return getIncludelibrarytype();
        return basicGetIncludelibrarytype();
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
      case MMDSLPackage.INCLUDE_LIBRARY__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE:
        setIncludelibrarytype((IncludeLibraryType)newValue);
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
      case MMDSLPackage.INCLUDE_LIBRARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE:
        setIncludelibrarytype((IncludeLibraryType)null);
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
      case MMDSLPackage.INCLUDE_LIBRARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.INCLUDE_LIBRARY__INCLUDELIBRARYTYPE:
        return includelibrarytype != null;
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

} //IncludeLibraryImpl
