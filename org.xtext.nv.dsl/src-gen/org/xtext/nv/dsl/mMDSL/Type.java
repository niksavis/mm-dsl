/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Type#getSimpletype <em>Simpletype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Type#getEnumtype <em>Enumtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Simpletype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.SimpleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simpletype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simpletype</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.SimpleType
   * @see #setSimpletype(SimpleType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getType_Simpletype()
   * @model
   * @generated
   */
  SimpleType getSimpletype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Type#getSimpletype <em>Simpletype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simpletype</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.SimpleType
   * @see #getSimpletype()
   * @generated
   */
  void setSimpletype(SimpleType value);

  /**
   * Returns the value of the '<em><b>Enumtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumtype</em>' containment reference.
   * @see #setEnumtype(EnumType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getType_Enumtype()
   * @model containment="true"
   * @generated
   */
  EnumType getEnumtype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Type#getEnumtype <em>Enumtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumtype</em>' containment reference.
   * @see #getEnumtype()
   * @generated
   */
  void setEnumtype(EnumType value);

} // Type
