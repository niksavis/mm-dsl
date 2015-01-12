/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ClassInstanceDelete#getNameofclassinstance <em>Nameofclassinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceDelete()
 * @model
 * @generated
 */
public interface ClassInstanceDelete extends EObject
{
  /**
   * Returns the value of the '<em><b>Nameofclassinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nameofclassinstance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nameofclassinstance</em>' reference.
   * @see #setNameofclassinstance(ClassInstanceCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceDelete_Nameofclassinstance()
   * @model
   * @generated
   */
  ClassInstanceCreate getNameofclassinstance();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceDelete#getNameofclassinstance <em>Nameofclassinstance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofclassinstance</em>' reference.
   * @see #getNameofclassinstance()
   * @generated
   */
  void setNameofclassinstance(ClassInstanceCreate value);

} // ClassInstanceDelete
