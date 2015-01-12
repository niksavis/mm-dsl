/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getNameofclass <em>Nameofclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceCreate()
 * @model
 * @generated
 */
public interface ClassInstanceCreate extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceCreate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClassInstanceCreate_Nameofclass()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getNameofclass();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getNameofclass <em>Nameofclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameofclass</em>' reference.
   * @see #getNameofclass()
   * @generated
   */
  void setNameofclass(org.xtext.nv.dsl.mMDSL.Class value);

} // ClassInstanceCreate
