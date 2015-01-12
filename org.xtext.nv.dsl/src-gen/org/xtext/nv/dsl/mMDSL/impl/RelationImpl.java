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

import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Relation;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getParentrelationname <em>Parentrelationname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getFromclassname <em>Fromclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getToclassname <em>Toclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParentrelationname() <em>Parentrelationname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentrelationname()
   * @generated
   * @ordered
   */
  protected Relation parentrelationname;

  /**
   * The cached value of the '{@link #getSymbolrelation() <em>Symbolrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolrelation()
   * @generated
   * @ordered
   */
  protected SymbolRelation symbolrelation;

  /**
   * The cached value of the '{@link #getFromclassname() <em>Fromclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromclassname()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class fromclassname;

  /**
   * The cached value of the '{@link #getToclassname() <em>Toclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToclassname()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class toclassname;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attribute;

  /**
   * The cached value of the '{@link #getInsertembedcode() <em>Insertembedcode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertembedcode()
   * @generated
   * @ordered
   */
  protected EList<InsertEmbedCode> insertembedcode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return MMDSLPackage.eINSTANCE.getRelation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation getParentrelationname()
  {
    if (parentrelationname != null && parentrelationname.eIsProxy())
    {
      InternalEObject oldParentrelationname = (InternalEObject)parentrelationname;
      parentrelationname = (Relation)eResolveProxy(oldParentrelationname);
      if (parentrelationname != oldParentrelationname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION__PARENTRELATIONNAME, oldParentrelationname, parentrelationname));
      }
    }
    return parentrelationname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation basicGetParentrelationname()
  {
    return parentrelationname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentrelationname(Relation newParentrelationname)
  {
    Relation oldParentrelationname = parentrelationname;
    parentrelationname = newParentrelationname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION__PARENTRELATIONNAME, oldParentrelationname, parentrelationname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRelation getSymbolrelation()
  {
    if (symbolrelation != null && symbolrelation.eIsProxy())
    {
      InternalEObject oldSymbolrelation = (InternalEObject)symbolrelation;
      symbolrelation = (SymbolRelation)eResolveProxy(oldSymbolrelation);
      if (symbolrelation != oldSymbolrelation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION__SYMBOLRELATION, oldSymbolrelation, symbolrelation));
      }
    }
    return symbolrelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRelation basicGetSymbolrelation()
  {
    return symbolrelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolrelation(SymbolRelation newSymbolrelation)
  {
    SymbolRelation oldSymbolrelation = symbolrelation;
    symbolrelation = newSymbolrelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION__SYMBOLRELATION, oldSymbolrelation, symbolrelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getFromclassname()
  {
    if (fromclassname != null && fromclassname.eIsProxy())
    {
      InternalEObject oldFromclassname = (InternalEObject)fromclassname;
      fromclassname = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldFromclassname);
      if (fromclassname != oldFromclassname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION__FROMCLASSNAME, oldFromclassname, fromclassname));
      }
    }
    return fromclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetFromclassname()
  {
    return fromclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromclassname(org.xtext.nv.dsl.mMDSL.Class newFromclassname)
  {
    org.xtext.nv.dsl.mMDSL.Class oldFromclassname = fromclassname;
    fromclassname = newFromclassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION__FROMCLASSNAME, oldFromclassname, fromclassname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getToclassname()
  {
    if (toclassname != null && toclassname.eIsProxy())
    {
      InternalEObject oldToclassname = (InternalEObject)toclassname;
      toclassname = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldToclassname);
      if (toclassname != oldToclassname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.RELATION__TOCLASSNAME, oldToclassname, toclassname));
      }
    }
    return toclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetToclassname()
  {
    return toclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToclassname(org.xtext.nv.dsl.mMDSL.Class newToclassname)
  {
    org.xtext.nv.dsl.mMDSL.Class oldToclassname = toclassname;
    toclassname = newToclassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.RELATION__TOCLASSNAME, oldToclassname, toclassname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, MMDSLPackage.RELATION__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InsertEmbedCode> getInsertembedcode()
  {
    if (insertembedcode == null)
    {
      insertembedcode = new EObjectContainmentEList<InsertEmbedCode>(InsertEmbedCode.class, this, MMDSLPackage.RELATION__INSERTEMBEDCODE);
    }
    return insertembedcode;
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
      case MMDSLPackage.RELATION__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.RELATION__INSERTEMBEDCODE:
        return ((InternalEList<?>)getInsertembedcode()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.RELATION__NAME:
        return getName();
      case MMDSLPackage.RELATION__PARENTRELATIONNAME:
        if (resolve) return getParentrelationname();
        return basicGetParentrelationname();
      case MMDSLPackage.RELATION__SYMBOLRELATION:
        if (resolve) return getSymbolrelation();
        return basicGetSymbolrelation();
      case MMDSLPackage.RELATION__FROMCLASSNAME:
        if (resolve) return getFromclassname();
        return basicGetFromclassname();
      case MMDSLPackage.RELATION__TOCLASSNAME:
        if (resolve) return getToclassname();
        return basicGetToclassname();
      case MMDSLPackage.RELATION__ATTRIBUTE:
        return getAttribute();
      case MMDSLPackage.RELATION__INSERTEMBEDCODE:
        return getInsertembedcode();
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
      case MMDSLPackage.RELATION__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.RELATION__PARENTRELATIONNAME:
        setParentrelationname((Relation)newValue);
        return;
      case MMDSLPackage.RELATION__SYMBOLRELATION:
        setSymbolrelation((SymbolRelation)newValue);
        return;
      case MMDSLPackage.RELATION__FROMCLASSNAME:
        setFromclassname((org.xtext.nv.dsl.mMDSL.Class)newValue);
        return;
      case MMDSLPackage.RELATION__TOCLASSNAME:
        setToclassname((org.xtext.nv.dsl.mMDSL.Class)newValue);
        return;
      case MMDSLPackage.RELATION__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
        return;
      case MMDSLPackage.RELATION__INSERTEMBEDCODE:
        getInsertembedcode().clear();
        getInsertembedcode().addAll((Collection<? extends InsertEmbedCode>)newValue);
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
      case MMDSLPackage.RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.RELATION__PARENTRELATIONNAME:
        setParentrelationname((Relation)null);
        return;
      case MMDSLPackage.RELATION__SYMBOLRELATION:
        setSymbolrelation((SymbolRelation)null);
        return;
      case MMDSLPackage.RELATION__FROMCLASSNAME:
        setFromclassname((org.xtext.nv.dsl.mMDSL.Class)null);
        return;
      case MMDSLPackage.RELATION__TOCLASSNAME:
        setToclassname((org.xtext.nv.dsl.mMDSL.Class)null);
        return;
      case MMDSLPackage.RELATION__ATTRIBUTE:
        getAttribute().clear();
        return;
      case MMDSLPackage.RELATION__INSERTEMBEDCODE:
        getInsertembedcode().clear();
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
      case MMDSLPackage.RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.RELATION__PARENTRELATIONNAME:
        return parentrelationname != null;
      case MMDSLPackage.RELATION__SYMBOLRELATION:
        return symbolrelation != null;
      case MMDSLPackage.RELATION__FROMCLASSNAME:
        return fromclassname != null;
      case MMDSLPackage.RELATION__TOCLASSNAME:
        return toclassname != null;
      case MMDSLPackage.RELATION__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case MMDSLPackage.RELATION__INSERTEMBEDCODE:
        return insertembedcode != null && !insertembedcode.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
