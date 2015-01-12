/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorEqual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorEqualImpl#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorEqualImpl#getNotequal <em>Notequal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorEqualImpl extends MinimalEObjectImpl.Container implements OperatorEqual
{
  /**
   * The default value of the '{@link #getEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqual()
   * @generated
   * @ordered
   */
  protected static final String EQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqual()
   * @generated
   * @ordered
   */
  protected String equal = EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getNotequal() <em>Notequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotequal()
   * @generated
   * @ordered
   */
  protected static final String NOTEQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNotequal() <em>Notequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotequal()
   * @generated
   * @ordered
   */
  protected String notequal = NOTEQUAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorEqualImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorEqual();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEqual()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqual(String newEqual)
  {
    String oldEqual = equal;
    equal = newEqual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_EQUAL__EQUAL, oldEqual, equal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNotequal()
  {
    return notequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotequal(String newNotequal)
  {
    String oldNotequal = notequal;
    notequal = newNotequal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_EQUAL__NOTEQUAL, oldNotequal, notequal));
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
      case MMDSLPackage.OPERATOR_EQUAL__EQUAL:
        return getEqual();
      case MMDSLPackage.OPERATOR_EQUAL__NOTEQUAL:
        return getNotequal();
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
      case MMDSLPackage.OPERATOR_EQUAL__EQUAL:
        setEqual((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_EQUAL__NOTEQUAL:
        setNotequal((String)newValue);
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
      case MMDSLPackage.OPERATOR_EQUAL__EQUAL:
        setEqual(EQUAL_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_EQUAL__NOTEQUAL:
        setNotequal(NOTEQUAL_EDEFAULT);
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
      case MMDSLPackage.OPERATOR_EQUAL__EQUAL:
        return EQUAL_EDEFAULT == null ? equal != null : !EQUAL_EDEFAULT.equals(equal);
      case MMDSLPackage.OPERATOR_EQUAL__NOTEQUAL:
        return NOTEQUAL_EDEFAULT == null ? notequal != null : !NOTEQUAL_EDEFAULT.equals(notequal);
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
    result.append(" (equal: ");
    result.append(equal);
    result.append(", notequal: ");
    result.append(notequal);
    result.append(')');
    return result.toString();
  }

} //OperatorEqualImpl
