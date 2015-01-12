/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getButtontype <em>Buttontype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getErrorBox()
 * @model
 * @generated
 */
public interface ErrorBox extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getErrorBox_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getTitle <em>Title</em>}' attribute.
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getErrorBox_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Buttontype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.ButtonType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttontype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttontype</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.ButtonType
   * @see #setButtontype(ButtonType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getErrorBox_Buttontype()
   * @model
   * @generated
   */
  ButtonType getButtontype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getButtontype <em>Buttontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buttontype</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.ButtonType
   * @see #getButtontype()
   * @generated
   */
  void setButtontype(ButtonType value);

} // ErrorBox
