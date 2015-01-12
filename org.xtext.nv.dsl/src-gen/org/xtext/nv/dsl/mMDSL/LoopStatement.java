/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getWhiletloop <em>Whiletloop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getForloop <em>Forloop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Whiletloop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whiletloop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whiletloop</em>' containment reference.
   * @see #setWhiletloop(WhileLoop)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getLoopStatement_Whiletloop()
   * @model containment="true"
   * @generated
   */
  WhileLoop getWhiletloop();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getWhiletloop <em>Whiletloop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whiletloop</em>' containment reference.
   * @see #getWhiletloop()
   * @generated
   */
  void setWhiletloop(WhileLoop value);

  /**
   * Returns the value of the '<em><b>Forloop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forloop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forloop</em>' containment reference.
   * @see #setForloop(ForLoop)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getLoopStatement_Forloop()
   * @model containment="true"
   * @generated
   */
  ForLoop getForloop();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getForloop <em>Forloop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forloop</em>' containment reference.
   * @see #getForloop()
   * @generated
   */
  void setForloop(ForLoop value);

} // LoopStatement
