/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFillcolor <em>Fillcolor</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokecolor <em>Strokecolor</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle()
 * @model
 * @generated
 */
public interface SymbolStyle extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fillcolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fillcolor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fillcolor</em>' containment reference.
   * @see #setFillcolor(FillColor)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Fillcolor()
   * @model containment="true"
   * @generated
   */
  FillColor getFillcolor();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFillcolor <em>Fillcolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fillcolor</em>' containment reference.
   * @see #getFillcolor()
   * @generated
   */
  void setFillcolor(FillColor value);

  /**
   * Returns the value of the '<em><b>Strokecolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strokecolor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strokecolor</em>' containment reference.
   * @see #setStrokecolor(StrokeColor)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Strokecolor()
   * @model containment="true"
   * @generated
   */
  StrokeColor getStrokecolor();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokecolor <em>Strokecolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strokecolor</em>' containment reference.
   * @see #getStrokecolor()
   * @generated
   */
  void setStrokecolor(StrokeColor value);

  /**
   * Returns the value of the '<em><b>Strokewidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strokewidth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strokewidth</em>' attribute.
   * @see #setStrokewidth(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Strokewidth()
   * @model
   * @generated
   */
  String getStrokewidth();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokewidth <em>Strokewidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strokewidth</em>' attribute.
   * @see #getStrokewidth()
   * @generated
   */
  void setStrokewidth(String value);

  /**
   * Returns the value of the '<em><b>Fontfamily</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fontfamily</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fontfamily</em>' containment reference.
   * @see #setFontfamily(FontFamily)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Fontfamily()
   * @model containment="true"
   * @generated
   */
  FontFamily getFontfamily();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontfamily <em>Fontfamily</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fontfamily</em>' containment reference.
   * @see #getFontfamily()
   * @generated
   */
  void setFontfamily(FontFamily value);

  /**
   * Returns the value of the '<em><b>Fontsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fontsize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fontsize</em>' attribute.
   * @see #setFontsize(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Fontsize()
   * @model
   * @generated
   */
  String getFontsize();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontsize <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fontsize</em>' attribute.
   * @see #getFontsize()
   * @generated
   */
  void setFontsize(String value);

  /**
   * Returns the value of the '<em><b>Insertembedcode</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insertembedcode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insertembedcode</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getSymbolStyle_Insertembedcode()
   * @model containment="true"
   * @generated
   */
  EList<InsertEmbedCode> getInsertembedcode();

} // SymbolStyle
