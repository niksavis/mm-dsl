/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.RelationInstance;
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate;
import org.xtext.nv.dsl.mMDSL.RelationInstanceDelete;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGet;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.RelationInstanceSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl#getRelationinstancecreate <em>Relationinstancecreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl#getRelationinstancedelete <em>Relationinstancedelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl#getRelationinstanceget <em>Relationinstanceget</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl#getRelationinstanceset <em>Relationinstanceset</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl#getRelationinstancegetall <em>Relationinstancegetall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationInstanceImpl extends MinimalEObjectImpl.Container implements RelationInstance
{
  /**
   * The cached value of the '{@link #getRelationinstancecreate() <em>Relationinstancecreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstancecreate()
   * @generated
   * @ordered
   */
  protected RelationInstanceCreate relationinstancecreate;

  /**
   * The cached value of the '{@link #getRelationinstancedelete() <em>Relationinstancedelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstancedelete()
   * @generated
   * @ordered
   */
  protected RelationInstanceDelete relationinstancedelete;

  /**
   * The cached value of the '{@link #getRelationinstanceget() <em>Relationinstanceget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstanceget()
   * @generated
   * @ordered
   */
  protected RelationInstanceGet relationinstanceget;

  /**
   * The cached value of the '{@link #getRelationinstanceset() <em>Relationinstanceset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstanceset()
   * @generated
   * @ordered
   */
  protected RelationInstanceSet relationinstanceset;

  /**
   * The cached value of the '{@link #getRelationinstancegetall() <em>Relationinstancegetall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationinstancegetall()
   * @generated
   * @ordered
   */
  protected RelationInstanceGetAll relationinstancegetall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationInstanceImpl()
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
    return MMDSLPackage.eINSTANCE.getRelationInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceCreate getRelationinstancecreate()
  {
    return relationinstancecreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstancecreate(RelationInstanceCreate newRelationinstancecreate, NotificationChain msgs)
  {
    RelationInstanceCreate oldRelationinstancecreate = relationinstancecreate;
    relationinstancecreate = newRelationinstancecreate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE, oldRelationinstancecreate, newRelationinstancecreate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstancecreate(RelationInstanceCreate newRelationinstancecreate)
  {
    if (newRelationinstancecreate != relationinstancecreate)
    {
      NotificationChain msgs = null;
      if (relationinstancecreate != null)
        msgs = ((InternalEObject)relationinstancecreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE, null, msgs);
      if (newRelationinstancecreate != null)
        msgs = ((InternalEObject)newRelationinstancecreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE, null, msgs);
      msgs = basicSetRelationinstancecreate(newRelationinstancecreate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE, newRelationinstancecreate, newRelationinstancecreate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceDelete getRelationinstancedelete()
  {
    return relationinstancedelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstancedelete(RelationInstanceDelete newRelationinstancedelete, NotificationChain msgs)
  {
    RelationInstanceDelete oldRelationinstancedelete = relationinstancedelete;
    relationinstancedelete = newRelationinstancedelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE, oldRelationinstancedelete, newRelationinstancedelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstancedelete(RelationInstanceDelete newRelationinstancedelete)
  {
    if (newRelationinstancedelete != relationinstancedelete)
    {
      NotificationChain msgs = null;
      if (relationinstancedelete != null)
        msgs = ((InternalEObject)relationinstancedelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE, null, msgs);
      if (newRelationinstancedelete != null)
        msgs = ((InternalEObject)newRelationinstancedelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE, null, msgs);
      msgs = basicSetRelationinstancedelete(newRelationinstancedelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE, newRelationinstancedelete, newRelationinstancedelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceGet getRelationinstanceget()
  {
    return relationinstanceget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstanceget(RelationInstanceGet newRelationinstanceget, NotificationChain msgs)
  {
    RelationInstanceGet oldRelationinstanceget = relationinstanceget;
    relationinstanceget = newRelationinstanceget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET, oldRelationinstanceget, newRelationinstanceget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstanceget(RelationInstanceGet newRelationinstanceget)
  {
    if (newRelationinstanceget != relationinstanceget)
    {
      NotificationChain msgs = null;
      if (relationinstanceget != null)
        msgs = ((InternalEObject)relationinstanceget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET, null, msgs);
      if (newRelationinstanceget != null)
        msgs = ((InternalEObject)newRelationinstanceget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET, null, msgs);
      msgs = basicSetRelationinstanceget(newRelationinstanceget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET, newRelationinstanceget, newRelationinstanceget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceSet getRelationinstanceset()
  {
    return relationinstanceset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstanceset(RelationInstanceSet newRelationinstanceset, NotificationChain msgs)
  {
    RelationInstanceSet oldRelationinstanceset = relationinstanceset;
    relationinstanceset = newRelationinstanceset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET, oldRelationinstanceset, newRelationinstanceset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstanceset(RelationInstanceSet newRelationinstanceset)
  {
    if (newRelationinstanceset != relationinstanceset)
    {
      NotificationChain msgs = null;
      if (relationinstanceset != null)
        msgs = ((InternalEObject)relationinstanceset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET, null, msgs);
      if (newRelationinstanceset != null)
        msgs = ((InternalEObject)newRelationinstanceset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET, null, msgs);
      msgs = basicSetRelationinstanceset(newRelationinstanceset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET, newRelationinstanceset, newRelationinstanceset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceGetAll getRelationinstancegetall()
  {
    return relationinstancegetall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationinstancegetall(RelationInstanceGetAll newRelationinstancegetall, NotificationChain msgs)
  {
    RelationInstanceGetAll oldRelationinstancegetall = relationinstancegetall;
    relationinstancegetall = newRelationinstancegetall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL, oldRelationinstancegetall, newRelationinstancegetall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationinstancegetall(RelationInstanceGetAll newRelationinstancegetall)
  {
    if (newRelationinstancegetall != relationinstancegetall)
    {
      NotificationChain msgs = null;
      if (relationinstancegetall != null)
        msgs = ((InternalEObject)relationinstancegetall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL, null, msgs);
      if (newRelationinstancegetall != null)
        msgs = ((InternalEObject)newRelationinstancegetall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL, null, msgs);
      msgs = basicSetRelationinstancegetall(newRelationinstancegetall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL, newRelationinstancegetall, newRelationinstancegetall));
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
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE:
        return basicSetRelationinstancecreate(null, msgs);
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE:
        return basicSetRelationinstancedelete(null, msgs);
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET:
        return basicSetRelationinstanceget(null, msgs);
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET:
        return basicSetRelationinstanceset(null, msgs);
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL:
        return basicSetRelationinstancegetall(null, msgs);
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
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE:
        return getRelationinstancecreate();
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE:
        return getRelationinstancedelete();
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET:
        return getRelationinstanceget();
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET:
        return getRelationinstanceset();
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL:
        return getRelationinstancegetall();
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
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE:
        setRelationinstancecreate((RelationInstanceCreate)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE:
        setRelationinstancedelete((RelationInstanceDelete)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET:
        setRelationinstanceget((RelationInstanceGet)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET:
        setRelationinstanceset((RelationInstanceSet)newValue);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL:
        setRelationinstancegetall((RelationInstanceGetAll)newValue);
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
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE:
        setRelationinstancecreate((RelationInstanceCreate)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE:
        setRelationinstancedelete((RelationInstanceDelete)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET:
        setRelationinstanceget((RelationInstanceGet)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET:
        setRelationinstanceset((RelationInstanceSet)null);
        return;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL:
        setRelationinstancegetall((RelationInstanceGetAll)null);
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
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCECREATE:
        return relationinstancecreate != null;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEDELETE:
        return relationinstancedelete != null;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGET:
        return relationinstanceget != null;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCESET:
        return relationinstanceset != null;
      case MMDSLPackage.RELATION_INSTANCE__RELATIONINSTANCEGETALL:
        return relationinstancegetall != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationInstanceImpl
