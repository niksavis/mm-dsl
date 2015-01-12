/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getGlobalstyle <em>Globalstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsfrom <em>Svgcommandsfrom</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsmiddle <em>Svgcommandsmiddle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsto <em>Svgcommandsto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation()
 * @model
 * @generated
 */
public interface SymbolRelation extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation_Globalstyle()
   * @model
   * @generated
   */
  SymbolStyle getGlobalstyle();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getGlobalstyle <em>Globalstyle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Globalstyle</em>' reference.
   * @see #getGlobalstyle()
   * @generated
   */
  void setGlobalstyle(SymbolStyle value);

  /**
   * Returns the value of the '<em><b>Svgcommandsfrom</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SVGCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Svgcommandsfrom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Svgcommandsfrom</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation_Svgcommandsfrom()
   * @model containment="true"
   * @generated
   */
  EList<SVGCommand> getSvgcommandsfrom();

  /**
   * Returns the value of the '<em><b>Svgcommandsmiddle</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SVGCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Svgcommandsmiddle</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Svgcommandsmiddle</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation_Svgcommandsmiddle()
   * @model containment="true"
   * @generated
   */
  EList<SVGCommand> getSvgcommandsmiddle();

  /**
   * Returns the value of the '<em><b>Svgcommandsto</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.SVGCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Svgcommandsto</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Svgcommandsto</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolRelation_Svgcommandsto()
   * @model containment="true"
   * @generated
   */
  EList<SVGCommand> getSvgcommandsto();

} // SymbolRelation
