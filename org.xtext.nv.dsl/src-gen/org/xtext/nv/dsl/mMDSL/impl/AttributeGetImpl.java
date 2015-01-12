/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.AttrGetParams;
import org.xtext.nv.dsl.mMDSL.AttributeGet;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeGetImpl#getAttrgetparams <em>Attrgetparams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeGetImpl extends MinimalEObjectImpl.Container implements AttributeGet
{
  /**
   * The default value of the '{@link #getAttrgetparams() <em>Attrgetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrgetparams()
   * @generated
   * @ordered
   */
  protected static final AttrGetParams ATTRGETPARAMS_EDEFAULT = AttrGetParams.TYPE;

  /**
   * The cached value of the '{@link #getAttrgetparams() <em>Attrgetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrgetparams()
   * @generated
   * @ordered
   */
  protected AttrGetParams attrgetparams = ATTRGETPARAMS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeGetImpl()
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
    return MMDSLPackage.eINSTANCE.getAttributeGet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrGetParams getAttrgetparams()
  {
    return attrgetparams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrgetparams(AttrGetParams newAttrgetparams)
  {
    AttrGetParams oldAttrgetparams = attrgetparams;
    attrgetparams = newAttrgetparams == null ? ATTRGETPARAMS_EDEFAULT : newAttrgetparams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_GET__ATTRGETPARAMS, oldAttrgetparams, attrgetparams));
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
      case MMDSLPackage.ATTRIBUTE_GET__ATTRGETPARAMS:
        return getAttrgetparams();
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
      case MMDSLPackage.ATTRIBUTE_GET__ATTRGETPARAMS:
        setAttrgetparams((AttrGetParams)newValue);
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
      case MMDSLPackage.ATTRIBUTE_GET__ATTRGETPARAMS:
        setAttrgetparams(ATTRGETPARAMS_EDEFAULT);
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
      case MMDSLPackage.ATTRIBUTE_GET__ATTRGETPARAMS:
        return attrgetparams != ATTRGETPARAMS_EDEFAULT;
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
    result.append(" (attrgetparams: ");
    result.append(attrgetparams);
    result.append(')');
    return result.toString();
  }

} //AttributeGetImpl
