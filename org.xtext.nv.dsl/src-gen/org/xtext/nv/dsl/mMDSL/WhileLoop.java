/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getWhileblock <em>Whileblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getBreakcontinue <em>Breakcontinue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expr)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getWhileLoop_Condition()
   * @model containment="true"
   * @generated
   */
  Expr getCondition();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expr value);

  /**
   * Returns the value of the '<em><b>Whileblock</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whileblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whileblock</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getWhileLoop_Whileblock()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getWhileblock();

  /**
   * Returns the value of the '<em><b>Breakcontinue</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.BreakContinue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Breakcontinue</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Breakcontinue</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getWhileLoop_Breakcontinue()
   * @model containment="true"
   * @generated
   */
  EList<BreakContinue> getBreakcontinue();

} // WhileLoop
