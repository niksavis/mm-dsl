/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.AttributeGet#getAttrgetparams <em>Attrgetparams</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeGet()
 * @model
 * @generated
 */
public interface AttributeGet extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrgetparams</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.AttrGetParams}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrgetparams</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrgetparams</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.AttrGetParams
   * @see #setAttrgetparams(AttrGetParams)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getAttributeGet_Attrgetparams()
   * @model
   * @generated
   */
  AttrGetParams getAttrgetparams();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.AttributeGet#getAttrgetparams <em>Attrgetparams</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrgetparams</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.AttrGetParams
   * @see #getAttrgetparams()
   * @generated
   */
  void setAttrgetparams(AttrGetParams value);

} // AttributeGet
