/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.nv.dsl.mMDSL.AccessType;
import org.xtext.nv.dsl.mMDSL.AdditionExpression;
import org.xtext.nv.dsl.mMDSL.Algorithm;
import org.xtext.nv.dsl.mMDSL.AlgorithmOperation;
import org.xtext.nv.dsl.mMDSL.AndExpression;
import org.xtext.nv.dsl.mMDSL.AttrGetParams;
import org.xtext.nv.dsl.mMDSL.AttrSetParams;
import org.xtext.nv.dsl.mMDSL.Attribute;
import org.xtext.nv.dsl.mMDSL.AttributeGet;
import org.xtext.nv.dsl.mMDSL.AttributeOperation;
import org.xtext.nv.dsl.mMDSL.AttributeSet;
import org.xtext.nv.dsl.mMDSL.BreakContinue;
import org.xtext.nv.dsl.mMDSL.ButtonType;
import org.xtext.nv.dsl.mMDSL.Circle;
import org.xtext.nv.dsl.mMDSL.ClassAttribute;
import org.xtext.nv.dsl.mMDSL.ClassInstance;
import org.xtext.nv.dsl.mMDSL.ClassInstanceCreate;
import org.xtext.nv.dsl.mMDSL.ClassInstanceDelete;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGet;
import org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll;
import org.xtext.nv.dsl.mMDSL.ClassInstanceSet;
import org.xtext.nv.dsl.mMDSL.Color;
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
import org.xtext.nv.dsl.mMDSL.EventName;
import org.xtext.nv.dsl.mMDSL.Expr;
import org.xtext.nv.dsl.mMDSL.Expression;
import org.xtext.nv.dsl.mMDSL.FileCopy;
import org.xtext.nv.dsl.mMDSL.FileCreate;
import org.xtext.nv.dsl.mMDSL.FileDelete;
import org.xtext.nv.dsl.mMDSL.FileOperation;
import org.xtext.nv.dsl.mMDSL.FileRead;
import org.xtext.nv.dsl.mMDSL.FileWrite;
import org.xtext.nv.dsl.mMDSL.FillColor;
import org.xtext.nv.dsl.mMDSL.Font;
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
import org.xtext.nv.dsl.mMDSL.MMDSLFactory;
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
import org.xtext.nv.dsl.mMDSL.SimpleType;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MMDSLFactoryImpl extends EFactoryImpl implements MMDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MMDSLFactory init()
  {
    try
    {
      MMDSLFactory theMMDSLFactory = (MMDSLFactory)EPackage.Registry.INSTANCE.getEFactory(MMDSLPackage.eNS_URI);
      if (theMMDSLFactory != null)
      {
        return theMMDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MMDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MMDSLPackage.ROOT: return createRoot();
      case MMDSLPackage.METHOD_NAME: return createMethodName();
      case MMDSLPackage.INCLUDE_LIBRARY: return createIncludeLibrary();
      case MMDSLPackage.INCLUDE_LIBRARY_TYPE: return createIncludeLibraryType();
      case MMDSLPackage.EMBED_CODE: return createEmbedCode();
      case MMDSLPackage.EMBED_PLATFORM_TYPE: return createEmbedPlatformType();
      case MMDSLPackage.EMBED_CODE_TYPE: return createEmbedCodeType();
      case MMDSLPackage.INSERT_EMBED_CODE: return createInsertEmbedCode();
      case MMDSLPackage.METHOD: return createMethod();
      case MMDSLPackage.ENUMERATION: return createEnumeration();
      case MMDSLPackage.METAMODEL: return createMetamodel();
      case MMDSLPackage.CLASS: return createClass();
      case MMDSLPackage.RELATION: return createRelation();
      case MMDSLPackage.ATTRIBUTE: return createAttribute();
      case MMDSLPackage.CLASS_ATTRIBUTE: return createClassAttribute();
      case MMDSLPackage.REFERENCE: return createReference();
      case MMDSLPackage.REF_NAME: return createRefName();
      case MMDSLPackage.TYPE: return createType();
      case MMDSLPackage.ENUM_TYPE: return createEnumType();
      case MMDSLPackage.MODEL_TYPE: return createModelType();
      case MMDSLPackage.MODE: return createMode();
      case MMDSLPackage.SYMBOL_CLASS: return createSymbolClass();
      case MMDSLPackage.SYMBOL_RELATION: return createSymbolRelation();
      case MMDSLPackage.SVG_COMMAND: return createSVGCommand();
      case MMDSLPackage.RECTANGLE: return createRectangle();
      case MMDSLPackage.CIRCLE: return createCircle();
      case MMDSLPackage.ELLIPSE: return createEllipse();
      case MMDSLPackage.LINE: return createLine();
      case MMDSLPackage.POLYLINE: return createPolyline();
      case MMDSLPackage.POLYGON: return createPolygon();
      case MMDSLPackage.PATH: return createPath();
      case MMDSLPackage.TEXT: return createText();
      case MMDSLPackage.PATH_DATA: return createPathData();
      case MMDSLPackage.MOVE_TO: return createMoveTo();
      case MMDSLPackage.LINE_TO: return createLineTo();
      case MMDSLPackage.HORIZONTAL_LINE_TO: return createHorizontalLineTo();
      case MMDSLPackage.VERTICAL_LINE_TO: return createVerticalLineTo();
      case MMDSLPackage.CURVE_TO: return createCurveTo();
      case MMDSLPackage.SMOOTH_CURVE_TO: return createSmoothCurveTo();
      case MMDSLPackage.QUADRATIC_BEZIER_CURVE: return createQuadraticBezierCurve();
      case MMDSLPackage.SMOOTH_QUADRATIC_BEZIER_CURVE_TO: return createSmoothQuadraticBezierCurveTo();
      case MMDSLPackage.ELLIPTICAL_ARC: return createEllipticalArc();
      case MMDSLPackage.POINTS: return createPoints();
      case MMDSLPackage.PATH_PARAMETERS_HV: return createPathParametersHV();
      case MMDSLPackage.PATH_PARAMETERS_MLT: return createPathParametersMLT();
      case MMDSLPackage.PATH_PARAMETERS_S: return createPathParametersS();
      case MMDSLPackage.PATH_PARAMETERS_Q: return createPathParametersQ();
      case MMDSLPackage.PATH_PARAMETERS_C: return createPathParametersC();
      case MMDSLPackage.PATH_PARAMETERS_A: return createPathParametersA();
      case MMDSLPackage.SYMBOL_STYLE: return createSymbolStyle();
      case MMDSLPackage.FILL_COLOR: return createFillColor();
      case MMDSLPackage.STROKE_COLOR: return createStrokeColor();
      case MMDSLPackage.FONT_FAMILY: return createFontFamily();
      case MMDSLPackage.ALGORITHM: return createAlgorithm();
      case MMDSLPackage.STATEMENT: return createStatement();
      case MMDSLPackage.SELECTION_STATEMENT: return createSelectionStatement();
      case MMDSLPackage.LOOP_STATEMENT: return createLoopStatement();
      case MMDSLPackage.WHILE_LOOP: return createWhileLoop();
      case MMDSLPackage.FOR_LOOP: return createForLoop();
      case MMDSLPackage.BREAK_CONTINUE: return createBreakContinue();
      case MMDSLPackage.VARIABLE: return createVariable();
      case MMDSLPackage.VAR_STATEMENT: return createVarStatement();
      case MMDSLPackage.OPERATOR_ASSIGN: return createOperatorAssign();
      case MMDSLPackage.OPERATOR_MULTY_ASSIGN: return createOperatorMultyAssign();
      case MMDSLPackage.OPERATOR_UNARY: return createOperatorUnary();
      case MMDSLPackage.OPERATOR_MULTIPLY: return createOperatorMultiply();
      case MMDSLPackage.OPERATOR_ADD: return createOperatorAdd();
      case MMDSLPackage.OPERATOR_COMPARE: return createOperatorCompare();
      case MMDSLPackage.OPERATOR_EQUAL: return createOperatorEqual();
      case MMDSLPackage.OPERATOR_AND: return createOperatorAnd();
      case MMDSLPackage.OPERATOR_OR: return createOperatorOr();
      case MMDSLPackage.EXPR: return createExpr();
      case MMDSLPackage.EXPRESSION: return createExpression();
      case MMDSLPackage.ALGORITHM_OPERATION: return createAlgorithmOperation();
      case MMDSLPackage.FILE_OPERATION: return createFileOperation();
      case MMDSLPackage.FILE_COPY: return createFileCopy();
      case MMDSLPackage.FILE_DELETE: return createFileDelete();
      case MMDSLPackage.FILE_CREATE: return createFileCreate();
      case MMDSLPackage.FILE_READ: return createFileRead();
      case MMDSLPackage.FILE_WRITE: return createFileWrite();
      case MMDSLPackage.DIR_OPERATION: return createDirOperation();
      case MMDSLPackage.DIR_SET_WORKING: return createDirSetWorking();
      case MMDSLPackage.DIR_GET_WORKING: return createDirGetWorking();
      case MMDSLPackage.DIR_CREATE: return createDirCreate();
      case MMDSLPackage.DIR_DELETE: return createDirDelete();
      case MMDSLPackage.DIR_LIST: return createDirList();
      case MMDSLPackage.SIMPLE_UI: return createSimpleUI();
      case MMDSLPackage.EDIT_BOX: return createEditBox();
      case MMDSLPackage.INFO_BOX: return createInfoBox();
      case MMDSLPackage.ERROR_BOX: return createErrorBox();
      case MMDSLPackage.WARNING_BOX: return createWarningBox();
      case MMDSLPackage.VIEW_BOX: return createViewBox();
      case MMDSLPackage.ITEM_OPERATION: return createItemOperation();
      case MMDSLPackage.MENU_ITEM: return createMenuItem();
      case MMDSLPackage.INSERT_MENU_ITEM: return createInsertMenuItem();
      case MMDSLPackage.REMOVE_MENU_ITEM: return createRemoveMenuItem();
      case MMDSLPackage.CONTEXT_ITEM: return createContextItem();
      case MMDSLPackage.INSERT_CONTEXT_ITEM: return createInsertContextItem();
      case MMDSLPackage.REMOVE_CONTEXT_ITEM: return createRemoveContextItem();
      case MMDSLPackage.MODEL_OPERATION: return createModelOperation();
      case MMDSLPackage.MODEL_CREATE: return createModelCreate();
      case MMDSLPackage.MODEL_DELETE: return createModelDelete();
      case MMDSLPackage.MODEL_DISCARD: return createModelDiscard();
      case MMDSLPackage.MODEL_SAVE: return createModelSave();
      case MMDSLPackage.MODEL_LOAD: return createModelLoad();
      case MMDSLPackage.MODEL_IS_LOADED: return createModelIsLoaded();
      case MMDSLPackage.INSTANCE_OPERATION: return createInstanceOperation();
      case MMDSLPackage.CLASS_INSTANCE: return createClassInstance();
      case MMDSLPackage.CLASS_INSTANCE_CREATE: return createClassInstanceCreate();
      case MMDSLPackage.CLASS_INSTANCE_DELETE: return createClassInstanceDelete();
      case MMDSLPackage.CLASS_INSTANCE_GET: return createClassInstanceGet();
      case MMDSLPackage.CLASS_INSTANCE_GET_ALL: return createClassInstanceGetAll();
      case MMDSLPackage.CLASS_INSTANCE_SET: return createClassInstanceSet();
      case MMDSLPackage.RELATION_INSTANCE: return createRelationInstance();
      case MMDSLPackage.RELATION_INSTANCE_CREATE: return createRelationInstanceCreate();
      case MMDSLPackage.RELATION_INSTANCE_DELETE: return createRelationInstanceDelete();
      case MMDSLPackage.RELATION_INSTANCE_GET: return createRelationInstanceGet();
      case MMDSLPackage.RELATION_INSTANCE_GET_ALL: return createRelationInstanceGetAll();
      case MMDSLPackage.RELATION_INSTANCE_SET: return createRelationInstanceSet();
      case MMDSLPackage.ATTRIBUTE_OPERATION: return createAttributeOperation();
      case MMDSLPackage.ATTRIBUTE_GET: return createAttributeGet();
      case MMDSLPackage.ATTRIBUTE_SET: return createAttributeSet();
      case MMDSLPackage.EVENT: return createEvent();
      case MMDSLPackage.OR_EXPRESSION: return createOrExpression();
      case MMDSLPackage.AND_EXPRESSION: return createAndExpression();
      case MMDSLPackage.EQUAL_EXPRESSION: return createEqualExpression();
      case MMDSLPackage.COMPARE_EXPRESSION: return createCompareExpression();
      case MMDSLPackage.ADDITION_EXPRESSION: return createAdditionExpression();
      case MMDSLPackage.MULTIPLICATION_EXPRESSION: return createMultiplicationExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MMDSLPackage.ACCESS_TYPE:
        return createAccessTypeFromString(eDataType, initialValue);
      case MMDSLPackage.SIMPLE_TYPE:
        return createSimpleTypeFromString(eDataType, initialValue);
      case MMDSLPackage.FONT:
        return createFontFromString(eDataType, initialValue);
      case MMDSLPackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      case MMDSLPackage.BUTTON_TYPE:
        return createButtonTypeFromString(eDataType, initialValue);
      case MMDSLPackage.ATTR_GET_PARAMS:
        return createAttrGetParamsFromString(eDataType, initialValue);
      case MMDSLPackage.ATTR_SET_PARAMS:
        return createAttrSetParamsFromString(eDataType, initialValue);
      case MMDSLPackage.EVENT_NAME:
        return createEventNameFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MMDSLPackage.ACCESS_TYPE:
        return convertAccessTypeToString(eDataType, instanceValue);
      case MMDSLPackage.SIMPLE_TYPE:
        return convertSimpleTypeToString(eDataType, instanceValue);
      case MMDSLPackage.FONT:
        return convertFontToString(eDataType, instanceValue);
      case MMDSLPackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      case MMDSLPackage.BUTTON_TYPE:
        return convertButtonTypeToString(eDataType, instanceValue);
      case MMDSLPackage.ATTR_GET_PARAMS:
        return convertAttrGetParamsToString(eDataType, instanceValue);
      case MMDSLPackage.ATTR_SET_PARAMS:
        return convertAttrSetParamsToString(eDataType, instanceValue);
      case MMDSLPackage.EVENT_NAME:
        return convertEventNameToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName createMethodName()
  {
    MethodNameImpl methodName = new MethodNameImpl();
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeLibrary createIncludeLibrary()
  {
    IncludeLibraryImpl includeLibrary = new IncludeLibraryImpl();
    return includeLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeLibraryType createIncludeLibraryType()
  {
    IncludeLibraryTypeImpl includeLibraryType = new IncludeLibraryTypeImpl();
    return includeLibraryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCode createEmbedCode()
  {
    EmbedCodeImpl embedCode = new EmbedCodeImpl();
    return embedCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedPlatformType createEmbedPlatformType()
  {
    EmbedPlatformTypeImpl embedPlatformType = new EmbedPlatformTypeImpl();
    return embedPlatformType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedCodeType createEmbedCodeType()
  {
    EmbedCodeTypeImpl embedCodeType = new EmbedCodeTypeImpl();
    return embedCodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertEmbedCode createInsertEmbedCode()
  {
    InsertEmbedCodeImpl insertEmbedCode = new InsertEmbedCodeImpl();
    return insertEmbedCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.nv.dsl.mMDSL.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttribute createClassAttribute()
  {
    ClassAttributeImpl classAttribute = new ClassAttributeImpl();
    return classAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefName createRefName()
  {
    RefNameImpl refName = new RefNameImpl();
    return refName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType createModelType()
  {
    ModelTypeImpl modelType = new ModelTypeImpl();
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolClass createSymbolClass()
  {
    SymbolClassImpl symbolClass = new SymbolClassImpl();
    return symbolClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRelation createSymbolRelation()
  {
    SymbolRelationImpl symbolRelation = new SymbolRelationImpl();
    return symbolRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SVGCommand createSVGCommand()
  {
    SVGCommandImpl svgCommand = new SVGCommandImpl();
    return svgCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle createRectangle()
  {
    RectangleImpl rectangle = new RectangleImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Circle createCircle()
  {
    CircleImpl circle = new CircleImpl();
    return circle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ellipse createEllipse()
  {
    EllipseImpl ellipse = new EllipseImpl();
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polyline createPolyline()
  {
    PolylineImpl polyline = new PolylineImpl();
    return polyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polygon createPolygon()
  {
    PolygonImpl polygon = new PolygonImpl();
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathData createPathData()
  {
    PathDataImpl pathData = new PathDataImpl();
    return pathData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveTo createMoveTo()
  {
    MoveToImpl moveTo = new MoveToImpl();
    return moveTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineTo createLineTo()
  {
    LineToImpl lineTo = new LineToImpl();
    return lineTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalLineTo createHorizontalLineTo()
  {
    HorizontalLineToImpl horizontalLineTo = new HorizontalLineToImpl();
    return horizontalLineTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalLineTo createVerticalLineTo()
  {
    VerticalLineToImpl verticalLineTo = new VerticalLineToImpl();
    return verticalLineTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurveTo createCurveTo()
  {
    CurveToImpl curveTo = new CurveToImpl();
    return curveTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmoothCurveTo createSmoothCurveTo()
  {
    SmoothCurveToImpl smoothCurveTo = new SmoothCurveToImpl();
    return smoothCurveTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuadraticBezierCurve createQuadraticBezierCurve()
  {
    QuadraticBezierCurveImpl quadraticBezierCurve = new QuadraticBezierCurveImpl();
    return quadraticBezierCurve;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmoothQuadraticBezierCurveTo createSmoothQuadraticBezierCurveTo()
  {
    SmoothQuadraticBezierCurveToImpl smoothQuadraticBezierCurveTo = new SmoothQuadraticBezierCurveToImpl();
    return smoothQuadraticBezierCurveTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EllipticalArc createEllipticalArc()
  {
    EllipticalArcImpl ellipticalArc = new EllipticalArcImpl();
    return ellipticalArc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Points createPoints()
  {
    PointsImpl points = new PointsImpl();
    return points;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersHV createPathParametersHV()
  {
    PathParametersHVImpl pathParametersHV = new PathParametersHVImpl();
    return pathParametersHV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersMLT createPathParametersMLT()
  {
    PathParametersMLTImpl pathParametersMLT = new PathParametersMLTImpl();
    return pathParametersMLT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersS createPathParametersS()
  {
    PathParametersSImpl pathParametersS = new PathParametersSImpl();
    return pathParametersS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersQ createPathParametersQ()
  {
    PathParametersQImpl pathParametersQ = new PathParametersQImpl();
    return pathParametersQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersC createPathParametersC()
  {
    PathParametersCImpl pathParametersC = new PathParametersCImpl();
    return pathParametersC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathParametersA createPathParametersA()
  {
    PathParametersAImpl pathParametersA = new PathParametersAImpl();
    return pathParametersA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolStyle createSymbolStyle()
  {
    SymbolStyleImpl symbolStyle = new SymbolStyleImpl();
    return symbolStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FillColor createFillColor()
  {
    FillColorImpl fillColor = new FillColorImpl();
    return fillColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrokeColor createStrokeColor()
  {
    StrokeColorImpl strokeColor = new StrokeColorImpl();
    return strokeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFamily createFontFamily()
  {
    FontFamilyImpl fontFamily = new FontFamilyImpl();
    return fontFamily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Algorithm createAlgorithm()
  {
    AlgorithmImpl algorithm = new AlgorithmImpl();
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionStatement createSelectionStatement()
  {
    SelectionStatementImpl selectionStatement = new SelectionStatementImpl();
    return selectionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopStatement createLoopStatement()
  {
    LoopStatementImpl loopStatement = new LoopStatementImpl();
    return loopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileLoop createWhileLoop()
  {
    WhileLoopImpl whileLoop = new WhileLoopImpl();
    return whileLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForLoop createForLoop()
  {
    ForLoopImpl forLoop = new ForLoopImpl();
    return forLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakContinue createBreakContinue()
  {
    BreakContinueImpl breakContinue = new BreakContinueImpl();
    return breakContinue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarStatement createVarStatement()
  {
    VarStatementImpl varStatement = new VarStatementImpl();
    return varStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorAssign createOperatorAssign()
  {
    OperatorAssignImpl operatorAssign = new OperatorAssignImpl();
    return operatorAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorMultyAssign createOperatorMultyAssign()
  {
    OperatorMultyAssignImpl operatorMultyAssign = new OperatorMultyAssignImpl();
    return operatorMultyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorUnary createOperatorUnary()
  {
    OperatorUnaryImpl operatorUnary = new OperatorUnaryImpl();
    return operatorUnary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorMultiply createOperatorMultiply()
  {
    OperatorMultiplyImpl operatorMultiply = new OperatorMultiplyImpl();
    return operatorMultiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorAdd createOperatorAdd()
  {
    OperatorAddImpl operatorAdd = new OperatorAddImpl();
    return operatorAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorCompare createOperatorCompare()
  {
    OperatorCompareImpl operatorCompare = new OperatorCompareImpl();
    return operatorCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorEqual createOperatorEqual()
  {
    OperatorEqualImpl operatorEqual = new OperatorEqualImpl();
    return operatorEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorAnd createOperatorAnd()
  {
    OperatorAndImpl operatorAnd = new OperatorAndImpl();
    return operatorAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorOr createOperatorOr()
  {
    OperatorOrImpl operatorOr = new OperatorOrImpl();
    return operatorOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgorithmOperation createAlgorithmOperation()
  {
    AlgorithmOperationImpl algorithmOperation = new AlgorithmOperationImpl();
    return algorithmOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileOperation createFileOperation()
  {
    FileOperationImpl fileOperation = new FileOperationImpl();
    return fileOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileCopy createFileCopy()
  {
    FileCopyImpl fileCopy = new FileCopyImpl();
    return fileCopy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileDelete createFileDelete()
  {
    FileDeleteImpl fileDelete = new FileDeleteImpl();
    return fileDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileCreate createFileCreate()
  {
    FileCreateImpl fileCreate = new FileCreateImpl();
    return fileCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileRead createFileRead()
  {
    FileReadImpl fileRead = new FileReadImpl();
    return fileRead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileWrite createFileWrite()
  {
    FileWriteImpl fileWrite = new FileWriteImpl();
    return fileWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirOperation createDirOperation()
  {
    DirOperationImpl dirOperation = new DirOperationImpl();
    return dirOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirSetWorking createDirSetWorking()
  {
    DirSetWorkingImpl dirSetWorking = new DirSetWorkingImpl();
    return dirSetWorking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirGetWorking createDirGetWorking()
  {
    DirGetWorkingImpl dirGetWorking = new DirGetWorkingImpl();
    return dirGetWorking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirCreate createDirCreate()
  {
    DirCreateImpl dirCreate = new DirCreateImpl();
    return dirCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirDelete createDirDelete()
  {
    DirDeleteImpl dirDelete = new DirDeleteImpl();
    return dirDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirList createDirList()
  {
    DirListImpl dirList = new DirListImpl();
    return dirList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleUI createSimpleUI()
  {
    SimpleUIImpl simpleUI = new SimpleUIImpl();
    return simpleUI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditBox createEditBox()
  {
    EditBoxImpl editBox = new EditBoxImpl();
    return editBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfoBox createInfoBox()
  {
    InfoBoxImpl infoBox = new InfoBoxImpl();
    return infoBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorBox createErrorBox()
  {
    ErrorBoxImpl errorBox = new ErrorBoxImpl();
    return errorBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WarningBox createWarningBox()
  {
    WarningBoxImpl warningBox = new WarningBoxImpl();
    return warningBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewBox createViewBox()
  {
    ViewBoxImpl viewBox = new ViewBoxImpl();
    return viewBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemOperation createItemOperation()
  {
    ItemOperationImpl itemOperation = new ItemOperationImpl();
    return itemOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuItem createMenuItem()
  {
    MenuItemImpl menuItem = new MenuItemImpl();
    return menuItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertMenuItem createInsertMenuItem()
  {
    InsertMenuItemImpl insertMenuItem = new InsertMenuItemImpl();
    return insertMenuItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveMenuItem createRemoveMenuItem()
  {
    RemoveMenuItemImpl removeMenuItem = new RemoveMenuItemImpl();
    return removeMenuItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextItem createContextItem()
  {
    ContextItemImpl contextItem = new ContextItemImpl();
    return contextItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertContextItem createInsertContextItem()
  {
    InsertContextItemImpl insertContextItem = new InsertContextItemImpl();
    return insertContextItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoveContextItem createRemoveContextItem()
  {
    RemoveContextItemImpl removeContextItem = new RemoveContextItemImpl();
    return removeContextItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelOperation createModelOperation()
  {
    ModelOperationImpl modelOperation = new ModelOperationImpl();
    return modelOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCreate createModelCreate()
  {
    ModelCreateImpl modelCreate = new ModelCreateImpl();
    return modelCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDelete createModelDelete()
  {
    ModelDeleteImpl modelDelete = new ModelDeleteImpl();
    return modelDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDiscard createModelDiscard()
  {
    ModelDiscardImpl modelDiscard = new ModelDiscardImpl();
    return modelDiscard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSave createModelSave()
  {
    ModelSaveImpl modelSave = new ModelSaveImpl();
    return modelSave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelLoad createModelLoad()
  {
    ModelLoadImpl modelLoad = new ModelLoadImpl();
    return modelLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelIsLoaded createModelIsLoaded()
  {
    ModelIsLoadedImpl modelIsLoaded = new ModelIsLoadedImpl();
    return modelIsLoaded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOperation createInstanceOperation()
  {
    InstanceOperationImpl instanceOperation = new InstanceOperationImpl();
    return instanceOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstance createClassInstance()
  {
    ClassInstanceImpl classInstance = new ClassInstanceImpl();
    return classInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceCreate createClassInstanceCreate()
  {
    ClassInstanceCreateImpl classInstanceCreate = new ClassInstanceCreateImpl();
    return classInstanceCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceDelete createClassInstanceDelete()
  {
    ClassInstanceDeleteImpl classInstanceDelete = new ClassInstanceDeleteImpl();
    return classInstanceDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceGet createClassInstanceGet()
  {
    ClassInstanceGetImpl classInstanceGet = new ClassInstanceGetImpl();
    return classInstanceGet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceGetAll createClassInstanceGetAll()
  {
    ClassInstanceGetAllImpl classInstanceGetAll = new ClassInstanceGetAllImpl();
    return classInstanceGetAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstanceSet createClassInstanceSet()
  {
    ClassInstanceSetImpl classInstanceSet = new ClassInstanceSetImpl();
    return classInstanceSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstance createRelationInstance()
  {
    RelationInstanceImpl relationInstance = new RelationInstanceImpl();
    return relationInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceCreate createRelationInstanceCreate()
  {
    RelationInstanceCreateImpl relationInstanceCreate = new RelationInstanceCreateImpl();
    return relationInstanceCreate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceDelete createRelationInstanceDelete()
  {
    RelationInstanceDeleteImpl relationInstanceDelete = new RelationInstanceDeleteImpl();
    return relationInstanceDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceGet createRelationInstanceGet()
  {
    RelationInstanceGetImpl relationInstanceGet = new RelationInstanceGetImpl();
    return relationInstanceGet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceGetAll createRelationInstanceGetAll()
  {
    RelationInstanceGetAllImpl relationInstanceGetAll = new RelationInstanceGetAllImpl();
    return relationInstanceGetAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationInstanceSet createRelationInstanceSet()
  {
    RelationInstanceSetImpl relationInstanceSet = new RelationInstanceSetImpl();
    return relationInstanceSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeOperation createAttributeOperation()
  {
    AttributeOperationImpl attributeOperation = new AttributeOperationImpl();
    return attributeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeGet createAttributeGet()
  {
    AttributeGetImpl attributeGet = new AttributeGetImpl();
    return attributeGet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSet createAttributeSet()
  {
    AttributeSetImpl attributeSet = new AttributeSetImpl();
    return attributeSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualExpression createEqualExpression()
  {
    EqualExpressionImpl equalExpression = new EqualExpressionImpl();
    return equalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareExpression createCompareExpression()
  {
    CompareExpressionImpl compareExpression = new CompareExpressionImpl();
    return compareExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionExpression createAdditionExpression()
  {
    AdditionExpressionImpl additionExpression = new AdditionExpressionImpl();
    return additionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationExpression createMultiplicationExpression()
  {
    MultiplicationExpressionImpl multiplicationExpression = new MultiplicationExpressionImpl();
    return multiplicationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue)
  {
    AccessType result = AccessType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleTypeFromString(EDataType eDataType, String initialValue)
  {
    SimpleType result = SimpleType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSimpleTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font createFontFromString(EDataType eDataType, String initialValue)
  {
    Font result = Font.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFontToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonType createButtonTypeFromString(EDataType eDataType, String initialValue)
  {
    ButtonType result = ButtonType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertButtonTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrGetParams createAttrGetParamsFromString(EDataType eDataType, String initialValue)
  {
    AttrGetParams result = AttrGetParams.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttrGetParamsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrSetParams createAttrSetParamsFromString(EDataType eDataType, String initialValue)
  {
    AttrSetParams result = AttrSetParams.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttrSetParamsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventName createEventNameFromString(EDataType eDataType, String initialValue)
  {
    EventName result = EventName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEventNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMDSLPackage getMMDSLPackage()
  {
    return (MMDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MMDSLPackage getPackage()
  {
    return MMDSLPackage.eINSTANCE;
  }

} //MMDSLFactoryImpl
