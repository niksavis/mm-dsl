/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Polyline#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends EObject
{
  /**
   * Returns the value of the '<em><b>Points</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.Points}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPolyline_Points()
   * @model containment="true"
   * @generated
   */
  EList<Points> getPoints();

} // Polyline
