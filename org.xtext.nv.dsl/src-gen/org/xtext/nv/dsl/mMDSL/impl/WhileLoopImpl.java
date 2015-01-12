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
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nv.dsl.mMDSL.BreakContinue;
import org.xtext.nv.dsl.mMDSL.Expr;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Statement;
import org.xtext.nv.dsl.mMDSL.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WhileLoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WhileLoopImpl#getWhileblock <em>Whileblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WhileLoopImpl#getBreakcontinue <em>Breakcontinue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileLoopImpl extends MinimalEObjectImpl.Container implements WhileLoop
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expr condition;

  /**
   * The cached value of the '{@link #getWhileblock() <em>Whileblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileblock()
   * @generated
   * @ordered
   */
  protected EList<Statement> whileblock;

  /**
   * The cached value of the '{@link #getBreakcontinue() <em>Breakcontinue</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreakcontinue()
   * @generated
   * @ordered
   */
  protected EList<BreakContinue> breakcontinue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileLoopImpl()
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
    return MMDSLPackage.eINSTANCE.getWhileLoop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expr newCondition, NotificationChain msgs)
  {
    Expr oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.WHILE_LOOP__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expr newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.WHILE_LOOP__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.WHILE_LOOP__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.WHILE_LOOP__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getWhileblock()
  {
    if (whileblock == null)
    {
      whileblock = new EObjectContainmentEList<Statement>(Statement.class, this, MMDSLPackage.WHILE_LOOP__WHILEBLOCK);
    }
    return whileblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BreakContinue> getBreakcontinue()
  {
    if (breakcontinue == null)
    {
      breakcontinue = new EObjectContainmentEList<BreakContinue>(BreakContinue.class, this, MMDSLPackage.WHILE_LOOP__BREAKCONTINUE);
    }
    return breakcontinue;
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
      case MMDSLPackage.WHILE_LOOP__CONDITION:
        return basicSetCondition(null, msgs);
      case MMDSLPackage.WHILE_LOOP__WHILEBLOCK:
        return ((InternalEList<?>)getWhileblock()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.WHILE_LOOP__BREAKCONTINUE:
        return ((InternalEList<?>)getBreakcontinue()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.WHILE_LOOP__CONDITION:
        return getCondition();
      case MMDSLPackage.WHILE_LOOP__WHILEBLOCK:
        return getWhileblock();
      case MMDSLPackage.WHILE_LOOP__BREAKCONTINUE:
        return getBreakcontinue();
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
      case MMDSLPackage.WHILE_LOOP__CONDITION:
        setCondition((Expr)newValue);
        return;
      case MMDSLPackage.WHILE_LOOP__WHILEBLOCK:
        getWhileblock().clear();
        getWhileblock().addAll((Collection<? extends Statement>)newValue);
        return;
      case MMDSLPackage.WHILE_LOOP__BREAKCONTINUE:
        getBreakcontinue().clear();
        getBreakcontinue().addAll((Collection<? extends BreakContinue>)newValue);
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
      case MMDSLPackage.WHILE_LOOP__CONDITION:
        setCondition((Expr)null);
        return;
      case MMDSLPackage.WHILE_LOOP__WHILEBLOCK:
        getWhileblock().clear();
        return;
      case MMDSLPackage.WHILE_LOOP__BREAKCONTINUE:
        getBreakcontinue().clear();
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
      case MMDSLPackage.WHILE_LOOP__CONDITION:
        return condition != null;
      case MMDSLPackage.WHILE_LOOP__WHILEBLOCK:
        return whileblock != null && !whileblock.isEmpty();
      case MMDSLPackage.WHILE_LOOP__BREAKCONTINUE:
        return breakcontinue != null && !breakcontinue.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhileLoopImpl
