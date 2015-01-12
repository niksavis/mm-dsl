/**
 */
package org.xtext.nv.dsl.mMDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage
 * @generated
 */
public class MMDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MMDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MMDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MMDSLSwitch<Adapter> modelSwitch =
    new MMDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseMethodName(MethodName object)
      {
        return createMethodNameAdapter();
      }
      @Override
      public Adapter caseIncludeLibrary(IncludeLibrary object)
      {
        return createIncludeLibraryAdapter();
      }
      @Override
      public Adapter caseIncludeLibraryType(IncludeLibraryType object)
      {
        return createIncludeLibraryTypeAdapter();
      }
      @Override
      public Adapter caseEmbedCode(EmbedCode object)
      {
        return createEmbedCodeAdapter();
      }
      @Override
      public Adapter caseEmbedPlatformType(EmbedPlatformType object)
      {
        return createEmbedPlatformTypeAdapter();
      }
      @Override
      public Adapter caseEmbedCodeType(EmbedCodeType object)
      {
        return createEmbedCodeTypeAdapter();
      }
      @Override
      public Adapter caseInsertEmbedCode(InsertEmbedCode object)
      {
        return createInsertEmbedCodeAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseMetamodel(Metamodel object)
      {
        return createMetamodelAdapter();
      }
      @Override
      public Adapter caseClass(org.xtext.nv.dsl.mMDSL.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseClassAttribute(ClassAttribute object)
      {
        return createClassAttributeAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseRefName(RefName object)
      {
        return createRefNameAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseEnumType(EnumType object)
      {
        return createEnumTypeAdapter();
      }
      @Override
      public Adapter caseModelType(ModelType object)
      {
        return createModelTypeAdapter();
      }
      @Override
      public Adapter caseMode(Mode object)
      {
        return createModeAdapter();
      }
      @Override
      public Adapter caseSymbolClass(SymbolClass object)
      {
        return createSymbolClassAdapter();
      }
      @Override
      public Adapter caseSymbolRelation(SymbolRelation object)
      {
        return createSymbolRelationAdapter();
      }
      @Override
      public Adapter caseSVGCommand(SVGCommand object)
      {
        return createSVGCommandAdapter();
      }
      @Override
      public Adapter caseRectangle(Rectangle object)
      {
        return createRectangleAdapter();
      }
      @Override
      public Adapter caseCircle(Circle object)
      {
        return createCircleAdapter();
      }
      @Override
      public Adapter caseEllipse(Ellipse object)
      {
        return createEllipseAdapter();
      }
      @Override
      public Adapter caseLine(Line object)
      {
        return createLineAdapter();
      }
      @Override
      public Adapter casePolyline(Polyline object)
      {
        return createPolylineAdapter();
      }
      @Override
      public Adapter casePolygon(Polygon object)
      {
        return createPolygonAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter casePathData(PathData object)
      {
        return createPathDataAdapter();
      }
      @Override
      public Adapter caseMoveTo(MoveTo object)
      {
        return createMoveToAdapter();
      }
      @Override
      public Adapter caseLineTo(LineTo object)
      {
        return createLineToAdapter();
      }
      @Override
      public Adapter caseHorizontalLineTo(HorizontalLineTo object)
      {
        return createHorizontalLineToAdapter();
      }
      @Override
      public Adapter caseVerticalLineTo(VerticalLineTo object)
      {
        return createVerticalLineToAdapter();
      }
      @Override
      public Adapter caseCurveTo(CurveTo object)
      {
        return createCurveToAdapter();
      }
      @Override
      public Adapter caseSmoothCurveTo(SmoothCurveTo object)
      {
        return createSmoothCurveToAdapter();
      }
      @Override
      public Adapter caseQuadraticBezierCurve(QuadraticBezierCurve object)
      {
        return createQuadraticBezierCurveAdapter();
      }
      @Override
      public Adapter caseSmoothQuadraticBezierCurveTo(SmoothQuadraticBezierCurveTo object)
      {
        return createSmoothQuadraticBezierCurveToAdapter();
      }
      @Override
      public Adapter caseEllipticalArc(EllipticalArc object)
      {
        return createEllipticalArcAdapter();
      }
      @Override
      public Adapter casePoints(Points object)
      {
        return createPointsAdapter();
      }
      @Override
      public Adapter casePathParametersHV(PathParametersHV object)
      {
        return createPathParametersHVAdapter();
      }
      @Override
      public Adapter casePathParametersMLT(PathParametersMLT object)
      {
        return createPathParametersMLTAdapter();
      }
      @Override
      public Adapter casePathParametersS(PathParametersS object)
      {
        return createPathParametersSAdapter();
      }
      @Override
      public Adapter casePathParametersQ(PathParametersQ object)
      {
        return createPathParametersQAdapter();
      }
      @Override
      public Adapter casePathParametersC(PathParametersC object)
      {
        return createPathParametersCAdapter();
      }
      @Override
      public Adapter casePathParametersA(PathParametersA object)
      {
        return createPathParametersAAdapter();
      }
      @Override
      public Adapter caseSymbolStyle(SymbolStyle object)
      {
        return createSymbolStyleAdapter();
      }
      @Override
      public Adapter caseFillColor(FillColor object)
      {
        return createFillColorAdapter();
      }
      @Override
      public Adapter caseStrokeColor(StrokeColor object)
      {
        return createStrokeColorAdapter();
      }
      @Override
      public Adapter caseFontFamily(FontFamily object)
      {
        return createFontFamilyAdapter();
      }
      @Override
      public Adapter caseAlgorithm(Algorithm object)
      {
        return createAlgorithmAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSelectionStatement(SelectionStatement object)
      {
        return createSelectionStatementAdapter();
      }
      @Override
      public Adapter caseLoopStatement(LoopStatement object)
      {
        return createLoopStatementAdapter();
      }
      @Override
      public Adapter caseWhileLoop(WhileLoop object)
      {
        return createWhileLoopAdapter();
      }
      @Override
      public Adapter caseForLoop(ForLoop object)
      {
        return createForLoopAdapter();
      }
      @Override
      public Adapter caseBreakContinue(BreakContinue object)
      {
        return createBreakContinueAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseVarStatement(VarStatement object)
      {
        return createVarStatementAdapter();
      }
      @Override
      public Adapter caseOperatorAssign(OperatorAssign object)
      {
        return createOperatorAssignAdapter();
      }
      @Override
      public Adapter caseOperatorMultyAssign(OperatorMultyAssign object)
      {
        return createOperatorMultyAssignAdapter();
      }
      @Override
      public Adapter caseOperatorUnary(OperatorUnary object)
      {
        return createOperatorUnaryAdapter();
      }
      @Override
      public Adapter caseOperatorMultiply(OperatorMultiply object)
      {
        return createOperatorMultiplyAdapter();
      }
      @Override
      public Adapter caseOperatorAdd(OperatorAdd object)
      {
        return createOperatorAddAdapter();
      }
      @Override
      public Adapter caseOperatorCompare(OperatorCompare object)
      {
        return createOperatorCompareAdapter();
      }
      @Override
      public Adapter caseOperatorEqual(OperatorEqual object)
      {
        return createOperatorEqualAdapter();
      }
      @Override
      public Adapter caseOperatorAnd(OperatorAnd object)
      {
        return createOperatorAndAdapter();
      }
      @Override
      public Adapter caseOperatorOr(OperatorOr object)
      {
        return createOperatorOrAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAlgorithmOperation(AlgorithmOperation object)
      {
        return createAlgorithmOperationAdapter();
      }
      @Override
      public Adapter caseFileOperation(FileOperation object)
      {
        return createFileOperationAdapter();
      }
      @Override
      public Adapter caseFileCopy(FileCopy object)
      {
        return createFileCopyAdapter();
      }
      @Override
      public Adapter caseFileDelete(FileDelete object)
      {
        return createFileDeleteAdapter();
      }
      @Override
      public Adapter caseFileCreate(FileCreate object)
      {
        return createFileCreateAdapter();
      }
      @Override
      public Adapter caseFileRead(FileRead object)
      {
        return createFileReadAdapter();
      }
      @Override
      public Adapter caseFileWrite(FileWrite object)
      {
        return createFileWriteAdapter();
      }
      @Override
      public Adapter caseDirOperation(DirOperation object)
      {
        return createDirOperationAdapter();
      }
      @Override
      public Adapter caseDirSetWorking(DirSetWorking object)
      {
        return createDirSetWorkingAdapter();
      }
      @Override
      public Adapter caseDirGetWorking(DirGetWorking object)
      {
        return createDirGetWorkingAdapter();
      }
      @Override
      public Adapter caseDirCreate(DirCreate object)
      {
        return createDirCreateAdapter();
      }
      @Override
      public Adapter caseDirDelete(DirDelete object)
      {
        return createDirDeleteAdapter();
      }
      @Override
      public Adapter caseDirList(DirList object)
      {
        return createDirListAdapter();
      }
      @Override
      public Adapter caseSimpleUI(SimpleUI object)
      {
        return createSimpleUIAdapter();
      }
      @Override
      public Adapter caseEditBox(EditBox object)
      {
        return createEditBoxAdapter();
      }
      @Override
      public Adapter caseInfoBox(InfoBox object)
      {
        return createInfoBoxAdapter();
      }
      @Override
      public Adapter caseErrorBox(ErrorBox object)
      {
        return createErrorBoxAdapter();
      }
      @Override
      public Adapter caseWarningBox(WarningBox object)
      {
        return createWarningBoxAdapter();
      }
      @Override
      public Adapter caseViewBox(ViewBox object)
      {
        return createViewBoxAdapter();
      }
      @Override
      public Adapter caseItemOperation(ItemOperation object)
      {
        return createItemOperationAdapter();
      }
      @Override
      public Adapter caseMenuItem(MenuItem object)
      {
        return createMenuItemAdapter();
      }
      @Override
      public Adapter caseInsertMenuItem(InsertMenuItem object)
      {
        return createInsertMenuItemAdapter();
      }
      @Override
      public Adapter caseRemoveMenuItem(RemoveMenuItem object)
      {
        return createRemoveMenuItemAdapter();
      }
      @Override
      public Adapter caseContextItem(ContextItem object)
      {
        return createContextItemAdapter();
      }
      @Override
      public Adapter caseInsertContextItem(InsertContextItem object)
      {
        return createInsertContextItemAdapter();
      }
      @Override
      public Adapter caseRemoveContextItem(RemoveContextItem object)
      {
        return createRemoveContextItemAdapter();
      }
      @Override
      public Adapter caseModelOperation(ModelOperation object)
      {
        return createModelOperationAdapter();
      }
      @Override
      public Adapter caseModelCreate(ModelCreate object)
      {
        return createModelCreateAdapter();
      }
      @Override
      public Adapter caseModelDelete(ModelDelete object)
      {
        return createModelDeleteAdapter();
      }
      @Override
      public Adapter caseModelDiscard(ModelDiscard object)
      {
        return createModelDiscardAdapter();
      }
      @Override
      public Adapter caseModelSave(ModelSave object)
      {
        return createModelSaveAdapter();
      }
      @Override
      public Adapter caseModelLoad(ModelLoad object)
      {
        return createModelLoadAdapter();
      }
      @Override
      public Adapter caseModelIsLoaded(ModelIsLoaded object)
      {
        return createModelIsLoadedAdapter();
      }
      @Override
      public Adapter caseInstanceOperation(InstanceOperation object)
      {
        return createInstanceOperationAdapter();
      }
      @Override
      public Adapter caseClassInstance(ClassInstance object)
      {
        return createClassInstanceAdapter();
      }
      @Override
      public Adapter caseClassInstanceCreate(ClassInstanceCreate object)
      {
        return createClassInstanceCreateAdapter();
      }
      @Override
      public Adapter caseClassInstanceDelete(ClassInstanceDelete object)
      {
        return createClassInstanceDeleteAdapter();
      }
      @Override
      public Adapter caseClassInstanceGet(ClassInstanceGet object)
      {
        return createClassInstanceGetAdapter();
      }
      @Override
      public Adapter caseClassInstanceGetAll(ClassInstanceGetAll object)
      {
        return createClassInstanceGetAllAdapter();
      }
      @Override
      public Adapter caseClassInstanceSet(ClassInstanceSet object)
      {
        return createClassInstanceSetAdapter();
      }
      @Override
      public Adapter caseRelationInstance(RelationInstance object)
      {
        return createRelationInstanceAdapter();
      }
      @Override
      public Adapter caseRelationInstanceCreate(RelationInstanceCreate object)
      {
        return createRelationInstanceCreateAdapter();
      }
      @Override
      public Adapter caseRelationInstanceDelete(RelationInstanceDelete object)
      {
        return createRelationInstanceDeleteAdapter();
      }
      @Override
      public Adapter caseRelationInstanceGet(RelationInstanceGet object)
      {
        return createRelationInstanceGetAdapter();
      }
      @Override
      public Adapter caseRelationInstanceGetAll(RelationInstanceGetAll object)
      {
        return createRelationInstanceGetAllAdapter();
      }
      @Override
      public Adapter caseRelationInstanceSet(RelationInstanceSet object)
      {
        return createRelationInstanceSetAdapter();
      }
      @Override
      public Adapter caseAttributeOperation(AttributeOperation object)
      {
        return createAttributeOperationAdapter();
      }
      @Override
      public Adapter caseAttributeGet(AttributeGet object)
      {
        return createAttributeGetAdapter();
      }
      @Override
      public Adapter caseAttributeSet(AttributeSet object)
      {
        return createAttributeSetAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseEqualExpression(EqualExpression object)
      {
        return createEqualExpressionAdapter();
      }
      @Override
      public Adapter caseCompareExpression(CompareExpression object)
      {
        return createCompareExpressionAdapter();
      }
      @Override
      public Adapter caseAdditionExpression(AdditionExpression object)
      {
        return createAdditionExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicationExpression(MultiplicationExpression object)
      {
        return createMultiplicationExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.MethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.MethodName
   * @generated
   */
  public Adapter createMethodNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary <em>Include Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibrary
   * @generated
   */
  public Adapter createIncludeLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.IncludeLibraryType <em>Include Library Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibraryType
   * @generated
   */
  public Adapter createIncludeLibraryTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EmbedCode <em>Embed Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode
   * @generated
   */
  public Adapter createEmbedCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EmbedPlatformType <em>Embed Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EmbedPlatformType
   * @generated
   */
  public Adapter createEmbedPlatformTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EmbedCodeType <em>Embed Code Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCodeType
   * @generated
   */
  public Adapter createEmbedCodeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode <em>Insert Embed Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.InsertEmbedCode
   * @generated
   */
  public Adapter createInsertEmbedCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel
   * @generated
   */
  public Adapter createMetamodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassAttribute <em>Class Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassAttribute
   * @generated
   */
  public Adapter createClassAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RefName <em>Ref Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RefName
   * @generated
   */
  public Adapter createRefNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EnumType
   * @generated
   */
  public Adapter createEnumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelType
   * @generated
   */
  public Adapter createModelTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Mode
   * @generated
   */
  public Adapter createModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SymbolClass <em>Symbol Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SymbolClass
   * @generated
   */
  public Adapter createSymbolClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation <em>Symbol Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation
   * @generated
   */
  public Adapter createSymbolRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SVGCommand <em>SVG Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand
   * @generated
   */
  public Adapter createSVGCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle
   * @generated
   */
  public Adapter createRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Circle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Circle
   * @generated
   */
  public Adapter createCircleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse
   * @generated
   */
  public Adapter createEllipseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Line
   * @generated
   */
  public Adapter createLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Polyline
   * @generated
   */
  public Adapter createPolylineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Polygon
   * @generated
   */
  public Adapter createPolygonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathData <em>Path Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathData
   * @generated
   */
  public Adapter createPathDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.MoveTo <em>Move To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.MoveTo
   * @generated
   */
  public Adapter createMoveToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.LineTo <em>Line To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.LineTo
   * @generated
   */
  public Adapter createLineToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.HorizontalLineTo <em>Horizontal Line To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.HorizontalLineTo
   * @generated
   */
  public Adapter createHorizontalLineToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.VerticalLineTo <em>Vertical Line To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.VerticalLineTo
   * @generated
   */
  public Adapter createVerticalLineToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.CurveTo <em>Curve To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.CurveTo
   * @generated
   */
  public Adapter createCurveToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SmoothCurveTo <em>Smooth Curve To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SmoothCurveTo
   * @generated
   */
  public Adapter createSmoothCurveToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve <em>Quadratic Bezier Curve</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve
   * @generated
   */
  public Adapter createQuadraticBezierCurveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo <em>Smooth Quadratic Bezier Curve To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo
   * @generated
   */
  public Adapter createSmoothQuadraticBezierCurveToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EllipticalArc <em>Elliptical Arc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EllipticalArc
   * @generated
   */
  public Adapter createEllipticalArcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Points
   * @generated
   */
  public Adapter createPointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersHV <em>Path Parameters HV</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersHV
   * @generated
   */
  public Adapter createPathParametersHVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersMLT <em>Path Parameters MLT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersMLT
   * @generated
   */
  public Adapter createPathParametersMLTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersS <em>Path Parameters S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS
   * @generated
   */
  public Adapter createPathParametersSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ <em>Path Parameters Q</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ
   * @generated
   */
  public Adapter createPathParametersQAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersC <em>Path Parameters C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC
   * @generated
   */
  public Adapter createPathParametersCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.PathParametersA <em>Path Parameters A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA
   * @generated
   */
  public Adapter createPathParametersAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle <em>Symbol Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle
   * @generated
   */
  public Adapter createSymbolStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FillColor <em>Fill Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FillColor
   * @generated
   */
  public Adapter createFillColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.StrokeColor <em>Stroke Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.StrokeColor
   * @generated
   */
  public Adapter createStrokeColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FontFamily <em>Font Family</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FontFamily
   * @generated
   */
  public Adapter createFontFamilyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Algorithm <em>Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Algorithm
   * @generated
   */
  public Adapter createAlgorithmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement <em>Selection Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement
   * @generated
   */
  public Adapter createSelectionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.LoopStatement
   * @generated
   */
  public Adapter createLoopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.WhileLoop <em>While Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.WhileLoop
   * @generated
   */
  public Adapter createWhileLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop
   * @generated
   */
  public Adapter createForLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.BreakContinue <em>Break Continue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.BreakContinue
   * @generated
   */
  public Adapter createBreakContinueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.VarStatement <em>Var Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement
   * @generated
   */
  public Adapter createVarStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign <em>Operator Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAssign
   * @generated
   */
  public Adapter createOperatorAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign <em>Operator Multy Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign
   * @generated
   */
  public Adapter createOperatorMultyAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorUnary <em>Operator Unary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorUnary
   * @generated
   */
  public Adapter createOperatorUnaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply <em>Operator Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultiply
   * @generated
   */
  public Adapter createOperatorMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd <em>Operator Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAdd
   * @generated
   */
  public Adapter createOperatorAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare <em>Operator Compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare
   * @generated
   */
  public Adapter createOperatorCompareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual <em>Operator Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorEqual
   * @generated
   */
  public Adapter createOperatorEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorAnd <em>Operator And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAnd
   * @generated
   */
  public Adapter createOperatorAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OperatorOr <em>Operator Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OperatorOr
   * @generated
   */
  public Adapter createOperatorOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation <em>Algorithm Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation
   * @generated
   */
  public Adapter createAlgorithmOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileOperation <em>File Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation
   * @generated
   */
  public Adapter createFileOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileCopy <em>File Copy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileCopy
   * @generated
   */
  public Adapter createFileCopyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileDelete <em>File Delete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileDelete
   * @generated
   */
  public Adapter createFileDeleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileCreate <em>File Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileCreate
   * @generated
   */
  public Adapter createFileCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileRead <em>File Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileRead
   * @generated
   */
  public Adapter createFileReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.FileWrite <em>File Write</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.FileWrite
   * @generated
   */
  public Adapter createFileWriteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirOperation <em>Dir Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation
   * @generated
   */
  public Adapter createDirOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirSetWorking <em>Dir Set Working</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirSetWorking
   * @generated
   */
  public Adapter createDirSetWorkingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirGetWorking <em>Dir Get Working</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirGetWorking
   * @generated
   */
  public Adapter createDirGetWorkingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirCreate <em>Dir Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirCreate
   * @generated
   */
  public Adapter createDirCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirDelete <em>Dir Delete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirDelete
   * @generated
   */
  public Adapter createDirDeleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.DirList <em>Dir List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.DirList
   * @generated
   */
  public Adapter createDirListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.SimpleUI <em>Simple UI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI
   * @generated
   */
  public Adapter createSimpleUIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EditBox <em>Edit Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EditBox
   * @generated
   */
  public Adapter createEditBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.InfoBox <em>Info Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.InfoBox
   * @generated
   */
  public Adapter createInfoBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ErrorBox <em>Error Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ErrorBox
   * @generated
   */
  public Adapter createErrorBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.WarningBox <em>Warning Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.WarningBox
   * @generated
   */
  public Adapter createWarningBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ViewBox <em>View Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ViewBox
   * @generated
   */
  public Adapter createViewBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ItemOperation <em>Item Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ItemOperation
   * @generated
   */
  public Adapter createItemOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.MenuItem <em>Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.MenuItem
   * @generated
   */
  public Adapter createMenuItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.InsertMenuItem <em>Insert Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.InsertMenuItem
   * @generated
   */
  public Adapter createInsertMenuItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RemoveMenuItem <em>Remove Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RemoveMenuItem
   * @generated
   */
  public Adapter createRemoveMenuItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ContextItem <em>Context Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ContextItem
   * @generated
   */
  public Adapter createContextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.InsertContextItem <em>Insert Context Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.InsertContextItem
   * @generated
   */
  public Adapter createInsertContextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RemoveContextItem <em>Remove Context Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RemoveContextItem
   * @generated
   */
  public Adapter createRemoveContextItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelOperation <em>Model Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation
   * @generated
   */
  public Adapter createModelOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelCreate <em>Model Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelCreate
   * @generated
   */
  public Adapter createModelCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelDelete <em>Model Delete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelDelete
   * @generated
   */
  public Adapter createModelDeleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelDiscard <em>Model Discard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelDiscard
   * @generated
   */
  public Adapter createModelDiscardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelSave <em>Model Save</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelSave
   * @generated
   */
  public Adapter createModelSaveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelLoad <em>Model Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelLoad
   * @generated
   */
  public Adapter createModelLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ModelIsLoaded <em>Model Is Loaded</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ModelIsLoaded
   * @generated
   */
  public Adapter createModelIsLoadedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation <em>Instance Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.InstanceOperation
   * @generated
   */
  public Adapter createInstanceOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstance <em>Class Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance
   * @generated
   */
  public Adapter createClassInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate <em>Class Instance Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceCreate
   * @generated
   */
  public Adapter createClassInstanceCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceDelete <em>Class Instance Delete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceDelete
   * @generated
   */
  public Adapter createClassInstanceDeleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGet <em>Class Instance Get</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGet
   * @generated
   */
  public Adapter createClassInstanceGetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll <em>Class Instance Get All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll
   * @generated
   */
  public Adapter createClassInstanceGetAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceSet <em>Class Instance Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceSet
   * @generated
   */
  public Adapter createClassInstanceSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstance <em>Relation Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance
   * @generated
   */
  public Adapter createRelationInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate <em>Relation Instance Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate
   * @generated
   */
  public Adapter createRelationInstanceCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceDelete <em>Relation Instance Delete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceDelete
   * @generated
   */
  public Adapter createRelationInstanceDeleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGet <em>Relation Instance Get</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGet
   * @generated
   */
  public Adapter createRelationInstanceGetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll <em>Relation Instance Get All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll
   * @generated
   */
  public Adapter createRelationInstanceGetAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceSet <em>Relation Instance Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceSet
   * @generated
   */
  public Adapter createRelationInstanceSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation <em>Attribute Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AttributeOperation
   * @generated
   */
  public Adapter createAttributeOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AttributeGet <em>Attribute Get</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AttributeGet
   * @generated
   */
  public Adapter createAttributeGetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AttributeSet <em>Attribute Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet
   * @generated
   */
  public Adapter createAttributeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.EqualExpression <em>Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.EqualExpression
   * @generated
   */
  public Adapter createEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.CompareExpression
   * @generated
   */
  public Adapter createCompareExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.AdditionExpression
   * @generated
   */
  public Adapter createAdditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.nv.dsl.mMDSL.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.nv.dsl.mMDSL.MultiplicationExpression
   * @generated
   */
  public Adapter createMultiplicationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MMDSLAdapterFactory
