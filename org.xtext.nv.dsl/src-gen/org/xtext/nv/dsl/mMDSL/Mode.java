/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Mode#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Mode#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Mode#getRelationname <em>Relationname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Mode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Classname</b></em>' reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMode_Classname()
   * @model
   * @generated
   */
  EList<org.xtext.nv.dsl.mMDSL.Class> getClassname();

  /**
   * Returns the value of the '<em><b>Relationname</b></em>' reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationname</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationname</em>' reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMode_Relationname()
   * @model
   * @generated
   */
  EList<Relation> getRelationname();

} // Mode
