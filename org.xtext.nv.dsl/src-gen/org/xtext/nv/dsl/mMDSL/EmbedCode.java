/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embed Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedplatformtype <em>Embedplatformtype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedcodetype <em>Embedcodetype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbeddedcode <em>Embeddedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEmbedCode()
 * @model
 * @generated
 */
public interface EmbedCode extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEmbedCode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Embedplatformtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedplatformtype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedplatformtype</em>' reference.
   * @see #setEmbedplatformtype(EmbedPlatformType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEmbedCode_Embedplatformtype()
   * @model
   * @generated
   */
  EmbedPlatformType getEmbedplatformtype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedplatformtype <em>Embedplatformtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedplatformtype</em>' reference.
   * @see #getEmbedplatformtype()
   * @generated
   */
  void setEmbedplatformtype(EmbedPlatformType value);

  /**
   * Returns the value of the '<em><b>Embedcodetype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedcodetype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedcodetype</em>' reference.
   * @see #setEmbedcodetype(EmbedCodeType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEmbedCode_Embedcodetype()
   * @model
   * @generated
   */
  EmbedCodeType getEmbedcodetype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedcodetype <em>Embedcodetype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedcodetype</em>' reference.
   * @see #getEmbedcodetype()
   * @generated
   */
  void setEmbedcodetype(EmbedCodeType value);

  /**
   * Returns the value of the '<em><b>Embeddedcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embeddedcode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embeddedcode</em>' attribute.
   * @see #setEmbeddedcode(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEmbedCode_Embeddedcode()
   * @model
   * @generated
   */
  String getEmbeddedcode();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbeddedcode <em>Embeddedcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embeddedcode</em>' attribute.
   * @see #getEmbeddedcode()
   * @generated
   */
  void setEmbeddedcode(String value);

} // EmbedCode
