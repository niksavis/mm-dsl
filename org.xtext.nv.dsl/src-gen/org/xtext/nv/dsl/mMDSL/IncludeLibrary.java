/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getIncludelibrarytype <em>Includelibrarytype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getIncludeLibrary()
 * @model
 * @generated
 */
public interface IncludeLibrary extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getIncludeLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Includelibrarytype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includelibrarytype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includelibrarytype</em>' reference.
   * @see #setIncludelibrarytype(IncludeLibraryType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getIncludeLibrary_Includelibrarytype()
   * @model
   * @generated
   */
  IncludeLibraryType getIncludelibrarytype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getIncludelibrarytype <em>Includelibrarytype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includelibrarytype</em>' reference.
   * @see #getIncludelibrarytype()
   * @generated
   */
  void setIncludelibrarytype(IncludeLibraryType value);

} // IncludeLibrary
