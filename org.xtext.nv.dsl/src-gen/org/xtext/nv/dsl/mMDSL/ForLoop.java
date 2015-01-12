/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStop <em>Stop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ForLoop#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ForLoop#getForblock <em>Forblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ForLoop#getBreakcontinue <em>Breakcontinue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop</em>' attribute.
   * @see #setStop(int)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop_Stop()
   * @model
   * @generated
   */
  int getStop();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStop <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop</em>' attribute.
   * @see #getStop()
   * @generated
   */
  void setStop(int value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(int)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop_Interval()
   * @model
   * @generated
   */
  int getInterval();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(int value);

  /**
   * Returns the value of the '<em><b>Forblock</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forblock</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop_Forblock()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getForblock();

  /**
   * Returns the value of the '<em><b>Breakcontinue</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.BreakContinue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Breakcontinue</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Breakcontinue</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getForLoop_Breakcontinue()
   * @model containment="true"
   * @generated
   */
  EList<BreakContinue> getBreakcontinue();

} // ForLoop
