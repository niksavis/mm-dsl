/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Metamodel#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Metamodel#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Metamodel#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Metamodel#getModeltype <em>Modeltype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMetamodel_Class()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.nv.dsl.mMDSL.Class> getClass_();

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMetamodel_Relation()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelation();

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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMetamodel_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Modeltype</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.ModelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeltype</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeltype</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMetamodel_Modeltype()
   * @model containment="true"
   * @generated
   */
  EList<ModelType> getModeltype();

} // Metamodel
