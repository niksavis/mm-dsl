/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolstyle <em>Symbolstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Method#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Enumeration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Enumeration()
   * @model containment="true"
   * @generated
   */
  EList<Enumeration> getEnumeration();

  /**
   * Returns the value of the '<em><b>Symbolstyle</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SymbolStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolstyle</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolstyle</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Symbolstyle()
   * @model containment="true"
   * @generated
   */
  EList<SymbolStyle> getSymbolstyle();

  /**
   * Returns the value of the '<em><b>Symbolclass</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SymbolClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolclass</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolclass</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Symbolclass()
   * @model containment="true"
   * @generated
   */
  EList<SymbolClass> getSymbolclass();

  /**
   * Returns the value of the '<em><b>Symbolrelation</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SymbolRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolrelation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolrelation</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Symbolrelation()
   * @model containment="true"
   * @generated
   */
  EList<SymbolRelation> getSymbolrelation();

  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference.
   * @see #setMetamodel(Metamodel)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Metamodel()
   * @model containment="true"
   * @generated
   */
  Metamodel getMetamodel();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Method#getMetamodel <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' containment reference.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(Metamodel value);

  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Algorithm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Algorithm()
   * @model containment="true"
   * @generated
   */
  EList<Algorithm> getAlgorithm();

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMethod_Event()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvent();

} // Method
