/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getClassinstance <em>Classinstance</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getRelationinstance <em>Relationinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getInstanceOperation()
 * @model
 * @generated
 */
public interface InstanceOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Classinstance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classinstance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classinstance</em>' containment reference.
   * @see #setClassinstance(ClassInstance)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getInstanceOperation_Classinstance()
   * @model containment="true"
   * @generated
   */
  ClassInstance getClassinstance();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getClassinstance <em>Classinstance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classinstance</em>' containment reference.
   * @see #getClassinstance()
   * @generated
   */
  void setClassinstance(ClassInstance value);

  /**
   * Returns the value of the '<em><b>Relationinstance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationinstance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationinstance</em>' containment reference.
   * @see #setRelationinstance(RelationInstance)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getInstanceOperation_Relationinstance()
   * @model containment="true"
   * @generated
   */
  RelationInstance getRelationinstance();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getRelationinstance <em>Relationinstance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationinstance</em>' containment reference.
   * @see #getRelationinstance()
   * @generated
   */
  void setRelationinstance(RelationInstance value);

} // InstanceOperation
