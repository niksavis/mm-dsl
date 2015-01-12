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

import org.xtext.nv.dsl.mMDSL.Expr;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.SelectionStatement;
import org.xtext.nv.dsl.mMDSL.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl#getIfcondition <em>Ifcondition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl#getIfblock <em>Ifblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl#getElseifcondition <em>Elseifcondition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl#getElseifblock <em>Elseifblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl#getElseblock <em>Elseblock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionStatementImpl extends MinimalEObjectImpl.Container implements SelectionStatement
{
  /**
   * The cached value of the '{@link #getIfcondition() <em>Ifcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfcondition()
   * @generated
   * @ordered
   */
  protected Expr ifcondition;

  /**
   * The cached value of the '{@link #getIfblock() <em>Ifblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfblock()
   * @generated
   * @ordered
   */
  protected EList<Statement> ifblock;

  /**
   * The cached value of the '{@link #getElseifcondition() <em>Elseifcondition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseifcondition()
   * @generated
   * @ordered
   */
  protected EList<Expr> elseifcondition;

  /**
   * The cached value of the '{@link #getElseifblock() <em>Elseifblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseifblock()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseifblock;

  /**
   * The cached value of the '{@link #getElseblock() <em>Elseblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseblock()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseblock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionStatementImpl()
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
    return MMDSLPackage.eINSTANCE.getSelectionStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getIfcondition()
  {
    return ifcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfcondition(Expr newIfcondition, NotificationChain msgs)
  {
    Expr oldIfcondition = ifcondition;
    ifcondition = newIfcondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SELECTION_STATEMENT__IFCONDITION, oldIfcondition, newIfcondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfcondition(Expr newIfcondition)
  {
    if (newIfcondition != ifcondition)
    {
      NotificationChain msgs = null;
      if (ifcondition != null)
        msgs = ((InternalEObject)ifcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SELECTION_STATEMENT__IFCONDITION, null, msgs);
      if (newIfcondition != null)
        msgs = ((InternalEObject)newIfcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SELECTION_STATEMENT__IFCONDITION, null, msgs);
      msgs = basicSetIfcondition(newIfcondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SELECTION_STATEMENT__IFCONDITION, newIfcondition, newIfcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getIfblock()
  {
    if (ifblock == null)
    {
      ifblock = new EObjectContainmentEList<Statement>(Statement.class, this, MMDSLPackage.SELECTION_STATEMENT__IFBLOCK);
    }
    return ifblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getElseifcondition()
  {
    if (elseifcondition == null)
    {
      elseifcondition = new EObjectContainmentEList<Expr>(Expr.class, this, MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION);
    }
    return elseifcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseifblock()
  {
    if (elseifblock == null)
    {
      elseifblock = new EObjectContainmentEList<Statement>(Statement.class, this, MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK);
    }
    return elseifblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseblock()
  {
    if (elseblock == null)
    {
      elseblock = new EObjectContainmentEList<Statement>(Statement.class, this, MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK);
    }
    return elseblock;
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
      case MMDSLPackage.SELECTION_STATEMENT__IFCONDITION:
        return basicSetIfcondition(null, msgs);
      case MMDSLPackage.SELECTION_STATEMENT__IFBLOCK:
        return ((InternalEList<?>)getIfblock()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION:
        return ((InternalEList<?>)getElseifcondition()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK:
        return ((InternalEList<?>)getElseifblock()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK:
        return ((InternalEList<?>)getElseblock()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.SELECTION_STATEMENT__IFCONDITION:
        return getIfcondition();
      case MMDSLPackage.SELECTION_STATEMENT__IFBLOCK:
        return getIfblock();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION:
        return getElseifcondition();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK:
        return getElseifblock();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK:
        return getElseblock();
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
      case MMDSLPackage.SELECTION_STATEMENT__IFCONDITION:
        setIfcondition((Expr)newValue);
        return;
      case MMDSLPackage.SELECTION_STATEMENT__IFBLOCK:
        getIfblock().clear();
        getIfblock().addAll((Collection<? extends Statement>)newValue);
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION:
        getElseifcondition().clear();
        getElseifcondition().addAll((Collection<? extends Expr>)newValue);
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK:
        getElseifblock().clear();
        getElseifblock().addAll((Collection<? extends Statement>)newValue);
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK:
        getElseblock().clear();
        getElseblock().addAll((Collection<? extends Statement>)newValue);
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
      case MMDSLPackage.SELECTION_STATEMENT__IFCONDITION:
        setIfcondition((Expr)null);
        return;
      case MMDSLPackage.SELECTION_STATEMENT__IFBLOCK:
        getIfblock().clear();
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION:
        getElseifcondition().clear();
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK:
        getElseifblock().clear();
        return;
      case MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK:
        getElseblock().clear();
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
      case MMDSLPackage.SELECTION_STATEMENT__IFCONDITION:
        return ifcondition != null;
      case MMDSLPackage.SELECTION_STATEMENT__IFBLOCK:
        return ifblock != null && !ifblock.isEmpty();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFCONDITION:
        return elseifcondition != null && !elseifcondition.isEmpty();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEIFBLOCK:
        return elseifblock != null && !elseifblock.isEmpty();
      case MMDSLPackage.SELECTION_STATEMENT__ELSEBLOCK:
        return elseblock != null && !elseblock.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectionStatementImpl
