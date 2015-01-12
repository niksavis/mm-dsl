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

import org.xtext.nv.dsl.mMDSL.FillColor;
import org.xtext.nv.dsl.mMDSL.FontFamily;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.StrokeColor;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getFillcolor <em>Fillcolor</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getStrokecolor <em>Strokecolor</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getFontfamily <em>Fontfamily</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolStyleImpl extends MinimalEObjectImpl.Container implements SymbolStyle
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
   * The cached value of the '{@link #getFillcolor() <em>Fillcolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillcolor()
   * @generated
   * @ordered
   */
  protected FillColor fillcolor;

  /**
   * The cached value of the '{@link #getStrokecolor() <em>Strokecolor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrokecolor()
   * @generated
   * @ordered
   */
  protected StrokeColor strokecolor;

  /**
   * The default value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrokewidth()
   * @generated
   * @ordered
   */
  protected static final String STROKEWIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrokewidth()
   * @generated
   * @ordered
   */
  protected String strokewidth = STROKEWIDTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getFontfamily() <em>Fontfamily</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontfamily()
   * @generated
   * @ordered
   */
  protected FontFamily fontfamily;

  /**
   * The default value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontsize()
   * @generated
   * @ordered
   */
  protected static final String FONTSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontsize()
   * @generated
   * @ordered
   */
  protected String fontsize = FONTSIZE_EDEFAULT;

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
  protected SymbolStyleImpl()
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
    return MMDSLPackage.eINSTANCE.getSymbolStyle();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FillColor getFillcolor()
  {
    return fillcolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFillcolor(FillColor newFillcolor, NotificationChain msgs)
  {
    FillColor oldFillcolor = fillcolor;
    fillcolor = newFillcolor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__FILLCOLOR, oldFillcolor, newFillcolor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillcolor(FillColor newFillcolor)
  {
    if (newFillcolor != fillcolor)
    {
      NotificationChain msgs = null;
      if (fillcolor != null)
        msgs = ((InternalEObject)fillcolor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__FILLCOLOR, null, msgs);
      if (newFillcolor != null)
        msgs = ((InternalEObject)newFillcolor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__FILLCOLOR, null, msgs);
      msgs = basicSetFillcolor(newFillcolor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__FILLCOLOR, newFillcolor, newFillcolor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrokeColor getStrokecolor()
  {
    return strokecolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrokecolor(StrokeColor newStrokecolor, NotificationChain msgs)
  {
    StrokeColor oldStrokecolor = strokecolor;
    strokecolor = newStrokecolor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__STROKECOLOR, oldStrokecolor, newStrokecolor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrokecolor(StrokeColor newStrokecolor)
  {
    if (newStrokecolor != strokecolor)
    {
      NotificationChain msgs = null;
      if (strokecolor != null)
        msgs = ((InternalEObject)strokecolor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__STROKECOLOR, null, msgs);
      if (newStrokecolor != null)
        msgs = ((InternalEObject)newStrokecolor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__STROKECOLOR, null, msgs);
      msgs = basicSetStrokecolor(newStrokecolor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__STROKECOLOR, newStrokecolor, newStrokecolor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrokewidth()
  {
    return strokewidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrokewidth(String newStrokewidth)
  {
    String oldStrokewidth = strokewidth;
    strokewidth = newStrokewidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__STROKEWIDTH, oldStrokewidth, strokewidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamily getFontfamily()
  {
    return fontfamily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontfamily(FontFamily newFontfamily, NotificationChain msgs)
  {
    FontFamily oldFontfamily = fontfamily;
    fontfamily = newFontfamily;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__FONTFAMILY, oldFontfamily, newFontfamily);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontfamily(FontFamily newFontfamily)
  {
    if (newFontfamily != fontfamily)
    {
      NotificationChain msgs = null;
      if (fontfamily != null)
        msgs = ((InternalEObject)fontfamily).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__FONTFAMILY, null, msgs);
      if (newFontfamily != null)
        msgs = ((InternalEObject)newFontfamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SYMBOL_STYLE__FONTFAMILY, null, msgs);
      msgs = basicSetFontfamily(newFontfamily, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__FONTFAMILY, newFontfamily, newFontfamily));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFontsize()
  {
    return fontsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontsize(String newFontsize)
  {
    String oldFontsize = fontsize;
    fontsize = newFontsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SYMBOL_STYLE__FONTSIZE, oldFontsize, fontsize));
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
      insertembedcode = new EObjectContainmentEList<InsertEmbedCode>(InsertEmbedCode.class, this, MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE);
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
      case MMDSLPackage.SYMBOL_STYLE__FILLCOLOR:
        return basicSetFillcolor(null, msgs);
      case MMDSLPackage.SYMBOL_STYLE__STROKECOLOR:
        return basicSetStrokecolor(null, msgs);
      case MMDSLPackage.SYMBOL_STYLE__FONTFAMILY:
        return basicSetFontfamily(null, msgs);
      case MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE:
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
      case MMDSLPackage.SYMBOL_STYLE__NAME:
        return getName();
      case MMDSLPackage.SYMBOL_STYLE__FILLCOLOR:
        return getFillcolor();
      case MMDSLPackage.SYMBOL_STYLE__STROKECOLOR:
        return getStrokecolor();
      case MMDSLPackage.SYMBOL_STYLE__STROKEWIDTH:
        return getStrokewidth();
      case MMDSLPackage.SYMBOL_STYLE__FONTFAMILY:
        return getFontfamily();
      case MMDSLPackage.SYMBOL_STYLE__FONTSIZE:
        return getFontsize();
      case MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE:
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
      case MMDSLPackage.SYMBOL_STYLE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FILLCOLOR:
        setFillcolor((FillColor)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__STROKECOLOR:
        setStrokecolor((StrokeColor)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__STROKEWIDTH:
        setStrokewidth((String)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FONTFAMILY:
        setFontfamily((FontFamily)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FONTSIZE:
        setFontsize((String)newValue);
        return;
      case MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE:
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
      case MMDSLPackage.SYMBOL_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FILLCOLOR:
        setFillcolor((FillColor)null);
        return;
      case MMDSLPackage.SYMBOL_STYLE__STROKECOLOR:
        setStrokecolor((StrokeColor)null);
        return;
      case MMDSLPackage.SYMBOL_STYLE__STROKEWIDTH:
        setStrokewidth(STROKEWIDTH_EDEFAULT);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FONTFAMILY:
        setFontfamily((FontFamily)null);
        return;
      case MMDSLPackage.SYMBOL_STYLE__FONTSIZE:
        setFontsize(FONTSIZE_EDEFAULT);
        return;
      case MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE:
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
      case MMDSLPackage.SYMBOL_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.SYMBOL_STYLE__FILLCOLOR:
        return fillcolor != null;
      case MMDSLPackage.SYMBOL_STYLE__STROKECOLOR:
        return strokecolor != null;
      case MMDSLPackage.SYMBOL_STYLE__STROKEWIDTH:
        return STROKEWIDTH_EDEFAULT == null ? strokewidth != null : !STROKEWIDTH_EDEFAULT.equals(strokewidth);
      case MMDSLPackage.SYMBOL_STYLE__FONTFAMILY:
        return fontfamily != null;
      case MMDSLPackage.SYMBOL_STYLE__FONTSIZE:
        return FONTSIZE_EDEFAULT == null ? fontsize != null : !FONTSIZE_EDEFAULT.equals(fontsize);
      case MMDSLPackage.SYMBOL_STYLE__INSERTEMBEDCODE:
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
    result.append(", strokewidth: ");
    result.append(strokewidth);
    result.append(", fontsize: ");
    result.append(fontsize);
    result.append(')');
    return result.toString();
  }

} //SymbolStyleImpl
