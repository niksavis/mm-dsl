/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stroke Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getHexcolor <em>Hexcolor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStrokeColor()
 * @model
 * @generated
 */
public interface StrokeColor extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.Color
   * @see #setColor(Color)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStrokeColor_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.Color
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Hexcolor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hexcolor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hexcolor</em>' attribute.
   * @see #setHexcolor(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStrokeColor_Hexcolor()
   * @model
   * @generated
   */
  String getHexcolor();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getHexcolor <em>Hexcolor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hexcolor</em>' attribute.
   * @see #getHexcolor()
   * @generated
   */
  void setHexcolor(String value);

} // StrokeColor
