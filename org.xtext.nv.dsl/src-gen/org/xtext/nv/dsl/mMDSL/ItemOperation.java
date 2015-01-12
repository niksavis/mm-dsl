/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getMenuitem <em>Menuitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getContextitem <em>Contextitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getItemOperation()
 * @model
 * @generated
 */
public interface ItemOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Menuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menuitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menuitem</em>' containment reference.
   * @see #setMenuitem(MenuItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getItemOperation_Menuitem()
   * @model containment="true"
   * @generated
   */
  MenuItem getMenuitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getMenuitem <em>Menuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menuitem</em>' containment reference.
   * @see #getMenuitem()
   * @generated
   */
  void setMenuitem(MenuItem value);

  /**
   * Returns the value of the '<em><b>Contextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextitem</em>' containment reference.
   * @see #setContextitem(ContextItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getItemOperation_Contextitem()
   * @model containment="true"
   * @generated
   */
  ContextItem getContextitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getContextitem <em>Contextitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contextitem</em>' containment reference.
   * @see #getContextitem()
   * @generated
   */
  void setContextitem(ContextItem value);

} // ItemOperation
