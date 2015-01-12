/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.FileCopy;
import org.xtext.nv.dsl.mMDSL.FileCreate;
import org.xtext.nv.dsl.mMDSL.FileDelete;
import org.xtext.nv.dsl.mMDSL.FileOperation;
import org.xtext.nv.dsl.mMDSL.FileRead;
import org.xtext.nv.dsl.mMDSL.FileWrite;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl#getFilecopy <em>Filecopy</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl#getFiledelete <em>Filedelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl#getFilecreate <em>Filecreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl#getFileread <em>Fileread</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl#getFilewrite <em>Filewrite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileOperationImpl extends MinimalEObjectImpl.Container implements FileOperation
{
  /**
   * The cached value of the '{@link #getFilecopy() <em>Filecopy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilecopy()
   * @generated
   * @ordered
   */
  protected FileCopy filecopy;

  /**
   * The cached value of the '{@link #getFiledelete() <em>Filedelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiledelete()
   * @generated
   * @ordered
   */
  protected FileDelete filedelete;

  /**
   * The cached value of the '{@link #getFilecreate() <em>Filecreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilecreate()
   * @generated
   * @ordered
   */
  protected FileCreate filecreate;

  /**
   * The cached value of the '{@link #getFileread() <em>Fileread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileread()
   * @generated
   * @ordered
   */
  protected FileRead fileread;

  /**
   * The cached value of the '{@link #getFilewrite() <em>Filewrite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilewrite()
   * @generated
   * @ordered
   */
  protected FileWrite filewrite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MMDSLPackage.eINSTANCE.getFileOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileCopy getFilecopy()
  {
    return filecopy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilecopy(FileCopy newFilecopy, NotificationChain msgs)
  {
    FileCopy oldFilecopy = filecopy;
    filecopy = newFilecopy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILECOPY, oldFilecopy, newFilecopy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilecopy(FileCopy newFilecopy)
  {
    if (newFilecopy != filecopy)
    {
      NotificationChain msgs = null;
      if (filecopy != null)
        msgs = ((InternalEObject)filecopy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILECOPY, null, msgs);
      if (newFilecopy != null)
        msgs = ((InternalEObject)newFilecopy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILECOPY, null, msgs);
      msgs = basicSetFilecopy(newFilecopy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILECOPY, newFilecopy, newFilecopy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileDelete getFiledelete()
  {
    return filedelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFiledelete(FileDelete newFiledelete, NotificationChain msgs)
  {
    FileDelete oldFiledelete = filedelete;
    filedelete = newFiledelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEDELETE, oldFiledelete, newFiledelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFiledelete(FileDelete newFiledelete)
  {
    if (newFiledelete != filedelete)
    {
      NotificationChain msgs = null;
      if (filedelete != null)
        msgs = ((InternalEObject)filedelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEDELETE, null, msgs);
      if (newFiledelete != null)
        msgs = ((InternalEObject)newFiledelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEDELETE, null, msgs);
      msgs = basicSetFiledelete(newFiledelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEDELETE, newFiledelete, newFiledelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileCreate getFilecreate()
  {
    return filecreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilecreate(FileCreate newFilecreate, NotificationChain msgs)
  {
    FileCreate oldFilecreate = filecreate;
    filecreate = newFilecreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILECREATE, oldFilecreate, newFilecreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilecreate(FileCreate newFilecreate)
  {
    if (newFilecreate != filecreate)
    {
      NotificationChain msgs = null;
      if (filecreate != null)
        msgs = ((InternalEObject)filecreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILECREATE, null, msgs);
      if (newFilecreate != null)
        msgs = ((InternalEObject)newFilecreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILECREATE, null, msgs);
      msgs = basicSetFilecreate(newFilecreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILECREATE, newFilecreate, newFilecreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileRead getFileread()
  {
    return fileread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileread(FileRead newFileread, NotificationChain msgs)
  {
    FileRead oldFileread = fileread;
    fileread = newFileread;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEREAD, oldFileread, newFileread);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileread(FileRead newFileread)
  {
    if (newFileread != fileread)
    {
      NotificationChain msgs = null;
      if (fileread != null)
        msgs = ((InternalEObject)fileread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEREAD, null, msgs);
      if (newFileread != null)
        msgs = ((InternalEObject)newFileread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEREAD, null, msgs);
      msgs = basicSetFileread(newFileread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEREAD, newFileread, newFileread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileWrite getFilewrite()
  {
    return filewrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilewrite(FileWrite newFilewrite, NotificationChain msgs)
  {
    FileWrite oldFilewrite = filewrite;
    filewrite = newFilewrite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEWRITE, oldFilewrite, newFilewrite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilewrite(FileWrite newFilewrite)
  {
    if (newFilewrite != filewrite)
    {
      NotificationChain msgs = null;
      if (filewrite != null)
        msgs = ((InternalEObject)filewrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEWRITE, null, msgs);
      if (newFilewrite != null)
        msgs = ((InternalEObject)newFilewrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.FILE_OPERATION__FILEWRITE, null, msgs);
      msgs = basicSetFilewrite(newFilewrite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FILE_OPERATION__FILEWRITE, newFilewrite, newFilewrite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MMDSLPackage.FILE_OPERATION__FILECOPY:
        return basicSetFilecopy(null, msgs);
      case MMDSLPackage.FILE_OPERATION__FILEDELETE:
        return basicSetFiledelete(null, msgs);
      case MMDSLPackage.FILE_OPERATION__FILECREATE:
        return basicSetFilecreate(null, msgs);
      case MMDSLPackage.FILE_OPERATION__FILEREAD:
        return basicSetFileread(null, msgs);
      case MMDSLPackage.FILE_OPERATION__FILEWRITE:
        return basicSetFilewrite(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MMDSLPackage.FILE_OPERATION__FILECOPY:
        return getFilecopy();
      case MMDSLPackage.FILE_OPERATION__FILEDELETE:
        return getFiledelete();
      case MMDSLPackage.FILE_OPERATION__FILECREATE:
        return getFilecreate();
      case MMDSLPackage.FILE_OPERATION__FILEREAD:
        return getFileread();
      case MMDSLPackage.FILE_OPERATION__FILEWRITE:
        return getFilewrite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MMDSLPackage.FILE_OPERATION__FILECOPY:
        setFilecopy((FileCopy)newValue);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEDELETE:
        setFiledelete((FileDelete)newValue);
        return;
      case MMDSLPackage.FILE_OPERATION__FILECREATE:
        setFilecreate((FileCreate)newValue);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEREAD:
        setFileread((FileRead)newValue);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEWRITE:
        setFilewrite((FileWrite)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MMDSLPackage.FILE_OPERATION__FILECOPY:
        setFilecopy((FileCopy)null);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEDELETE:
        setFiledelete((FileDelete)null);
        return;
      case MMDSLPackage.FILE_OPERATION__FILECREATE:
        setFilecreate((FileCreate)null);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEREAD:
        setFileread((FileRead)null);
        return;
      case MMDSLPackage.FILE_OPERATION__FILEWRITE:
        setFilewrite((FileWrite)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MMDSLPackage.FILE_OPERATION__FILECOPY:
        return filecopy != null;
      case MMDSLPackage.FILE_OPERATION__FILEDELETE:
        return filedelete != null;
      case MMDSLPackage.FILE_OPERATION__FILECREATE:
        return filecreate != null;
      case MMDSLPackage.FILE_OPERATION__FILEREAD:
        return fileread != null;
      case MMDSLPackage.FILE_OPERATION__FILEWRITE:
        return filewrite != null;
    }
    return super.eIsSet(featureID);
  }

} //FileOperationImpl
