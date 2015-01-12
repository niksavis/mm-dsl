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
import org.xtext.nv.dsl.mMDSL.VarStatement;
import org.xtext.nv.dsl.mMDSL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VariableImpl#getOpassing <em>Opassing</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VariableImpl#getVarstatement <em>Varstatement</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VariableImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpassing() <em>Opassing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpassing()
   * @generated
   * @ordered
   */
  protected OperatorAssign opassing;

  /**
   * The cached value of the '{@link #getVarstatement() <em>Varstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarstatement()
   * @generated
   * @ordered
   */
  protected VarStatement varstatement;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return MMDSLPackage.eINSTANCE.getVariable();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorAssign getOpassing()
  {
    return opassing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpassing(OperatorAssign newOpassing, NotificationChain msgs)
  {
    OperatorAssign oldOpassing = opassing;
    opassing = newOpassing;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__OPASSING, oldOpassing, newOpassing);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpassing(OperatorAssign newOpassing)
  {
    if (newOpassing != opassing)
    {
      NotificationChain msgs = null;
      if (opassing != null)
        msgs = ((InternalEObject)opassing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VARIABLE__OPASSING, null, msgs);
      if (newOpassing != null)
        msgs = ((InternalEObject)newOpassing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VARIABLE__OPASSING, null, msgs);
      msgs = basicSetOpassing(newOpassing, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__OPASSING, newOpassing, newOpassing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarStatement getVarstatement()
  {
    return varstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarstatement(VarStatement newVarstatement, NotificationChain msgs)
  {
    VarStatement oldVarstatement = varstatement;
    varstatement = newVarstatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__VARSTATEMENT, oldVarstatement, newVarstatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarstatement(VarStatement newVarstatement)
  {
    if (newVarstatement != varstatement)
    {
      NotificationChain msgs = null;
      if (varstatement != null)
        msgs = ((InternalEObject)varstatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VARIABLE__VARSTATEMENT, null, msgs);
      if (newVarstatement != null)
        msgs = ((InternalEObject)newVarstatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VARIABLE__VARSTATEMENT, null, msgs);
      msgs = basicSetVarstatement(newVarstatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__VARSTATEMENT, newVarstatement, newVarstatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (Variable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VARIABLE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VARIABLE__VARIABLE, oldVariable, variable));
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
      case MMDSLPackage.VARIABLE__OPASSING:
        return basicSetOpassing(null, msgs);
      case MMDSLPackage.VARIABLE__VARSTATEMENT:
        return basicSetVarstatement(null, msgs);
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
      case MMDSLPackage.VARIABLE__NAME:
        return getName();
      case MMDSLPackage.VARIABLE__OPASSING:
        return getOpassing();
      case MMDSLPackage.VARIABLE__VARSTATEMENT:
        return getVarstatement();
      case MMDSLPackage.VARIABLE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
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
      case MMDSLPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.VARIABLE__OPASSING:
        setOpassing((OperatorAssign)newValue);
        return;
      case MMDSLPackage.VARIABLE__VARSTATEMENT:
        setVarstatement((VarStatement)newValue);
        return;
      case MMDSLPackage.VARIABLE__VARIABLE:
        setVariable((Variable)newValue);
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
      case MMDSLPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.VARIABLE__OPASSING:
        setOpassing((OperatorAssign)null);
        return;
      case MMDSLPackage.VARIABLE__VARSTATEMENT:
        setVarstatement((VarStatement)null);
        return;
      case MMDSLPackage.VARIABLE__VARIABLE:
        setVariable((Variable)null);
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
      case MMDSLPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.VARIABLE__OPASSING:
        return opassing != null;
      case MMDSLPackage.VARIABLE__VARSTATEMENT:
        return varstatement != null;
      case MMDSLPackage.VARIABLE__VARIABLE:
        return variable != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
