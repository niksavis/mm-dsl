/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Statement#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Statement#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Statement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Statement#getAlgorithmoperation <em>Algorithmoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Statement#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(SelectionStatement)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement_Selection()
   * @model containment="true"
   * @generated
   */
  SelectionStatement getSelection();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Statement#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(SelectionStatement value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(LoopStatement)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement_Loop()
   * @model containment="true"
   * @generated
   */
  LoopStatement getLoop();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Statement#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(LoopStatement value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Statement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Algorithmoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithmoperation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithmoperation</em>' containment reference.
   * @see #setAlgorithmoperation(AlgorithmOperation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement_Algorithmoperation()
   * @model containment="true"
   * @generated
   */
  AlgorithmOperation getAlgorithmoperation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Statement#getAlgorithmoperation <em>Algorithmoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithmoperation</em>' containment reference.
   * @see #getAlgorithmoperation()
   * @generated
   */
  void setAlgorithmoperation(AlgorithmOperation value);

  /**
   * Returns the value of the '<em><b>Insertembedcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertembedcode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertembedcode</em>' containment reference.
   * @see #setInsertembedcode(InsertEmbedCode)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getStatement_Insertembedcode()
   * @model containment="true"
   * @generated
   */
  InsertEmbedCode getInsertembedcode();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Statement#getInsertembedcode <em>Insertembedcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertembedcode</em>' containment reference.
   * @see #getInsertembedcode()
   * @generated
   */
  void setInsertembedcode(InsertEmbedCode value);

} // Statement
