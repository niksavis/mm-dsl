/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.nv.dsl.mMDSL.Circle;
import org.xtext.nv.dsl.mMDSL.Ellipse;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.Line;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Path;
import org.xtext.nv.dsl.mMDSL.Polygon;
import org.xtext.nv.dsl.mMDSL.Polyline;
import org.xtext.nv.dsl.mMDSL.Rectangle;
import org.xtext.nv.dsl.mMDSL.SVGCommand;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;
import org.xtext.nv.dsl.mMDSL.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getInsertembedcode <em>Insertembedcode</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getSymbolstyle <em>Symbolstyle</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl#getSymbolstyleref <em>Symbolstyleref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGCommandImpl extends MinimalEObjectImpl.Container implements SVGCommand
{
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
   * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRectangle()
   * @generated
   * @ordered
   */
  protected Rectangle rectangle;

  /**
   * The cached value of the '{@link #getCircle() <em>Circle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCircle()
   * @generated
   * @ordered
   */
  protected Circle circle;

  /**
   * The cached value of the '{@link #getEllipse() <em>Ellipse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEllipse()
   * @generated
   * @ordered
   */
  protected Ellipse ellipse;

  /**
   * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected Line line;

  /**
   * The cached value of the '{@link #getPolyline() <em>Polyline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolyline()
   * @generated
   * @ordered
   */
  protected Polyline polyline;

  /**
   * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolygon()
   * @generated
   * @ordered
   */
  protected Polygon polygon;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected Path path;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected Text text;

  /**
   * The cached value of the '{@link #getSymbolstyle() <em>Symbolstyle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolstyle()
   * @generated
   * @ordered
   */
  protected SymbolStyle symbolstyle;

  /**
   * The cached value of the '{@link #getSymbolstyleref() <em>Symbolstyleref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolstyleref()
   * @generated
   * @ordered
   */
  protected SymbolStyle symbolstyleref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SVGCommandImpl()
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
    return MMDSLPackage.eINSTANCE.getSVGCommand();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE, oldInsertembedcode, newInsertembedcode);
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
        msgs = ((InternalEObject)insertembedcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE, null, msgs);
      if (newInsertembedcode != null)
        msgs = ((InternalEObject)newInsertembedcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE, null, msgs);
      msgs = basicSetInsertembedcode(newInsertembedcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE, newInsertembedcode, newInsertembedcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle getRectangle()
  {
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRectangle(Rectangle newRectangle, NotificationChain msgs)
  {
    Rectangle oldRectangle = rectangle;
    rectangle = newRectangle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__RECTANGLE, oldRectangle, newRectangle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRectangle(Rectangle newRectangle)
  {
    if (newRectangle != rectangle)
    {
      NotificationChain msgs = null;
      if (rectangle != null)
        msgs = ((InternalEObject)rectangle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__RECTANGLE, null, msgs);
      if (newRectangle != null)
        msgs = ((InternalEObject)newRectangle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__RECTANGLE, null, msgs);
      msgs = basicSetRectangle(newRectangle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__RECTANGLE, newRectangle, newRectangle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Circle getCircle()
  {
    return circle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCircle(Circle newCircle, NotificationChain msgs)
  {
    Circle oldCircle = circle;
    circle = newCircle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__CIRCLE, oldCircle, newCircle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCircle(Circle newCircle)
  {
    if (newCircle != circle)
    {
      NotificationChain msgs = null;
      if (circle != null)
        msgs = ((InternalEObject)circle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__CIRCLE, null, msgs);
      if (newCircle != null)
        msgs = ((InternalEObject)newCircle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__CIRCLE, null, msgs);
      msgs = basicSetCircle(newCircle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__CIRCLE, newCircle, newCircle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ellipse getEllipse()
  {
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEllipse(Ellipse newEllipse, NotificationChain msgs)
  {
    Ellipse oldEllipse = ellipse;
    ellipse = newEllipse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__ELLIPSE, oldEllipse, newEllipse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEllipse(Ellipse newEllipse)
  {
    if (newEllipse != ellipse)
    {
      NotificationChain msgs = null;
      if (ellipse != null)
        msgs = ((InternalEObject)ellipse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__ELLIPSE, null, msgs);
      if (newEllipse != null)
        msgs = ((InternalEObject)newEllipse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__ELLIPSE, null, msgs);
      msgs = basicSetEllipse(newEllipse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__ELLIPSE, newEllipse, newEllipse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line getLine()
  {
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLine(Line newLine, NotificationChain msgs)
  {
    Line oldLine = line;
    line = newLine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__LINE, oldLine, newLine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLine(Line newLine)
  {
    if (newLine != line)
    {
      NotificationChain msgs = null;
      if (line != null)
        msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__LINE, null, msgs);
      if (newLine != null)
        msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__LINE, null, msgs);
      msgs = basicSetLine(newLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__LINE, newLine, newLine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polyline getPolyline()
  {
    return polyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolyline(Polyline newPolyline, NotificationChain msgs)
  {
    Polyline oldPolyline = polyline;
    polyline = newPolyline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__POLYLINE, oldPolyline, newPolyline);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolyline(Polyline newPolyline)
  {
    if (newPolyline != polyline)
    {
      NotificationChain msgs = null;
      if (polyline != null)
        msgs = ((InternalEObject)polyline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__POLYLINE, null, msgs);
      if (newPolyline != null)
        msgs = ((InternalEObject)newPolyline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__POLYLINE, null, msgs);
      msgs = basicSetPolyline(newPolyline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__POLYLINE, newPolyline, newPolyline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polygon getPolygon()
  {
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolygon(Polygon newPolygon, NotificationChain msgs)
  {
    Polygon oldPolygon = polygon;
    polygon = newPolygon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__POLYGON, oldPolygon, newPolygon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolygon(Polygon newPolygon)
  {
    if (newPolygon != polygon)
    {
      NotificationChain msgs = null;
      if (polygon != null)
        msgs = ((InternalEObject)polygon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__POLYGON, null, msgs);
      if (newPolygon != null)
        msgs = ((InternalEObject)newPolygon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__POLYGON, null, msgs);
      msgs = basicSetPolygon(newPolygon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__POLYGON, newPolygon, newPolygon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(Path newPath, NotificationChain msgs)
  {
    Path oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(Path newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__PATH, newPath, newPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(Text newText, NotificationChain msgs)
  {
    Text oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(Text newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle getSymbolstyle()
  {
    return symbolstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbolstyle(SymbolStyle newSymbolstyle, NotificationChain msgs)
  {
    SymbolStyle oldSymbolstyle = symbolstyle;
    symbolstyle = newSymbolstyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE, oldSymbolstyle, newSymbolstyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolstyle(SymbolStyle newSymbolstyle)
  {
    if (newSymbolstyle != symbolstyle)
    {
      NotificationChain msgs = null;
      if (symbolstyle != null)
        msgs = ((InternalEObject)symbolstyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE, null, msgs);
      if (newSymbolstyle != null)
        msgs = ((InternalEObject)newSymbolstyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE, null, msgs);
      msgs = basicSetSymbolstyle(newSymbolstyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE, newSymbolstyle, newSymbolstyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle getSymbolstyleref()
  {
    if (symbolstyleref != null && symbolstyleref.eIsProxy())
    {
      InternalEObject oldSymbolstyleref = (InternalEObject)symbolstyleref;
      symbolstyleref = (SymbolStyle)eResolveProxy(oldSymbolstyleref);
      if (symbolstyleref != oldSymbolstyleref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF, oldSymbolstyleref, symbolstyleref));
      }
    }
    return symbolstyleref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle basicGetSymbolstyleref()
  {
    return symbolstyleref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolstyleref(SymbolStyle newSymbolstyleref)
  {
    SymbolStyle oldSymbolstyleref = symbolstyleref;
    symbolstyleref = newSymbolstyleref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF, oldSymbolstyleref, symbolstyleref));
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
      case MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE:
        return basicSetInsertembedcode(null, msgs);
      case MMDSLPackage.SVG_COMMAND__RECTANGLE:
        return basicSetRectangle(null, msgs);
      case MMDSLPackage.SVG_COMMAND__CIRCLE:
        return basicSetCircle(null, msgs);
      case MMDSLPackage.SVG_COMMAND__ELLIPSE:
        return basicSetEllipse(null, msgs);
      case MMDSLPackage.SVG_COMMAND__LINE:
        return basicSetLine(null, msgs);
      case MMDSLPackage.SVG_COMMAND__POLYLINE:
        return basicSetPolyline(null, msgs);
      case MMDSLPackage.SVG_COMMAND__POLYGON:
        return basicSetPolygon(null, msgs);
      case MMDSLPackage.SVG_COMMAND__PATH:
        return basicSetPath(null, msgs);
      case MMDSLPackage.SVG_COMMAND__TEXT:
        return basicSetText(null, msgs);
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE:
        return basicSetSymbolstyle(null, msgs);
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
      case MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE:
        return getInsertembedcode();
      case MMDSLPackage.SVG_COMMAND__RECTANGLE:
        return getRectangle();
      case MMDSLPackage.SVG_COMMAND__CIRCLE:
        return getCircle();
      case MMDSLPackage.SVG_COMMAND__ELLIPSE:
        return getEllipse();
      case MMDSLPackage.SVG_COMMAND__LINE:
        return getLine();
      case MMDSLPackage.SVG_COMMAND__POLYLINE:
        return getPolyline();
      case MMDSLPackage.SVG_COMMAND__POLYGON:
        return getPolygon();
      case MMDSLPackage.SVG_COMMAND__PATH:
        return getPath();
      case MMDSLPackage.SVG_COMMAND__TEXT:
        return getText();
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE:
        return getSymbolstyle();
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF:
        if (resolve) return getSymbolstyleref();
        return basicGetSymbolstyleref();
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
      case MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE:
        setInsertembedcode((InsertEmbedCode)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__RECTANGLE:
        setRectangle((Rectangle)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__CIRCLE:
        setCircle((Circle)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__ELLIPSE:
        setEllipse((Ellipse)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__LINE:
        setLine((Line)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__POLYLINE:
        setPolyline((Polyline)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__POLYGON:
        setPolygon((Polygon)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__PATH:
        setPath((Path)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__TEXT:
        setText((Text)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE:
        setSymbolstyle((SymbolStyle)newValue);
        return;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF:
        setSymbolstyleref((SymbolStyle)newValue);
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
      case MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE:
        setInsertembedcode((InsertEmbedCode)null);
        return;
      case MMDSLPackage.SVG_COMMAND__RECTANGLE:
        setRectangle((Rectangle)null);
        return;
      case MMDSLPackage.SVG_COMMAND__CIRCLE:
        setCircle((Circle)null);
        return;
      case MMDSLPackage.SVG_COMMAND__ELLIPSE:
        setEllipse((Ellipse)null);
        return;
      case MMDSLPackage.SVG_COMMAND__LINE:
        setLine((Line)null);
        return;
      case MMDSLPackage.SVG_COMMAND__POLYLINE:
        setPolyline((Polyline)null);
        return;
      case MMDSLPackage.SVG_COMMAND__POLYGON:
        setPolygon((Polygon)null);
        return;
      case MMDSLPackage.SVG_COMMAND__PATH:
        setPath((Path)null);
        return;
      case MMDSLPackage.SVG_COMMAND__TEXT:
        setText((Text)null);
        return;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE:
        setSymbolstyle((SymbolStyle)null);
        return;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF:
        setSymbolstyleref((SymbolStyle)null);
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
      case MMDSLPackage.SVG_COMMAND__INSERTEMBEDCODE:
        return insertembedcode != null;
      case MMDSLPackage.SVG_COMMAND__RECTANGLE:
        return rectangle != null;
      case MMDSLPackage.SVG_COMMAND__CIRCLE:
        return circle != null;
      case MMDSLPackage.SVG_COMMAND__ELLIPSE:
        return ellipse != null;
      case MMDSLPackage.SVG_COMMAND__LINE:
        return line != null;
      case MMDSLPackage.SVG_COMMAND__POLYLINE:
        return polyline != null;
      case MMDSLPackage.SVG_COMMAND__POLYGON:
        return polygon != null;
      case MMDSLPackage.SVG_COMMAND__PATH:
        return path != null;
      case MMDSLPackage.SVG_COMMAND__TEXT:
        return text != null;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLE:
        return symbolstyle != null;
      case MMDSLPackage.SVG_COMMAND__SYMBOLSTYLEREF:
        return symbolstyleref != null;
    }
    return super.eIsSet(featureID);
  }

} //SVGCommandImpl
