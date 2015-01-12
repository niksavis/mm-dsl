/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFontstr <em>Fontstr</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFontFamily()
 * @model
 * @generated
 */
public interface FontFamily extends EObject
{
  /**
   * Returns the value of the '<em><b>Fontstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fontstr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fontstr</em>' attribute.
   * @see #setFontstr(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFontFamily_Fontstr()
   * @model
   * @generated
   */
  String getFontstr();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFontstr <em>Fontstr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fontstr</em>' attribute.
   * @see #getFontstr()
   * @generated
   */
  void setFontstr(String value);

  /**
   * Returns the value of the '<em><b>Font</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.Font}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.Font
   * @see #setFont(Font)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFontFamily_Font()
   * @model
   * @generated
   */
  Font getFont();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFont <em>Font</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.Font
   * @see #getFont()
   * @generated
   */
  void setFont(Font value);

} // FontFamily
