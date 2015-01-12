/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.OperatorAssign;
import org.xtext.nv.dsl.mMDSL.OperatorMultyAssign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAssignImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAssignImpl#getMultyassign <em>Multyassign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorAssignImpl extends MinimalEObjectImpl.Container implements OperatorAssign
{
  /**
   * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected static final String ASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected String assign = ASSIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getMultyassign() <em>Multyassign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultyassign()
   * @generated
   * @ordered
   */
  protected OperatorMultyAssign multyassign;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorAssignImpl()
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
    return MMDSLPackage.eINSTANCE.getOperatorAssign();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(String newAssign)
  {
    String oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_ASSIGN__ASSIGN, oldAssign, assign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorMultyAssign getMultyassign()
  {
    return multyassign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultyassign(OperatorMultyAssign newMultyassign, NotificationChain msgs)
  {
    OperatorMultyAssign oldMultyassign = multyassign;
    multyassign = newMultyassign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN, oldMultyassign, newMultyassign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultyassign(OperatorMultyAssign newMultyassign)
  {
    if (newMultyassign != multyassign)
    {
      NotificationChain msgs = null;
      if (multyassign != null)
        msgs = ((InternalEObject)multyassign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN, null, msgs);
      if (newMultyassign != null)
        msgs = ((InternalEObject)newMultyassign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN, null, msgs);
      msgs = basicSetMultyassign(newMultyassign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN, newMultyassign, newMultyassign));
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
      case MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN:
        return basicSetMultyassign(null, msgs);
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
      case MMDSLPackage.OPERATOR_ASSIGN__ASSIGN:
        return getAssign();
      case MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN:
        return getMultyassign();
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
      case MMDSLPackage.OPERATOR_ASSIGN__ASSIGN:
        setAssign((String)newValue);
        return;
      case MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN:
        setMultyassign((OperatorMultyAssign)newValue);
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
      case MMDSLPackage.OPERATOR_ASSIGN__ASSIGN:
        setAssign(ASSIGN_EDEFAULT);
        return;
      case MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN:
        setMultyassign((OperatorMultyAssign)null);
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
      case MMDSLPackage.OPERATOR_ASSIGN__ASSIGN:
        return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
      case MMDSLPackage.OPERATOR_ASSIGN__MULTYASSIGN:
        return multyassign != null;
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
    result.append(" (assign: ");
    result.append(assign);
    result.append(')');
    return result.toString();
  }

} //OperatorAssignImpl
