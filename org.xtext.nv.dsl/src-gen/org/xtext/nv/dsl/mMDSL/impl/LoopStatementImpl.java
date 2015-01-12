/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ForLoop;
import org.xtext.nv.dsl.mMDSL.LoopStatement;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.LoopStatementImpl#getWhiletloop <em>Whiletloop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.LoopStatementImpl#getForloop <em>Forloop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopStatementImpl extends MinimalEObjectImpl.Container implements LoopStatement
{
  /**
   * The cached value of the '{@link #getWhiletloop() <em>Whiletloop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhiletloop()
   * @generated
   * @ordered
   */
  protected WhileLoop whiletloop;

  /**
   * The cached value of the '{@link #getForloop() <em>Forloop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForloop()
   * @generated
   * @ordered
   */
  protected ForLoop forloop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopStatementImpl()
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
    return MMDSLPackage.eINSTANCE.getLoopStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileLoop getWhiletloop()
  {
    return whiletloop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhiletloop(WhileLoop newWhiletloop, NotificationChain msgs)
  {
    WhileLoop oldWhiletloop = whiletloop;
    whiletloop = newWhiletloop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.LOOP_STATEMENT__WHILETLOOP, oldWhiletloop, newWhiletloop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhiletloop(WhileLoop newWhiletloop)
  {
    if (newWhiletloop != whiletloop)
    {
      NotificationChain msgs = null;
      if (whiletloop != null)
        msgs = ((InternalEObject)whiletloop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.LOOP_STATEMENT__WHILETLOOP, null, msgs);
      if (newWhiletloop != null)
        msgs = ((InternalEObject)newWhiletloop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.LOOP_STATEMENT__WHILETLOOP, null, msgs);
      msgs = basicSetWhiletloop(newWhiletloop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.LOOP_STATEMENT__WHILETLOOP, newWhiletloop, newWhiletloop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoop getForloop()
  {
    return forloop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForloop(ForLoop newForloop, NotificationChain msgs)
  {
    ForLoop oldForloop = forloop;
    forloop = newForloop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.LOOP_STATEMENT__FORLOOP, oldForloop, newForloop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForloop(ForLoop newForloop)
  {
    if (newForloop != forloop)
    {
      NotificationChain msgs = null;
      if (forloop != null)
        msgs = ((InternalEObject)forloop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.LOOP_STATEMENT__FORLOOP, null, msgs);
      if (newForloop != null)
        msgs = ((InternalEObject)newForloop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.LOOP_STATEMENT__FORLOOP, null, msgs);
      msgs = basicSetForloop(newForloop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.LOOP_STATEMENT__FORLOOP, newForloop, newForloop));
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
      case MMDSLPackage.LOOP_STATEMENT__WHILETLOOP:
        return basicSetWhiletloop(null, msgs);
      case MMDSLPackage.LOOP_STATEMENT__FORLOOP:
        return basicSetForloop(null, msgs);
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
      case MMDSLPackage.LOOP_STATEMENT__WHILETLOOP:
        return getWhiletloop();
      case MMDSLPackage.LOOP_STATEMENT__FORLOOP:
        return getForloop();
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
      case MMDSLPackage.LOOP_STATEMENT__WHILETLOOP:
        setWhiletloop((WhileLoop)newValue);
        return;
      case MMDSLPackage.LOOP_STATEMENT__FORLOOP:
        setForloop((ForLoop)newValue);
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
      case MMDSLPackage.LOOP_STATEMENT__WHILETLOOP:
        setWhiletloop((WhileLoop)null);
        return;
      case MMDSLPackage.LOOP_STATEMENT__FORLOOP:
        setForloop((ForLoop)null);
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
      case MMDSLPackage.LOOP_STATEMENT__WHILETLOOP:
        return whiletloop != null;
      case MMDSLPackage.LOOP_STATEMENT__FORLOOP:
        return forloop != null;
    }
    return super.eIsSet(featureID);
  }

} //LoopStatementImpl
