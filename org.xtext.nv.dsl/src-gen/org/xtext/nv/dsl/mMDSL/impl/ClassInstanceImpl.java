/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.ClassInstance;
import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGet;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.ClassInstanceSet;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl#getClassinstancecreate <em>Classinstancecreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl#getClassinstancedelete <em>Classinstancedelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl#getClassinstanceget <em>Classinstanceget</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl#getClassinstanceset <em>Classinstanceset</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl#getClassinstancegetall <em>Classinstancegetall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassInstanceImpl extends MinimalEObjectImpl.Container implements ClassInstance
{
  /**
   * The cached value of the '{@link #getClassinstancecreate() <em>Classinstancecreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstancecreate()
   * @generated
   * @ordered
   */
  protected ClassInstanceCreate classinstancecreate;

  /**
   * The cached value of the '{@link #getClassinstancedelete() <em>Classinstancedelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstancedelete()
   * @generated
   * @ordered
   */
  protected ClassInstanceDelete classinstancedelete;

  /**
   * The cached value of the '{@link #getClassinstanceget() <em>Classinstanceget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstanceget()
   * @generated
   * @ordered
   */
  protected ClassInstanceGet classinstanceget;

  /**
   * The cached value of the '{@link #getClassinstanceset() <em>Classinstanceset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstanceset()
   * @generated
   * @ordered
   */
  protected ClassInstanceSet classinstanceset;

  /**
   * The cached value of the '{@link #getClassinstancegetall() <em>Classinstancegetall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassinstancegetall()
   * @generated
   * @ordered
   */
  protected ClassInstanceGetAll classinstancegetall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassInstanceImpl()
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
    return MMDSLPackage.eINSTANCE.getClassInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate getClassinstancecreate()
  {
    return classinstancecreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstancecreate(ClassInstanceCreate newClassinstancecreate, NotificationChain msgs)
  {
    ClassInstanceCreate oldClassinstancecreate = classinstancecreate;
    classinstancecreate = newClassinstancecreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE, oldClassinstancecreate, newClassinstancecreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstancecreate(ClassInstanceCreate newClassinstancecreate)
  {
    if (newClassinstancecreate != classinstancecreate)
    {
      NotificationChain msgs = null;
      if (classinstancecreate != null)
        msgs = ((InternalEObject)classinstancecreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE, null, msgs);
      if (newClassinstancecreate != null)
        msgs = ((InternalEObject)newClassinstancecreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE, null, msgs);
      msgs = basicSetClassinstancecreate(newClassinstancecreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE, newClassinstancecreate, newClassinstancecreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceDelete getClassinstancedelete()
  {
    return classinstancedelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstancedelete(ClassInstanceDelete newClassinstancedelete, NotificationChain msgs)
  {
    ClassInstanceDelete oldClassinstancedelete = classinstancedelete;
    classinstancedelete = newClassinstancedelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE, oldClassinstancedelete, newClassinstancedelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstancedelete(ClassInstanceDelete newClassinstancedelete)
  {
    if (newClassinstancedelete != classinstancedelete)
    {
      NotificationChain msgs = null;
      if (classinstancedelete != null)
        msgs = ((InternalEObject)classinstancedelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE, null, msgs);
      if (newClassinstancedelete != null)
        msgs = ((InternalEObject)newClassinstancedelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE, null, msgs);
      msgs = basicSetClassinstancedelete(newClassinstancedelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE, newClassinstancedelete, newClassinstancedelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceGet getClassinstanceget()
  {
    return classinstanceget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstanceget(ClassInstanceGet newClassinstanceget, NotificationChain msgs)
  {
    ClassInstanceGet oldClassinstanceget = classinstanceget;
    classinstanceget = newClassinstanceget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET, oldClassinstanceget, newClassinstanceget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstanceget(ClassInstanceGet newClassinstanceget)
  {
    if (newClassinstanceget != classinstanceget)
    {
      NotificationChain msgs = null;
      if (classinstanceget != null)
        msgs = ((InternalEObject)classinstanceget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET, null, msgs);
      if (newClassinstanceget != null)
        msgs = ((InternalEObject)newClassinstanceget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET, null, msgs);
      msgs = basicSetClassinstanceget(newClassinstanceget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET, newClassinstanceget, newClassinstanceget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceSet getClassinstanceset()
  {
    return classinstanceset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstanceset(ClassInstanceSet newClassinstanceset, NotificationChain msgs)
  {
    ClassInstanceSet oldClassinstanceset = classinstanceset;
    classinstanceset = newClassinstanceset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET, oldClassinstanceset, newClassinstanceset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstanceset(ClassInstanceSet newClassinstanceset)
  {
    if (newClassinstanceset != classinstanceset)
    {
      NotificationChain msgs = null;
      if (classinstanceset != null)
        msgs = ((InternalEObject)classinstanceset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET, null, msgs);
      if (newClassinstanceset != null)
        msgs = ((InternalEObject)newClassinstanceset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET, null, msgs);
      msgs = basicSetClassinstanceset(newClassinstanceset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET, newClassinstanceset, newClassinstanceset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceGetAll getClassinstancegetall()
  {
    return classinstancegetall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassinstancegetall(ClassInstanceGetAll newClassinstancegetall, NotificationChain msgs)
  {
    ClassInstanceGetAll oldClassinstancegetall = classinstancegetall;
    classinstancegetall = newClassinstancegetall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL, oldClassinstancegetall, newClassinstancegetall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassinstancegetall(ClassInstanceGetAll newClassinstancegetall)
  {
    if (newClassinstancegetall != classinstancegetall)
    {
      NotificationChain msgs = null;
      if (classinstancegetall != null)
        msgs = ((InternalEObject)classinstancegetall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL, null, msgs);
      if (newClassinstancegetall != null)
        msgs = ((InternalEObject)newClassinstancegetall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL, null, msgs);
      msgs = basicSetClassinstancegetall(newClassinstancegetall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL, newClassinstancegetall, newClassinstancegetall));
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
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE:
        return basicSetClassinstancecreate(null, msgs);
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE:
        return basicSetClassinstancedelete(null, msgs);
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET:
        return basicSetClassinstanceget(null, msgs);
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET:
        return basicSetClassinstanceset(null, msgs);
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL:
        return basicSetClassinstancegetall(null, msgs);
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
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE:
        return getClassinstancecreate();
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE:
        return getClassinstancedelete();
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET:
        return getClassinstanceget();
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET:
        return getClassinstanceset();
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL:
        return getClassinstancegetall();
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
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE:
        setClassinstancecreate((ClassInstanceCreate)newValue);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE:
        setClassinstancedelete((ClassInstanceDelete)newValue);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET:
        setClassinstanceget((ClassInstanceGet)newValue);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET:
        setClassinstanceset((ClassInstanceSet)newValue);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL:
        setClassinstancegetall((ClassInstanceGetAll)newValue);
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
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE:
        setClassinstancecreate((ClassInstanceCreate)null);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE:
        setClassinstancedelete((ClassInstanceDelete)null);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET:
        setClassinstanceget((ClassInstanceGet)null);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET:
        setClassinstanceset((ClassInstanceSet)null);
        return;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL:
        setClassinstancegetall((ClassInstanceGetAll)null);
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
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCECREATE:
        return classinstancecreate != null;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEDELETE:
        return classinstancedelete != null;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGET:
        return classinstanceget != null;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCESET:
        return classinstanceset != null;
      case MMDSLPackage.CLASS_INSTANCE__CLASSINSTANCEGETALL:
        return classinstancegetall != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassInstanceImpl
