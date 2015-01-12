/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorAdd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAddImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAddImpl#getSubtract <em>Subtract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorAddImpl extends MinimalEObjectImpl.Container implements OperatorAdd
{
  /**
   * The default value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected static final String ADD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected String add = ADD_EDEFAULT;

  /**
   * The default value of the '{@link #getSubtract() <em>Subtract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtract()
   * @generated
   * @ordered
   */
  protected static final String SUBTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubtract() <em>Subtract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtract()
   * @generated
   * @ordered
   */
  protected String subtract = SUBTRACT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorAddImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorAdd();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdd()
  {
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdd(String newAdd)
  {
    String oldAdd = add;
    add = newAdd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_ADD__ADD, oldAdd, add));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubtract()
  {
    return subtract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtract(String newSubtract)
  {
    String oldSubtract = subtract;
    subtract = newSubtract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_ADD__SUBTRACT, oldSubtract, subtract));
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
      case MMDSLPackage.OPERATOR_ADD__ADD:
        return getAdd();
      case MMDSLPackage.OPERATOR_ADD__SUBTRACT:
        return getSubtract();
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
      case MMDSLPackage.OPERATOR_ADD__ADD:
        setAdd((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_ADD__SUBTRACT:
        setSubtract((String)newValue);
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
      case MMDSLPackage.OPERATOR_ADD__ADD:
        setAdd(ADD_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_ADD__SUBTRACT:
        setSubtract(SUBTRACT_EDEFAULT);
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
      case MMDSLPackage.OPERATOR_ADD__ADD:
        return ADD_EDEFAULT == null ? add != null : !ADD_EDEFAULT.equals(add);
      case MMDSLPackage.OPERATOR_ADD__SUBTRACT:
        return SUBTRACT_EDEFAULT == null ? subtract != null : !SUBTRACT_EDEFAULT.equals(subtract);
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
    result.append(" (add: ");
    result.append(add);
    result.append(", subtract: ");
    result.append(subtract);
    result.append(')');
    return result.toString();
  }

} //OperatorAddImpl
