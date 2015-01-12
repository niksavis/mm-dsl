/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Font;
import org.xtext.nv.dsl.mMDSL.FontFamily;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FontFamilyImpl#getFontstr <em>Fontstr</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FontFamilyImpl#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontFamilyImpl extends MinimalEObjectImpl.Container implements FontFamily
{
  /**
   * The default value of the '{@link #getFontstr() <em>Fontstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontstr()
   * @generated
   * @ordered
   */
  protected static final String FONTSTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFontstr() <em>Fontstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontstr()
   * @generated
   * @ordered
   */
  protected String fontstr = FONTSTR_EDEFAULT;

  /**
   * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected static final Font FONT_EDEFAULT = Font.ARIAL;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected Font font = FONT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontFamilyImpl()
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
    return MMDSLPackage.eINSTANCE.getFontFamily();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFontstr()
  {
    return fontstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontstr(String newFontstr)
  {
    String oldFontstr = fontstr;
    fontstr = newFontstr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FONT_FAMILY__FONTSTR, oldFontstr, fontstr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font getFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont(Font newFont)
  {
    Font oldFont = font;
    font = newFont == null ? FONT_EDEFAULT : newFont;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FONT_FAMILY__FONT, oldFont, font));
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
      case MMDSLPackage.FONT_FAMILY__FONTSTR:
        return getFontstr();
      case MMDSLPackage.FONT_FAMILY__FONT:
        return getFont();
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
      case MMDSLPackage.FONT_FAMILY__FONTSTR:
        setFontstr((String)newValue);
        return;
      case MMDSLPackage.FONT_FAMILY__FONT:
        setFont((Font)newValue);
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
      case MMDSLPackage.FONT_FAMILY__FONTSTR:
        setFontstr(FONTSTR_EDEFAULT);
        return;
      case MMDSLPackage.FONT_FAMILY__FONT:
        setFont(FONT_EDEFAULT);
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
      case MMDSLPackage.FONT_FAMILY__FONTSTR:
        return FONTSTR_EDEFAULT == null ? fontstr != null : !FONTSTR_EDEFAULT.equals(fontstr);
      case MMDSLPackage.FONT_FAMILY__FONT:
        return font != FONT_EDEFAULT;
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
    result.append(" (fontstr: ");
    result.append(fontstr);
    result.append(", font: ");
    result.append(font);
    result.append(')');
    return result.toString();
  }

} //FontFamilyImpl
