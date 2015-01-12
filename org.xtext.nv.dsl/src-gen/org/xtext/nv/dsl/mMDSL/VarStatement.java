/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAlgorithmoperation <em>Algorithmoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolstyle <em>Symbolstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getEmbeddedcode <em>Embeddedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.VarStatement#getModeltype <em>Modeltype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement()
 * @model
 * @generated
 */
public interface VarStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expr)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expr getExpression();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expr value);

  /**
   * Returns the value of the '<em><b>Algorithmoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithmoperation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithmoperation</em>' containment reference.
   * @see #setAlgorithmoperation(AlgorithmOperation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Algorithmoperation()
   * @model containment="true"
   * @generated
   */
  AlgorithmOperation getAlgorithmoperation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAlgorithmoperation <em>Algorithmoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithmoperation</em>' containment reference.
   * @see #getAlgorithmoperation()
   * @generated
   */
  void setAlgorithmoperation(AlgorithmOperation value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(org.xtext.nv.dsl.mMDSL.Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Class()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getClass_();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(org.xtext.nv.dsl.mMDSL.Class value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Reference)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Reference()
   * @model
   * @generated
   */
  Reference getReference();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Reference value);

  /**
   * Returns the value of the '<em><b>Symbolclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolclass</em>' reference.
   * @see #setSymbolclass(SymbolClass)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Symbolclass()
   * @model
   * @generated
   */
  SymbolClass getSymbolclass();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolclass <em>Symbolclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolclass</em>' reference.
   * @see #getSymbolclass()
   * @generated
   */
  void setSymbolclass(SymbolClass value);

  /**
   * Returns the value of the '<em><b>Symbolrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolrelation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolrelation</em>' reference.
   * @see #setSymbolrelation(SymbolRelation)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Symbolrelation()
   * @model
   * @generated
   */
  SymbolRelation getSymbolrelation();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolrelation <em>Symbolrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolrelation</em>' reference.
   * @see #getSymbolrelation()
   * @generated
   */
  void setSymbolrelation(SymbolRelation value);

  /**
   * Returns the value of the '<em><b>Symbolstyle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolstyle</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolstyle</em>' reference.
   * @see #setSymbolstyle(SymbolStyle)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Symbolstyle()
   * @model
   * @generated
   */
  SymbolStyle getSymbolstyle();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolstyle <em>Symbolstyle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolstyle</em>' reference.
   * @see #getSymbolstyle()
   * @generated
   */
  void setSymbolstyle(SymbolStyle value);

  /**
   * Returns the value of the '<em><b>Embeddedcode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embeddedcode</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embeddedcode</em>' reference.
   * @see #setEmbeddedcode(EmbedCode)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Embeddedcode()
   * @model
   * @generated
   */
  EmbedCode getEmbeddedcode();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getEmbeddedcode <em>Embeddedcode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embeddedcode</em>' reference.
   * @see #getEmbeddedcode()
   * @generated
   */
  void setEmbeddedcode(EmbedCode value);

  /**
   * Returns the value of the '<em><b>Modeltype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeltype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeltype</em>' reference.
   * @see #setModeltype(ModelType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getVarStatement_Modeltype()
   * @model
   * @generated
   */
  ModelType getModeltype();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getModeltype <em>Modeltype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modeltype</em>' reference.
   * @see #getModeltype()
   * @generated
   */
  void setModeltype(ModelType value);

} // VarStatement
