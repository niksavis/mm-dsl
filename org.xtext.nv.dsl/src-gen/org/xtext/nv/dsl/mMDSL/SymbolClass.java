/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getGlobalstyle <em>Globalstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getSvgcommand <em>Svgcommand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolClass()
 * @model
 * @generated
 */
public interface SymbolClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Globalstyle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Globalstyle</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globalstyle</em>' reference.
   * @see #setGlobalstyle(SymbolStyle)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolClass_Globalstyle()
   * @model
   * @generated
   */
  SymbolStyle getGlobalstyle();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getGlobalstyle <em>Globalstyle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Globalstyle</em>' reference.
   * @see #getGlobalstyle()
   * @generated
   */
  void setGlobalstyle(SymbolStyle value);

  /**
   * Returns the value of the '<em><b>Svgcommand</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SVGCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Svgcommand</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Svgcommand</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolClass_Svgcommand()
   * @model containment="true"
   * @generated
   */
  EList<SVGCommand> getSvgcommand();

} // SymbolClass
