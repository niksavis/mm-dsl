/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Expression;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getAtomic <em>Atomic</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getTrue <em>True</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getFalse <em>False</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getValueRealNumber <em>Value Real Number</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EObject op;

  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected Expression operand;

  /**
   * The cached value of the '{@link #getAtomic() <em>Atomic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomic()
   * @generated
   * @ordered
   */
  protected Expression atomic;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The default value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected static final String TRUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected String true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected static final String FALSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected String false_ = FALSE_EDEFAULT;

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
   * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected String valueString = VALUE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValueRealNumber() <em>Value Real Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueRealNumber()
   * @generated
   * @ordered
   */
  protected static final String VALUE_REAL_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueRealNumber() <em>Value Real Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueRealNumber()
   * @generated
   * @ordered
   */
  protected String valueRealNumber = VALUE_REAL_NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return MMDSLPackage.eINSTANCE.getExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(EObject newOp, NotificationChain msgs)
  {
    EObject oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(EObject newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand(Expression newOperand, NotificationChain msgs)
  {
    Expression oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__OPERAND, oldOperand, newOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(Expression newOperand)
  {
    if (newOperand != operand)
    {
      NotificationChain msgs = null;
      if (operand != null)
        msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__OPERAND, null, msgs);
      if (newOperand != null)
        msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__OPERAND, null, msgs);
      msgs = basicSetOperand(newOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__OPERAND, newOperand, newOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAtomic()
  {
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomic(Expression newAtomic, NotificationChain msgs)
  {
    Expression oldAtomic = atomic;
    atomic = newAtomic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__ATOMIC, oldAtomic, newAtomic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomic(Expression newAtomic)
  {
    if (newAtomic != atomic)
    {
      NotificationChain msgs = null;
      if (atomic != null)
        msgs = ((InternalEObject)atomic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__ATOMIC, null, msgs);
      if (newAtomic != null)
        msgs = ((InternalEObject)newAtomic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__ATOMIC, null, msgs);
      msgs = basicSetAtomic(newAtomic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__ATOMIC, newAtomic, newAtomic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(String newTrue)
  {
    String oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(String newFalse)
  {
    String oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__FALSE, oldFalse, false_));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.EXPRESSION__VARIABLE, oldVariable, variable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueString()
  {
    return valueString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueString(String newValueString)
  {
    String oldValueString = valueString;
    valueString = newValueString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__VALUE_STRING, oldValueString, valueString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueRealNumber()
  {
    return valueRealNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueRealNumber(String newValueRealNumber)
  {
    String oldValueRealNumber = valueRealNumber;
    valueRealNumber = newValueRealNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__VALUE_REAL_NUMBER, oldValueRealNumber, valueRealNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EXPRESSION__RIGHT, newRight, newRight));
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
      case MMDSLPackage.EXPRESSION__OP:
        return basicSetOp(null, msgs);
      case MMDSLPackage.EXPRESSION__OPERAND:
        return basicSetOperand(null, msgs);
      case MMDSLPackage.EXPRESSION__ATOMIC:
        return basicSetAtomic(null, msgs);
      case MMDSLPackage.EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MMDSLPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case MMDSLPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
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
      case MMDSLPackage.EXPRESSION__OP:
        return getOp();
      case MMDSLPackage.EXPRESSION__OPERAND:
        return getOperand();
      case MMDSLPackage.EXPRESSION__ATOMIC:
        return getAtomic();
      case MMDSLPackage.EXPRESSION__EXPRESSION:
        return getExpression();
      case MMDSLPackage.EXPRESSION__TRUE:
        return getTrue();
      case MMDSLPackage.EXPRESSION__FALSE:
        return getFalse();
      case MMDSLPackage.EXPRESSION__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case MMDSLPackage.EXPRESSION__VALUE_STRING:
        return getValueString();
      case MMDSLPackage.EXPRESSION__VALUE_REAL_NUMBER:
        return getValueRealNumber();
      case MMDSLPackage.EXPRESSION__LEFT:
        return getLeft();
      case MMDSLPackage.EXPRESSION__RIGHT:
        return getRight();
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
      case MMDSLPackage.EXPRESSION__OP:
        setOp((EObject)newValue);
        return;
      case MMDSLPackage.EXPRESSION__OPERAND:
        setOperand((Expression)newValue);
        return;
      case MMDSLPackage.EXPRESSION__ATOMIC:
        setAtomic((Expression)newValue);
        return;
      case MMDSLPackage.EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MMDSLPackage.EXPRESSION__TRUE:
        setTrue((String)newValue);
        return;
      case MMDSLPackage.EXPRESSION__FALSE:
        setFalse((String)newValue);
        return;
      case MMDSLPackage.EXPRESSION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case MMDSLPackage.EXPRESSION__VALUE_STRING:
        setValueString((String)newValue);
        return;
      case MMDSLPackage.EXPRESSION__VALUE_REAL_NUMBER:
        setValueRealNumber((String)newValue);
        return;
      case MMDSLPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case MMDSLPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
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
      case MMDSLPackage.EXPRESSION__OP:
        setOp((EObject)null);
        return;
      case MMDSLPackage.EXPRESSION__OPERAND:
        setOperand((Expression)null);
        return;
      case MMDSLPackage.EXPRESSION__ATOMIC:
        setAtomic((Expression)null);
        return;
      case MMDSLPackage.EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MMDSLPackage.EXPRESSION__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case MMDSLPackage.EXPRESSION__FALSE:
        setFalse(FALSE_EDEFAULT);
        return;
      case MMDSLPackage.EXPRESSION__VARIABLE:
        setVariable((Variable)null);
        return;
      case MMDSLPackage.EXPRESSION__VALUE_STRING:
        setValueString(VALUE_STRING_EDEFAULT);
        return;
      case MMDSLPackage.EXPRESSION__VALUE_REAL_NUMBER:
        setValueRealNumber(VALUE_REAL_NUMBER_EDEFAULT);
        return;
      case MMDSLPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case MMDSLPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
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
      case MMDSLPackage.EXPRESSION__OP:
        return op != null;
      case MMDSLPackage.EXPRESSION__OPERAND:
        return operand != null;
      case MMDSLPackage.EXPRESSION__ATOMIC:
        return atomic != null;
      case MMDSLPackage.EXPRESSION__EXPRESSION:
        return expression != null;
      case MMDSLPackage.EXPRESSION__TRUE:
        return TRUE_EDEFAULT == null ? true_ != null : !TRUE_EDEFAULT.equals(true_);
      case MMDSLPackage.EXPRESSION__FALSE:
        return FALSE_EDEFAULT == null ? false_ != null : !FALSE_EDEFAULT.equals(false_);
      case MMDSLPackage.EXPRESSION__VARIABLE:
        return variable != null;
      case MMDSLPackage.EXPRESSION__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
      case MMDSLPackage.EXPRESSION__VALUE_REAL_NUMBER:
        return VALUE_REAL_NUMBER_EDEFAULT == null ? valueRealNumber != null : !VALUE_REAL_NUMBER_EDEFAULT.equals(valueRealNumber);
      case MMDSLPackage.EXPRESSION__LEFT:
        return left != null;
      case MMDSLPackage.EXPRESSION__RIGHT:
        return right != null;
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
    result.append(" (true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(", valueString: ");
    result.append(valueString);
    result.append(", valueRealNumber: ");
    result.append(valueRealNumber);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
