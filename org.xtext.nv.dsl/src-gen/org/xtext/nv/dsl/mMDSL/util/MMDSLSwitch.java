/**
 */
package org.xtext.nv.dsl.mMDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.nv.dsl.mMDSL.AdditionExpression;
import org.xtext.nv.dsl.mMDSL.Algorithm;
import org.xtext.nv.dsl.mMDSL.AlgorithmOperation;
import org.xtext.nv.dsl.mMDSL.AndExpression;
import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.AttributeGet;
import org.xtext.nv.dsl.mMDSL.AttributeOperation;
import org.xtext.nv.dsl.mMDSL.AttributeSet;
import org.xtext.nv.dsl.mMDSL.BreakContinue;
import org.xtext.nv.dsl.mMDSL.Circle;
import org.xtext.nv.dsl.mMDSL.ClassAttribute;
import org.xtext.nv.dsl.mMDSL.ClassInstance;
import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGet;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.ClassInstanceSet;
import org.xtext.nv.dsl.mMDSL.CompareExpression;
import org.xtext.nv.dsl.mMDSL.ContextItem;
import org.xtext.nv.dsl.mMDSL.CurveTo;
import org.xtext.nv.dsl.mMDSL.DirCreate;
import org.xtext.nv.dsl.mMDSL.DirDelete;
import org.xtext.nv.dsl.mMDSL.DirGetWorking;
import org.xtext.nv.dsl.mMDSL.DirList;
import org.xtext.nv.dsl.mMDSL.DirOperation;
import org.xtext.nv.dsl.mMDSL.DirSetWorking;
import org.xtext.nv.dsl.mMDSL.EditBox;
import org.xtext.nv.dsl.mMDSL.Ellipse;
import org.xtext.nv.dsl.mMDSL.EllipticalArc;
import org.xtext.nv.dsl.mMDSL.EmbedCode;
import org.xtext.nv.dsl.mMDSL.EmbedCodeType;
import org.xtext.nv.dsl.mMDSL.EmbedPlatformType;
import org.xtext.nv.dsl.mMDSL.EnumType;
import org.xtext.nv.dsl.mMDSL.Enumeration;
import org.xtext.nv.dsl.mMDSL.EqualExpression;
import org.xtext.nv.dsl.mMDSL.ErrorBox;
import org.xtext.nv.dsl.mMDSL.Event;
import org.xtext.nv.dsl.mMDSL.Expr;
import org.xtext.nv.dsl.mMDSL.Expression;
import org.xtext.nv.dsl.mMDSL.FileCopy;
import org.xtext.nv.dsl.mMDSL.FileCreate;
import org.xtext.nv.dsl.mMDSL.FileDelete;
import org.xtext.nv.dsl.mMDSL.FileOperation;
import org.xtext.nv.dsl.mMDSL.FileRead;
import org.xtext.nv.dsl.mMDSL.FileWrite;
import org.xtext.nv.dsl.mMDSL.FillColor;
import org.xtext.nv.dsl.mMDSL.FontFamily;
import org.xtext.nv.dsl.mMDSL.ForLoop;
import org.xtext.nv.dsl.mMDSL.HorizontalLineTo;
import org.xtext.nv.dsl.mMDSL.IncludeLibrary;
import org.xtext.nv.dsl.mMDSL.IncludeLibraryType;
import org.xtext.nv.dsl.mMDSL.InfoBox;
import org.xtext.nv.dsl.mMDSL.InsertContextItem;
import org.xtext.nv.dsl.mMDSL.InsertEmbedCode;
import org.xtext.nv.dsl.mMDSL.InsertMenuItem;
import org.xtext.nv.dsl.mMDSL.InstanceOperation;
import org.xtext.nv.dsl.mMDSL.ItemOperation;
import org.xtext.nv.dsl.mMDSL.Line;
import org.xtext.nv.dsl.mMDSL.LineTo;
import org.xtext.nv.dsl.mMDSL.LoopStatement;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.MenuItem;
import org.xtext.nv.dsl.mMDSL.Metamodel;
import org.xtext.nv.dsl.mMDSL.Method;
import org.xtext.nv.dsl.mMDSL.MethodName;
import org.xtext.nv.dsl.mMDSL.Mode;
import org.xtext.nv.dsl.mMDSL.ModelCreate;
import org.xtext.nv.dsl.mMDSL.ModelDelete;
import org.xtext.nv.dsl.mMDSL.ModelDiscard;
import org.xtext.nv.dsl.mMDSL.ModelIsLoaded;
import org.xtext.nv.dsl.mMDSL.ModelLoad;
import org.xtext.nv.dsl.mMDSL.ModelOperation;
import org.xtext.nv.dsl.mMDSL.ModelSave;
import org.xtext.nv.dsl.mMDSL.ModelType;
import org.xtext.nv.dsl.mMDSL.MoveTo;
import org.xtext.nv.dsl.mMDSL.MultiplicationExpression;
import org.xtext.nv.dsl.mMDSL.OperatorAdd;
import org.xtext.nv.dsl.mMDSL.OperatorAnd;
import org.xtext.nv.dsl.mMDSL.OperatorAssign;
import org.xtext.nv.dsl.mMDSL.OperatorCompare;
import org.xtext.nv.dsl.mMDSL.OperatorEqual;
import org.xtext.nv.dsl.mMDSL.OperatorMultiply;
import org.xtext.nv.dsl.mMDSL.OperatorMultyAssign;
import org.xtext.nv.dsl.mMDSL.OperatorOr;
import org.xtext.nv.dsl.mMDSL.OperatorUnary;
import org.xtext.nv.dsl.mMDSL.OrExpression;
import org.xtext.nv.dsl.mMDSL.Path;
import org.xtext.nv.dsl.mMDSL.PathData;
import org.xtext.nv.dsl.mMDSL.PathParametersA;
import org.xtext.nv.dsl.mMDSL.PathParametersC;
import org.xtext.nv.dsl.mMDSL.PathParametersHV;
import org.xtext.nv.dsl.mMDSL.PathParametersMLT;
import org.xtext.nv.dsl.mMDSL.PathParametersQ;
import org.xtext.nv.dsl.mMDSL.PathParametersS;
import org.xtext.nv.dsl.mMDSL.Points;
import org.xtext.nv.dsl.mMDSL.Polygon;
import org.xtext.nv.dsl.mMDSL.Polyline;
import org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve;
import org.xtext.nv.dsl.mMDSL.Rectangle;
import org.xtext.nv.dsl.mMDSL.RefName;
import org.xtext.nv.dsl.mMDSL.Reference;
import org.xtext.nv.dsl.mMDSL.Relation;
import org.xtext.nv.dsl.mMDSL.RelationInstance;
import org.xtext.nv.dsl.mMDSL.RelationInstanceCreate;
import org.xtext.nv.dsl.mMDSL.RelationInstanceDelete;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGet;
import org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.RelationInstanceSet;
import org.xtext.nv.dsl.mMDSL.RemoveContextItem;
import org.xtext.nv.dsl.mMDSL.RemoveMenuItem;
import org.xtext.nv.dsl.mMDSL.Root;
import org.xtext.nv.dsl.mMDSL.SVGCommand;
import org.xtext.nv.dsl.mMDSL.SelectionStatement;
import org.xtext.nv.dsl.mMDSL.SimpleUI;
import org.xtext.nv.dsl.mMDSL.SmoothCurveTo;
import org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo;
import org.xtext.nv.dsl.mMDSL.Statement;
import org.xtext.nv.dsl.mMDSL.StrokeColor;
import org.xtext.nv.dsl.mMDSL.SymbolClass;
import org.xtext.nv.dsl.mMDSL.SymbolRelation;
import org.xtext.nv.dsl.mMDSL.SymbolStyle;
import org.xtext.nv.dsl.mMDSL.Text;
import org.xtext.nv.dsl.mMDSL.Type;
import org.xtext.nv.dsl.mMDSL.VarStatement;
import org.xtext.nv.dsl.mMDSL.Variable;
import org.xtext.nv.dsl.mMDSL.VerticalLineTo;
import org.xtext.nv.dsl.mMDSL.ViewBox;
import org.xtext.nv.dsl.mMDSL.WarningBox;
import org.xtext.nv.dsl.mMDSL.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage
 * @generated
 */
