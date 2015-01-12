/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RemoveMenuItem#getMenuitemname <em>Menuitemname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRemoveMenuItem()
 * @model
 * @generated
 */
public interface RemoveMenuItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Menuitemname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menuitemname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menuitemname</em>' reference.
   * @see #setMenuitemname(InsertMenuItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRemoveMenuItem_Menuitemname()
   * @model
   * @generated
   */
  InsertMenuItem getMenuitemname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RemoveMenuItem#getMenuitemname <em>Menuitemname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menuitemname</em>' reference.
   * @see #getMenuitemname()
   * @generated
   */
  void setMenuitemname(InsertMenuItem value);

} // RemoveMenuItem
