/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getSubtract <em>Subtract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAdd()
 * @model
 * @generated
 */
public interface OperatorAdd extends EObject
{
  /**
   * Returns the value of the '<em><b>Add</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add</em>' attribute.
   * @see #setAdd(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAdd_Add()
   * @model
   * @generated
   */
  String getAdd();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getAdd <em>Add</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add</em>' attribute.
   * @see #getAdd()
   * @generated
   */
  void setAdd(String value);

  /**
   * Returns the value of the '<em><b>Subtract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtract</em>' attribute.
   * @see #setSubtract(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAdd_Subtract()
   * @model
   * @generated
   */
  String getSubtract();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getSubtract <em>Subtract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtract</em>' attribute.
   * @see #getSubtract()
   * @generated
   */
  void setSubtract(String value);

} // OperatorAdd
