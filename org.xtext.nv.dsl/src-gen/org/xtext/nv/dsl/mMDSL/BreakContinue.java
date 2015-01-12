/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Continue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getBreak <em>Break</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getBreakContinue()
 * @model
 * @generated
 */
public interface BreakContinue extends EObject
{
  /**
   * Returns the value of the '<em><b>Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Break</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Break</em>' attribute.
   * @see #setBreak(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getBreakContinue_Break()
   * @model
   * @generated
   */
  String getBreak();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getBreak <em>Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Break</em>' attribute.
   * @see #getBreak()
   * @generated
   */
  void setBreak(String value);

  /**
   * Returns the value of the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continue</em>' attribute.
   * @see #setContinue(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getBreakContinue_Continue()
   * @model
   * @generated
   */
  String getContinue();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getContinue <em>Continue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continue</em>' attribute.
   * @see #getContinue()
   * @generated
   */
  void setContinue(String value);

} // BreakContinue
