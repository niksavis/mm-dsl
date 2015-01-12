/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getY <em>Y</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Text#getFillcolor <em>Fillcolor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_X()
   * @model
   * @generated
   */
  String getX();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(String value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_Y()
   * @model
   * @generated
   */
  String getY();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(String value);

  /**
   * Returns the value of the '<em><b>Fontfamily</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fontfamily</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fontfamily</em>' containment reference.
   * @see #setFontfamily(FontFamily)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_Fontfamily()
   * @model containment="true"
   * @generated
   */
  FontFamily getFontfamily();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getFontfamily <em>Fontfamily</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fontfamily</em>' containment reference.
   * @see #getFontfamily()
   * @generated
   */
  void setFontfamily(FontFamily value);

  /**
   * Returns the value of the '<em><b>Fontsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fontsize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fontsize</em>' attribute.
   * @see #setFontsize(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_Fontsize()
   * @model
   * @generated
   */
  String getFontsize();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getFontsize <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fontsize</em>' attribute.
   * @see #getFontsize()
   * @generated
   */
  void setFontsize(String value);

  /**
   * Returns the value of the '<em><b>Fillcolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fillcolor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fillcolor</em>' containment reference.
   * @see #setFillcolor(FillColor)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getText_Fillcolor()
   * @model containment="true"
   * @generated
   */
  FillColor getFillcolor();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Text#getFillcolor <em>Fillcolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fillcolor</em>' containment reference.
   * @see #getFillcolor()
   * @generated
   */
  void setFillcolor(FillColor value);

} // Text
