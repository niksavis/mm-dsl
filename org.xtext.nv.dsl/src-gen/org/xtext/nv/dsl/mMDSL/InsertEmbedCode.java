/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Embed Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode#getCodesnippetname <em>Codesnippetname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getInsertEmbedCode()
 * @model
 * @generated
 */
public interface InsertEmbedCode extends EObject
{
  /**
   * Returns the value of the '<em><b>Codesnippetname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Codesnippetname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codesnippetname</em>' reference.
   * @see #setCodesnippetname(EmbedCode)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getInsertEmbedCode_Codesnippetname()
   * @model
   * @generated
   */
  EmbedCode getCodesnippetname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode#getCodesnippetname <em>Codesnippetname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Codesnippetname</em>' reference.
   * @see #getCodesnippetname()
   * @generated
   */
  void setCodesnippetname(EmbedCode value);

} // InsertEmbedCode
