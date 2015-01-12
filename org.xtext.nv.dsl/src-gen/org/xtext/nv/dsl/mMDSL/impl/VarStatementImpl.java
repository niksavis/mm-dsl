/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.AlgorithmOperation;
import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.Expr;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.Reference;
import org.xtext.nv.dsl.mMDSL.SymbolClass;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;
import org.xtext.nv.dsl.mMDSL.VarStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getAlgorithmoperation <em>Algorithmoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getSymbolclass <em>Symbolclass</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getSymbolrelation <em>Symbolrelation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getSymbolstyle <em>Symbolstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getEmbeddedcode <em>Embeddedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl#getModeltype <em>Modeltype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarStatementImpl extends MinimalEObjectImpl.Container implements VarStatement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expr expression;

  /**
   * The cached value of the '{@link #getAlgorithmoperation() <em>Algorithmoperation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithmoperation()
   * @generated
   * @ordered
   */
  protected AlgorithmOperation algorithmoperation;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected org.xtext.nv.dsl.mMDSL.Class class_;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Reference reference;

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
   * The cached value of the '{@link #getSymbolrelation() <em>Symbolrelation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolrelation()
   * @generated
   * @ordered
   */
  protected SymbolRelation symbolrelation;

  /**
   * The cached value of the '{@link #getSymbolstyle() <em>Symbolstyle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolstyle()
   * @generated
   * @ordered
   */
  protected SymbolStyle symbolstyle;

  /**
   * The cached value of the '{@link #getEmbeddedcode() <em>Embeddedcode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedcode()
   * @generated
   * @ordered
   */
  protected EmbedCode embeddedcode;

  /**
   * The cached value of the '{@link #getModeltype() <em>Modeltype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeltype()
   * @generated
   * @ordered
   */
  protected ModelType modeltype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarStatementImpl()
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
    return MMDSLPackage.eINSTANCE.getVarStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expr newExpression, NotificationChain msgs)
  {
    Expr oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expr newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VAR_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VAR_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgorithmOperation getAlgorithmoperation()
  {
    return algorithmoperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlgorithmoperation(AlgorithmOperation newAlgorithmoperation, NotificationChain msgs)
  {
    AlgorithmOperation oldAlgorithmoperation = algorithmoperation;
    algorithmoperation = newAlgorithmoperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION, oldAlgorithmoperation, newAlgorithmoperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlgorithmoperation(AlgorithmOperation newAlgorithmoperation)
  {
    if (newAlgorithmoperation != algorithmoperation)
    {
      NotificationChain msgs = null;
      if (algorithmoperation != null)
        msgs = ((InternalEObject)algorithmoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION, null, msgs);
      if (newAlgorithmoperation != null)
        msgs = ((InternalEObject)newAlgorithmoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION, null, msgs);
      msgs = basicSetAlgorithmoperation(newAlgorithmoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION, newAlgorithmoperation, newAlgorithmoperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (org.xtext.nv.dsl.mMDSL.Class)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(org.xtext.nv.dsl.mMDSL.Class newClass)
  {
    org.xtext.nv.dsl.mMDSL.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (Reference)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(Reference newReference)
  {
    Reference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__REFERENCE, oldReference, reference));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS, oldSymbolclass, symbolclass));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS, oldSymbolclass, symbolclass));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION, oldSymbolrelation, symbolrelation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION, oldSymbolrelation, symbolrelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle getSymbolstyle()
  {
    if (symbolstyle != null && symbolstyle.eIsProxy())
    {
      InternalEObject oldSymbolstyle = (InternalEObject)symbolstyle;
      symbolstyle = (SymbolStyle)eResolveProxy(oldSymbolstyle);
      if (symbolstyle != oldSymbolstyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE, oldSymbolstyle, symbolstyle));
      }
    }
    return symbolstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle basicGetSymbolstyle()
  {
    return symbolstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolstyle(SymbolStyle newSymbolstyle)
  {
    SymbolStyle oldSymbolstyle = symbolstyle;
    symbolstyle = newSymbolstyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE, oldSymbolstyle, symbolstyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCode getEmbeddedcode()
  {
    if (embeddedcode != null && embeddedcode.eIsProxy())
    {
      InternalEObject oldEmbeddedcode = (InternalEObject)embeddedcode;
      embeddedcode = (EmbedCode)eResolveProxy(oldEmbeddedcode);
      if (embeddedcode != oldEmbeddedcode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE, oldEmbeddedcode, embeddedcode));
      }
    }
    return embeddedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCode basicGetEmbeddedcode()
  {
    return embeddedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedcode(EmbedCode newEmbeddedcode)
  {
    EmbedCode oldEmbeddedcode = embeddedcode;
    embeddedcode = newEmbeddedcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE, oldEmbeddedcode, embeddedcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType getModeltype()
  {
    if (modeltype != null && modeltype.eIsProxy())
    {
      InternalEObject oldModeltype = (InternalEObject)modeltype;
      modeltype = (ModelType)eResolveProxy(oldModeltype);
      if (modeltype != oldModeltype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.VAR_STATEMENT__MODELTYPE, oldModeltype, modeltype));
      }
    }
    return modeltype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType basicGetModeltype()
  {
    return modeltype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeltype(ModelType newModeltype)
  {
    ModelType oldModeltype = modeltype;
    modeltype = newModeltype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.VAR_STATEMENT__MODELTYPE, oldModeltype, modeltype));
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
      case MMDSLPackage.VAR_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION:
        return basicSetAlgorithmoperation(null, msgs);
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
      case MMDSLPackage.VAR_STATEMENT__EXPRESSION:
        return getExpression();
      case MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION:
        return getAlgorithmoperation();
      case MMDSLPackage.VAR_STATEMENT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case MMDSLPackage.VAR_STATEMENT__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case MMDSLPackage.VAR_STATEMENT__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS:
        if (resolve) return getSymbolclass();
        return basicGetSymbolclass();
      case MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION:
        if (resolve) return getSymbolrelation();
        return basicGetSymbolrelation();
      case MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE:
        if (resolve) return getSymbolstyle();
        return basicGetSymbolstyle();
      case MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE:
        if (resolve) return getEmbeddedcode();
        return basicGetEmbeddedcode();
      case MMDSLPackage.VAR_STATEMENT__MODELTYPE:
        if (resolve) return getModeltype();
        return basicGetModeltype();
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
      case MMDSLPackage.VAR_STATEMENT__EXPRESSION:
        setExpression((Expr)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION:
        setAlgorithmoperation((AlgorithmOperation)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__CLASS:
        setClass((org.xtext.nv.dsl.mMDSL.Class)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__REFERENCE:
        setReference((Reference)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS:
        setSymbolclass((SymbolClass)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION:
        setSymbolrelation((SymbolRelation)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE:
        setSymbolstyle((SymbolStyle)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE:
        setEmbeddedcode((EmbedCode)newValue);
        return;
      case MMDSLPackage.VAR_STATEMENT__MODELTYPE:
        setModeltype((ModelType)newValue);
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
      case MMDSLPackage.VAR_STATEMENT__EXPRESSION:
        setExpression((Expr)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION:
        setAlgorithmoperation((AlgorithmOperation)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__CLASS:
        setClass((org.xtext.nv.dsl.mMDSL.Class)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__REFERENCE:
        setReference((Reference)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS:
        setSymbolclass((SymbolClass)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION:
        setSymbolrelation((SymbolRelation)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE:
        setSymbolstyle((SymbolStyle)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE:
        setEmbeddedcode((EmbedCode)null);
        return;
      case MMDSLPackage.VAR_STATEMENT__MODELTYPE:
        setModeltype((ModelType)null);
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
      case MMDSLPackage.VAR_STATEMENT__EXPRESSION:
        return expression != null;
      case MMDSLPackage.VAR_STATEMENT__ALGORITHMOPERATION:
        return algorithmoperation != null;
      case MMDSLPackage.VAR_STATEMENT__CLASS:
        return class_ != null;
      case MMDSLPackage.VAR_STATEMENT__ATTRIBUTE:
        return attribute != null;
      case MMDSLPackage.VAR_STATEMENT__REFERENCE:
        return reference != null;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLCLASS:
        return symbolclass != null;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLRELATION:
        return symbolrelation != null;
      case MMDSLPackage.VAR_STATEMENT__SYMBOLSTYLE:
        return symbolstyle != null;
      case MMDSLPackage.VAR_STATEMENT__EMBEDDEDCODE:
        return embeddedcode != null;
      case MMDSLPackage.VAR_STATEMENT__MODELTYPE:
        return modeltype != null;
    }
    return super.eIsSet(featureID);
  }

} //VarStatementImpl
