/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Event#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Event#getAlgorithmname <em>Algorithmname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.nv.dsl.mMDSL.EventName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.EventName
   * @see #setName(EventName)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEvent_Name()
   * @model
   * @generated
   */
  EventName getName();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.xtext.nv.dsl.mMDSL.EventName
   * @see #getName()
   * @generated
   */
  void setName(EventName value);

  /**
   * Returns the value of the '<em><b>Algorithmname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithmname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithmname</em>' reference.
   * @see #setAlgorithmname(Algorithm)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEvent_Algorithmname()
   * @model
   * @generated
   */
  Algorithm getAlgorithmname();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.Event#getAlgorithmname <em>Algorithmname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithmname</em>' reference.
   * @see #getAlgorithmname()
   * @generated
   */
  void setAlgorithmname(Algorithm value);

} // Event
