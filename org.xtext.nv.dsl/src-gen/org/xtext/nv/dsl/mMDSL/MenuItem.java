/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.MenuItem#getInsertmenuitem <em>Insertmenuitem</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.MenuItem#getRemovemenuitem <em>Removemenuitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMenuItem()
 * @model
 * @generated
 */
public interface MenuItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Insertmenuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertmenuitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertmenuitem</em>' containment reference.
   * @see #setInsertmenuitem(InsertMenuItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMenuItem_Insertmenuitem()
   * @model containment="true"
   * @generated
   */
  InsertMenuItem getInsertmenuitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.MenuItem#getInsertmenuitem <em>Insertmenuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insertmenuitem</em>' containment reference.
   * @see #getInsertmenuitem()
   * @generated
   */
  void setInsertmenuitem(InsertMenuItem value);

  /**
   * Returns the value of the '<em><b>Removemenuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removemenuitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removemenuitem</em>' containment reference.
   * @see #setRemovemenuitem(RemoveMenuItem)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getMenuItem_Removemenuitem()
   * @model containment="true"
   * @generated
   */
  RemoveMenuItem getRemovemenuitem();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.MenuItem#getRemovemenuitem <em>Removemenuitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Removemenuitem</em>' containment reference.
   * @see #getRemovemenuitem()
   * @generated
   */
  void setRemovemenuitem(RemoveMenuItem value);

} // MenuItem