public class MMDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MMDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MMDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MMDSLPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.METHOD_NAME:
      {
        MethodName methodName = (MethodName)theEObject;
        T result = caseMethodName(methodName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INCLUDE_LIBRARY:
      {
        IncludeLibrary includeLibrary = (IncludeLibrary)theEObject;
        T result = caseIncludeLibrary(includeLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INCLUDE_LIBRARY_TYPE:
      {
        IncludeLibraryType includeLibraryType = (IncludeLibraryType)theEObject;
        T result = caseIncludeLibraryType(includeLibraryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EMBED_CODE:
      {
        EmbedCode embedCode = (EmbedCode)theEObject;
        T result = caseEmbedCode(embedCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EMBED_PLATFORM_TYPE:
      {
        EmbedPlatformType embedPlatformType = (EmbedPlatformType)theEObject;
        T result = caseEmbedPlatformType(embedPlatformType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EMBED_CODE_TYPE:
      {
        EmbedCodeType embedCodeType = (EmbedCodeType)theEObject;
        T result = caseEmbedCodeType(embedCodeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INSERT_EMBED_CODE:
      {
        InsertEmbedCode insertEmbedCode = (InsertEmbedCode)theEObject;
        T result = caseInsertEmbedCode(insertEmbedCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.METAMODEL:
      {
        Metamodel metamodel = (Metamodel)theEObject;
        T result = caseMetamodel(metamodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS:
      {
        org.xtext.nv.dsl.mMDSL.Class class_ = (org.xtext.nv.dsl.mMDSL.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_ATTRIBUTE:
      {
        ClassAttribute classAttribute = (ClassAttribute)theEObject;
        T result = caseClassAttribute(classAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.REF_NAME:
      {
        RefName refName = (RefName)theEObject;
        T result = caseRefName(refName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ENUM_TYPE:
      {
        EnumType enumType = (EnumType)theEObject;
        T result = caseEnumType(enumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_TYPE:
      {
        ModelType modelType = (ModelType)theEObject;
        T result = caseModelType(modelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODE:
      {
        Mode mode = (Mode)theEObject;
        T result = caseMode(mode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SYMBOL_CLASS:
      {
        SymbolClass symbolClass = (SymbolClass)theEObject;
        T result = caseSymbolClass(symbolClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SYMBOL_RELATION:
      {
        SymbolRelation symbolRelation = (SymbolRelation)theEObject;
        T result = caseSymbolRelation(symbolRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SVG_COMMAND:
      {
        SVGCommand svgCommand = (SVGCommand)theEObject;
        T result = caseSVGCommand(svgCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RECTANGLE:
      {
        Rectangle rectangle = (Rectangle)theEObject;
        T result = caseRectangle(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CIRCLE:
      {
        Circle circle = (Circle)theEObject;
        T result = caseCircle(circle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ELLIPSE:
      {
        Ellipse ellipse = (Ellipse)theEObject;
        T result = caseEllipse(ellipse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.POLYLINE:
      {
        Polyline polyline = (Polyline)theEObject;
        T result = casePolyline(polyline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.POLYGON:
      {
        Polygon polygon = (Polygon)theEObject;
        T result = casePolygon(polygon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_DATA:
      {
        PathData pathData = (PathData)theEObject;
        T result = casePathData(pathData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MOVE_TO:
      {
        MoveTo moveTo = (MoveTo)theEObject;
        T result = caseMoveTo(moveTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.LINE_TO:
      {
        LineTo lineTo = (LineTo)theEObject;
        T result = caseLineTo(lineTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.HORIZONTAL_LINE_TO:
      {
        HorizontalLineTo horizontalLineTo = (HorizontalLineTo)theEObject;
        T result = caseHorizontalLineTo(horizontalLineTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.VERTICAL_LINE_TO:
      {
        VerticalLineTo verticalLineTo = (VerticalLineTo)theEObject;
        T result = caseVerticalLineTo(verticalLineTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CURVE_TO:
      {
        CurveTo curveTo = (CurveTo)theEObject;
        T result = caseCurveTo(curveTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SMOOTH_CURVE_TO:
      {
        SmoothCurveTo smoothCurveTo = (SmoothCurveTo)theEObject;
        T result = caseSmoothCurveTo(smoothCurveTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.QUADRATIC_BEZIER_CURVE:
      {
        QuadraticBezierCurve quadraticBezierCurve = (QuadraticBezierCurve)theEObject;
        T result = caseQuadraticBezierCurve(quadraticBezierCurve);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SMOOTH_QUADRATIC_BEZIER_CURVE_TO:
      {
        SmoothQuadraticBezierCurveTo smoothQuadraticBezierCurveTo = (SmoothQuadraticBezierCurveTo)theEObject;
        T result = caseSmoothQuadraticBezierCurveTo(smoothQuadraticBezierCurveTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ELLIPTICAL_ARC:
      {
        EllipticalArc ellipticalArc = (EllipticalArc)theEObject;
        T result = caseEllipticalArc(ellipticalArc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.POINTS:
      {
        Points points = (Points)theEObject;
        T result = casePoints(points);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_HV:
      {
        PathParametersHV pathParametersHV = (PathParametersHV)theEObject;
        T result = casePathParametersHV(pathParametersHV);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_MLT:
      {
        PathParametersMLT pathParametersMLT = (PathParametersMLT)theEObject;
        T result = casePathParametersMLT(pathParametersMLT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_S:
      {
        PathParametersS pathParametersS = (PathParametersS)theEObject;
        T result = casePathParametersS(pathParametersS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_Q:
      {
        PathParametersQ pathParametersQ = (PathParametersQ)theEObject;
        T result = casePathParametersQ(pathParametersQ);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_C:
      {
        PathParametersC pathParametersC = (PathParametersC)theEObject;
        T result = casePathParametersC(pathParametersC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.PATH_PARAMETERS_A:
      {
        PathParametersA pathParametersA = (PathParametersA)theEObject;
        T result = casePathParametersA(pathParametersA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SYMBOL_STYLE:
      {
        SymbolStyle symbolStyle = (SymbolStyle)theEObject;
        T result = caseSymbolStyle(symbolStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILL_COLOR:
      {
        FillColor fillColor = (FillColor)theEObject;
        T result = caseFillColor(fillColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.STROKE_COLOR:
      {
        StrokeColor strokeColor = (StrokeColor)theEObject;
        T result = caseStrokeColor(strokeColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FONT_FAMILY:
      {
        FontFamily fontFamily = (FontFamily)theEObject;
        T result = caseFontFamily(fontFamily);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ALGORITHM:
      {
        Algorithm algorithm = (Algorithm)theEObject;
        T result = caseAlgorithm(algorithm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SELECTION_STATEMENT:
      {
        SelectionStatement selectionStatement = (SelectionStatement)theEObject;
        T result = caseSelectionStatement(selectionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.LOOP_STATEMENT:
      {
        LoopStatement loopStatement = (LoopStatement)theEObject;
        T result = caseLoopStatement(loopStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.WHILE_LOOP:
      {
        WhileLoop whileLoop = (WhileLoop)theEObject;
        T result = caseWhileLoop(whileLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FOR_LOOP:
      {
        ForLoop forLoop = (ForLoop)theEObject;
        T result = caseForLoop(forLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.BREAK_CONTINUE:
      {
        BreakContinue breakContinue = (BreakContinue)theEObject;
        T result = caseBreakContinue(breakContinue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.VAR_STATEMENT:
      {
        VarStatement varStatement = (VarStatement)theEObject;
        T result = caseVarStatement(varStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_ASSIGN:
      {
        OperatorAssign operatorAssign = (OperatorAssign)theEObject;
        T result = caseOperatorAssign(operatorAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN:
      {
        OperatorMultyAssign operatorMultyAssign = (OperatorMultyAssign)theEObject;
        T result = caseOperatorMultyAssign(operatorMultyAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_UNARY:
      {
        OperatorUnary operatorUnary = (OperatorUnary)theEObject;
        T result = caseOperatorUnary(operatorUnary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_MULTIPLY:
      {
        OperatorMultiply operatorMultiply = (OperatorMultiply)theEObject;
        T result = caseOperatorMultiply(operatorMultiply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_ADD:
      {
        OperatorAdd operatorAdd = (OperatorAdd)theEObject;
        T result = caseOperatorAdd(operatorAdd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_COMPARE:
      {
        OperatorCompare operatorCompare = (OperatorCompare)theEObject;
        T result = caseOperatorCompare(operatorCompare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_EQUAL:
      {
        OperatorEqual operatorEqual = (OperatorEqual)theEObject;
        T result = caseOperatorEqual(operatorEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_AND:
      {
        OperatorAnd operatorAnd = (OperatorAnd)theEObject;
        T result = caseOperatorAnd(operatorAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OPERATOR_OR:
      {
        OperatorOr operatorOr = (OperatorOr)theEObject;
        T result = caseOperatorOr(operatorOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ALGORITHM_OPERATION:
      {
        AlgorithmOperation algorithmOperation = (AlgorithmOperation)theEObject;
        T result = caseAlgorithmOperation(algorithmOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_OPERATION:
      {
        FileOperation fileOperation = (FileOperation)theEObject;
        T result = caseFileOperation(fileOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_COPY:
      {
        FileCopy fileCopy = (FileCopy)theEObject;
        T result = caseFileCopy(fileCopy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_DELETE:
      {
        FileDelete fileDelete = (FileDelete)theEObject;
        T result = caseFileDelete(fileDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_CREATE:
      {
        FileCreate fileCreate = (FileCreate)theEObject;
        T result = caseFileCreate(fileCreate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_READ:
      {
        FileRead fileRead = (FileRead)theEObject;
        T result = caseFileRead(fileRead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.FILE_WRITE:
      {
        FileWrite fileWrite = (FileWrite)theEObject;
        T result = caseFileWrite(fileWrite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_OPERATION:
      {
        DirOperation dirOperation = (DirOperation)theEObject;
        T result = caseDirOperation(dirOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_SET_WORKING:
      {
        DirSetWorking dirSetWorking = (DirSetWorking)theEObject;
        T result = caseDirSetWorking(dirSetWorking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_GET_WORKING:
      {
        DirGetWorking dirGetWorking = (DirGetWorking)theEObject;
        T result = caseDirGetWorking(dirGetWorking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_CREATE:
      {
        DirCreate dirCreate = (DirCreate)theEObject;
        T result = caseDirCreate(dirCreate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_DELETE:
      {
        DirDelete dirDelete = (DirDelete)theEObject;
        T result = caseDirDelete(dirDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.DIR_LIST:
      {
        DirList dirList = (DirList)theEObject;
        T result = caseDirList(dirList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.SIMPLE_UI:
      {
        SimpleUI simpleUI = (SimpleUI)theEObject;
        T result = caseSimpleUI(simpleUI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EDIT_BOX:
      {
        EditBox editBox = (EditBox)theEObject;
        T result = caseEditBox(editBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INFO_BOX:
      {
        InfoBox infoBox = (InfoBox)theEObject;
        T result = caseInfoBox(infoBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ERROR_BOX:
      {
        ErrorBox errorBox = (ErrorBox)theEObject;
        T result = caseErrorBox(errorBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.WARNING_BOX:
      {
        WarningBox warningBox = (WarningBox)theEObject;
        T result = caseWarningBox(warningBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.VIEW_BOX:
      {
        ViewBox viewBox = (ViewBox)theEObject;
        T result = caseViewBox(viewBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ITEM_OPERATION:
      {
        ItemOperation itemOperation = (ItemOperation)theEObject;
        T result = caseItemOperation(itemOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MENU_ITEM:
      {
        MenuItem menuItem = (MenuItem)theEObject;
        T result = caseMenuItem(menuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INSERT_MENU_ITEM:
      {
        InsertMenuItem insertMenuItem = (InsertMenuItem)theEObject;
        T result = caseInsertMenuItem(insertMenuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.REMOVE_MENU_ITEM:
      {
        RemoveMenuItem removeMenuItem = (RemoveMenuItem)theEObject;
        T result = caseRemoveMenuItem(removeMenuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CONTEXT_ITEM:
      {
        ContextItem contextItem = (ContextItem)theEObject;
        T result = caseContextItem(contextItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INSERT_CONTEXT_ITEM:
      {
        InsertContextItem insertContextItem = (InsertContextItem)theEObject;
        T result = caseInsertContextItem(insertContextItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.REMOVE_CONTEXT_ITEM:
      {
        RemoveContextItem removeContextItem = (RemoveContextItem)theEObject;
        T result = caseRemoveContextItem(removeContextItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_OPERATION:
      {
        ModelOperation modelOperation = (ModelOperation)theEObject;
        T result = caseModelOperation(modelOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_CREATE:
      {
        ModelCreate modelCreate = (ModelCreate)theEObject;
        T result = caseModelCreate(modelCreate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_DELETE:
      {
        ModelDelete modelDelete = (ModelDelete)theEObject;
        T result = caseModelDelete(modelDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_DISCARD:
      {
        ModelDiscard modelDiscard = (ModelDiscard)theEObject;
        T result = caseModelDiscard(modelDiscard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_SAVE:
      {
        ModelSave modelSave = (ModelSave)theEObject;
        T result = caseModelSave(modelSave);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_LOAD:
      {
        ModelLoad modelLoad = (ModelLoad)theEObject;
        T result = caseModelLoad(modelLoad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MODEL_IS_LOADED:
      {
        ModelIsLoaded modelIsLoaded = (ModelIsLoaded)theEObject;
        T result = caseModelIsLoaded(modelIsLoaded);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.INSTANCE_OPERATION:
      {
        InstanceOperation instanceOperation = (InstanceOperation)theEObject;
        T result = caseInstanceOperation(instanceOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE:
      {
        ClassInstance classInstance = (ClassInstance)theEObject;
        T result = caseClassInstance(classInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE_CREATE:
      {
        ClassInstanceCreate classInstanceCreate = (ClassInstanceCreate)theEObject;
        T result = caseClassInstanceCreate(classInstanceCreate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE_DELETE:
      {
        ClassInstanceDelete classInstanceDelete = (ClassInstanceDelete)theEObject;
        T result = caseClassInstanceDelete(classInstanceDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE_GET:
      {
        ClassInstanceGet classInstanceGet = (ClassInstanceGet)theEObject;
        T result = caseClassInstanceGet(classInstanceGet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE_GET_ALL:
      {
        ClassInstanceGetAll classInstanceGetAll = (ClassInstanceGetAll)theEObject;
        T result = caseClassInstanceGetAll(classInstanceGetAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.CLASS_INSTANCE_SET:
      {
        ClassInstanceSet classInstanceSet = (ClassInstanceSet)theEObject;
        T result = caseClassInstanceSet(classInstanceSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE:
      {
        RelationInstance relationInstance = (RelationInstance)theEObject;
        T result = caseRelationInstance(relationInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE_CREATE:
      {
        RelationInstanceCreate relationInstanceCreate = (RelationInstanceCreate)theEObject;
        T result = caseRelationInstanceCreate(relationInstanceCreate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE_DELETE:
      {
        RelationInstanceDelete relationInstanceDelete = (RelationInstanceDelete)theEObject;
        T result = caseRelationInstanceDelete(relationInstanceDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE_GET:
      {
        RelationInstanceGet relationInstanceGet = (RelationInstanceGet)theEObject;
        T result = caseRelationInstanceGet(relationInstanceGet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL:
      {
        RelationInstanceGetAll relationInstanceGetAll = (RelationInstanceGetAll)theEObject;
        T result = caseRelationInstanceGetAll(relationInstanceGetAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.RELATION_INSTANCE_SET:
      {
        RelationInstanceSet relationInstanceSet = (RelationInstanceSet)theEObject;
        T result = caseRelationInstanceSet(relationInstanceSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ATTRIBUTE_OPERATION:
      {
        AttributeOperation attributeOperation = (AttributeOperation)theEObject;
        T result = caseAttributeOperation(attributeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ATTRIBUTE_GET:
      {
        AttributeGet attributeGet = (AttributeGet)theEObject;
        T result = caseAttributeGet(attributeGet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ATTRIBUTE_SET:
      {
        AttributeSet attributeSet = (AttributeSet)theEObject;
        T result = caseAttributeSet(attributeSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.EQUAL_EXPRESSION:
      {
        EqualExpression equalExpression = (EqualExpression)theEObject;
        T result = caseEqualExpression(equalExpression);
        if (result == null) result = caseExpression(equalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.COMPARE_EXPRESSION:
      {
        CompareExpression compareExpression = (CompareExpression)theEObject;
        T result = caseCompareExpression(compareExpression);
        if (result == null) result = caseExpression(compareExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.ADDITION_EXPRESSION:
      {
        AdditionExpression additionExpression = (AdditionExpression)theEObject;
        T result = caseAdditionExpression(additionExpression);
        if (result == null) result = caseExpression(additionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MMDSLPackage.MULTIPLICATION_EXPRESSION:
      {
        MultiplicationExpression multiplicationExpression = (MultiplicationExpression)theEObject;
        T result = caseMultiplicationExpression(multiplicationExpression);
        if (result == null) result = caseExpression(multiplicationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodName(MethodName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeLibrary(IncludeLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Library Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Library Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeLibraryType(IncludeLibraryType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embed Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embed Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbedCode(EmbedCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embed Platform Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embed Platform Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbedPlatformType(EmbedPlatformType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embed Code Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embed Code Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbedCodeType(EmbedCodeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Embed Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Embed Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertEmbedCode(InsertEmbedCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodel(Metamodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.xtext.nv.dsl.mMDSL.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassAttribute(ClassAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefName(RefName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumType(EnumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelType(ModelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMode(Mode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolClass(SymbolClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRelation(SymbolRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVG Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVG Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSVGCommand(SVGCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRectangle(Rectangle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCircle(Circle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEllipse(Ellipse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolyline(Polyline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolygon(Polygon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePath(Path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathData(PathData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoveTo(MoveTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineTo(LineTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Horizontal Line To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Horizontal Line To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHorizontalLineTo(HorizontalLineTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vertical Line To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vertical Line To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerticalLineTo(VerticalLineTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Curve To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Curve To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurveTo(CurveTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smooth Curve To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smooth Curve To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmoothCurveTo(SmoothCurveTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quadratic Bezier Curve</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quadratic Bezier Curve</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuadraticBezierCurve(QuadraticBezierCurve object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smooth Quadratic Bezier Curve To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smooth Quadratic Bezier Curve To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmoothQuadraticBezierCurveTo(SmoothQuadraticBezierCurveTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elliptical Arc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elliptical Arc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEllipticalArc(EllipticalArc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Points</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Points</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoints(Points object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters HV</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters HV</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersHV(PathParametersHV object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters MLT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters MLT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersMLT(PathParametersMLT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters S</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters S</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersS(PathParametersS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters Q</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters Q</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersQ(PathParametersQ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters C</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters C</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersC(PathParametersC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameters A</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameters A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParametersA(PathParametersA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolStyle(SymbolStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFillColor(FillColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stroke Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stroke Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrokeColor(StrokeColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Family</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Family</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontFamily(FontFamily object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algorithm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algorithm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgorithm(Algorithm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionStatement(SelectionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopStatement(LoopStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileLoop(WhileLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForLoop(ForLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Continue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Continue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakContinue(BreakContinue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarStatement(VarStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorAssign(OperatorAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Multy Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Multy Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorMultyAssign(OperatorMultyAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Unary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Unary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorUnary(OperatorUnary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Multiply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Multiply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorMultiply(OperatorMultiply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorAdd(OperatorAdd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorCompare(OperatorCompare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorEqual(OperatorEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorAnd(OperatorAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorOr(OperatorOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algorithm Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algorithm Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgorithmOperation(AlgorithmOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileOperation(FileOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Copy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Copy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileCopy(FileCopy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileDelete(FileDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileCreate(FileCreate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileRead(FileRead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Write</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Write</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileWrite(FileWrite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirOperation(DirOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir Set Working</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir Set Working</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirSetWorking(DirSetWorking object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir Get Working</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir Get Working</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirGetWorking(DirGetWorking object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirCreate(DirCreate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirDelete(DirDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dir List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dir List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirList(DirList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple UI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple UI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleUI(SimpleUI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditBox(EditBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Info Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfoBox(InfoBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorBox(ErrorBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Warning Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Warning Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWarningBox(WarningBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewBox(ViewBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemOperation(ItemOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuItem(MenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertMenuItem(InsertMenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveMenuItem(RemoveMenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextItem(ContextItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert Context Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert Context Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsertContextItem(InsertContextItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Context Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Context Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveContextItem(RemoveContextItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelOperation(ModelOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelCreate(ModelCreate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelDelete(ModelDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Discard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Discard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelDiscard(ModelDiscard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Save</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Save</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelSave(ModelSave object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelLoad(ModelLoad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Is Loaded</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Is Loaded</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelIsLoaded(ModelIsLoaded object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOperation(InstanceOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstance(ClassInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstanceCreate(ClassInstanceCreate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstanceDelete(ClassInstanceDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstanceGet(ClassInstanceGet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance Get All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance Get All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstanceGetAll(ClassInstanceGetAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstanceSet(ClassInstanceSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstance(RelationInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstanceCreate(RelationInstanceCreate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstanceDelete(RelationInstanceDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstanceGet(RelationInstanceGet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance Get All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance Get All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstanceGetAll(RelationInstanceGetAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Instance Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Instance Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationInstanceSet(RelationInstanceSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeOperation(AttributeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeGet(AttributeGet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSet(AttributeSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualExpression(EqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareExpression(CompareExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionExpression(AdditionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationExpression(MultiplicationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MMDSLSwitch
