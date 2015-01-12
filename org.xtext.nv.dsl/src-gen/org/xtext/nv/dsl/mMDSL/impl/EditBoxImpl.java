/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.EditBox;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EditBoxImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EditBoxImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EditBoxImpl#getOkbuttontext <em>Okbuttontext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditBoxImpl extends MinimalEObjectImpl.Container implements EditBox
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
   * The default value of the '{@link #getOkbuttontext() <em>Okbuttontext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOkbuttontext()
   * @generated
   * @ordered
   */
  protected static final String OKBUTTONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOkbuttontext() <em>Okbuttontext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOkbuttontext()
   * @generated
   * @ordered
   */
  protected String okbuttontext = OKBUTTONTEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditBoxImpl()
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
    return MMDSLPackage.eINSTANCE.getEditBox();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EDIT_BOX__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EDIT_BOX__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOkbuttontext()
  {
    return okbuttontext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOkbuttontext(String newOkbuttontext)
  {
    String oldOkbuttontext = okbuttontext;
    okbuttontext = newOkbuttontext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EDIT_BOX__OKBUTTONTEXT, oldOkbuttontext, okbuttontext));
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
      case MMDSLPackage.EDIT_BOX__TITLE:
        return getTitle();
      case MMDSLPackage.EDIT_BOX__TEXT:
        return getText();
      case MMDSLPackage.EDIT_BOX__OKBUTTONTEXT:
        return getOkbuttontext();
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
      case MMDSLPackage.EDIT_BOX__TITLE:
        setTitle((String)newValue);
        return;
      case MMDSLPackage.EDIT_BOX__TEXT:
        setText((String)newValue);
        return;
      case MMDSLPackage.EDIT_BOX__OKBUTTONTEXT:
        setOkbuttontext((String)newValue);
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
      case MMDSLPackage.EDIT_BOX__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case MMDSLPackage.EDIT_BOX__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case MMDSLPackage.EDIT_BOX__OKBUTTONTEXT:
        setOkbuttontext(OKBUTTONTEXT_EDEFAULT);
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
      case MMDSLPackage.EDIT_BOX__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case MMDSLPackage.EDIT_BOX__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case MMDSLPackage.EDIT_BOX__OKBUTTONTEXT:
        return OKBUTTONTEXT_EDEFAULT == null ? okbuttontext != null : !OKBUTTONTEXT_EDEFAULT.equals(okbuttontext);
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
    result.append(", okbuttontext: ");
    result.append(okbuttontext);
    result.append(')');
    return result.toString();
  }

} //EditBoxImpl
