/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getAttrsetparams <em>Attrsetparams</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueRealNumber <em>Value Real Number</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueVariable <em>Value Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeSet()
 * @model
 * @generated
 */
public interface AttributeSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrsetparams</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.AttrSetParams}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrsetparams</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrsetparams</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.AttrSetParams
   * @see #setAttrsetparams(AttrSetParams)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeSet_Attrsetparams()
   * @model
   * @generated
   */
  AttrSetParams getAttrsetparams();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getAttrsetparams <em>Attrsetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrsetparams</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.AttrSetParams
   * @see #getAttrsetparams()
   * @generated
   */
  void setAttrsetparams(AttrSetParams value);

  /**
   * Returns the value of the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value String</em>' attribute.
   * @see #setValueString(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeSet_ValueString()
   * @model
   * @generated
   */
  String getValueString();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueString <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value String</em>' attribute.
   * @see #getValueString()
   * @generated
   */
  void setValueString(String value);

  /**
   * Returns the value of the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Real Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Real Number</em>' attribute.
   * @see #setValueRealNumber(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeSet_ValueRealNumber()
   * @model
   * @generated
   */
  String getValueRealNumber();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueRealNumber <em>Value Real Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Real Number</em>' attribute.
   * @see #getValueRealNumber()
   * @generated
   */
  void setValueRealNumber(String value);

  /**
   * Returns the value of the '<em><b>Value Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Variable</em>' reference.
   * @see #setValueVariable(Variable)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeSet_ValueVariable()
   * @model
   * @generated
   */
  Variable getValueVariable();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueVariable <em>Value Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Variable</em>' reference.
   * @see #getValueVariable()
   * @generated
   */
  void setValueVariable(Variable value);

} // AttributeSet
