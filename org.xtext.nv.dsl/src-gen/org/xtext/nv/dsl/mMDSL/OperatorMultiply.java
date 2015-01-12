/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Multiply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getModulo <em>Modulo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorMultiply()
 * @model
 * @generated
 */
public interface OperatorMultiply extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiply</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiply</em>' attribute.
   * @see #setMultiply(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorMultiply_Multiply()
   * @model
   * @generated
   */
  String getMultiply();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getMultiply <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiply</em>' attribute.
   * @see #getMultiply()
   * @generated
   */
  void setMultiply(String value);

  /**
   * Returns the value of the '<em><b>Divide</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Divide</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Divide</em>' attribute.
   * @see #setDivide(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorMultiply_Divide()
   * @model
   * @generated
   */
  String getDivide();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getDivide <em>Divide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Divide</em>' attribute.
   * @see #getDivide()
   * @generated
   */
  void setDivide(String value);

  /**
   * Returns the value of the '<em><b>Modulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modulo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modulo</em>' attribute.
   * @see #setModulo(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorMultiply_Modulo()
   * @model
   * @generated
   */
  String getModulo();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getModulo <em>Modulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modulo</em>' attribute.
   * @see #getModulo()
   * @generated
   */
  void setModulo(String value);

} // OperatorMultiply
