/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.CurveTo;
import org.xtext.nv.dsl.mMDSL.EllipticalArc;
import org.xtext.nv.dsl.mMDSL.HorizontalLineTo;
import org.xtext.nv.dsl.mMDSL.LineTo;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.MoveTo;
import org.xtext.nv.dsl.mMDSL.PathData;
import org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve;
import org.xtext.nv.dsl.mMDSL.SmoothCurveTo;
import org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo;
import org.xtext.nv.dsl.mMDSL.VerticalLineTo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getLineto <em>Lineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getHorizontallineto <em>Horizontallineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getVerticallineto <em>Verticallineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getCurveto <em>Curveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getSmoothcurveto <em>Smoothcurveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getQuadraticbeziercurve <em>Quadraticbeziercurve</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getSmoothquadraticbeziercurveto <em>Smoothquadraticbeziercurveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getEllipticalarc <em>Ellipticalarc</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl#getClosepath <em>Closepath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathDataImpl extends MinimalEObjectImpl.Container implements PathData
{
  /**
   * The cached value of the '{@link #getMoveto() <em>Moveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoveto()
   * @generated
   * @ordered
   */
  protected MoveTo moveto;

  /**
   * The cached value of the '{@link #getLineto() <em>Lineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineto()
   * @generated
   * @ordered
   */
  protected LineTo lineto;

  /**
   * The cached value of the '{@link #getHorizontallineto() <em>Horizontallineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontallineto()
   * @generated
   * @ordered
   */
  protected HorizontalLineTo horizontallineto;

  /**
   * The cached value of the '{@link #getVerticallineto() <em>Verticallineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerticallineto()
   * @generated
   * @ordered
   */
  protected VerticalLineTo verticallineto;

  /**
   * The cached value of the '{@link #getCurveto() <em>Curveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveto()
   * @generated
   * @ordered
   */
  protected CurveTo curveto;

  /**
   * The cached value of the '{@link #getSmoothcurveto() <em>Smoothcurveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmoothcurveto()
   * @generated
   * @ordered
   */
  protected SmoothCurveTo smoothcurveto;

  /**
   * The cached value of the '{@link #getQuadraticbeziercurve() <em>Quadraticbeziercurve</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuadraticbeziercurve()
   * @generated
   * @ordered
   */
  protected QuadraticBezierCurve quadraticbeziercurve;

  /**
   * The cached value of the '{@link #getSmoothquadraticbeziercurveto() <em>Smoothquadraticbeziercurveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmoothquadraticbeziercurveto()
   * @generated
   * @ordered
   */
  protected SmoothQuadraticBezierCurveTo smoothquadraticbeziercurveto;

  /**
   * The cached value of the '{@link #getEllipticalarc() <em>Ellipticalarc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEllipticalarc()
   * @generated
   * @ordered
   */
  protected EllipticalArc ellipticalarc;

  /**
   * The default value of the '{@link #getClosepath() <em>Closepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosepath()
   * @generated
   * @ordered
   */
  protected static final String CLOSEPATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClosepath() <em>Closepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosepath()
   * @generated
   * @ordered
   */
  protected String closepath = CLOSEPATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathDataImpl()
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
    return MMDSLPackage.eINSTANCE.getPathData();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveTo getMoveto()
  {
    return moveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoveto(MoveTo newMoveto, NotificationChain msgs)
  {
    MoveTo oldMoveto = moveto;
    moveto = newMoveto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__MOVETO, oldMoveto, newMoveto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoveto(MoveTo newMoveto)
  {
    if (newMoveto != moveto)
    {
      NotificationChain msgs = null;
      if (moveto != null)
        msgs = ((InternalEObject)moveto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__MOVETO, null, msgs);
      if (newMoveto != null)
        msgs = ((InternalEObject)newMoveto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__MOVETO, null, msgs);
      msgs = basicSetMoveto(newMoveto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__MOVETO, newMoveto, newMoveto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineTo getLineto()
  {
    return lineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLineto(LineTo newLineto, NotificationChain msgs)
  {
    LineTo oldLineto = lineto;
    lineto = newLineto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__LINETO, oldLineto, newLineto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineto(LineTo newLineto)
  {
    if (newLineto != lineto)
    {
      NotificationChain msgs = null;
      if (lineto != null)
        msgs = ((InternalEObject)lineto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__LINETO, null, msgs);
      if (newLineto != null)
        msgs = ((InternalEObject)newLineto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__LINETO, null, msgs);
      msgs = basicSetLineto(newLineto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__LINETO, newLineto, newLineto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalLineTo getHorizontallineto()
  {
    return horizontallineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorizontallineto(HorizontalLineTo newHorizontallineto, NotificationChain msgs)
  {
    HorizontalLineTo oldHorizontallineto = horizontallineto;
    horizontallineto = newHorizontallineto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__HORIZONTALLINETO, oldHorizontallineto, newHorizontallineto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontallineto(HorizontalLineTo newHorizontallineto)
  {
    if (newHorizontallineto != horizontallineto)
    {
      NotificationChain msgs = null;
      if (horizontallineto != null)
        msgs = ((InternalEObject)horizontallineto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__HORIZONTALLINETO, null, msgs);
      if (newHorizontallineto != null)
        msgs = ((InternalEObject)newHorizontallineto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__HORIZONTALLINETO, null, msgs);
      msgs = basicSetHorizontallineto(newHorizontallineto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__HORIZONTALLINETO, newHorizontallineto, newHorizontallineto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalLineTo getVerticallineto()
  {
    return verticallineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerticallineto(VerticalLineTo newVerticallineto, NotificationChain msgs)
  {
    VerticalLineTo oldVerticallineto = verticallineto;
    verticallineto = newVerticallineto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__VERTICALLINETO, oldVerticallineto, newVerticallineto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerticallineto(VerticalLineTo newVerticallineto)
  {
    if (newVerticallineto != verticallineto)
    {
      NotificationChain msgs = null;
      if (verticallineto != null)
        msgs = ((InternalEObject)verticallineto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__VERTICALLINETO, null, msgs);
      if (newVerticallineto != null)
        msgs = ((InternalEObject)newVerticallineto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__VERTICALLINETO, null, msgs);
      msgs = basicSetVerticallineto(newVerticallineto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__VERTICALLINETO, newVerticallineto, newVerticallineto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurveTo getCurveto()
  {
    return curveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurveto(CurveTo newCurveto, NotificationChain msgs)
  {
    CurveTo oldCurveto = curveto;
    curveto = newCurveto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__CURVETO, oldCurveto, newCurveto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurveto(CurveTo newCurveto)
  {
    if (newCurveto != curveto)
    {
      NotificationChain msgs = null;
      if (curveto != null)
        msgs = ((InternalEObject)curveto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__CURVETO, null, msgs);
      if (newCurveto != null)
        msgs = ((InternalEObject)newCurveto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__CURVETO, null, msgs);
      msgs = basicSetCurveto(newCurveto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__CURVETO, newCurveto, newCurveto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmoothCurveTo getSmoothcurveto()
  {
    return smoothcurveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmoothcurveto(SmoothCurveTo newSmoothcurveto, NotificationChain msgs)
  {
    SmoothCurveTo oldSmoothcurveto = smoothcurveto;
    smoothcurveto = newSmoothcurveto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__SMOOTHCURVETO, oldSmoothcurveto, newSmoothcurveto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmoothcurveto(SmoothCurveTo newSmoothcurveto)
  {
    if (newSmoothcurveto != smoothcurveto)
    {
      NotificationChain msgs = null;
      if (smoothcurveto != null)
        msgs = ((InternalEObject)smoothcurveto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__SMOOTHCURVETO, null, msgs);
      if (newSmoothcurveto != null)
        msgs = ((InternalEObject)newSmoothcurveto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__SMOOTHCURVETO, null, msgs);
      msgs = basicSetSmoothcurveto(newSmoothcurveto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__SMOOTHCURVETO, newSmoothcurveto, newSmoothcurveto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuadraticBezierCurve getQuadraticbeziercurve()
  {
    return quadraticbeziercurve;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuadraticbeziercurve(QuadraticBezierCurve newQuadraticbeziercurve, NotificationChain msgs)
  {
    QuadraticBezierCurve oldQuadraticbeziercurve = quadraticbeziercurve;
    quadraticbeziercurve = newQuadraticbeziercurve;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE, oldQuadraticbeziercurve, newQuadraticbeziercurve);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuadraticbeziercurve(QuadraticBezierCurve newQuadraticbeziercurve)
  {
    if (newQuadraticbeziercurve != quadraticbeziercurve)
    {
      NotificationChain msgs = null;
      if (quadraticbeziercurve != null)
        msgs = ((InternalEObject)quadraticbeziercurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE, null, msgs);
      if (newQuadraticbeziercurve != null)
        msgs = ((InternalEObject)newQuadraticbeziercurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE, null, msgs);
      msgs = basicSetQuadraticbeziercurve(newQuadraticbeziercurve, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE, newQuadraticbeziercurve, newQuadraticbeziercurve));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmoothQuadraticBezierCurveTo getSmoothquadraticbeziercurveto()
  {
    return smoothquadraticbeziercurveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmoothquadraticbeziercurveto(SmoothQuadraticBezierCurveTo newSmoothquadraticbeziercurveto, NotificationChain msgs)
  {
    SmoothQuadraticBezierCurveTo oldSmoothquadraticbeziercurveto = smoothquadraticbeziercurveto;
    smoothquadraticbeziercurveto = newSmoothquadraticbeziercurveto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO, oldSmoothquadraticbeziercurveto, newSmoothquadraticbeziercurveto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmoothquadraticbeziercurveto(SmoothQuadraticBezierCurveTo newSmoothquadraticbeziercurveto)
  {
    if (newSmoothquadraticbeziercurveto != smoothquadraticbeziercurveto)
    {
      NotificationChain msgs = null;
      if (smoothquadraticbeziercurveto != null)
        msgs = ((InternalEObject)smoothquadraticbeziercurveto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO, null, msgs);
      if (newSmoothquadraticbeziercurveto != null)
        msgs = ((InternalEObject)newSmoothquadraticbeziercurveto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO, null, msgs);
      msgs = basicSetSmoothquadraticbeziercurveto(newSmoothquadraticbeziercurveto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO, newSmoothquadraticbeziercurveto, newSmoothquadraticbeziercurveto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EllipticalArc getEllipticalarc()
  {
    return ellipticalarc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEllipticalarc(EllipticalArc newEllipticalarc, NotificationChain msgs)
  {
    EllipticalArc oldEllipticalarc = ellipticalarc;
    ellipticalarc = newEllipticalarc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__ELLIPTICALARC, oldEllipticalarc, newEllipticalarc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEllipticalarc(EllipticalArc newEllipticalarc)
  {
    if (newEllipticalarc != ellipticalarc)
    {
      NotificationChain msgs = null;
      if (ellipticalarc != null)
        msgs = ((InternalEObject)ellipticalarc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__ELLIPTICALARC, null, msgs);
      if (newEllipticalarc != null)
        msgs = ((InternalEObject)newEllipticalarc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.PATH_DATA__ELLIPTICALARC, null, msgs);
      msgs = basicSetEllipticalarc(newEllipticalarc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__ELLIPTICALARC, newEllipticalarc, newEllipticalarc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClosepath()
  {
    return closepath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClosepath(String newClosepath)
  {
    String oldClosepath = closepath;
    closepath = newClosepath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.PATH_DATA__CLOSEPATH, oldClosepath, closepath));
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
      case MMDSLPackage.PATH_DATA__MOVETO:
        return basicSetMoveto(null, msgs);
      case MMDSLPackage.PATH_DATA__LINETO:
        return basicSetLineto(null, msgs);
      case MMDSLPackage.PATH_DATA__HORIZONTALLINETO:
        return basicSetHorizontallineto(null, msgs);
      case MMDSLPackage.PATH_DATA__VERTICALLINETO:
        return basicSetVerticallineto(null, msgs);
      case MMDSLPackage.PATH_DATA__CURVETO:
        return basicSetCurveto(null, msgs);
      case MMDSLPackage.PATH_DATA__SMOOTHCURVETO:
        return basicSetSmoothcurveto(null, msgs);
      case MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE:
        return basicSetQuadraticbeziercurve(null, msgs);
      case MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO:
        return basicSetSmoothquadraticbeziercurveto(null, msgs);
      case MMDSLPackage.PATH_DATA__ELLIPTICALARC:
        return basicSetEllipticalarc(null, msgs);
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
      case MMDSLPackage.PATH_DATA__MOVETO:
        return getMoveto();
      case MMDSLPackage.PATH_DATA__LINETO:
        return getLineto();
      case MMDSLPackage.PATH_DATA__HORIZONTALLINETO:
        return getHorizontallineto();
      case MMDSLPackage.PATH_DATA__VERTICALLINETO:
        return getVerticallineto();
      case MMDSLPackage.PATH_DATA__CURVETO:
        return getCurveto();
      case MMDSLPackage.PATH_DATA__SMOOTHCURVETO:
        return getSmoothcurveto();
      case MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE:
        return getQuadraticbeziercurve();
      case MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO:
        return getSmoothquadraticbeziercurveto();
      case MMDSLPackage.PATH_DATA__ELLIPTICALARC:
        return getEllipticalarc();
      case MMDSLPackage.PATH_DATA__CLOSEPATH:
        return getClosepath();
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
      case MMDSLPackage.PATH_DATA__MOVETO:
        setMoveto((MoveTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__LINETO:
        setLineto((LineTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__HORIZONTALLINETO:
        setHorizontallineto((HorizontalLineTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__VERTICALLINETO:
        setVerticallineto((VerticalLineTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__CURVETO:
        setCurveto((CurveTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__SMOOTHCURVETO:
        setSmoothcurveto((SmoothCurveTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE:
        setQuadraticbeziercurve((QuadraticBezierCurve)newValue);
        return;
      case MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO:
        setSmoothquadraticbeziercurveto((SmoothQuadraticBezierCurveTo)newValue);
        return;
      case MMDSLPackage.PATH_DATA__ELLIPTICALARC:
        setEllipticalarc((EllipticalArc)newValue);
        return;
      case MMDSLPackage.PATH_DATA__CLOSEPATH:
        setClosepath((String)newValue);
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
      case MMDSLPackage.PATH_DATA__MOVETO:
        setMoveto((MoveTo)null);
        return;
      case MMDSLPackage.PATH_DATA__LINETO:
        setLineto((LineTo)null);
        return;
      case MMDSLPackage.PATH_DATA__HORIZONTALLINETO:
        setHorizontallineto((HorizontalLineTo)null);
        return;
      case MMDSLPackage.PATH_DATA__VERTICALLINETO:
        setVerticallineto((VerticalLineTo)null);
        return;
      case MMDSLPackage.PATH_DATA__CURVETO:
        setCurveto((CurveTo)null);
        return;
      case MMDSLPackage.PATH_DATA__SMOOTHCURVETO:
        setSmoothcurveto((SmoothCurveTo)null);
        return;
      case MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE:
        setQuadraticbeziercurve((QuadraticBezierCurve)null);
        return;
      case MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO:
        setSmoothquadraticbeziercurveto((SmoothQuadraticBezierCurveTo)null);
        return;
      case MMDSLPackage.PATH_DATA__ELLIPTICALARC:
        setEllipticalarc((EllipticalArc)null);
        return;
      case MMDSLPackage.PATH_DATA__CLOSEPATH:
        setClosepath(CLOSEPATH_EDEFAULT);
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
      case MMDSLPackage.PATH_DATA__MOVETO:
        return moveto != null;
      case MMDSLPackage.PATH_DATA__LINETO:
        return lineto != null;
      case MMDSLPackage.PATH_DATA__HORIZONTALLINETO:
        return horizontallineto != null;
      case MMDSLPackage.PATH_DATA__VERTICALLINETO:
        return verticallineto != null;
      case MMDSLPackage.PATH_DATA__CURVETO:
        return curveto != null;
      case MMDSLPackage.PATH_DATA__SMOOTHCURVETO:
        return smoothcurveto != null;
      case MMDSLPackage.PATH_DATA__QUADRATICBEZIERCURVE:
        return quadraticbeziercurve != null;
      case MMDSLPackage.PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO:
        return smoothquadraticbeziercurveto != null;
      case MMDSLPackage.PATH_DATA__ELLIPTICALARC:
        return ellipticalarc != null;
      case MMDSLPackage.PATH_DATA__CLOSEPATH:
        return CLOSEPATH_EDEFAULT == null ? closepath != null : !CLOSEPATH_EDEFAULT.equals(closepath);
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
    result.append(" (closepath: ");
    result.append(closepath);
    result.append(')');
    return result.toString();
  }

} //PathDataImpl
