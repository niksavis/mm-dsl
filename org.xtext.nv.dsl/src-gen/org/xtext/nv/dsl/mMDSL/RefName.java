/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RefName#getModeltypename <em>Modeltypename</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.RefName#getClassname <em>Classname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRefName()
 * @model
 * @generated
 */
public interface RefName extends EObject
{
  /**
   * Returns the value of the '<em><b>Modeltypename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeltypename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeltypename</em>' reference.
   * @see #setModeltypename(ModelType)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRefName_Modeltypename()
   * @model
   * @generated
   */
  ModelType getModeltypename();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RefName#getModeltypename <em>Modeltypename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modeltypename</em>' reference.
   * @see #getModeltypename()
   * @generated
   */
  void setModeltypename(ModelType value);

  /**
   * Returns the value of the '<em><b>Classname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' reference.
   * @see #setClassname(org.xtext.nv.dsl.mMDSL.Class)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getRefName_Classname()
   * @model
   * @generated
   */
  org.xtext.nv.dsl.mMDSL.Class getClassname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.RefName#getClassname <em>Classname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' reference.
   * @see #getClassname()
   * @generated
   */
  void setClassname(org.xtext.nv.dsl.mMDSL.Class value);

} // RefName
