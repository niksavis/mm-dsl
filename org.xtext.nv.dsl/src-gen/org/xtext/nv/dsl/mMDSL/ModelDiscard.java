/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Discard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelDiscard#getModelname <em>Modelname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelDiscard()
 * @model
 * @generated
 */
public interface ModelDiscard extends EObject
{
  /**
   * Returns the value of the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelname</em>' reference.
   * @see #setModelname(ModelCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelDiscard_Modelname()
   * @model
   * @generated
   */
  ModelCreate getModelname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelDiscard#getModelname <em>Modelname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelname</em>' reference.
   * @see #getModelname()
   * @generated
   */
  void setModelname(ModelCreate value);

} // ModelDiscard
