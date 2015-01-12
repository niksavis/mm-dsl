/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage
 * @generated
 */
public interface MMDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MMDSLFactory eINSTANCE = org.xtext.nv.dsl.mMDSL.impl.MMDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Method Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Name</em>'.
   * @generated
   */
  MethodName createMethodName();

  /**
   * Returns a new object of class '<em>Include Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Library</em>'.
   * @generated
   */
  IncludeLibrary createIncludeLibrary();

  /**
   * Returns a new object of class '<em>Include Library Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Library Type</em>'.
   * @generated
   */
  IncludeLibraryType createIncludeLibraryType();

  /**
   * Returns a new object of class '<em>Embed Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embed Code</em>'.
   * @generated
   */
  EmbedCode createEmbedCode();

  /**
   * Returns a new object of class '<em>Embed Platform Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embed Platform Type</em>'.
   * @generated
   */
  EmbedPlatformType createEmbedPlatformType();

  /**
   * Returns a new object of class '<em>Embed Code Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embed Code Type</em>'.
   * @generated
   */
  EmbedCodeType createEmbedCodeType();

  /**
   * Returns a new object of class '<em>Insert Embed Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Embed Code</em>'.
   * @generated
   */
  InsertEmbedCode createInsertEmbedCode();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel</em>'.
   * @generated
   */
  Metamodel createMetamodel();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Class Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Attribute</em>'.
   * @generated
   */
  ClassAttribute createClassAttribute();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Ref Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Name</em>'.
   * @generated
   */
  RefName createRefName();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Type</em>'.
   * @generated
   */
  ModelType createModelType();

  /**
   * Returns a new object of class '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode</em>'.
   * @generated
   */
  Mode createMode();

  /**
   * Returns a new object of class '<em>Symbol Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Class</em>'.
   * @generated
   */
  SymbolClass createSymbolClass();

  /**
   * Returns a new object of class '<em>Symbol Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Relation</em>'.
   * @generated
   */
  SymbolRelation createSymbolRelation();

  /**
   * Returns a new object of class '<em>SVG Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SVG Command</em>'.
   * @generated
   */
  SVGCommand createSVGCommand();

  /**
   * Returns a new object of class '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rectangle</em>'.
   * @generated
   */
  Rectangle createRectangle();

  /**
   * Returns a new object of class '<em>Circle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Circle</em>'.
   * @generated
   */
  Circle createCircle();

  /**
   * Returns a new object of class '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ellipse</em>'.
   * @generated
   */
  Ellipse createEllipse();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Polyline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polyline</em>'.
   * @generated
   */
  Polyline createPolyline();

  /**
   * Returns a new object of class '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polygon</em>'.
   * @generated
   */
  Polygon createPolygon();

  /**
   * Returns a new object of class '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path</em>'.
   * @generated
   */
  Path createPath();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Path Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Data</em>'.
   * @generated
   */
  PathData createPathData();

  /**
   * Returns a new object of class '<em>Move To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move To</em>'.
   * @generated
   */
  MoveTo createMoveTo();

  /**
   * Returns a new object of class '<em>Line To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line To</em>'.
   * @generated
   */
  LineTo createLineTo();

  /**
   * Returns a new object of class '<em>Horizontal Line To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Horizontal Line To</em>'.
   * @generated
   */
  HorizontalLineTo createHorizontalLineTo();

  /**
   * Returns a new object of class '<em>Vertical Line To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vertical Line To</em>'.
   * @generated
   */
  VerticalLineTo createVerticalLineTo();

  /**
   * Returns a new object of class '<em>Curve To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Curve To</em>'.
   * @generated
   */
  CurveTo createCurveTo();

  /**
   * Returns a new object of class '<em>Smooth Curve To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smooth Curve To</em>'.
   * @generated
   */
  SmoothCurveTo createSmoothCurveTo();

  /**
   * Returns a new object of class '<em>Quadratic Bezier Curve</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quadratic Bezier Curve</em>'.
   * @generated
   */
  QuadraticBezierCurve createQuadraticBezierCurve();

  /**
   * Returns a new object of class '<em>Smooth Quadratic Bezier Curve To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smooth Quadratic Bezier Curve To</em>'.
   * @generated
   */
  SmoothQuadraticBezierCurveTo createSmoothQuadraticBezierCurveTo();

  /**
   * Returns a new object of class '<em>Elliptical Arc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Elliptical Arc</em>'.
   * @generated
   */
  EllipticalArc createEllipticalArc();

  /**
   * Returns a new object of class '<em>Points</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Points</em>'.
   * @generated
   */
  Points createPoints();

  /**
   * Returns a new object of class '<em>Path Parameters HV</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters HV</em>'.
   * @generated
   */
  PathParametersHV createPathParametersHV();

  /**
   * Returns a new object of class '<em>Path Parameters MLT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters MLT</em>'.
   * @generated
   */
  PathParametersMLT createPathParametersMLT();

  /**
   * Returns a new object of class '<em>Path Parameters S</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters S</em>'.
   * @generated
   */
  PathParametersS createPathParametersS();

  /**
   * Returns a new object of class '<em>Path Parameters Q</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters Q</em>'.
   * @generated
   */
  PathParametersQ createPathParametersQ();

  /**
   * Returns a new object of class '<em>Path Parameters C</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters C</em>'.
   * @generated
   */
  PathParametersC createPathParametersC();

  /**
   * Returns a new object of class '<em>Path Parameters A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Parameters A</em>'.
   * @generated
   */
  PathParametersA createPathParametersA();

  /**
   * Returns a new object of class '<em>Symbol Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Style</em>'.
   * @generated
   */
  SymbolStyle createSymbolStyle();

  /**
   * Returns a new object of class '<em>Fill Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fill Color</em>'.
   * @generated
   */
  FillColor createFillColor();

  /**
   * Returns a new object of class '<em>Stroke Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stroke Color</em>'.
   * @generated
   */
  StrokeColor createStrokeColor();

  /**
   * Returns a new object of class '<em>Font Family</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Family</em>'.
   * @generated
   */
  FontFamily createFontFamily();

  /**
   * Returns a new object of class '<em>Algorithm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm</em>'.
   * @generated
   */
  Algorithm createAlgorithm();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Selection Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Statement</em>'.
   * @generated
   */
  SelectionStatement createSelectionStatement();

  /**
   * Returns a new object of class '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Statement</em>'.
   * @generated
   */
  LoopStatement createLoopStatement();

  /**
   * Returns a new object of class '<em>While Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Loop</em>'.
   * @generated
   */
  WhileLoop createWhileLoop();

  /**
   * Returns a new object of class '<em>For Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Loop</em>'.
   * @generated
   */
  ForLoop createForLoop();

  /**
   * Returns a new object of class '<em>Break Continue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Continue</em>'.
   * @generated
   */
  BreakContinue createBreakContinue();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Var Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Statement</em>'.
   * @generated
   */
  VarStatement createVarStatement();

  /**
   * Returns a new object of class '<em>Operator Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Assign</em>'.
   * @generated
   */
  OperatorAssign createOperatorAssign();

  /**
   * Returns a new object of class '<em>Operator Multy Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Multy Assign</em>'.
   * @generated
   */
  OperatorMultyAssign createOperatorMultyAssign();

  /**
   * Returns a new object of class '<em>Operator Unary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Unary</em>'.
   * @generated
   */
  OperatorUnary createOperatorUnary();

  /**
   * Returns a new object of class '<em>Operator Multiply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Multiply</em>'.
   * @generated
   */
  OperatorMultiply createOperatorMultiply();

  /**
   * Returns a new object of class '<em>Operator Add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Add</em>'.
   * @generated
   */
  OperatorAdd createOperatorAdd();

  /**
   * Returns a new object of class '<em>Operator Compare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Compare</em>'.
   * @generated
   */
  OperatorCompare createOperatorCompare();

  /**
   * Returns a new object of class '<em>Operator Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Equal</em>'.
   * @generated
   */
  OperatorEqual createOperatorEqual();

  /**
   * Returns a new object of class '<em>Operator And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator And</em>'.
   * @generated
   */
  OperatorAnd createOperatorAnd();

  /**
   * Returns a new object of class '<em>Operator Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Or</em>'.
   * @generated
   */
  OperatorOr createOperatorOr();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Algorithm Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm Operation</em>'.
   * @generated
   */
  AlgorithmOperation createAlgorithmOperation();

  /**
   * Returns a new object of class '<em>File Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Operation</em>'.
   * @generated
   */
  FileOperation createFileOperation();

  /**
   * Returns a new object of class '<em>File Copy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Copy</em>'.
   * @generated
   */
  FileCopy createFileCopy();

  /**
   * Returns a new object of class '<em>File Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Delete</em>'.
   * @generated
   */
  FileDelete createFileDelete();

  /**
   * Returns a new object of class '<em>File Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Create</em>'.
   * @generated
   */
  FileCreate createFileCreate();

  /**
   * Returns a new object of class '<em>File Read</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Read</em>'.
   * @generated
   */
  FileRead createFileRead();

  /**
   * Returns a new object of class '<em>File Write</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Write</em>'.
   * @generated
   */
  FileWrite createFileWrite();

  /**
   * Returns a new object of class '<em>Dir Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir Operation</em>'.
   * @generated
   */
  DirOperation createDirOperation();

  /**
   * Returns a new object of class '<em>Dir Set Working</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir Set Working</em>'.
   * @generated
   */
  DirSetWorking createDirSetWorking();

  /**
   * Returns a new object of class '<em>Dir Get Working</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir Get Working</em>'.
   * @generated
   */
  DirGetWorking createDirGetWorking();

  /**
   * Returns a new object of class '<em>Dir Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir Create</em>'.
   * @generated
   */
  DirCreate createDirCreate();

  /**
   * Returns a new object of class '<em>Dir Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir Delete</em>'.
   * @generated
   */
  DirDelete createDirDelete();

  /**
   * Returns a new object of class '<em>Dir List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dir List</em>'.
   * @generated
   */
  DirList createDirList();

  /**
   * Returns a new object of class '<em>Simple UI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple UI</em>'.
   * @generated
   */
  SimpleUI createSimpleUI();

  /**
   * Returns a new object of class '<em>Edit Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edit Box</em>'.
   * @generated
   */
  EditBox createEditBox();

  /**
   * Returns a new object of class '<em>Info Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Info Box</em>'.
   * @generated
   */
  InfoBox createInfoBox();

  /**
   * Returns a new object of class '<em>Error Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Box</em>'.
   * @generated
   */
  ErrorBox createErrorBox();

  /**
   * Returns a new object of class '<em>Warning Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warning Box</em>'.
   * @generated
   */
  WarningBox createWarningBox();

  /**
   * Returns a new object of class '<em>View Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Box</em>'.
   * @generated
   */
  ViewBox createViewBox();

  /**
   * Returns a new object of class '<em>Item Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Operation</em>'.
   * @generated
   */
  ItemOperation createItemOperation();

  /**
   * Returns a new object of class '<em>Menu Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu Item</em>'.
   * @generated
   */
  MenuItem createMenuItem();

  /**
   * Returns a new object of class '<em>Insert Menu Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Menu Item</em>'.
   * @generated
   */
  InsertMenuItem createInsertMenuItem();

  /**
   * Returns a new object of class '<em>Remove Menu Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Menu Item</em>'.
   * @generated
   */
  RemoveMenuItem createRemoveMenuItem();

  /**
   * Returns a new object of class '<em>Context Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Item</em>'.
   * @generated
   */
  ContextItem createContextItem();

  /**
   * Returns a new object of class '<em>Insert Context Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Context Item</em>'.
   * @generated
   */
  InsertContextItem createInsertContextItem();

  /**
   * Returns a new object of class '<em>Remove Context Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Context Item</em>'.
   * @generated
   */
  RemoveContextItem createRemoveContextItem();

  /**
   * Returns a new object of class '<em>Model Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Operation</em>'.
   * @generated
   */
  ModelOperation createModelOperation();

  /**
   * Returns a new object of class '<em>Model Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Create</em>'.
   * @generated
   */
  ModelCreate createModelCreate();

  /**
   * Returns a new object of class '<em>Model Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Delete</em>'.
   * @generated
   */
  ModelDelete createModelDelete();

  /**
   * Returns a new object of class '<em>Model Discard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Discard</em>'.
   * @generated
   */
  ModelDiscard createModelDiscard();

  /**
   * Returns a new object of class '<em>Model Save</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Save</em>'.
   * @generated
   */
  ModelSave createModelSave();

  /**
   * Returns a new object of class '<em>Model Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Load</em>'.
   * @generated
   */
  ModelLoad createModelLoad();

  /**
   * Returns a new object of class '<em>Model Is Loaded</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Is Loaded</em>'.
   * @generated
   */
  ModelIsLoaded createModelIsLoaded();

  /**
   * Returns a new object of class '<em>Instance Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Operation</em>'.
   * @generated
   */
  InstanceOperation createInstanceOperation();

  /**
   * Returns a new object of class '<em>Class Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance</em>'.
   * @generated
   */
  ClassInstance createClassInstance();

  /**
   * Returns a new object of class '<em>Class Instance Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance Create</em>'.
   * @generated
   */
  ClassInstanceCreate createClassInstanceCreate();

  /**
   * Returns a new object of class '<em>Class Instance Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance Delete</em>'.
   * @generated
   */
  ClassInstanceDelete createClassInstanceDelete();

  /**
   * Returns a new object of class '<em>Class Instance Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance Get</em>'.
   * @generated
   */
  ClassInstanceGet createClassInstanceGet();

  /**
   * Returns a new object of class '<em>Class Instance Get All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance Get All</em>'.
   * @generated
   */
  ClassInstanceGetAll createClassInstanceGetAll();

  /**
   * Returns a new object of class '<em>Class Instance Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance Set</em>'.
   * @generated
   */
  ClassInstanceSet createClassInstanceSet();

  /**
   * Returns a new object of class '<em>Relation Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance</em>'.
   * @generated
   */
  RelationInstance createRelationInstance();

  /**
   * Returns a new object of class '<em>Relation Instance Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance Create</em>'.
   * @generated
   */
  RelationInstanceCreate createRelationInstanceCreate();

  /**
   * Returns a new object of class '<em>Relation Instance Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance Delete</em>'.
   * @generated
   */
  RelationInstanceDelete createRelationInstanceDelete();

  /**
   * Returns a new object of class '<em>Relation Instance Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance Get</em>'.
   * @generated
   */
  RelationInstanceGet createRelationInstanceGet();

  /**
   * Returns a new object of class '<em>Relation Instance Get All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance Get All</em>'.
   * @generated
   */
  RelationInstanceGetAll createRelationInstanceGetAll();

  /**
   * Returns a new object of class '<em>Relation Instance Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Instance Set</em>'.
   * @generated
   */
  RelationInstanceSet createRelationInstanceSet();

  /**
   * Returns a new object of class '<em>Attribute Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Operation</em>'.
   * @generated
   */
  AttributeOperation createAttributeOperation();

  /**
   * Returns a new object of class '<em>Attribute Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Get</em>'.
   * @generated
   */
  AttributeGet createAttributeGet();

  /**
   * Returns a new object of class '<em>Attribute Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Set</em>'.
   * @generated
   */
  AttributeSet createAttributeSet();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal Expression</em>'.
   * @generated
   */
  EqualExpression createEqualExpression();

  /**
   * Returns a new object of class '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Expression</em>'.
   * @generated
   */
  CompareExpression createCompareExpression();

  /**
   * Returns a new object of class '<em>Addition Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Expression</em>'.
   * @generated
   */
  AdditionExpression createAdditionExpression();

  /**
   * Returns a new object of class '<em>Multiplication Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Expression</em>'.
   * @generated
   */
  MultiplicationExpression createMultiplicationExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MMDSLPackage getMMDSLPackage();

} //MMDSLFactory
