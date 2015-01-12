/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getParentclassname <em>Parentclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getInsertembedcode <em>Insertembedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Class#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parentclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parentclassname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parentclassname</em>' reference.
   * @see #setParentclassname(Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Parentclassname()
   * @model
   * @generated
   */
  Class getParentclassname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Class#getParentclassname <em>Parentclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parentclassname</em>' reference.
   * @see #getParentclassname()
   * @generated
   */
  void setParentclassname(Class value);

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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Symbolclass()
   * @model
   * @generated
   */
  SymbolClass getSymbolclass();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Class#getSymbolclass <em>Symbolclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolclass</em>' reference.
   * @see #getSymbolclass()
   * @generated
   */
  void setSymbolclass(SymbolClass value);

  /**
   * Returns the value of the '<em><b>Classattribute</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.ClassAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classattribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classattribute</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Classattribute()
   * @model containment="true"
   * @generated
   */
  EList<ClassAttribute> getClassattribute();

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Insertembedcode()
   * @model containment="true"
   * @generated
   */
  EList<InsertEmbedCode> getInsertembedcode();

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getClass_Reference()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReference();

} // Class
