/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.AttrSetParams;
import org.xtext.nv.dsl.mMDSL.AttributeSet;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl#getAttrsetparams <em>Attrsetparams</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl#getValueRealNumber <em>Value Real Number</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl#getValueVariable <em>Value Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeSetImpl extends MinimalEObjectImpl.Container implements AttributeSet
{
  /**
   * The default value of the '{@link #getAttrsetparams() <em>Attrsetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrsetparams()
   * @generated
   * @ordered
   */
  protected static final AttrSetParams ATTRSETPARAMS_EDEFAULT = AttrSetParams.VALUE;

  /**
   * The cached value of the '{@link #getAttrsetparams() <em>Attrsetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrsetparams()
   * @generated
   * @ordered
   */
  protected AttrSetParams attrsetparams = ATTRSETPARAMS_EDEFAULT;

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
   * The cached value of the '{@link #getValueVariable() <em>Value Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueVariable()
   * @generated
   * @ordered
   */
  protected Variable valueVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeSetImpl()
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
    return MMDSLPackage.eINSTANCE.getAttributeSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrSetParams getAttrsetparams()
  {
    return attrsetparams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrsetparams(AttrSetParams newAttrsetparams)
  {
    AttrSetParams oldAttrsetparams = attrsetparams;
    attrsetparams = newAttrsetparams == null ? ATTRSETPARAMS_EDEFAULT : newAttrsetparams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_SET__ATTRSETPARAMS, oldAttrsetparams, attrsetparams));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_SET__VALUE_STRING, oldValueString, valueString));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_SET__VALUE_REAL_NUMBER, oldValueRealNumber, valueRealNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getValueVariable()
  {
    if (valueVariable != null && valueVariable.eIsProxy())
    {
      InternalEObject oldValueVariable = (InternalEObject)valueVariable;
      valueVariable = (Variable)eResolveProxy(oldValueVariable);
      if (valueVariable != oldValueVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE, oldValueVariable, valueVariable));
      }
    }
    return valueVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetValueVariable()
  {
    return valueVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueVariable(Variable newValueVariable)
  {
    Variable oldValueVariable = valueVariable;
    valueVariable = newValueVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE, oldValueVariable, valueVariable));
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
      case MMDSLPackage.ATTRIBUTE_SET__ATTRSETPARAMS:
        return getAttrsetparams();
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_STRING:
        return getValueString();
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_REAL_NUMBER:
        return getValueRealNumber();
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE:
        if (resolve) return getValueVariable();
        return basicGetValueVariable();
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
      case MMDSLPackage.ATTRIBUTE_SET__ATTRSETPARAMS:
        setAttrsetparams((AttrSetParams)newValue);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_STRING:
        setValueString((String)newValue);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_REAL_NUMBER:
        setValueRealNumber((String)newValue);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE:
        setValueVariable((Variable)newValue);
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
      case MMDSLPackage.ATTRIBUTE_SET__ATTRSETPARAMS:
        setAttrsetparams(ATTRSETPARAMS_EDEFAULT);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_STRING:
        setValueString(VALUE_STRING_EDEFAULT);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_REAL_NUMBER:
        setValueRealNumber(VALUE_REAL_NUMBER_EDEFAULT);
        return;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE:
        setValueVariable((Variable)null);
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
      case MMDSLPackage.ATTRIBUTE_SET__ATTRSETPARAMS:
        return attrsetparams != ATTRSETPARAMS_EDEFAULT;
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_REAL_NUMBER:
        return VALUE_REAL_NUMBER_EDEFAULT == null ? valueRealNumber != null : !VALUE_REAL_NUMBER_EDEFAULT.equals(valueRealNumber);
      case MMDSLPackage.ATTRIBUTE_SET__VALUE_VARIABLE:
        return valueVariable != null;
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
    result.append(" (attrsetparams: ");
    result.append(attrsetparams);
    result.append(", valueString: ");
    result.append(valueString);
    result.append(", valueRealNumber: ");
    result.append(valueRealNumber);
    result.append(')');
    return result.toString();
  }

} //AttributeSetImpl
