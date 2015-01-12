/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ButtonType;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.WarningBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warning Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WarningBoxImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WarningBoxImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.WarningBoxImpl#getButtontype <em>Buttontype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarningBoxImpl extends MinimalEObjectImpl.Container implements WarningBox
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getButtontype() <em>Buttontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtontype()
   * @generated
   * @ordered
   */
  protected static final ButtonType BUTTONTYPE_EDEFAULT = ButtonType.OK;

  /**
   * The cached value of the '{@link #getButtontype() <em>Buttontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtontype()
   * @generated
   * @ordered
   */
  protected ButtonType buttontype = BUTTONTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WarningBoxImpl()
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
    return MMDSLPackage.eINSTANCE.getWarningBox();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.WARNING_BOX__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.WARNING_BOX__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonType getButtontype()
  {
    return buttontype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButtontype(ButtonType newButtontype)
  {
    ButtonType oldButtontype = buttontype;
    buttontype = newButtontype == null ? BUTTONTYPE_EDEFAULT : newButtontype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.WARNING_BOX__BUTTONTYPE, oldButtontype, buttontype));
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
      case MMDSLPackage.WARNING_BOX__TITLE:
        return getTitle();
      case MMDSLPackage.WARNING_BOX__TEXT:
        return getText();
      case MMDSLPackage.WARNING_BOX__BUTTONTYPE:
        return getButtontype();
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
      case MMDSLPackage.WARNING_BOX__TITLE:
        setTitle((String)newValue);
        return;
      case MMDSLPackage.WARNING_BOX__TEXT:
        setText((String)newValue);
        return;
      case MMDSLPackage.WARNING_BOX__BUTTONTYPE:
        setButtontype((ButtonType)newValue);
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
      case MMDSLPackage.WARNING_BOX__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case MMDSLPackage.WARNING_BOX__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case MMDSLPackage.WARNING_BOX__BUTTONTYPE:
        setButtontype(BUTTONTYPE_EDEFAULT);
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
      case MMDSLPackage.WARNING_BOX__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case MMDSLPackage.WARNING_BOX__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case MMDSLPackage.WARNING_BOX__BUTTONTYPE:
        return buttontype != BUTTONTYPE_EDEFAULT;
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
    result.append(" (title: ");
    result.append(title);
    result.append(", text: ");
    result.append(text);
    result.append(", buttontype: ");
    result.append(buttontype);
    result.append(')');
    return result.toString();
  }

} //WarningBoxImpl