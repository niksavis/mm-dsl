/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorMultiply;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Multiply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultiplyImpl#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultiplyImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultiplyImpl#getModulo <em>Modulo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorMultiplyImpl extends MinimalEObjectImpl.Container implements OperatorMultiply
{
  /**
   * The default value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected String multiply = MULTIPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getDivide() <em>Divide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivide()
   * @generated
   * @ordered
   */
  protected static final String DIVIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDivide() <em>Divide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivide()
   * @generated
   * @ordered
   */
  protected String divide = DIVIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getModulo() <em>Modulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModulo()
   * @generated
   * @ordered
   */
  protected static final String MODULO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModulo() <em>Modulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModulo()
   * @generated
   * @ordered
   */
  protected String modulo = MODULO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorMultiplyImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorMultiply();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiply()
  {
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiply(String newMultiply)
  {
    String oldMultiply = multiply;
    multiply = newMultiply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTIPLY__MULTIPLY, oldMultiply, multiply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDivide()
  {
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDivide(String newDivide)
  {
    String oldDivide = divide;
    divide = newDivide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTIPLY__DIVIDE, oldDivide, divide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModulo()
  {
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModulo(String newModulo)
  {
    String oldModulo = modulo;
    modulo = newModulo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTIPLY__MODULO, oldModulo, modulo));
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
      case MMDSLPackage.OPERATOR_MULTIPLY__MULTIPLY:
        return getMultiply();
      case MMDSLPackage.OPERATOR_MULTIPLY__DIVIDE:
        return getDivide();
      case MMDSLPackage.OPERATOR_MULTIPLY__MODULO:
        return getModulo();
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
      case MMDSLPackage.OPERATOR_MULTIPLY__MULTIPLY:
        setMultiply((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_MULTIPLY__DIVIDE:
        setDivide((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_MULTIPLY__MODULO:
        setModulo((String)newValue);
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
      case MMDSLPackage.OPERATOR_MULTIPLY__MULTIPLY:
        setMultiply(MULTIPLY_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_MULTIPLY__DIVIDE:
        setDivide(DIVIDE_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_MULTIPLY__MODULO:
        setModulo(MODULO_EDEFAULT);
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
      case MMDSLPackage.OPERATOR_MULTIPLY__MULTIPLY:
        return MULTIPLY_EDEFAULT == null ? multiply != null : !MULTIPLY_EDEFAULT.equals(multiply);
      case MMDSLPackage.OPERATOR_MULTIPLY__DIVIDE:
        return DIVIDE_EDEFAULT == null ? divide != null : !DIVIDE_EDEFAULT.equals(divide);
      case MMDSLPackage.OPERATOR_MULTIPLY__MODULO:
        return MODULO_EDEFAULT == null ? modulo != null : !MODULO_EDEFAULT.equals(modulo);
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
    result.append(" (multiply: ");
    result.append(multiply);
    result.append(", divide: ");
    result.append(divide);
    result.append(", modulo: ");
    result.append(modulo);
    result.append(')');
    return result.toString();
  }

} //OperatorMultiplyImpl
