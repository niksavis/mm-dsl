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
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.LoopStatement;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.SelectionStatement;
import org.xtext.nv.dsl.mMDSL.Statement;
import org.xtext.nv.dsl.mMDSL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl#getAlgorithmoperation <em>Algorithmoperation</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl#getInsertembedcode <em>Insertembedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected SelectionStatement selection;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected LoopStatement loop;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

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
   * The cached value of the '{@link #getInsertembedcode() <em>Insertembedcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsertembedcode()
   * @generated
   * @ordered
   */
  protected InsertEmbedCode insertembedcode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return MMDSLPackage.eINSTANCE.getStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionStatement getSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelection(SelectionStatement newSelection, NotificationChain msgs)
  {
    SelectionStatement oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__SELECTION, oldSelection, newSelection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(SelectionStatement newSelection)
  {
    if (newSelection != selection)
    {
      NotificationChain msgs = null;
      if (selection != null)
        msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__SELECTION, null, msgs);
      if (newSelection != null)
        msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__SELECTION, null, msgs);
      msgs = basicSetSelection(newSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__SELECTION, newSelection, newSelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopStatement getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(LoopStatement newLoop, NotificationChain msgs)
  {
    LoopStatement oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__LOOP, oldLoop, newLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoop(LoopStatement newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__VARIABLE, newVariable, newVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__ALGORITHMOPERATION, oldAlgorithmoperation, newAlgorithmoperation);
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
        msgs = ((InternalEObject)algorithmoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__ALGORITHMOPERATION, null, msgs);
      if (newAlgorithmoperation != null)
        msgs = ((InternalEObject)newAlgorithmoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__ALGORITHMOPERATION, null, msgs);
      msgs = basicSetAlgorithmoperation(newAlgorithmoperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__ALGORITHMOPERATION, newAlgorithmoperation, newAlgorithmoperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertEmbedCode getInsertembedcode()
  {
    return insertembedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInsertembedcode(InsertEmbedCode newInsertembedcode, NotificationChain msgs)
  {
    InsertEmbedCode oldInsertembedcode = insertembedcode;
    insertembedcode = newInsertembedcode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__INSERTEMBEDCODE, oldInsertembedcode, newInsertembedcode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsertembedcode(InsertEmbedCode newInsertembedcode)
  {
    if (newInsertembedcode != insertembedcode)
    {
      NotificationChain msgs = null;
      if (insertembedcode != null)
        msgs = ((InternalEObject)insertembedcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__INSERTEMBEDCODE, null, msgs);
      if (newInsertembedcode != null)
        msgs = ((InternalEObject)newInsertembedcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.STATEMENT__INSERTEMBEDCODE, null, msgs);
      msgs = basicSetInsertembedcode(newInsertembedcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.STATEMENT__INSERTEMBEDCODE, newInsertembedcode, newInsertembedcode));
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
      case MMDSLPackage.STATEMENT__SELECTION:
        return basicSetSelection(null, msgs);
      case MMDSLPackage.STATEMENT__LOOP:
        return basicSetLoop(null, msgs);
      case MMDSLPackage.STATEMENT__VARIABLE:
        return basicSetVariable(null, msgs);
      case MMDSLPackage.STATEMENT__ALGORITHMOPERATION:
        return basicSetAlgorithmoperation(null, msgs);
      case MMDSLPackage.STATEMENT__INSERTEMBEDCODE:
        return basicSetInsertembedcode(null, msgs);
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
      case MMDSLPackage.STATEMENT__SELECTION:
        return getSelection();
      case MMDSLPackage.STATEMENT__LOOP:
        return getLoop();
      case MMDSLPackage.STATEMENT__VARIABLE:
        return getVariable();
      case MMDSLPackage.STATEMENT__ALGORITHMOPERATION:
        return getAlgorithmoperation();
      case MMDSLPackage.STATEMENT__INSERTEMBEDCODE:
        return getInsertembedcode();
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
      case MMDSLPackage.STATEMENT__SELECTION:
        setSelection((SelectionStatement)newValue);
        return;
      case MMDSLPackage.STATEMENT__LOOP:
        setLoop((LoopStatement)newValue);
        return;
      case MMDSLPackage.STATEMENT__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case MMDSLPackage.STATEMENT__ALGORITHMOPERATION:
        setAlgorithmoperation((AlgorithmOperation)newValue);
        return;
      case MMDSLPackage.STATEMENT__INSERTEMBEDCODE:
        setInsertembedcode((InsertEmbedCode)newValue);
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
      case MMDSLPackage.STATEMENT__SELECTION:
        setSelection((SelectionStatement)null);
        return;
      case MMDSLPackage.STATEMENT__LOOP:
        setLoop((LoopStatement)null);
        return;
      case MMDSLPackage.STATEMENT__VARIABLE:
        setVariable((Variable)null);
        return;
      case MMDSLPackage.STATEMENT__ALGORITHMOPERATION:
        setAlgorithmoperation((AlgorithmOperation)null);
        return;
      case MMDSLPackage.STATEMENT__INSERTEMBEDCODE:
        setInsertembedcode((InsertEmbedCode)null);
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
      case MMDSLPackage.STATEMENT__SELECTION:
        return selection != null;
      case MMDSLPackage.STATEMENT__LOOP:
        return loop != null;
      case MMDSLPackage.STATEMENT__VARIABLE:
        return variable != null;
      case MMDSLPackage.STATEMENT__ALGORITHMOPERATION:
        return algorithmoperation != null;
      case MMDSLPackage.STATEMENT__INSERTEMBEDCODE:
        return insertembedcode != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
