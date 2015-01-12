/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Instance Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGet#getNameofrelationinstance <em>Nameofrelationinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceGet()
 * @model
 * @generated
 */
public interface RelationInstanceGet extends EObject
{
  /**
   * Returns the value of the '<em><b>Nameofrelationinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nameofrelationinstance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nameofrelationinstance</em>' reference.
   * @see #setNameofrelationinstance(RelationInstanceCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRelationInstanceGet_Nameofrelationinstance()
   * @model
   * @generated
   */
  RelationInstanceCreate getNameofrelationinstance();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGet#getNameofrelationinstance <em>Nameofrelationinstance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofrelationinstance</em>' reference.
   * @see #getNameofrelationinstance()
   * @generated
   */
  void setNameofrelationinstance(RelationInstanceCreate value);

} // RelationInstanceGet
