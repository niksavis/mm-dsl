/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ContextItem#getInsertcontextitem <em>Insertcontextitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ContextItem#getRemovecontextitem <em>Removecontextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getContextItem()
 * @model
 * @generated
 */
public interface ContextItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Insertcontextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertcontextitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertcontextitem</em>' containment reference.
   * @see #setInsertcontextitem(InsertContextItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getContextItem_Insertcontextitem()
   * @model containment="true"
   * @generated
   */
  InsertContextItem getInsertcontextitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ContextItem#getInsertcontextitem <em>Insertcontextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertcontextitem</em>' containment reference.
   * @see #getInsertcontextitem()
   * @generated
   */
  void setInsertcontextitem(InsertContextItem value);

  /**
   * Returns the value of the '<em><b>Removecontextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removecontextitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removecontextitem</em>' containment reference.
   * @see #setRemovecontextitem(RemoveContextItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getContextItem_Removecontextitem()
   * @model containment="true"
   * @generated
   */
  RemoveContextItem getRemovecontextitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ContextItem#getRemovecontextitem <em>Removecontextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Removecontextitem</em>' containment reference.
   * @see #getRemovecontextitem()
   * @generated
   */
  void setRemovecontextitem(RemoveContextItem value);

} // ContextItem
