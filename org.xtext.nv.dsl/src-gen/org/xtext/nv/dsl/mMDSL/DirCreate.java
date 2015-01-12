/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dir Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.DirCreate#getDirname <em>Dirname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getDirCreate()
 * @model
 * @generated
 */
public interface DirCreate extends EObject
{
  /**
   * Returns the value of the '<em><b>Dirname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dirname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dirname</em>' attribute.
   * @see #setDirname(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getDirCreate_Dirname()
   * @model
   * @generated
   */
  String getDirname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.DirCreate#getDirname <em>Dirname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dirname</em>' attribute.
   * @see #getDirname()
   * @generated
   */
  void setDirname(String value);

} // DirCreate
