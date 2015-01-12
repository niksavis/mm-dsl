/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getMultyassign <em>Multyassign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAssign()
 * @model
 * @generated
 */
public interface OperatorAssign extends EObject
{
  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute.
   * @see #setAssign(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAssign_Assign()
   * @model
   * @generated
   */
  String getAssign();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getAssign <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' attribute.
   * @see #getAssign()
   * @generated
   */
  void setAssign(String value);

  /**
   * Returns the value of the '<em><b>Multyassign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multyassign</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multyassign</em>' containment reference.
   * @see #setMultyassign(OperatorMultyAssign)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getOperatorAssign_Multyassign()
   * @model containment="true"
   * @generated
   */
  OperatorMultyAssign getMultyassign();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getMultyassign <em>Multyassign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multyassign</em>' containment reference.
   * @see #getMultyassign()
   * @generated
   */
  void setMultyassign(OperatorMultyAssign value);

} // OperatorAssign
