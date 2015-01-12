/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getIncludelibrarytype <em>Includelibrarytype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedplatformtype <em>Embedplatformtype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedcodetype <em>Embedcodetype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getIncludelibrary <em>Includelibrary</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedcode <em>Embedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Root#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Methodname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodname</em>' containment reference.
   * @see #setMethodname(MethodName)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Methodname()
   * @model containment="true"
   * @generated
   */
  MethodName getMethodname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Root#getMethodname <em>Methodname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodname</em>' containment reference.
   * @see #getMethodname()
   * @generated
   */
  void setMethodname(MethodName value);

  /**
   * Returns the value of the '<em><b>Includelibrarytype</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.IncludeLibraryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includelibrarytype</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includelibrarytype</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Includelibrarytype()
   * @model containment="true"
   * @generated
   */
  EList<IncludeLibraryType> getIncludelibrarytype();

  /**
   * Returns the value of the '<em><b>Embedplatformtype</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.EmbedPlatformType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedplatformtype</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedplatformtype</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Embedplatformtype()
   * @model containment="true"
   * @generated
   */
  EList<EmbedPlatformType> getEmbedplatformtype();

  /**
   * Returns the value of the '<em><b>Embedcodetype</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.EmbedCodeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedcodetype</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedcodetype</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Embedcodetype()
   * @model containment="true"
   * @generated
   */
  EList<EmbedCodeType> getEmbedcodetype();

  /**
   * Returns the value of the '<em><b>Includelibrary</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.IncludeLibrary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includelibrary</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includelibrary</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Includelibrary()
   * @model containment="true"
   * @generated
   */
  EList<IncludeLibrary> getIncludelibrary();

  /**
   * Returns the value of the '<em><b>Embedcode</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.EmbedCode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedcode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedcode</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Embedcode()
   * @model containment="true"
   * @generated
   */
  EList<EmbedCode> getEmbedcode();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(Method)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRoot_Method()
   * @model containment="true"
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Root#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

} // Root
