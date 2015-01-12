/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.AttributeGet;
import org.xtext.nv.dsl.mMDSL.AttributeOperation;
import org.xtext.nv.dsl.mMDSL.AttributeSet;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeOperationImpl#getAttributename <em>Attributename</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeOperationImpl#getAttributeget <em>Attributeget</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.AttributeOperationImpl#getAttributeset <em>Attributeset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeOperationImpl extends MinimalEObjectImpl.Container implements AttributeOperation
{
  /**
   * The cached value of the '{@link #getAttributename() <em>Attributename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributename()
   * @generated
   * @ordered
   */
  protected Attribute attributename;

  /**
   * The cached value of the '{@link #getAttributeget() <em>Attributeget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeget()
   * @generated
   * @ordered
   */
  protected AttributeGet attributeget;

  /**
   * The cached value of the '{@link #getAttributeset() <em>Attributeset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeset()
   * @generated
   * @ordered
   */
  protected AttributeSet attributeset;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeOperationImpl()
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
    return MMDSLPackage.eINSTANCE.getAttributeOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributename()
  {
    if (attributename != null && attributename.eIsProxy())
    {
      InternalEObject oldAttributename = (InternalEObject)attributename;
      attributename = (Attribute)eResolveProxy(oldAttributename);
      if (attributename != oldAttributename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME, oldAttributename, attributename));
      }
    }
    return attributename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttributename()
  {
    return attributename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributename(Attribute newAttributename)
  {
    Attribute oldAttributename = attributename;
    attributename = newAttributename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME, oldAttributename, attributename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeGet getAttributeget()
  {
    return attributeget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeget(AttributeGet newAttributeget, NotificationChain msgs)
  {
    AttributeGet oldAttributeget = attributeget;
    attributeget = newAttributeget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET, oldAttributeget, newAttributeget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeget(AttributeGet newAttributeget)
  {
    if (newAttributeget != attributeget)
    {
      NotificationChain msgs = null;
      if (attributeget != null)
        msgs = ((InternalEObject)attributeget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET, null, msgs);
      if (newAttributeget != null)
        msgs = ((InternalEObject)newAttributeget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET, null, msgs);
      msgs = basicSetAttributeget(newAttributeget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET, newAttributeget, newAttributeget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSet getAttributeset()
  {
    return attributeset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeset(AttributeSet newAttributeset, NotificationChain msgs)
  {
    AttributeSet oldAttributeset = attributeset;
    attributeset = newAttributeset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET, oldAttributeset, newAttributeset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeset(AttributeSet newAttributeset)
  {
    if (newAttributeset != attributeset)
    {
      NotificationChain msgs = null;
      if (attributeset != null)
        msgs = ((InternalEObject)attributeset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET, null, msgs);
      if (newAttributeset != null)
        msgs = ((InternalEObject)newAttributeset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET, null, msgs);
      msgs = basicSetAttributeset(newAttributeset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET, newAttributeset, newAttributeset));
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
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET:
        return basicSetAttributeget(null, msgs);
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET:
        return basicSetAttributeset(null, msgs);
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
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME:
        if (resolve) return getAttributename();
        return basicGetAttributename();
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET:
        return getAttributeget();
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET:
        return getAttributeset();
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
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME:
        setAttributename((Attribute)newValue);
        return;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET:
        setAttributeget((AttributeGet)newValue);
        return;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET:
        setAttributeset((AttributeSet)newValue);
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
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME:
        setAttributename((Attribute)null);
        return;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET:
        setAttributeget((AttributeGet)null);
        return;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET:
        setAttributeset((AttributeSet)null);
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
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTENAME:
        return attributename != null;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTEGET:
        return attributeget != null;
      case MMDSLPackage.ATTRIBUTE_OPERATION__ATTRIBUTESET:
        return attributeset != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeOperationImpl
