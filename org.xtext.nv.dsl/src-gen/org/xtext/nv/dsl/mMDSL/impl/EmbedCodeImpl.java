/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.EmbedCodeType;
import org.xtext.nv.dsl.mMDSL.EmbedPlatformType;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embed Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl#getEmbedplatformtype <em>Embedplatformtype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl#getEmbedcodetype <em>Embedcodetype</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl#getEmbeddedcode <em>Embeddedcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbedCodeImpl extends MinimalEObjectImpl.Container implements EmbedCode
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
   * The cached value of the '{@link #getEmbedplatformtype() <em>Embedplatformtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedplatformtype()
   * @generated
   * @ordered
   */
  protected EmbedPlatformType embedplatformtype;

  /**
   * The cached value of the '{@link #getEmbedcodetype() <em>Embedcodetype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedcodetype()
   * @generated
   * @ordered
   */
  protected EmbedCodeType embedcodetype;

  /**
   * The default value of the '{@link #getEmbeddedcode() <em>Embeddedcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedcode()
   * @generated
   * @ordered
   */
  protected static final String EMBEDDEDCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmbeddedcode() <em>Embeddedcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedcode()
   * @generated
   * @ordered
   */
  protected String embeddedcode = EMBEDDEDCODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmbedCodeImpl()
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
    return MMDSLPackage.eINSTANCE.getEmbedCode();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EMBED_CODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedPlatformType getEmbedplatformtype()
  {
    if (embedplatformtype != null && embedplatformtype.eIsProxy())
    {
      InternalEObject oldEmbedplatformtype = (InternalEObject)embedplatformtype;
      embedplatformtype = (EmbedPlatformType)eResolveProxy(oldEmbedplatformtype);
      if (embedplatformtype != oldEmbedplatformtype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE, oldEmbedplatformtype, embedplatformtype));
      }
    }
    return embedplatformtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedPlatformType basicGetEmbedplatformtype()
  {
    return embedplatformtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbedplatformtype(EmbedPlatformType newEmbedplatformtype)
  {
    EmbedPlatformType oldEmbedplatformtype = embedplatformtype;
    embedplatformtype = newEmbedplatformtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE, oldEmbedplatformtype, embedplatformtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCodeType getEmbedcodetype()
  {
    if (embedcodetype != null && embedcodetype.eIsProxy())
    {
      InternalEObject oldEmbedcodetype = (InternalEObject)embedcodetype;
      embedcodetype = (EmbedCodeType)eResolveProxy(oldEmbedcodetype);
      if (embedcodetype != oldEmbedcodetype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.EMBED_CODE__EMBEDCODETYPE, oldEmbedcodetype, embedcodetype));
      }
    }
    return embedcodetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCodeType basicGetEmbedcodetype()
  {
    return embedcodetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbedcodetype(EmbedCodeType newEmbedcodetype)
  {
    EmbedCodeType oldEmbedcodetype = embedcodetype;
    embedcodetype = newEmbedcodetype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EMBED_CODE__EMBEDCODETYPE, oldEmbedcodetype, embedcodetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmbeddedcode()
  {
    return embeddedcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedcode(String newEmbeddedcode)
  {
    String oldEmbeddedcode = embeddedcode;
    embeddedcode = newEmbeddedcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.EMBED_CODE__EMBEDDEDCODE, oldEmbeddedcode, embeddedcode));
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
      case MMDSLPackage.EMBED_CODE__NAME:
        return getName();
      case MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE:
        if (resolve) return getEmbedplatformtype();
        return basicGetEmbedplatformtype();
      case MMDSLPackage.EMBED_CODE__EMBEDCODETYPE:
        if (resolve) return getEmbedcodetype();
        return basicGetEmbedcodetype();
      case MMDSLPackage.EMBED_CODE__EMBEDDEDCODE:
        return getEmbeddedcode();
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
      case MMDSLPackage.EMBED_CODE__NAME:
        setName((String)newValue);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE:
        setEmbedplatformtype((EmbedPlatformType)newValue);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDCODETYPE:
        setEmbedcodetype((EmbedCodeType)newValue);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDDEDCODE:
        setEmbeddedcode((String)newValue);
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
      case MMDSLPackage.EMBED_CODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE:
        setEmbedplatformtype((EmbedPlatformType)null);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDCODETYPE:
        setEmbedcodetype((EmbedCodeType)null);
        return;
      case MMDSLPackage.EMBED_CODE__EMBEDDEDCODE:
        setEmbeddedcode(EMBEDDEDCODE_EDEFAULT);
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
      case MMDSLPackage.EMBED_CODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MMDSLPackage.EMBED_CODE__EMBEDPLATFORMTYPE:
        return embedplatformtype != null;
      case MMDSLPackage.EMBED_CODE__EMBEDCODETYPE:
        return embedcodetype != null;
      case MMDSLPackage.EMBED_CODE__EMBEDDEDCODE:
        return EMBEDDEDCODE_EDEFAULT == null ? embeddedcode != null : !EMBEDDEDCODE_EDEFAULT.equals(embeddedcode);
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
    result.append(", embeddedcode: ");
    result.append(embeddedcode);
    result.append(')');
    return result.toString();
  }

} //EmbedCodeImpl
