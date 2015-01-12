/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getLineto <em>Lineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getHorizontallineto <em>Horizontallineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getVerticallineto <em>Verticallineto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getCurveto <em>Curveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothcurveto <em>Smoothcurveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getQuadraticbeziercurve <em>Quadraticbeziercurve</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothquadraticbeziercurveto <em>Smoothquadraticbeziercurveto</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getEllipticalarc <em>Ellipticalarc</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.PathData#getClosepath <em>Closepath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData()
 * @model
 * @generated
 */
public interface PathData extends EObject
{
  /**
   * Returns the value of the '<em><b>Moveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moveto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moveto</em>' containment reference.
   * @see #setMoveto(MoveTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Moveto()
   * @model containment="true"
   * @generated
   */
  MoveTo getMoveto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getMoveto <em>Moveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moveto</em>' containment reference.
   * @see #getMoveto()
   * @generated
   */
  void setMoveto(MoveTo value);

  /**
   * Returns the value of the '<em><b>Lineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lineto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lineto</em>' containment reference.
   * @see #setLineto(LineTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Lineto()
   * @model containment="true"
   * @generated
   */
  LineTo getLineto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getLineto <em>Lineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lineto</em>' containment reference.
   * @see #getLineto()
   * @generated
   */
  void setLineto(LineTo value);

  /**
   * Returns the value of the '<em><b>Horizontallineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontallineto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horizontallineto</em>' containment reference.
   * @see #setHorizontallineto(HorizontalLineTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Horizontallineto()
   * @model containment="true"
   * @generated
   */
  HorizontalLineTo getHorizontallineto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getHorizontallineto <em>Horizontallineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontallineto</em>' containment reference.
   * @see #getHorizontallineto()
   * @generated
   */
  void setHorizontallineto(HorizontalLineTo value);

  /**
   * Returns the value of the '<em><b>Verticallineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verticallineto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verticallineto</em>' containment reference.
   * @see #setVerticallineto(VerticalLineTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Verticallineto()
   * @model containment="true"
   * @generated
   */
  VerticalLineTo getVerticallineto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getVerticallineto <em>Verticallineto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verticallineto</em>' containment reference.
   * @see #getVerticallineto()
   * @generated
   */
  void setVerticallineto(VerticalLineTo value);

  /**
   * Returns the value of the '<em><b>Curveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Curveto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Curveto</em>' containment reference.
   * @see #setCurveto(CurveTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Curveto()
   * @model containment="true"
   * @generated
   */
  CurveTo getCurveto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getCurveto <em>Curveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Curveto</em>' containment reference.
   * @see #getCurveto()
   * @generated
   */
  void setCurveto(CurveTo value);

  /**
   * Returns the value of the '<em><b>Smoothcurveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smoothcurveto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smoothcurveto</em>' containment reference.
   * @see #setSmoothcurveto(SmoothCurveTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Smoothcurveto()
   * @model containment="true"
   * @generated
   */
  SmoothCurveTo getSmoothcurveto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothcurveto <em>Smoothcurveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Smoothcurveto</em>' containment reference.
   * @see #getSmoothcurveto()
   * @generated
   */
  void setSmoothcurveto(SmoothCurveTo value);

  /**
   * Returns the value of the '<em><b>Quadraticbeziercurve</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quadraticbeziercurve</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quadraticbeziercurve</em>' containment reference.
   * @see #setQuadraticbeziercurve(QuadraticBezierCurve)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Quadraticbeziercurve()
   * @model containment="true"
   * @generated
   */
  QuadraticBezierCurve getQuadraticbeziercurve();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getQuadraticbeziercurve <em>Quadraticbeziercurve</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quadraticbeziercurve</em>' containment reference.
   * @see #getQuadraticbeziercurve()
   * @generated
   */
  void setQuadraticbeziercurve(QuadraticBezierCurve value);

  /**
   * Returns the value of the '<em><b>Smoothquadraticbeziercurveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smoothquadraticbeziercurveto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smoothquadraticbeziercurveto</em>' containment reference.
   * @see #setSmoothquadraticbeziercurveto(SmoothQuadraticBezierCurveTo)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Smoothquadraticbeziercurveto()
   * @model containment="true"
   * @generated
   */
  SmoothQuadraticBezierCurveTo getSmoothquadraticbeziercurveto();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothquadraticbeziercurveto <em>Smoothquadraticbeziercurveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Smoothquadraticbeziercurveto</em>' containment reference.
   * @see #getSmoothquadraticbeziercurveto()
   * @generated
   */
  void setSmoothquadraticbeziercurveto(SmoothQuadraticBezierCurveTo value);

  /**
   * Returns the value of the '<em><b>Ellipticalarc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ellipticalarc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ellipticalarc</em>' containment reference.
   * @see #setEllipticalarc(EllipticalArc)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Ellipticalarc()
   * @model containment="true"
   * @generated
   */
  EllipticalArc getEllipticalarc();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getEllipticalarc <em>Ellipticalarc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ellipticalarc</em>' containment reference.
   * @see #getEllipticalarc()
   * @generated
   */
  void setEllipticalarc(EllipticalArc value);

  /**
   * Returns the value of the '<em><b>Closepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Closepath</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Closepath</em>' attribute.
   * @see #setClosepath(String)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getPathData_Closepath()
   * @model
   * @generated
   */
  String getClosepath();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.PathData#getClosepath <em>Closepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Closepath</em>' attribute.
   * @see #getClosepath()
   * @generated
   */
  void setClosepath(String value);

} // PathData
