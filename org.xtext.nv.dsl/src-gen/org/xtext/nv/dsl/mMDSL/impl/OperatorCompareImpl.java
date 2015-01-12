/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorCompare;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl#getGreaterequal <em>Greaterequal</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl#getLesserequal <em>Lesserequal</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl#getLesser <em>Lesser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorCompareImpl extends MinimalEObjectImpl.Container implements OperatorCompare
{
  /**
   * The default value of the '{@link #getGreaterequal() <em>Greaterequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreaterequal()
   * @generated
   * @ordered
   */
  protected static final String GREATEREQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGreaterequal() <em>Greaterequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreaterequal()
   * @generated
   * @ordered
   */
  protected String greaterequal = GREATEREQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getLesserequal() <em>Lesserequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLesserequal()
   * @generated
   * @ordered
   */
  protected static final String LESSEREQUAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLesserequal() <em>Lesserequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLesserequal()
   * @generated
   * @ordered
   */
  protected String lesserequal = LESSEREQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #getGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreater()
   * @generated
   * @ordered
   */
  protected static final String GREATER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreater()
   * @generated
   * @ordered
   */
  protected String greater = GREATER_EDEFAULT;

  /**
   * The default value of the '{@link #getLesser() <em>Lesser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLesser()
   * @generated
   * @ordered
   */
  protected static final String LESSER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLesser() <em>Lesser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLesser()
   * @generated
   * @ordered
   */
  protected String lesser = LESSER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorCompareImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorCompare();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGreaterequal()
  {
    return greaterequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreaterequal(String newGreaterequal)
  {
    String oldGreaterequal = greaterequal;
    greaterequal = newGreaterequal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_COMPARE__GREATEREQUAL, oldGreaterequal, greaterequal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLesserequal()
  {
    return lesserequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLesserequal(String newLesserequal)
  {
    String oldLesserequal = lesserequal;
    lesserequal = newLesserequal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_COMPARE__LESSEREQUAL, oldLesserequal, lesserequal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGreater()
  {
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreater(String newGreater)
  {
    String oldGreater = greater;
    greater = newGreater;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_COMPARE__GREATER, oldGreater, greater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLesser()
  {
    return lesser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLesser(String newLesser)
  {
    String oldLesser = lesser;
    lesser = newLesser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_COMPARE__LESSER, oldLesser, lesser));
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
      case MMDSLPackage.OPERATOR_COMPARE__GREATEREQUAL:
        return getGreaterequal();
      case MMDSLPackage.OPERATOR_COMPARE__LESSEREQUAL:
        return getLesserequal();
      case MMDSLPackage.OPERATOR_COMPARE__GREATER:
        return getGreater();
      case MMDSLPackage.OPERATOR_COMPARE__LESSER:
        return getLesser();
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
      case MMDSLPackage.OPERATOR_COMPARE__GREATEREQUAL:
        setGreaterequal((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__LESSEREQUAL:
        setLesserequal((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__GREATER:
        setGreater((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__LESSER:
        setLesser((String)newValue);
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
      case MMDSLPackage.OPERATOR_COMPARE__GREATEREQUAL:
        setGreaterequal(GREATEREQUAL_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__LESSEREQUAL:
        setLesserequal(LESSEREQUAL_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__GREATER:
        setGreater(GREATER_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_COMPARE__LESSER:
        setLesser(LESSER_EDEFAULT);
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
      case MMDSLPackage.OPERATOR_COMPARE__GREATEREQUAL:
        return GREATEREQUAL_EDEFAULT == null ? greaterequal != null : !GREATEREQUAL_EDEFAULT.equals(greaterequal);
      case MMDSLPackage.OPERATOR_COMPARE__LESSEREQUAL:
        return LESSEREQUAL_EDEFAULT == null ? lesserequal != null : !LESSEREQUAL_EDEFAULT.equals(lesserequal);
      case MMDSLPackage.OPERATOR_COMPARE__GREATER:
        return GREATER_EDEFAULT == null ? greater != null : !GREATER_EDEFAULT.equals(greater);
      case MMDSLPackage.OPERATOR_COMPARE__LESSER:
        return LESSER_EDEFAULT == null ? lesser != null : !LESSER_EDEFAULT.equals(lesser);
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
    result.append(" (greaterequal: ");
    result.append(greaterequal);
    result.append(", lesserequal: ");
    result.append(lesserequal);
    result.append(", greater: ");
    result.append(greater);
    result.append(", lesser: ");
    result.append(lesser);
    result.append(')');
    return result.toString();
  }

} //OperatorCompareImpl
