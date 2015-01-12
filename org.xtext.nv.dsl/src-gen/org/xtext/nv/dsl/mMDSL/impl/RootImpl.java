/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.EmbedCodeType;
import org.xtext.nv.dsl.mMDSL.EmbedPlatformType;
import org.xtext.nv.dsl.mMDSL.IncludeLibrary;
import org.xtext.nv.dsl.mMDSL.IncludeLibraryType;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Method;
import org.xtext.nv.dsl.mMDSL.MethodName;
import org.xtext.nv.dsl.mMDSL.Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getMethodname <em>Methodname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getIncludelibrarytype <em>Includelibrarytype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getEmbedplatformtype <em>Embedplatformtype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getEmbedcodetype <em>Embedcodetype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getIncludelibrary <em>Includelibrary</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getEmbedcode <em>Embedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root
{
  /**
   * The cached value of the '{@link #getMethodname() <em>Methodname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodname()
   * @generated
   * @ordered
   */
  protected MethodName methodname;

  /**
   * The cached value of the '{@link #getIncludelibrarytype() <em>Includelibrarytype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludelibrarytype()
   * @generated
   * @ordered
   */
  protected EList<IncludeLibraryType> includelibrarytype;

  /**
   * The cached value of the '{@link #getEmbedplatformtype() <em>Embedplatformtype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedplatformtype()
   * @generated
   * @ordered
   */
  protected EList<EmbedPlatformType> embedplatformtype;

  /**
   * The cached value of the '{@link #getEmbedcodetype() <em>Embedcodetype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedcodetype()
   * @generated
   * @ordered
   */
  protected EList<EmbedCodeType> embedcodetype;

  /**
   * The cached value of the '{@link #getIncludelibrary() <em>Includelibrary</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludelibrary()
   * @generated
   * @ordered
   */
  protected EList<IncludeLibrary> includelibrary;

  /**
   * The cached value of the '{@link #getEmbedcode() <em>Embedcode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedcode()
   * @generated
   * @ordered
   */
  protected EList<EmbedCode> embedcode;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Method method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return MMDSLPackage.eINSTANCE.getRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getMethodname()
  {
    return methodname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodname(MethodName newMethodname, NotificationChain msgs)
  {
    MethodName oldMethodname = methodname;
    methodname = newMethodname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ROOT__METHODNAME, oldMethodname, newMethodname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodname(MethodName newMethodname)
  {
    if (newMethodname != methodname)
    {
      NotificationChain msgs = null;
      if (methodname != null)
        msgs = ((InternalEObject)methodname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ROOT__METHODNAME, null, msgs);
      if (newMethodname != null)
        msgs = ((InternalEObject)newMethodname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ROOT__METHODNAME, null, msgs);
      msgs = basicSetMethodname(newMethodname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ROOT__METHODNAME, newMethodname, newMethodname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeLibraryType> getIncludelibrarytype()
  {
    if (includelibrarytype == null)
    {
      includelibrarytype = new EObjectContainmentEList<IncludeLibraryType>(IncludeLibraryType.class, this, MMDSLPackage.ROOT__INCLUDELIBRARYTYPE);
    }
    return includelibrarytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EmbedPlatformType> getEmbedplatformtype()
  {
    if (embedplatformtype == null)
    {
      embedplatformtype = new EObjectContainmentEList<EmbedPlatformType>(EmbedPlatformType.class, this, MMDSLPackage.ROOT__EMBEDPLATFORMTYPE);
    }
    return embedplatformtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EmbedCodeType> getEmbedcodetype()
  {
    if (embedcodetype == null)
    {
      embedcodetype = new EObjectContainmentEList<EmbedCodeType>(EmbedCodeType.class, this, MMDSLPackage.ROOT__EMBEDCODETYPE);
    }
    return embedcodetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeLibrary> getIncludelibrary()
  {
    if (includelibrary == null)
    {
      includelibrary = new EObjectContainmentEList<IncludeLibrary>(IncludeLibrary.class, this, MMDSLPackage.ROOT__INCLUDELIBRARY);
    }
    return includelibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EmbedCode> getEmbedcode()
  {
    if (embedcode == null)
    {
      embedcode = new EObjectContainmentEList<EmbedCode>(EmbedCode.class, this, MMDSLPackage.ROOT__EMBEDCODE);
    }
    return embedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs)
  {
    Method oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ROOT__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Method newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ROOT__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ROOT__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ROOT__METHOD, newMethod, newMethod));
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
      case MMDSLPackage.ROOT__METHODNAME:
        return basicSetMethodname(null, msgs);
      case MMDSLPackage.ROOT__INCLUDELIBRARYTYPE:
        return ((InternalEList<?>)getIncludelibrarytype()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.ROOT__EMBEDPLATFORMTYPE:
        return ((InternalEList<?>)getEmbedplatformtype()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.ROOT__EMBEDCODETYPE:
        return ((InternalEList<?>)getEmbedcodetype()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.ROOT__INCLUDELIBRARY:
        return ((InternalEList<?>)getIncludelibrary()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.ROOT__EMBEDCODE:
        return ((InternalEList<?>)getEmbedcode()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.ROOT__METHOD:
        return basicSetMethod(null, msgs);
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
      case MMDSLPackage.ROOT__METHODNAME:
        return getMethodname();
      case MMDSLPackage.ROOT__INCLUDELIBRARYTYPE:
        return getIncludelibrarytype();
      case MMDSLPackage.ROOT__EMBEDPLATFORMTYPE:
        return getEmbedplatformtype();
      case MMDSLPackage.ROOT__EMBEDCODETYPE:
        return getEmbedcodetype();
      case MMDSLPackage.ROOT__INCLUDELIBRARY:
        return getIncludelibrary();
      case MMDSLPackage.ROOT__EMBEDCODE:
        return getEmbedcode();
      case MMDSLPackage.ROOT__METHOD:
        return getMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MMDSLPackage.ROOT__METHODNAME:
        setMethodname((MethodName)newValue);
        return;
      case MMDSLPackage.ROOT__INCLUDELIBRARYTYPE:
        getIncludelibrarytype().clear();
        getIncludelibrarytype().addAll((Collection<? extends IncludeLibraryType>)newValue);
        return;
      case MMDSLPackage.ROOT__EMBEDPLATFORMTYPE:
        getEmbedplatformtype().clear();
        getEmbedplatformtype().addAll((Collection<? extends EmbedPlatformType>)newValue);
        return;
      case MMDSLPackage.ROOT__EMBEDCODETYPE:
        getEmbedcodetype().clear();
        getEmbedcodetype().addAll((Collection<? extends EmbedCodeType>)newValue);
        return;
      case MMDSLPackage.ROOT__INCLUDELIBRARY:
        getIncludelibrary().clear();
        getIncludelibrary().addAll((Collection<? extends IncludeLibrary>)newValue);
        return;
      case MMDSLPackage.ROOT__EMBEDCODE:
        getEmbedcode().clear();
        getEmbedcode().addAll((Collection<? extends EmbedCode>)newValue);
        return;
      case MMDSLPackage.ROOT__METHOD:
        setMethod((Method)newValue);
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
      case MMDSLPackage.ROOT__METHODNAME:
        setMethodname((MethodName)null);
        return;
      case MMDSLPackage.ROOT__INCLUDELIBRARYTYPE:
        getIncludelibrarytype().clear();
        return;
      case MMDSLPackage.ROOT__EMBEDPLATFORMTYPE:
        getEmbedplatformtype().clear();
        return;
      case MMDSLPackage.ROOT__EMBEDCODETYPE:
        getEmbedcodetype().clear();
        return;
      case MMDSLPackage.ROOT__INCLUDELIBRARY:
        getIncludelibrary().clear();
        return;
      case MMDSLPackage.ROOT__EMBEDCODE:
        getEmbedcode().clear();
        return;
      case MMDSLPackage.ROOT__METHOD:
        setMethod((Method)null);
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
      case MMDSLPackage.ROOT__METHODNAME:
        return methodname != null;
      case MMDSLPackage.ROOT__INCLUDELIBRARYTYPE:
        return includelibrarytype != null && !includelibrarytype.isEmpty();
      case MMDSLPackage.ROOT__EMBEDPLATFORMTYPE:
        return embedplatformtype != null && !embedplatformtype.isEmpty();
      case MMDSLPackage.ROOT__EMBEDCODETYPE:
        return embedcodetype != null && !embedcodetype.isEmpty();
      case MMDSLPackage.ROOT__INCLUDELIBRARY:
        return includelibrary != null && !includelibrary.isEmpty();
      case MMDSLPackage.ROOT__EMBEDCODE:
        return embedcode != null && !embedcode.isEmpty();
      case MMDSLPackage.ROOT__METHOD:
        return method != null;
    }
    return super.eIsSet(featureID);
  }

} //RootImpl
