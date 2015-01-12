/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Circle;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.CircleImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.CircleImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.CircleImpl#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircleImpl extends MinimalEObjectImpl.Container implements Circle
{
  /**
   * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCx()
   * @generated
   * @ordered
   */
  protected static final String CX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCx()
   * @generated
   * @ordered
   */
  protected String cx = CX_EDEFAULT;

  /**
   * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCy()
   * @generated
   * @ordered
   */
  protected static final String CY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCy()
   * @generated
   * @ordered
   */
  protected String cy = CY_EDEFAULT;

  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final String R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected String r = R_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CircleImpl()
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
    return MMDSLPackage.eINSTANCE.getCircle();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCx()
  {
    return cx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCx(String newCx)
  {
    String oldCx = cx;
    cx = newCx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CIRCLE__CX, oldCx, cx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCy()
  {
    return cy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCy(String newCy)
  {
    String oldCy = cy;
    cy = newCy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CIRCLE__CY, oldCy, cy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(String newR)
  {
    String oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CIRCLE__R, oldR, r));
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
      case MMDSLPackage.CIRCLE__CX:
        return getCx();
      case MMDSLPackage.CIRCLE__CY:
        return getCy();
      case MMDSLPackage.CIRCLE__R:
        return getR();
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
      case MMDSLPackage.CIRCLE__CX:
        setCx((String)newValue);
        return;
      case MMDSLPackage.CIRCLE__CY:
        setCy((String)newValue);
        return;
      case MMDSLPackage.CIRCLE__R:
        setR((String)newValue);
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
      case MMDSLPackage.CIRCLE__CX:
        setCx(CX_EDEFAULT);
        return;
      case MMDSLPackage.CIRCLE__CY:
        setCy(CY_EDEFAULT);
        return;
      case MMDSLPackage.CIRCLE__R:
        setR(R_EDEFAULT);
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
      case MMDSLPackage.CIRCLE__CX:
        return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
      case MMDSLPackage.CIRCLE__CY:
        return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
      case MMDSLPackage.CIRCLE__R:
        return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
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
    result.append(" (cx: ");
    result.append(cx);
    result.append(", cy: ");
    result.append(cy);
    result.append(", r: ");
    result.append(r);
    result.append(')');
    return result.toString();
  }

} //CircleImpl
