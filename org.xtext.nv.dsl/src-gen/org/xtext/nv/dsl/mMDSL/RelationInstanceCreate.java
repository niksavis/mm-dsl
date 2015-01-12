/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Instance Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getNameofrelation <em>Nameofrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstancefrom <em>Classinstancefrom</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstanceto <em>Classinstanceto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceCreate()
 * @model
 * @generated
 */
public interface RelationInstanceCreate extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceCreate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nameofrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nameofrelation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nameofrelation</em>' reference.
   * @see #setNameofrelation(Relation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceCreate_Nameofrelation()
   * @model
   * @generated
   */
  Relation getNameofrelation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getNameofrelation <em>Nameofrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofrelation</em>' reference.
   * @see #getNameofrelation()
   * @generated
   */
  void setNameofrelation(Relation value);

  /**
   * Returns the value of the '<em><b>Classinstancefrom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classinstancefrom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classinstancefrom</em>' reference.
   * @see #setClassinstancefrom(ClassInstanceCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceCreate_Classinstancefrom()
   * @model
   * @generated
   */
  ClassInstanceCreate getClassinstancefrom();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstancefrom <em>Classinstancefrom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classinstancefrom</em>' reference.
   * @see #getClassinstancefrom()
   * @generated
   */
  void setClassinstancefrom(ClassInstanceCreate value);

  /**
   * Returns the value of the '<em><b>Classinstanceto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classinstanceto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classinstanceto</em>' reference.
   * @see #setClassinstanceto(ClassInstanceCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceCreate_Classinstanceto()
   * @model
   * @generated
   */
  ClassInstanceCreate getClassinstanceto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstanceto <em>Classinstanceto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classinstanceto</em>' reference.
   * @see #getClassinstanceto()
   * @generated
   */
  void setClassinstanceto(ClassInstanceCreate value);

} // RelationInstanceCreate
