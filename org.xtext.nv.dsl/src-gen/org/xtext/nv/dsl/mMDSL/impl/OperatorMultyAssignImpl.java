/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorMultyAssign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Multy Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl#getAddassign <em>Addassign</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl#getSubassign <em>Subassign</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl#getMultiassign <em>Multiassign</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl#getDivassign <em>Divassign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorMultyAssignImpl extends MinimalEObjectImpl.Container implements OperatorMultyAssign
{
  /**
   * The default value of the '{@link #getAddassign() <em>Addassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddassign()
   * @generated
   * @ordered
   */
  protected static final String ADDASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddassign() <em>Addassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddassign()
   * @generated
   * @ordered
   */
  protected String addassign = ADDASSIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getSubassign() <em>Subassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubassign()
   * @generated
   * @ordered
   */
  protected static final String SUBASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubassign() <em>Subassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubassign()
   * @generated
   * @ordered
   */
  protected String subassign = SUBASSIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiassign() <em>Multiassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiassign()
   * @generated
   * @ordered
   */
  protected static final String MULTIASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiassign() <em>Multiassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiassign()
   * @generated
   * @ordered
   */
  protected String multiassign = MULTIASSIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getDivassign() <em>Divassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivassign()
   * @generated
   * @ordered
   */
  protected static final String DIVASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDivassign() <em>Divassign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivassign()
   * @generated
   * @ordered
   */
  protected String divassign = DIVASSIGN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorMultyAssignImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorMultyAssign();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddassign()
  {
    return addassign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddassign(String newAddassign)
  {
    String oldAddassign = addassign;
    addassign = newAddassign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTY_ASSIGN__ADDASSIGN, oldAddassign, addassign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubassign()
  {
    return subassign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubassign(String newSubassign)
  {
    String oldSubassign = subassign;
    subassign = newSubassign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTY_ASSIGN__SUBASSIGN, oldSubassign, subassign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiassign()
  {
    return multiassign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiassign(String newMultiassign)
  {
    String oldMultiassign = multiassign;
    multiassign = newMultiassign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTY_ASSIGN__MULTIASSIGN, oldMultiassign, multiassign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDivassign()
  {
    return divassign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDivassign(String newDivassign)
  {
    String oldDivassign = divassign;
    divassign = newDivassign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_MULTY_ASSIGN__DIVASSIGN, oldDivassign, divassign));
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
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__ADDASSIGN:
        return getAddassign();
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__SUBASSIGN:
        return getSubassign();
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__MULTIASSIGN:
        return getMultiassign();
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__DIVASSIGN:
        return getDivassign();
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
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__ADDASSIGN:
        setAddassign((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__SUBASSIGN:
        setSubassign((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__MULTIASSIGN:
        setMultiassign((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__DIVASSIGN:
        setDivassign((String)newValue);
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
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__ADDASSIGN:
        setAddassign(ADDASSIGN_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__SUBASSIGN:
        setSubassign(SUBASSIGN_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__MULTIASSIGN:
        setMultiassign(MULTIASSIGN_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__DIVASSIGN:
        setDivassign(DIVASSIGN_EDEFAULT);
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
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__ADDASSIGN:
        return ADDASSIGN_EDEFAULT == null ? addassign != null : !ADDASSIGN_EDEFAULT.equals(addassign);
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__SUBASSIGN:
        return SUBASSIGN_EDEFAULT == null ? subassign != null : !SUBASSIGN_EDEFAULT.equals(subassign);
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__MULTIASSIGN:
        return MULTIASSIGN_EDEFAULT == null ? multiassign != null : !MULTIASSIGN_EDEFAULT.equals(multiassign);
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN__DIVASSIGN:
        return DIVASSIGN_EDEFAULT == null ? divassign != null : !DIVASSIGN_EDEFAULT.equals(divassign);
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
    result.append(" (addassign: ");
    result.append(addassign);
    result.append(", subassign: ");
    result.append(subassign);
    result.append(", multiassign: ");
    result.append(multiassign);
    result.append(", divassign: ");
    result.append(divassign);
    result.append(')');
    return result.toString();
  }

} //OperatorMultyAssignImpl
