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

import org.xtext.nv.dsl.mMDSL.Algorithm;
import org.xtext.nv.dsl.mMDSL.Enumeration;
import org.xtext.nv.dsl.mMDSL.Event;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Metamodel;
import org.xtext.nv.dsl.mMDSL.Method;
import org.xtext.nv.dsl.mMDSL.SymbolClass;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getSymbolstyle <em>Symbolstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method
{
  /**
   * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeration()
   * @generated
   * @ordered
   */
  protected EList<Enumeration> enumeration;

  /**
   * The cached value of the '{@link #getSymbolstyle() <em>Symbolstyle</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolstyle()
   * @generated
   * @ordered
   */
  protected EList<SymbolStyle> symbolstyle;

  /**
   * The cached value of the '{@link #getSymbolclass() <em>Symbolclass</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolclass()
   * @generated
   * @ordered
   */
  protected EList<SymbolClass> symbolclass;

  /**
   * The cached value of the '{@link #getSymbolrelation() <em>Symbolrelation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolrelation()
   * @generated
   * @ordered
   */
  protected EList<SymbolRelation> symbolrelation;

  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected Metamodel metamodel;

  /**
   * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected EList<Algorithm> algorithm;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Event> event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return MMDSLPackage.eINSTANCE.getMethod();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Enumeration> getEnumeration()
  {
    if (enumeration == null)
    {
      enumeration = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, MMDSLPackage.METHOD__ENUMERATION);
    }
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SymbolStyle> getSymbolstyle()
  {
    if (symbolstyle == null)
    {
      symbolstyle = new EObjectContainmentEList<SymbolStyle>(SymbolStyle.class, this, MMDSLPackage.METHOD__SYMBOLSTYLE);
    }
    return symbolstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SymbolClass> getSymbolclass()
  {
    if (symbolclass == null)
    {
      symbolclass = new EObjectContainmentEList<SymbolClass>(SymbolClass.class, this, MMDSLPackage.METHOD__SYMBOLCLASS);
    }
    return symbolclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SymbolRelation> getSymbolrelation()
  {
    if (symbolrelation == null)
    {
      symbolrelation = new EObjectContainmentEList<SymbolRelation>(SymbolRelation.class, this, MMDSLPackage.METHOD__SYMBOLRELATION);
    }
    return symbolrelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel getMetamodel()
  {
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetamodel(Metamodel newMetamodel, NotificationChain msgs)
  {
    Metamodel oldMetamodel = metamodel;
    metamodel = newMetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.METHOD__METAMODEL, oldMetamodel, newMetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetamodel(Metamodel newMetamodel)
  {
    if (newMetamodel != metamodel)
    {
      NotificationChain msgs = null;
      if (metamodel != null)
        msgs = ((InternalEObject)metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.METHOD__METAMODEL, null, msgs);
      if (newMetamodel != null)
        msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.METHOD__METAMODEL, null, msgs);
      msgs = basicSetMetamodel(newMetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.METHOD__METAMODEL, newMetamodel, newMetamodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Algorithm> getAlgorithm()
  {
    if (algorithm == null)
    {
      algorithm = new EObjectContainmentEList<Algorithm>(Algorithm.class, this, MMDSLPackage.METHOD__ALGORITHM);
    }
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<Event>(Event.class, this, MMDSLPackage.METHOD__EVENT);
    }
    return event;
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
      case MMDSLPackage.METHOD__ENUMERATION:
        return ((InternalEList<?>)getEnumeration()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METHOD__SYMBOLSTYLE:
        return ((InternalEList<?>)getSymbolstyle()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METHOD__SYMBOLCLASS:
        return ((InternalEList<?>)getSymbolclass()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METHOD__SYMBOLRELATION:
        return ((InternalEList<?>)getSymbolrelation()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METHOD__METAMODEL:
        return basicSetMetamodel(null, msgs);
      case MMDSLPackage.METHOD__ALGORITHM:
        return ((InternalEList<?>)getAlgorithm()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.METHOD__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.METHOD__ENUMERATION:
        return getEnumeration();
      case MMDSLPackage.METHOD__SYMBOLSTYLE:
        return getSymbolstyle();
      case MMDSLPackage.METHOD__SYMBOLCLASS:
        return getSymbolclass();
      case MMDSLPackage.METHOD__SYMBOLRELATION:
        return getSymbolrelation();
      case MMDSLPackage.METHOD__METAMODEL:
        return getMetamodel();
      case MMDSLPackage.METHOD__ALGORITHM:
        return getAlgorithm();
      case MMDSLPackage.METHOD__EVENT:
        return getEvent();
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
      case MMDSLPackage.METHOD__ENUMERATION:
        getEnumeration().clear();
        getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
        return;
      case MMDSLPackage.METHOD__SYMBOLSTYLE:
        getSymbolstyle().clear();
        getSymbolstyle().addAll((Collection<? extends SymbolStyle>)newValue);
        return;
      case MMDSLPackage.METHOD__SYMBOLCLASS:
        getSymbolclass().clear();
        getSymbolclass().addAll((Collection<? extends SymbolClass>)newValue);
        return;
      case MMDSLPackage.METHOD__SYMBOLRELATION:
        getSymbolrelation().clear();
        getSymbolrelation().addAll((Collection<? extends SymbolRelation>)newValue);
        return;
      case MMDSLPackage.METHOD__METAMODEL:
        setMetamodel((Metamodel)newValue);
        return;
      case MMDSLPackage.METHOD__ALGORITHM:
        getAlgorithm().clear();
        getAlgorithm().addAll((Collection<? extends Algorithm>)newValue);
        return;
      case MMDSLPackage.METHOD__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Event>)newValue);
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
      case MMDSLPackage.METHOD__ENUMERATION:
        getEnumeration().clear();
        return;
      case MMDSLPackage.METHOD__SYMBOLSTYLE:
        getSymbolstyle().clear();
        return;
      case MMDSLPackage.METHOD__SYMBOLCLASS:
        getSymbolclass().clear();
        return;
      case MMDSLPackage.METHOD__SYMBOLRELATION:
        getSymbolrelation().clear();
        return;
      case MMDSLPackage.METHOD__METAMODEL:
        setMetamodel((Metamodel)null);
        return;
      case MMDSLPackage.METHOD__ALGORITHM:
        getAlgorithm().clear();
        return;
      case MMDSLPackage.METHOD__EVENT:
        getEvent().clear();
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
      case MMDSLPackage.METHOD__ENUMERATION:
        return enumeration != null && !enumeration.isEmpty();
      case MMDSLPackage.METHOD__SYMBOLSTYLE:
        return symbolstyle != null && !symbolstyle.isEmpty();
      case MMDSLPackage.METHOD__SYMBOLCLASS:
        return symbolclass != null && !symbolclass.isEmpty();
      case MMDSLPackage.METHOD__SYMBOLRELATION:
        return symbolrelation != null && !symbolrelation.isEmpty();
      case MMDSLPackage.METHOD__METAMODEL:
        return metamodel != null;
      case MMDSLPackage.METHOD__ALGORITHM:
        return algorithm != null && !algorithm.isEmpty();
      case MMDSLPackage.METHOD__EVENT:
        return event != null && !event.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl
