/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecopy <em>Filecopy</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFiledelete <em>Filedelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecreate <em>Filecreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFileread <em>Fileread</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilewrite <em>Filewrite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation()
 * @model
 * @generated
 */
public interface FileOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Filecopy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filecopy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filecopy</em>' containment reference.
   * @see #setFilecopy(FileCopy)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation_Filecopy()
   * @model containment="true"
   * @generated
   */
  FileCopy getFilecopy();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecopy <em>Filecopy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filecopy</em>' containment reference.
   * @see #getFilecopy()
   * @generated
   */
  void setFilecopy(FileCopy value);

  /**
   * Returns the value of the '<em><b>Filedelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filedelete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filedelete</em>' containment reference.
   * @see #setFiledelete(FileDelete)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation_Filedelete()
   * @model containment="true"
   * @generated
   */
  FileDelete getFiledelete();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFiledelete <em>Filedelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filedelete</em>' containment reference.
   * @see #getFiledelete()
   * @generated
   */
  void setFiledelete(FileDelete value);

  /**
   * Returns the value of the '<em><b>Filecreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filecreate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filecreate</em>' containment reference.
   * @see #setFilecreate(FileCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation_Filecreate()
   * @model containment="true"
   * @generated
   */
  FileCreate getFilecreate();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecreate <em>Filecreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filecreate</em>' containment reference.
   * @see #getFilecreate()
   * @generated
   */
  void setFilecreate(FileCreate value);

  /**
   * Returns the value of the '<em><b>Fileread</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fileread</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fileread</em>' containment reference.
   * @see #setFileread(FileRead)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation_Fileread()
   * @model containment="true"
   * @generated
   */
  FileRead getFileread();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFileread <em>Fileread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fileread</em>' containment reference.
   * @see #getFileread()
   * @generated
   */
  void setFileread(FileRead value);

  /**
   * Returns the value of the '<em><b>Filewrite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filewrite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filewrite</em>' containment reference.
   * @see #setFilewrite(FileWrite)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getFileOperation_Filewrite()
   * @model containment="true"
   * @generated
   */
  FileWrite getFilewrite();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilewrite <em>Filewrite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filewrite</em>' containment reference.
   * @see #getFilewrite()
   * @generated
   */
  void setFilewrite(FileWrite value);

} // FileOperation
