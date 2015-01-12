/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Ellipse;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EllipseImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EllipseImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EllipseImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EllipseImpl#getRy <em>Ry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EllipseImpl extends MinimalEObjectImpl.Container implements Ellipse
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
   * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRx()
   * @generated
   * @ordered
   */
  protected static final String RX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRx() <em>Rx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRx()
   * @generated
   * @ordered
   */
  protected String rx = RX_EDEFAULT;

  /**
   * The default value of the '{@link #getRy() <em>Ry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRy()
   * @generated
   * @ordered
   */
  protected static final String RY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRy() <em>Ry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRy()
   * @generated
   * @ordered
   */
  protected String ry = RY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EllipseImpl()
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
    return MMDSLPackage.eINSTANCE.getEllipse();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ELLIPSE__CX, oldCx, cx));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ELLIPSE__CY, oldCy, cy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRx()
  {
    return rx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRx(String newRx)
  {
    String oldRx = rx;
    rx = newRx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ELLIPSE__RX, oldRx, rx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRy()
  {
    return ry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRy(String newRy)
  {
    String oldRy = ry;
    ry = newRy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ELLIPSE__RY, oldRy, ry));
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
      case MMDSLPackage.ELLIPSE__CX:
        return getCx();
      case MMDSLPackage.ELLIPSE__CY:
        return getCy();
      case MMDSLPackage.ELLIPSE__RX:
        return getRx();
      case MMDSLPackage.ELLIPSE__RY:
        return getRy();
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
      case MMDSLPackage.ELLIPSE__CX:
        setCx((String)newValue);
        return;
      case MMDSLPackage.ELLIPSE__CY:
        setCy((String)newValue);
        return;
      case MMDSLPackage.ELLIPSE__RX:
        setRx((String)newValue);
        return;
      case MMDSLPackage.ELLIPSE__RY:
        setRy((String)newValue);
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
      case MMDSLPackage.ELLIPSE__CX:
        setCx(CX_EDEFAULT);
        return;
      case MMDSLPackage.ELLIPSE__CY:
        setCy(CY_EDEFAULT);
        return;
      case MMDSLPackage.ELLIPSE__RX:
        setRx(RX_EDEFAULT);
        return;
      case MMDSLPackage.ELLIPSE__RY:
        setRy(RY_EDEFAULT);
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
      case MMDSLPackage.ELLIPSE__CX:
        return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
      case MMDSLPackage.ELLIPSE__CY:
        return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
      case MMDSLPackage.ELLIPSE__RX:
        return RX_EDEFAULT == null ? rx != null : !RX_EDEFAULT.equals(rx);
      case MMDSLPackage.ELLIPSE__RY:
        return RY_EDEFAULT == null ? ry != null : !RY_EDEFAULT.equals(ry);
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
    result.append(", rx: ");
    result.append(rx);
    result.append(", ry: ");
    result.append(ry);
    result.append(')');
    return result.toString();
  }

} //EllipseImpl
