/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileCopy#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileCopy#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileCopy()
 * @model
 * @generated
 */
public interface FileCopy extends EObject
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' attribute.
   * @see #setSrc(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileCopy_Src()
   * @model
   * @generated
   */
  String getSrc();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileCopy#getSrc <em>Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' attribute.
   * @see #getSrc()
   * @generated
   */
  void setSrc(String value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' attribute.
   * @see #setDest(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileCopy_Dest()
   * @model
   * @generated
   */
  String getDest();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileCopy#getDest <em>Dest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' attribute.
   * @see #getDest()
   * @generated
   */
  void setDest(String value);

} // FileCopy
