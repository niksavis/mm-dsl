/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Variable#getOpassing <em>Opassing</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Variable#getVarstatement <em>Varstatement</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Variable#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Opassing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opassing</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opassing</em>' containment reference.
   * @see #setOpassing(OperatorAssign)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVariable_Opassing()
   * @model containment="true"
   * @generated
   */
  OperatorAssign getOpassing();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Variable#getOpassing <em>Opassing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opassing</em>' containment reference.
   * @see #getOpassing()
   * @generated
   */
  void setOpassing(OperatorAssign value);

  /**
   * Returns the value of the '<em><b>Varstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varstatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varstatement</em>' containment reference.
   * @see #setVarstatement(VarStatement)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVariable_Varstatement()
   * @model containment="true"
   * @generated
   */
  VarStatement getVarstatement();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Variable#getVarstatement <em>Varstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varstatement</em>' containment reference.
   * @see #getVarstatement()
   * @generated
   */
  void setVarstatement(VarStatement value);

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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVariable_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Variable#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // Variable
