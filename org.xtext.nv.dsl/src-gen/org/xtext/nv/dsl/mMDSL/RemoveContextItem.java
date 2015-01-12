/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Context Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RemoveContextItem#getContextitem <em>Contextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRemoveContextItem()
 * @model
 * @generated
 */
public interface RemoveContextItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Contextitem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextitem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextitem</em>' reference.
   * @see #setContextitem(InsertContextItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRemoveContextItem_Contextitem()
   * @model
   * @generated
   */
  InsertContextItem getContextitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RemoveContextItem#getContextitem <em>Contextitem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contextitem</em>' reference.
   * @see #getContextitem()
   * @generated
   */
  void setContextitem(InsertContextItem value);

} // RemoveContextItem
