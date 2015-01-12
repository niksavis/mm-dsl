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
import org.xtext.nv.dsl.mMDSL.ClassAttribute;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Reference;
import org.xtext.nv.dsl.mMDSL.SymbolClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getParentclassname <em>Parentclassname</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getClassattribute <em>Classattribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getInsertembedcode <em>Insertembedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements org.xtext.nv.dsl.mMDSL.Class
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
   * The cached value of the '{@link #getParentclassname() <em>Parentclassname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentclassname()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class parentclassname;

  /**
   * The cached value of the '{@link #getSymbolclass() <em>Symbolclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolclass()
   * @generated
   * @ordered
   */
  protected SymbolClass symbolclass;

  /**
   * The cached value of the '{@link #getClassattribute() <em>Classattribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassattribute()
   * @generated
   * @ordered
   */
  protected EList<ClassAttribute> classattribute;

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
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EList<Reference> reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return MMDSLPackage.eINSTANCE.getClass_();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getParentclassname()
  {
    if (parentclassname != null && parentclassname.eIsProxy())
    {
      InternalEObject oldParentclassname = (InternalEObject)parentclassname;
      parentclassname = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldParentclassname);
      if (parentclassname != oldParentclassname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.CLASS__PARENTCLASSNAME, oldParentclassname, parentclassname));
      }
    }
    return parentclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetParentclassname()
  {
    return parentclassname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentclassname(org.xtext.nv.dsl.mMDSL.Class newParentclassname)
  {
    org.xtext.nv.dsl.mMDSL.Class oldParentclassname = parentclassname;
    parentclassname = newParentclassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS__PARENTCLASSNAME, oldParentclassname, parentclassname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolClass getSymbolclass()
  {
    if (symbolclass != null && symbolclass.eIsProxy())
    {
      InternalEObject oldSymbolclass = (InternalEObject)symbolclass;
      symbolclass = (SymbolClass)eResolveProxy(oldSymbolclass);
      if (symbolclass != oldSymbolclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.CLASS__SYMBOLCLASS, oldSymbolclass, symbolclass));
      }
    }
    return symbolclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolClass basicGetSymbolclass()
  {
    return symbolclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolclass(SymbolClass newSymbolclass)
  {
    SymbolClass oldSymbolclass = symbolclass;
    symbolclass = newSymbolclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.CLASS__SYMBOLCLASS, oldSymbolclass, symbolclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassAttribute> getClassattribute()
  {
    if (classattribute == null)
    {
      classattribute = new EObjectContainmentEList<ClassAttribute>(ClassAttribute.class, this, MMDSLPackage.CLASS__CLASSATTRIBUTE);
    }
    return classattribute;
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
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, MMDSLPackage.CLASS__ATTRIBUTE);
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
      insertembedcode = new EObjectContainmentEList<InsertEmbedCode>(InsertEmbedCode.class, this, MMDSLPackage.CLASS__INSERTEMBEDCODE);
    }
    return insertembedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getReference()
  {
    if (reference == null)
    {
      reference = new EObjectContainmentEList<Reference>(Reference.class, this, MMDSLPackage.CLASS__REFERENCE);
    }
    return reference;
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
      case MMDSLPackage.CLASS__CLASSATTRIBUTE:
        return ((InternalEList<?>)getClassattribute()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.CLASS__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.CLASS__INSERTEMBEDCODE:
        return ((InternalEList<?>)getInsertembedcode()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.CLASS__REFERENCE:
        return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.CLASS__NAME:
        return getName();
      case MMDSLPackage.CLASS__PARENTCLASSNAME:
        if (resolve) return getParentclassname();
        return basicGetParentclassname();
      case MMDSLPackage.CLASS__SYMBOLCLASS:
        if (resolve) return getSymbolclass();
        return basicGetSymbolclass();
      case MMDSLPackage.CLASS__CLASSATTRIBUTE:
        return getClassattribute();
      case MMDSLPackage.CLASS__ATTRIBUTE:
        return getAttribute();
      case MMDSLPackage.CLASS__INSERTEMBEDCODE:
        return getInsertembedcode();
      case MMDSLPackage.CLASS__REFERENCE:
        return getReference();
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
      case MMDSLPackage.CLASS__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.CLASS__PARENTCLASSNAME:
        setParentclassname((org.xtext.nv.dsl.mMDSL.Class)newValue);
        return;
      case MMDSLPackage.CLASS__SYMBOLCLASS:
        setSymbolclass((SymbolClass)newValue);
        return;
      case MMDSLPackage.CLASS__CLASSATTRIBUTE:
        getClassattribute().clear();
        getClassattribute().addAll((Collection<? extends ClassAttribute>)newValue);
        return;
      case MMDSLPackage.CLASS__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
        return;
      case MMDSLPackage.CLASS__INSERTEMBEDCODE:
        getInsertembedcode().clear();
        getInsertembedcode().addAll((Collection<? extends InsertEmbedCode>)newValue);
        return;
      case MMDSLPackage.CLASS__REFERENCE:
        getReference().clear();
        getReference().addAll((Collection<? extends Reference>)newValue);
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
      case MMDSLPackage.CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.CLASS__PARENTCLASSNAME:
        setParentclassname((org.xtext.nv.dsl.mMDSL.Class)null);
        return;
      case MMDSLPackage.CLASS__SYMBOLCLASS:
        setSymbolclass((SymbolClass)null);
        return;
      case MMDSLPackage.CLASS__CLASSATTRIBUTE:
        getClassattribute().clear();
        return;
      case MMDSLPackage.CLASS__ATTRIBUTE:
        getAttribute().clear();
        return;
      case MMDSLPackage.CLASS__INSERTEMBEDCODE:
        getInsertembedcode().clear();
        return;
      case MMDSLPackage.CLASS__REFERENCE:
        getReference().clear();
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
      case MMDSLPackage.CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.CLASS__PARENTCLASSNAME:
        return parentclassname != null;
      case MMDSLPackage.CLASS__SYMBOLCLASS:
        return symbolclass != null;
      case MMDSLPackage.CLASS__CLASSATTRIBUTE:
        return classattribute != null && !classattribute.isEmpty();
      case MMDSLPackage.CLASS__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
      case MMDSLPackage.CLASS__INSERTEMBEDCODE:
        return insertembedcode != null && !insertembedcode.isEmpty();
      case MMDSLPackage.CLASS__REFERENCE:
        return reference != null && !reference.isEmpty();
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

} //ClassImpl
