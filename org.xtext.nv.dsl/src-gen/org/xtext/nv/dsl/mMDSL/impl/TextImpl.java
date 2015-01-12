/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.FillColor;
import org.xtext.nv.dsl.mMDSL.FontFamily;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl#getFillcolor <em>Fillcolor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends MinimalEObjectImpl.Container implements Text
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

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
   * The cached value of the '{@link #getFontfamily() <em>Fontfamily</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontfamily()
   * @generated
   * @ordered
   */
  protected FontFamily fontfamily;

  /**
   * The default value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontsize()
   * @generated
   * @ordered
   */
  protected static final String FONTSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontsize()
   * @generated
   * @ordered
   */
  protected String fontsize = FONTSIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFillcolor() <em>Fillcolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillcolor()
   * @generated
   * @ordered
   */
  protected FillColor fillcolor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextImpl()
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
    return MMDSLPackage.eINSTANCE.getText();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__X, oldX, x));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamily getFontfamily()
  {
    return fontfamily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontfamily(FontFamily newFontfamily, NotificationChain msgs)
  {
    FontFamily oldFontfamily = fontfamily;
    fontfamily = newFontfamily;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__FONTFAMILY, oldFontfamily, newFontfamily);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontfamily(FontFamily newFontfamily)
  {
    if (newFontfamily != fontfamily)
    {
      NotificationChain msgs = null;
      if (fontfamily != null)
        msgs = ((InternalEObject)fontfamily).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TEXT__FONTFAMILY, null, msgs);
      if (newFontfamily != null)
        msgs = ((InternalEObject)newFontfamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TEXT__FONTFAMILY, null, msgs);
      msgs = basicSetFontfamily(newFontfamily, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__FONTFAMILY, newFontfamily, newFontfamily));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFontsize()
  {
    return fontsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontsize(String newFontsize)
  {
    String oldFontsize = fontsize;
    fontsize = newFontsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__FONTSIZE, oldFontsize, fontsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FillColor getFillcolor()
  {
    return fillcolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFillcolor(FillColor newFillcolor, NotificationChain msgs)
  {
    FillColor oldFillcolor = fillcolor;
    fillcolor = newFillcolor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__FILLCOLOR, oldFillcolor, newFillcolor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillcolor(FillColor newFillcolor)
  {
    if (newFillcolor != fillcolor)
    {
      NotificationChain msgs = null;
      if (fillcolor != null)
        msgs = ((InternalEObject)fillcolor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TEXT__FILLCOLOR, null, msgs);
      if (newFillcolor != null)
        msgs = ((InternalEObject)newFillcolor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.TEXT__FILLCOLOR, null, msgs);
      msgs = basicSetFillcolor(newFillcolor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.TEXT__FILLCOLOR, newFillcolor, newFillcolor));
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
      case MMDSLPackage.TEXT__FONTFAMILY:
        return basicSetFontfamily(null, msgs);
      case MMDSLPackage.TEXT__FILLCOLOR:
        return basicSetFillcolor(null, msgs);
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
      case MMDSLPackage.TEXT__VALUE:
        return getValue();
      case MMDSLPackage.TEXT__X:
        return getX();
      case MMDSLPackage.TEXT__Y:
        return getY();
      case MMDSLPackage.TEXT__FONTFAMILY:
        return getFontfamily();
      case MMDSLPackage.TEXT__FONTSIZE:
        return getFontsize();
      case MMDSLPackage.TEXT__FILLCOLOR:
        return getFillcolor();
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
      case MMDSLPackage.TEXT__VALUE:
        setValue((String)newValue);
        return;
      case MMDSLPackage.TEXT__X:
        setX((String)newValue);
        return;
      case MMDSLPackage.TEXT__Y:
        setY((String)newValue);
        return;
      case MMDSLPackage.TEXT__FONTFAMILY:
        setFontfamily((FontFamily)newValue);
        return;
      case MMDSLPackage.TEXT__FONTSIZE:
        setFontsize((String)newValue);
        return;
      case MMDSLPackage.TEXT__FILLCOLOR:
        setFillcolor((FillColor)newValue);
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
      case MMDSLPackage.TEXT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MMDSLPackage.TEXT__X:
        setX(X_EDEFAULT);
        return;
      case MMDSLPackage.TEXT__Y:
        setY(Y_EDEFAULT);
        return;
      case MMDSLPackage.TEXT__FONTFAMILY:
        setFontfamily((FontFamily)null);
        return;
      case MMDSLPackage.TEXT__FONTSIZE:
        setFontsize(FONTSIZE_EDEFAULT);
        return;
      case MMDSLPackage.TEXT__FILLCOLOR:
        setFillcolor((FillColor)null);
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
      case MMDSLPackage.TEXT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case MMDSLPackage.TEXT__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case MMDSLPackage.TEXT__Y:
        return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
      case MMDSLPackage.TEXT__FONTFAMILY:
        return fontfamily != null;
      case MMDSLPackage.TEXT__FONTSIZE:
        return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
      case MMDSLPackage.TEXT__FILLCOLOR:
        return fillcolor != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", fontsize: ");
    result.append(fontsize);
    result.append(')');
    return result.toString();
  }

} //TextImpl
