/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Embed Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.InsertEmbedCodeImpl#getCodesnippetname <em>Codesnippetname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertEmbedCodeImpl extends MinimalEObjectImpl.Container implements InsertEmbedCode
{
  /**
   * The cached value of the '{@link #getCodesnippetname() <em>Codesnippetname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodesnippetname()
   * @generated
   * @ordered
   */
  protected EmbedCode codesnippetname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertEmbedCodeImpl()
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
    return MMDSLPackage.eINSTANCE.getInsertEmbedCode();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCode getCodesnippetname()
  {
    if (codesnippetname != null && codesnippetname.eIsProxy())
    {
      InternalEObject oldCodesnippetname = (InternalEObject)codesnippetname;
      codesnippetname = (EmbedCode)eResolveProxy(oldCodesnippetname);
      if (codesnippetname != oldCodesnippetname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME, oldCodesnippetname, codesnippetname));
      }
    }
    return codesnippetname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCode basicGetCodesnippetname()
  {
    return codesnippetname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodesnippetname(EmbedCode newCodesnippetname)
  {
    EmbedCode oldCodesnippetname = codesnippetname;
    codesnippetname = newCodesnippetname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME, oldCodesnippetname, codesnippetname));
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
      case MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME:
        if (resolve) return getCodesnippetname();
        return basicGetCodesnippetname();
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
      case MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME:
        setCodesnippetname((EmbedCode)newValue);
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
      case MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME:
        setCodesnippetname((EmbedCode)null);
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
      case MMDSLPackage.INSERT_EMBED_CODE__CODESNIPPETNAME:
        return codesnippetname != null;
    }
    return super.eIsSet(featureID);
  }

} //InsertEmbedCodeImpl
