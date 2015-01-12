/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.PathParametersC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Parameters C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathParametersCImpl extends MinimalEObjectImpl.Container implements PathParametersC
{
  /**
   * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX1()
   * @generated
   * @ordered
   */
  protected static final String X1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX1()
   * @generated
   * @ordered
   */
  protected String x1 = X1_EDEFAULT;

  /**
   * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY1()
   * @generated
   * @ordered
   */
  protected static final String Y1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY1()
   * @generated
   * @ordered
   */
  protected String y1 = Y1_EDEFAULT;

  /**
   * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected static final String X2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected String x2 = X2_EDEFAULT;

  /**
   * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected static final String Y2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected String y2 = Y2_EDEFAULT;

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
  protected PathParametersCImpl()
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
    return MMDSLPackage.eINSTANCE.getPathParametersC();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX1()
  {
    return x1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX1(String newX1)
  {
    String oldX1 = x1;
    x1 = newX1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__X1, oldX1, x1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY1()
  {
    return y1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY1(String newY1)
  {
    String oldY1 = y1;
    y1 = newY1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__Y1, oldY1, y1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX2()
  {
    return x2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX2(String newX2)
  {
    String oldX2 = x2;
    x2 = newX2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__X2, oldX2, x2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getY2()
  {
    return y2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY2(String newY2)
  {
    String oldY2 = y2;
    y2 = newY2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__Y2, oldY2, y2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__X, oldX, x));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_PARAMETERS_C__Y, oldY, y));
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
      case MMDSLPackage.PATH_PARAMETERS_C__X1:
        return getX1();
      case MMDSLPackage.PATH_PARAMETERS_C__Y1:
        return getY1();
      case MMDSLPackage.PATH_PARAMETERS_C__X2:
        return getX2();
      case MMDSLPackage.PATH_PARAMETERS_C__Y2:
        return getY2();
      case MMDSLPackage.PATH_PARAMETERS_C__X:
        return getX();
      case MMDSLPackage.PATH_PARAMETERS_C__Y:
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
      case MMDSLPackage.PATH_PARAMETERS_C__X1:
        setX1((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y1:
        setY1((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__X2:
        setX2((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y2:
        setY2((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__X:
        setX((String)newValue);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y:
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
      case MMDSLPackage.PATH_PARAMETERS_C__X1:
        setX1(X1_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y1:
        setY1(Y1_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__X2:
        setX2(X2_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y2:
        setY2(Y2_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__X:
        setX(X_EDEFAULT);
        return;
      case MMDSLPackage.PATH_PARAMETERS_C__Y:
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
      case MMDSLPackage.PATH_PARAMETERS_C__X1:
        return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
      case MMDSLPackage.PATH_PARAMETERS_C__Y1:
        return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
      case MMDSLPackage.PATH_PARAMETERS_C__X2:
        return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
      case MMDSLPackage.PATH_PARAMETERS_C__Y2:
        return Y2_EDEFAULT == null ? y2 != null : !Y2_EDEFAULT.equals(y2);
      case MMDSLPackage.PATH_PARAMETERS_C__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case MMDSLPackage.PATH_PARAMETERS_C__Y:
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
    result.append(" (x1: ");
    result.append(x1);
    result.append(", y1: ");
    result.append(y1);
    result.append(", x2: ");
    result.append(x2);
    result.append(", y2: ");
    result.append(y2);
    result.append(", x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(')');
    return result.toString();
  }

} //PathParametersCImpl
