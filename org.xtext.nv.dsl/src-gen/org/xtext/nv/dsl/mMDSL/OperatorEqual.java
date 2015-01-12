/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getNotequal <em>Notequal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorEqual()
 * @model
 * @generated
 */
public interface OperatorEqual extends EObject
{
  /**
   * Returns the value of the '<em><b>Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equal</em>' attribute.
   * @see #setEqual(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorEqual_Equal()
   * @model
   * @generated
   */
  String getEqual();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getEqual <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equal</em>' attribute.
   * @see #getEqual()
   * @generated
   */
  void setEqual(String value);

  /**
   * Returns the value of the '<em><b>Notequal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notequal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notequal</em>' attribute.
   * @see #setNotequal(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorEqual_Notequal()
   * @model
   * @generated
   */
  String getNotequal();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getNotequal <em>Notequal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notequal</em>' attribute.
   * @see #getNotequal()
   * @generated
   */
  void setNotequal(String value);

} // OperatorEqual
