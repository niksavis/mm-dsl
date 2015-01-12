/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getParentrelationname <em>Parentrelationname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getFromclassname <em>Fromclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getToclassname <em>Toclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Relation#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Relation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parentrelationname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parentrelationname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parentrelationname</em>' reference.
   * @see #setParentrelationname(Relation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Parentrelationname()
   * @model
   * @generated
   */
  Relation getParentrelationname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Relation#getParentrelationname <em>Parentrelationname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parentrelationname</em>' reference.
   * @see #getParentrelationname()
   * @generated
   */
  void setParentrelationname(Relation value);

  /**
   * Returns the value of the '<em><b>Symbolrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolrelation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolrelation</em>' reference.
   * @see #setSymbolrelation(SymbolRelation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Symbolrelation()
   * @model
   * @generated
   */
  SymbolRelation getSymbolrelation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Relation#getSymbolrelation <em>Symbolrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolrelation</em>' reference.
   * @see #getSymbolrelation()
   * @generated
   */
  void setSymbolrelation(SymbolRelation value);

  /**
   * Returns the value of the '<em><b>Fromclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fromclassname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fromclassname</em>' reference.
   * @see #setFromclassname(org.xtext.nv.dsl.mMDSL.Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Fromclassname()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getFromclassname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Relation#getFromclassname <em>Fromclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fromclassname</em>' reference.
   * @see #getFromclassname()
   * @generated
   */
  void setFromclassname(org.xtext.nv.dsl.mMDSL.Class value);

  /**
   * Returns the value of the '<em><b>Toclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Toclassname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toclassname</em>' reference.
   * @see #setToclassname(org.xtext.nv.dsl.mMDSL.Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Toclassname()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getToclassname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Relation#getToclassname <em>Toclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Toclassname</em>' reference.
   * @see #getToclassname()
   * @generated
   */
  void setToclassname(org.xtext.nv.dsl.mMDSL.Class value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Insertembedcode</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertembedcode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertembedcode</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelation_Insertembedcode()
   * @model containment="true"
   * @generated
   */
  EList<InsertEmbedCode> getInsertembedcode();

} // Relation
