/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelType#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelType#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelType#getRelationname <em>Relationname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelType#getModename <em>Modename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends EObject
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
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Classname</b></em>' reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelType_Classname()
   * @model
   * @generated
   */
  EList<org.xtext.nv.dsl.mMDSL.Class> getClassname();

  /**
   * Returns the value of the '<em><b>Relationname</b></em>' reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationname</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationname</em>' reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelType_Relationname()
   * @model
   * @generated
   */
  EList<Relation> getRelationname();

  /**
   * Returns the value of the '<em><b>Modename</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modename</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modename</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelType_Modename()
   * @model containment="true"
   * @generated
   */
  EList<Mode> getModename();

} // ModelType
