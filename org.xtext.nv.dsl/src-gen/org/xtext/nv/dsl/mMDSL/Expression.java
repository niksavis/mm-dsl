/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getAtomic <em>Atomic</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getTrue <em>True</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getFalse <em>False</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getValueRealNumber <em>Value Real Number</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Expression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(EObject)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(EObject value);

  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Expression)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Operand()
   * @model containment="true"
   * @generated
   */
  Expression getOperand();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Expression value);

  /**
   * Returns the value of the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic</em>' containment reference.
   * @see #setAtomic(Expression)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Atomic()
   * @model containment="true"
   * @generated
   */
  Expression getAtomic();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getAtomic <em>Atomic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic</em>' containment reference.
   * @see #getAtomic()
   * @generated
   */
  void setAtomic(Expression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_True()
   * @model
   * @generated
   */
  String getTrue();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #getTrue()
   * @generated
   */
  void setTrue(String value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_False()
   * @model
   * @generated
   */
  String getFalse();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #getFalse()
   * @generated
   */
  void setFalse(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value String</em>' attribute.
   * @see #setValueString(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_ValueString()
   * @model
   * @generated
   */
  String getValueString();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getValueString <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value String</em>' attribute.
   * @see #getValueString()
   * @generated
   */
  void setValueString(String value);

  /**
   * Returns the value of the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Real Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Real Number</em>' attribute.
   * @see #setValueRealNumber(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_ValueRealNumber()
   * @model
   * @generated
   */
  String getValueRealNumber();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getValueRealNumber <em>Value Real Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Real Number</em>' attribute.
   * @see #getValueRealNumber()
   * @generated
   */
  void setValueRealNumber(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Expression
