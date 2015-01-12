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

import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.SVGCommand;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl#getGlobalstyle <em>Globalstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl#getSvgcommandsfrom <em>Svgcommandsfrom</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl#getSvgcommandsmiddle <em>Svgcommandsmiddle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl#getSvgcommandsto <em>Svgcommandsto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolRelationImpl extends MinimalEObjectImpl.Container implements SymbolRelation
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
   * The cached value of the '{@link #getGlobalstyle() <em>Globalstyle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobalstyle()
   * @generated
   * @ordered
   */
  protected SymbolStyle globalstyle;

  /**
   * The cached value of the '{@link #getSvgcommandsfrom() <em>Svgcommandsfrom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvgcommandsfrom()
   * @generated
   * @ordered
   */
  protected EList<SVGCommand> svgcommandsfrom;

  /**
   * The cached value of the '{@link #getSvgcommandsmiddle() <em>Svgcommandsmiddle</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvgcommandsmiddle()
   * @generated
   * @ordered
   */
  protected EList<SVGCommand> svgcommandsmiddle;

  /**
   * The cached value of the '{@link #getSvgcommandsto() <em>Svgcommandsto</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvgcommandsto()
   * @generated
   * @ordered
   */
  protected EList<SVGCommand> svgcommandsto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolRelationImpl()
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
    return MMDSLPackage.eINSTANCE.getSymbolRelation();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle getGlobalstyle()
  {
    if (globalstyle != null && globalstyle.eIsProxy())
    {
      InternalEObject oldGlobalstyle = (InternalEObject)globalstyle;
      globalstyle = (SymbolStyle)eResolveProxy(oldGlobalstyle);
      if (globalstyle != oldGlobalstyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE, oldGlobalstyle, globalstyle));
      }
    }
    return globalstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle basicGetGlobalstyle()
  {
    return globalstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGlobalstyle(SymbolStyle newGlobalstyle)
  {
    SymbolStyle oldGlobalstyle = globalstyle;
    globalstyle = newGlobalstyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE, oldGlobalstyle, globalstyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SVGCommand> getSvgcommandsfrom()
  {
    if (svgcommandsfrom == null)
    {
      svgcommandsfrom = new EObjectContainmentEList<SVGCommand>(SVGCommand.class, this, MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM);
    }
    return svgcommandsfrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SVGCommand> getSvgcommandsmiddle()
  {
    if (svgcommandsmiddle == null)
    {
      svgcommandsmiddle = new EObjectContainmentEList<SVGCommand>(SVGCommand.class, this, MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE);
    }
    return svgcommandsmiddle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SVGCommand> getSvgcommandsto()
  {
    if (svgcommandsto == null)
    {
      svgcommandsto = new EObjectContainmentEList<SVGCommand>(SVGCommand.class, this, MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO);
    }
    return svgcommandsto;
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
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM:
        return ((InternalEList<?>)getSvgcommandsfrom()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE:
        return ((InternalEList<?>)getSvgcommandsmiddle()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO:
        return ((InternalEList<?>)getSvgcommandsto()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.SYMBOL_RELATION__NAME:
        return getName();
      case MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE:
        if (resolve) return getGlobalstyle();
        return basicGetGlobalstyle();
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM:
        return getSvgcommandsfrom();
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE:
        return getSvgcommandsmiddle();
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO:
        return getSvgcommandsto();
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
      case MMDSLPackage.SYMBOL_RELATION__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE:
        setGlobalstyle((SymbolStyle)newValue);
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM:
        getSvgcommandsfrom().clear();
        getSvgcommandsfrom().addAll((Collection<? extends SVGCommand>)newValue);
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE:
        getSvgcommandsmiddle().clear();
        getSvgcommandsmiddle().addAll((Collection<? extends SVGCommand>)newValue);
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO:
        getSvgcommandsto().clear();
        getSvgcommandsto().addAll((Collection<? extends SVGCommand>)newValue);
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
      case MMDSLPackage.SYMBOL_RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE:
        setGlobalstyle((SymbolStyle)null);
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM:
        getSvgcommandsfrom().clear();
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE:
        getSvgcommandsmiddle().clear();
        return;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO:
        getSvgcommandsto().clear();
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
      case MMDSLPackage.SYMBOL_RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.SYMBOL_RELATION__GLOBALSTYLE:
        return globalstyle != null;
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSFROM:
        return svgcommandsfrom != null && !svgcommandsfrom.isEmpty();
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSMIDDLE:
        return svgcommandsmiddle != null && !svgcommandsmiddle.isEmpty();
      case MMDSLPackage.SYMBOL_RELATION__SVGCOMMANDSTO:
        return svgcommandsto != null && !svgcommandsto.isEmpty();
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

} //SymbolRelationImpl
