/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.Path#getPathdata <em>Pathdata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject
{
  /**
   * Returns the value of the '<em><b>Pathdata</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.nv.dsl.mMDSL.PathData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pathdata</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pathdata</em>' containment reference list.
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPath_Pathdata()
   * @model containment="true"
   * @generated
   */
  EList<PathData> getPathdata();

} // Path
