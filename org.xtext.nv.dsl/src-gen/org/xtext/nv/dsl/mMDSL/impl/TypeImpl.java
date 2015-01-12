/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.EnumType;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.SimpleType;
import org.xtext.nv.dsl.mMDSL.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TypeImpl#getSimpletype <em>Simpletype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TypeImpl#getEnumtype <em>Enumtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getSimpletype() <em>Simpletype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpletype()
   * @generated
   * @ordered
   */
  protected static final SimpleType SIMPLETYPE_EDEFAULT = SimpleType.STRING;

  /**
   * The cached value of the '{@link #getSimpletype() <em>Simpletype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpletype()
   * @generated
   * @ordered
   */
  protected SimpleType simpletype = SIMPLETYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumtype() <em>Enumtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumtype()
   * @generated
   * @ordered
   */
  protected EnumType enumtype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return MMDSLPackage.eINSTANCE.getType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType getSimpletype()
  {
    return simpletype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpletype(SimpleType newSimpletype)
  {
    SimpleType oldSimpletype = simpletype;
    simpletype = newSimpletype == null ? SIMPLETYPE_EDEFAULT : newSimpletype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TYPE__SIMPLETYPE, oldSimpletype, simpletype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType getEnumtype()
  {
    return enumtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumtype(EnumType newEnumtype, NotificationChain msgs)
  {
    EnumType oldEnumtype = enumtype;
    enumtype = newEnumtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.TYPE__ENUMTYPE, oldEnumtype, newEnumtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumtype(EnumType newEnumtype)
  {
    if (newEnumtype != enumtype)
    {
      NotificationChain msgs = null;
      if (enumtype != null)
        msgs = ((InternalEObject)enumtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TYPE__ENUMTYPE, null, msgs);
      if (newEnumtype != null)
        msgs = ((InternalEObject)newEnumtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TYPE__ENUMTYPE, null, msgs);
      msgs = basicSetEnumtype(newEnumtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TYPE__ENUMTYPE, newEnumtype, newEnumtype));
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
      case MMDSLPackage.TYPE__ENUMTYPE:
        return basicSetEnumtype(null, msgs);
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
      case MMDSLPackage.TYPE__SIMPLETYPE:
        return getSimpletype();
      case MMDSLPackage.TYPE__ENUMTYPE:
        return getEnumtype();
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
      case MMDSLPackage.TYPE__SIMPLETYPE:
        setSimpletype((SimpleType)newValue);
        return;
      case MMDSLPackage.TYPE__ENUMTYPE:
        setEnumtype((EnumType)newValue);
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
      case MMDSLPackage.TYPE__SIMPLETYPE:
        setSimpletype(SIMPLETYPE_EDEFAULT);
        return;
      case MMDSLPackage.TYPE__ENUMTYPE:
        setEnumtype((EnumType)null);
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
      case MMDSLPackage.TYPE__SIMPLETYPE:
        return simpletype != SIMPLETYPE_EDEFAULT;
      case MMDSLPackage.TYPE__ENUMTYPE:
        return enumtype != null;
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
    result.append(" (simpletype: ");
    result.append(simpletype);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
