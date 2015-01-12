/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Instance Get All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll#getNameofrelation <em>Nameofrelation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceGetAll()
 * @model
 * @generated
 */
public interface RelationInstanceGetAll extends EObject
{
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceGetAll_Nameofrelation()
   * @model
   * @generated
   */
  Relation getNameofrelation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll#getNameofrelation <em>Nameofrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofrelation</em>' reference.
   * @see #getNameofrelation()
   * @generated
   */
  void setNameofrelation(Relation value);

} // RelationInstanceGetAll
