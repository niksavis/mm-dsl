/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributename <em>Attributename</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeget <em>Attributeget</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeset <em>Attributeset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeOperation()
 * @model
 * @generated
 */
public interface AttributeOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributename</em>' reference.
   * @see #setAttributename(Attribute)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeOperation_Attributename()
   * @model
   * @generated
   */
  Attribute getAttributename();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributename <em>Attributename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributename</em>' reference.
   * @see #getAttributename()
   * @generated
   */
  void setAttributename(Attribute value);

  /**
   * Returns the value of the '<em><b>Attributeget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributeget</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributeget</em>' containment reference.
   * @see #setAttributeget(AttributeGet)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeOperation_Attributeget()
   * @model containment="true"
   * @generated
   */
  AttributeGet getAttributeget();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeget <em>Attributeget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributeget</em>' containment reference.
   * @see #getAttributeget()
   * @generated
   */
  void setAttributeget(AttributeGet value);

  /**
   * Returns the value of the '<em><b>Attributeset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributeset</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributeset</em>' containment reference.
   * @see #setAttributeset(AttributeSet)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeOperation_Attributeset()
   * @model containment="true"
   * @generated
   */
  AttributeSet getAttributeset();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeset <em>Attributeset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributeset</em>' containment reference.
   * @see #getAttributeset()
   * @generated
   */
  void setAttributeset(AttributeSet value);

} // AttributeOperation
