/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfcondition <em>Ifcondition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfblock <em>Ifblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifcondition <em>Elseifcondition</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifblock <em>Elseifblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseblock <em>Elseblock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement()
 * @model
 * @generated
 */
public interface SelectionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifcondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifcondition</em>' containment reference.
   * @see #setIfcondition(Expr)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement_Ifcondition()
   * @model containment="true"
   * @generated
   */
  Expr getIfcondition();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfcondition <em>Ifcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifcondition</em>' containment reference.
   * @see #getIfcondition()
   * @generated
   */
  void setIfcondition(Expr value);

  /**
   * Returns the value of the '<em><b>Ifblock</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifblock</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement_Ifblock()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getIfblock();

  /**
   * Returns the value of the '<em><b>Elseifcondition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseifcondition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseifcondition</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement_Elseifcondition()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getElseifcondition();

  /**
   * Returns the value of the '<em><b>Elseifblock</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseifblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseifblock</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement_Elseifblock()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseifblock();

  /**
   * Returns the value of the '<em><b>Elseblock</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseblock</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSelectionStatement_Elseblock()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseblock();

} // SelectionStatement
