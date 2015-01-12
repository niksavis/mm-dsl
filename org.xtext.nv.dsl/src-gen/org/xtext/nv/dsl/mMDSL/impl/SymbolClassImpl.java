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
import org.xtext.nv.dsl.mMDSL.SymbolClass;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolClassImpl#getGlobalstyle <em>Globalstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolClassImpl#getSvgcommand <em>Svgcommand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolClassImpl extends MinimalEObjectImpl.Container implements SymbolClass
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
   * The cached value of the '{@link #getSvgcommand() <em>Svgcommand</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvgcommand()
   * @generated
   * @ordered
   */
  protected EList<SVGCommand> svgcommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolClassImpl()
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
    return MMDSLPackage.eINSTANCE.getSymbolClass();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_CLASS__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE, oldGlobalstyle, globalstyle));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE, oldGlobalstyle, globalstyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SVGCommand> getSvgcommand()
  {
    if (svgcommand == null)
    {
      svgcommand = new EObjectContainmentEList<SVGCommand>(SVGCommand.class, this, MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND);
    }
    return svgcommand;
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
      case MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND:
        return ((InternalEList<?>)getSvgcommand()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.SYMBOL_CLASS__NAME:
        return getName();
      case MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE:
        if (resolve) return getGlobalstyle();
        return basicGetGlobalstyle();
      case MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND:
        return getSvgcommand();
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
      case MMDSLPackage.SYMBOL_CLASS__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE:
        setGlobalstyle((SymbolStyle)newValue);
        return;
      case MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND:
        getSvgcommand().clear();
        getSvgcommand().addAll((Collection<? extends SVGCommand>)newValue);
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
      case MMDSLPackage.SYMBOL_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE:
        setGlobalstyle((SymbolStyle)null);
        return;
      case MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND:
        getSvgcommand().clear();
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
      case MMDSLPackage.SYMBOL_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.SYMBOL_CLASS__GLOBALSTYLE:
        return globalstyle != null;
      case MMDSLPackage.SYMBOL_CLASS__SVGCOMMAND:
        return svgcommand != null && !svgcommand.isEmpty();
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

} //SymbolClassImpl
