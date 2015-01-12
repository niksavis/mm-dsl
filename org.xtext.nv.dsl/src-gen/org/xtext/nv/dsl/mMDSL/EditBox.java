/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EditBox#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EditBox#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EditBox#getOkbuttontext <em>Okbuttontext</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEditBox()
 * @model
 * @generated
 */
public interface EditBox extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEditBox_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EditBox#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEditBox_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EditBox#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Okbuttontext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Okbuttontext</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Okbuttontext</em>' attribute.
   * @see #setOkbuttontext(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEditBox_Okbuttontext()
   * @model
   * @generated
   */
  String getOkbuttontext();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EditBox#getOkbuttontext <em>Okbuttontext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Okbuttontext</em>' attribute.
   * @see #getOkbuttontext()
   * @generated
   */
  void setOkbuttontext(String value);

} // EditBox
