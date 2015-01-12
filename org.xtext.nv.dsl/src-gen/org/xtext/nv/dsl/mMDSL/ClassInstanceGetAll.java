/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance Get All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll#getNameofclass <em>Nameofclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceGetAll()
 * @model
 * @generated
 */
public interface ClassInstanceGetAll extends EObject
{
  /**
   * Returns the value of the '<em><b>Nameofclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nameofclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nameofclass</em>' reference.
   * @see #setNameofclass(org.xtext.nv.dsl.mMDSL.Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceGetAll_Nameofclass()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getNameofclass();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll#getNameofclass <em>Nameofclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofclass</em>' reference.
   * @see #getNameofclass()
   * @generated
   */
  void setNameofclass(org.xtext.nv.dsl.mMDSL.Class value);

} // ClassInstanceGetAll
