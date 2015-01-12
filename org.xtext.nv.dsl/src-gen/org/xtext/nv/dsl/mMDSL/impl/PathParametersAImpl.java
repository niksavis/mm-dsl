/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.PathParametersA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Parameters A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getRy <em>Ry</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getXaxisrot <em>Xaxisrot</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getLargearcflag <em>Largearcflag</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getSweepflag <em>Sweepflag</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathParametersAImpl extends MinimalEObjectImpl.Container implements PathParametersA
{
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
   * The default value of the '{@link #getXaxisrot() <em>Xaxisrot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXaxisrot()
   * @generated
   * @ordered
   */
  protected static final String XAXISROT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXaxisrot() <em>Xaxisrot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXaxisrot()
   * @generated
   * @ordered
   */
  protected String xaxisrot = XAXISROT_EDEFAULT;

  /**
   * The default value of the '{@link #getLargearcflag() <em>Largearcflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLargearcflag()
   * @generated
   * @ordered
   */
  protected static final String LARGEARCFLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLargearcflag() <em>Largearcflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLargearcflag()
   * @generated
   * @ordered
   */
  protected String largearcflag = LARGEARCFLAG_EDEFAULT;

  /**
   * The default value of the '{@link #getSweepflag() <em>Sweepflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSweepflag()
   * @generated
   * @ordered
   */
  protected static final String SWEEPFLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSweepflag() <em>Sweepflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSweepflag()
   * @generated
   * @ordered
   */
  protected String sweepflag = SWEEPFLAG_EDEFAULT;

  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final String X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected String x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final String Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected String y = Y_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathParametersAImpl()
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
    return MMDSLPackage.eINSTANCE.getPathParametersA();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__RX, oldRx, rx));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__RY, oldRy, ry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXaxisrot()
  {
    return xaxisrot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXaxisrot(String newXaxisrot)
  {
    String oldXaxisrot = xaxisrot;
    xaxisrot = newXaxisrot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__XAXISROT, oldXaxisrot, xaxisrot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLargearcflag()
  {
    return largearcflag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLargearcflag(String newLargearcflag)
  {
    String oldLargearcflag = largearcflag;
    largearcflag = newLargearcflag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__LARGEARCFLAG, oldLargearcflag, largearcflag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSweepflag()
  {
    return sweepflag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSweepflag(String newSweepflag)
  {
    String oldSweepflag = sweepflag;
    sweepflag = newSweepflag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__SWEEPFLAG, oldSweepflag, sweepflag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(String newX)
  {
    String oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(String newY)
  {
    String oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_A__Y, oldY, y));
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
      case MMDSLPackage.PATH_PARAMETERS_A__RX:
        return getRx();
      case MMDSLPackage.PATH_PARAMETERS_A__RY:
        return getRy();
      case MMDSLPackage.PATH_PARAMETERS_A__XAXISROT:
        return getXaxisrot();
      case MMDSLPackage.PATH_PARAMETERS_A__LARGEARCFLAG:
        return getLargearcflag();
      case MMDSLPackage.PATH_PARAMETERS_A__SWEEPFLAG:
        return getSweepflag();
      case MMDSLPackage.PATH_PARAMETERS_A__X:
        return getX();
      case MMDSLPackage.PATH_PARAMETERS_A__Y:
        return getY();
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
      case MMDSLPackage.PATH_PARAMETERS_A__RX:
        setRx((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__RY:
        setRy((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__XAXISROT:
        setXaxisrot((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__LARGEARCFLAG:
        setLargearcflag((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__SWEEPFLAG:
        setSweepflag((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__X:
        setX((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__Y:
        setY((String)newValue);
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
      case MMDSLPackage.PATH_PARAMETERS_A__RX:
        setRx(RX_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__RY:
        setRy(RY_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__XAXISROT:
        setXaxisrot(XAXISROT_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__LARGEARCFLAG:
        setLargearcflag(LARGEARCFLAG_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__SWEEPFLAG:
        setSweepflag(SWEEPFLAG_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__X:
        setX(X_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_A__Y:
        setY(Y_EDEFAULT);
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
      case MMDSLPackage.PATH_PARAMETERS_A__RX:
        return RX_EDEFAULT == null ? rx != null : !RX_EDEFAULT.equals(rx);
      case MMDSLPackage.PATH_PARAMETERS_A__RY:
        return RY_EDEFAULT == null ? ry != null : !RY_EDEFAULT.equals(ry);
      case MMDSLPackage.PATH_PARAMETERS_A__XAXISROT:
        return XAXISROT_EDEFAULT == null ? xaxisrot != null : !XAXISROT_EDEFAULT.equals(xaxisrot);
      case MMDSLPackage.PATH_PARAMETERS_A__LARGEARCFLAG:
        return LARGEARCFLAG_EDEFAULT == null ? largearcflag != null : !LARGEARCFLAG_EDEFAULT.equals(largearcflag);
      case MMDSLPackage.PATH_PARAMETERS_A__SWEEPFLAG:
        return SWEEPFLAG_EDEFAULT == null ? sweepflag != null : !SWEEPFLAG_EDEFAULT.equals(sweepflag);
      case MMDSLPackage.PATH_PARAMETERS_A__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case MMDSLPackage.PATH_PARAMETERS_A__Y:
        return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
    result.append(" (rx: ");
    result.append(rx);
    result.append(", ry: ");
    result.append(ry);
    result.append(", xaxisrot: ");
    result.append(xaxisrot);
    result.append(", largearcflag: ");
    result.append(largearcflag);
    result.append(", sweepflag: ");
    result.append(sweepflag);
    result.append(", x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(')');
    return result.toString();
  }

} //PathParametersAImpl
