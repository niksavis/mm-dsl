package org.xtext.nv.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
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
import org.xtext.nv.dsl.services.MMDSLGrammarAccess;

@SuppressWarnings("all")
public class MMDSLSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private MMDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MMDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MMDSLPackage.ADDITION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_AdditionExpression(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ALGORITHM:
				if(context == grammarAccess.getAlgorithmRule()) {
					sequence_Algorithm(context, (Algorithm) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ALGORITHM_OPERATION:
				if(context == grammarAccess.getAlgorithmOperationRule()) {
					sequence_AlgorithmOperation(context, (AlgorithmOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ATTRIBUTE_GET:
				if(context == grammarAccess.getAttributeGetRule()) {
					sequence_AttributeGet(context, (AttributeGet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ATTRIBUTE_OPERATION:
				if(context == grammarAccess.getAttributeOperationRule()) {
					sequence_AttributeOperation(context, (AttributeOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ATTRIBUTE_SET:
				if(context == grammarAccess.getAttributeSetRule()) {
					sequence_AttributeSet(context, (AttributeSet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.BREAK_CONTINUE:
				if(context == grammarAccess.getBreakContinueRule()) {
					sequence_BreakContinue(context, (BreakContinue) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CIRCLE:
				if(context == grammarAccess.getCircleRule()) {
					sequence_Circle(context, (Circle) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (org.xtext.nv.dsl.mMDSL.Class) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_ATTRIBUTE:
				if(context == grammarAccess.getClassAttributeRule()) {
					sequence_ClassAttribute(context, (ClassAttribute) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE:
				if(context == grammarAccess.getClassInstanceRule()) {
					sequence_ClassInstance(context, (ClassInstance) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE_CREATE:
				if(context == grammarAccess.getClassInstanceCreateRule()) {
					sequence_ClassInstanceCreate(context, (ClassInstanceCreate) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE_DELETE:
				if(context == grammarAccess.getClassInstanceDeleteRule()) {
					sequence_ClassInstanceDelete(context, (ClassInstanceDelete) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE_GET:
				if(context == grammarAccess.getClassInstanceGetRule()) {
					sequence_ClassInstanceGet(context, (ClassInstanceGet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE_GET_ALL:
				if(context == grammarAccess.getClassInstanceGetAllRule()) {
					sequence_ClassInstanceGetAll(context, (ClassInstanceGetAll) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CLASS_INSTANCE_SET:
				if(context == grammarAccess.getClassInstanceSetRule()) {
					sequence_ClassInstanceSet(context, (ClassInstanceSet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_CompareExpression(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CONTEXT_ITEM:
				if(context == grammarAccess.getContextItemRule()) {
					sequence_ContextItem(context, (ContextItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.CURVE_TO:
				if(context == grammarAccess.getCurveToRule()) {
					sequence_CurveTo(context, (CurveTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_CREATE:
				if(context == grammarAccess.getDirCreateRule()) {
					sequence_DirCreate(context, (DirCreate) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_DELETE:
				if(context == grammarAccess.getDirDeleteRule()) {
					sequence_DirDelete(context, (DirDelete) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_GET_WORKING:
				if(context == grammarAccess.getDirGetWorkingRule()) {
					sequence_DirGetWorking(context, (DirGetWorking) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_LIST:
				if(context == grammarAccess.getDirListRule()) {
					sequence_DirList(context, (DirList) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_OPERATION:
				if(context == grammarAccess.getDirOperationRule()) {
					sequence_DirOperation(context, (DirOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.DIR_SET_WORKING:
				if(context == grammarAccess.getDirSetWorkingRule()) {
					sequence_DirSetWorking(context, (DirSetWorking) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EDIT_BOX:
				if(context == grammarAccess.getEditBoxRule()) {
					sequence_EditBox(context, (EditBox) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ELLIPSE:
				if(context == grammarAccess.getEllipseRule()) {
					sequence_Ellipse(context, (Ellipse) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ELLIPTICAL_ARC:
				if(context == grammarAccess.getEllipticalArcRule()) {
					sequence_EllipticalArc(context, (EllipticalArc) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EMBED_CODE:
				if(context == grammarAccess.getEmbedCodeRule()) {
					sequence_EmbedCode(context, (EmbedCode) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EMBED_CODE_TYPE:
				if(context == grammarAccess.getEmbedCodeTypeRule()) {
					sequence_EmbedCodeType(context, (EmbedCodeType) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EMBED_PLATFORM_TYPE:
				if(context == grammarAccess.getEmbedPlatformTypeRule()) {
					sequence_EmbedPlatformType(context, (EmbedPlatformType) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ENUM_TYPE:
				if(context == grammarAccess.getEnumTypeRule()) {
					sequence_EnumType(context, (EnumType) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ENUMERATION:
				if(context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EQUAL_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_EqualExpression(context, (EqualExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ERROR_BOX:
				if(context == grammarAccess.getErrorBoxRule()) {
					sequence_ErrorBox(context, (ErrorBox) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.EXPRESSION:
				if(context == grammarAccess.getAtomicExpressionRule()) {
					sequence_AtomicExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_COPY:
				if(context == grammarAccess.getFileCopyRule()) {
					sequence_FileCopy(context, (FileCopy) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_CREATE:
				if(context == grammarAccess.getFileCreateRule()) {
					sequence_FileCreate(context, (FileCreate) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_DELETE:
				if(context == grammarAccess.getFileDeleteRule()) {
					sequence_FileDelete(context, (FileDelete) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_OPERATION:
				if(context == grammarAccess.getFileOperationRule()) {
					sequence_FileOperation(context, (FileOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_READ:
				if(context == grammarAccess.getFileReadRule()) {
					sequence_FileRead(context, (FileRead) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILE_WRITE:
				if(context == grammarAccess.getFileWriteRule()) {
					sequence_FileWrite(context, (FileWrite) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FILL_COLOR:
				if(context == grammarAccess.getFillColorRule()) {
					sequence_FillColor(context, (FillColor) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FONT_FAMILY:
				if(context == grammarAccess.getFontFamilyRule()) {
					sequence_FontFamily(context, (FontFamily) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.FOR_LOOP:
				if(context == grammarAccess.getForLoopRule()) {
					sequence_ForLoop(context, (ForLoop) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.HORIZONTAL_LINE_TO:
				if(context == grammarAccess.getHorizontalLineToRule()) {
					sequence_HorizontalLineTo(context, (HorizontalLineTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INCLUDE_LIBRARY:
				if(context == grammarAccess.getIncludeLibraryRule()) {
					sequence_IncludeLibrary(context, (IncludeLibrary) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INCLUDE_LIBRARY_TYPE:
				if(context == grammarAccess.getIncludeLibraryTypeRule()) {
					sequence_IncludeLibraryType(context, (IncludeLibraryType) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INFO_BOX:
				if(context == grammarAccess.getInfoBoxRule()) {
					sequence_InfoBox(context, (InfoBox) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INSERT_CONTEXT_ITEM:
				if(context == grammarAccess.getInsertContextItemRule()) {
					sequence_InsertContextItem(context, (InsertContextItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INSERT_EMBED_CODE:
				if(context == grammarAccess.getInsertEmbedCodeRule()) {
					sequence_InsertEmbedCode(context, (InsertEmbedCode) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INSERT_MENU_ITEM:
				if(context == grammarAccess.getInsertMenuItemRule()) {
					sequence_InsertMenuItem(context, (InsertMenuItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.INSTANCE_OPERATION:
				if(context == grammarAccess.getInstanceOperationRule()) {
					sequence_InstanceOperation(context, (InstanceOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ITEM_OPERATION:
				if(context == grammarAccess.getItemOperationRule()) {
					sequence_ItemOperation(context, (ItemOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.LINE:
				if(context == grammarAccess.getLineRule()) {
					sequence_Line(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.LINE_TO:
				if(context == grammarAccess.getLineToRule()) {
					sequence_LineTo(context, (LineTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.LOOP_STATEMENT:
				if(context == grammarAccess.getLoopStatementRule()) {
					sequence_LoopStatement(context, (LoopStatement) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MENU_ITEM:
				if(context == grammarAccess.getMenuItemRule()) {
					sequence_MenuItem(context, (MenuItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.METAMODEL:
				if(context == grammarAccess.getMetamodelRule()) {
					sequence_Metamodel(context, (Metamodel) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.METHOD_NAME:
				if(context == grammarAccess.getMethodNameRule()) {
					sequence_MethodName(context, (MethodName) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODE:
				if(context == grammarAccess.getModeRule()) {
					sequence_Mode(context, (Mode) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_CREATE:
				if(context == grammarAccess.getModelCreateRule()) {
					sequence_ModelCreate(context, (ModelCreate) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_DELETE:
				if(context == grammarAccess.getModelDeleteRule()) {
					sequence_ModelDelete(context, (ModelDelete) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_DISCARD:
				if(context == grammarAccess.getModelDiscardRule()) {
					sequence_ModelDiscard(context, (ModelDiscard) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_IS_LOADED:
				if(context == grammarAccess.getModelIsLoadedRule()) {
					sequence_ModelIsLoaded(context, (ModelIsLoaded) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_LOAD:
				if(context == grammarAccess.getModelLoadRule()) {
					sequence_ModelLoad(context, (ModelLoad) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_OPERATION:
				if(context == grammarAccess.getModelOperationRule()) {
					sequence_ModelOperation(context, (ModelOperation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_SAVE:
				if(context == grammarAccess.getModelSaveRule()) {
					sequence_ModelSave(context, (ModelSave) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MODEL_TYPE:
				if(context == grammarAccess.getModelTypeRule()) {
					sequence_ModelType(context, (ModelType) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MOVE_TO:
				if(context == grammarAccess.getMoveToRule()) {
					sequence_MoveTo(context, (MoveTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.MULTIPLICATION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_MultiplicationExpression(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_ADD:
				if(context == grammarAccess.getOperatorAddRule()) {
					sequence_OperatorAdd(context, (OperatorAdd) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_AND:
				if(context == grammarAccess.getOperatorAndRule()) {
					sequence_OperatorAnd(context, (OperatorAnd) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_ASSIGN:
				if(context == grammarAccess.getOperatorAssignRule()) {
					sequence_OperatorAssign(context, (OperatorAssign) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_COMPARE:
				if(context == grammarAccess.getOperatorCompareRule()) {
					sequence_OperatorCompare(context, (OperatorCompare) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_EQUAL:
				if(context == grammarAccess.getOperatorEqualRule()) {
					sequence_OperatorEqual(context, (OperatorEqual) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_MULTIPLY:
				if(context == grammarAccess.getOperatorMultiplyRule()) {
					sequence_OperatorMultiply(context, (OperatorMultiply) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_MULTY_ASSIGN:
				if(context == grammarAccess.getOperatorMultyAssignRule()) {
					sequence_OperatorMultyAssign(context, (OperatorMultyAssign) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_OR:
				if(context == grammarAccess.getOperatorOrRule()) {
					sequence_OperatorOr(context, (OperatorOr) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OPERATOR_UNARY:
				if(context == grammarAccess.getOperatorUnaryRule()) {
					sequence_OperatorUnary(context, (OperatorUnary) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.OR_EXPRESSION:
				if(context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0_0_0()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH:
				if(context == grammarAccess.getPathRule()) {
					sequence_Path(context, (Path) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_DATA:
				if(context == grammarAccess.getPathDataRule()) {
					sequence_PathData(context, (PathData) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_A:
				if(context == grammarAccess.getPathParametersARule()) {
					sequence_PathParametersA(context, (PathParametersA) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_C:
				if(context == grammarAccess.getPathParametersCRule()) {
					sequence_PathParametersC(context, (PathParametersC) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_HV:
				if(context == grammarAccess.getPathParametersHVRule()) {
					sequence_PathParametersHV(context, (PathParametersHV) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_MLT:
				if(context == grammarAccess.getPathParametersMLTRule()) {
					sequence_PathParametersMLT(context, (PathParametersMLT) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_Q:
				if(context == grammarAccess.getPathParametersQRule()) {
					sequence_PathParametersQ(context, (PathParametersQ) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.PATH_PARAMETERS_S:
				if(context == grammarAccess.getPathParametersSRule()) {
					sequence_PathParametersS(context, (PathParametersS) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.POINTS:
				if(context == grammarAccess.getPointsRule()) {
					sequence_Points(context, (Points) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.POLYGON:
				if(context == grammarAccess.getPolygonRule()) {
					sequence_Polygon(context, (Polygon) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.POLYLINE:
				if(context == grammarAccess.getPolylineRule()) {
					sequence_Polyline(context, (Polyline) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.QUADRATIC_BEZIER_CURVE:
				if(context == grammarAccess.getQuadraticBezierCurveRule()) {
					sequence_QuadraticBezierCurve(context, (QuadraticBezierCurve) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RECTANGLE:
				if(context == grammarAccess.getRectangleRule()) {
					sequence_Rectangle(context, (Rectangle) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.REF_NAME:
				if(context == grammarAccess.getRefNameRule()) {
					sequence_RefName(context, (RefName) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION:
				if(context == grammarAccess.getRelationRule()) {
					sequence_Relation(context, (Relation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE:
				if(context == grammarAccess.getRelationInstanceRule()) {
					sequence_RelationInstance(context, (RelationInstance) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE_CREATE:
				if(context == grammarAccess.getRelationInstanceCreateRule()) {
					sequence_RelationInstanceCreate(context, (RelationInstanceCreate) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE_DELETE:
				if(context == grammarAccess.getRelationInstanceDeleteRule()) {
					sequence_RelationInstanceDelete(context, (RelationInstanceDelete) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE_GET:
				if(context == grammarAccess.getRelationInstanceGetRule()) {
					sequence_RelationInstanceGet(context, (RelationInstanceGet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE_GET_ALL:
				if(context == grammarAccess.getRelationInstanceGetAllRule()) {
					sequence_RelationInstanceGetAll(context, (RelationInstanceGetAll) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.RELATION_INSTANCE_SET:
				if(context == grammarAccess.getRelationInstanceSetRule()) {
					sequence_RelationInstanceSet(context, (RelationInstanceSet) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.REMOVE_CONTEXT_ITEM:
				if(context == grammarAccess.getRemoveContextItemRule()) {
					sequence_RemoveContextItem(context, (RemoveContextItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.REMOVE_MENU_ITEM:
				if(context == grammarAccess.getRemoveMenuItemRule()) {
					sequence_RemoveMenuItem(context, (RemoveMenuItem) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.ROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SVG_COMMAND:
				if(context == grammarAccess.getSVGCommandRule()) {
					sequence_SVGCommand(context, (SVGCommand) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SELECTION_STATEMENT:
				if(context == grammarAccess.getSelectionStatementRule()) {
					sequence_SelectionStatement(context, (SelectionStatement) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SIMPLE_UI:
				if(context == grammarAccess.getSimpleUIRule()) {
					sequence_SimpleUI(context, (SimpleUI) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SMOOTH_CURVE_TO:
				if(context == grammarAccess.getSmoothCurveToRule()) {
					sequence_SmoothCurveTo(context, (SmoothCurveTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SMOOTH_QUADRATIC_BEZIER_CURVE_TO:
				if(context == grammarAccess.getSmoothQuadraticBezierCurveToRule()) {
					sequence_SmoothQuadraticBezierCurveTo(context, (SmoothQuadraticBezierCurveTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.STROKE_COLOR:
				if(context == grammarAccess.getStrokeColorRule()) {
					sequence_StrokeColor(context, (StrokeColor) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SYMBOL_CLASS:
				if(context == grammarAccess.getSymbolClassRule()) {
					sequence_SymbolClass(context, (SymbolClass) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SYMBOL_RELATION:
				if(context == grammarAccess.getSymbolRelationRule()) {
					sequence_SymbolRelation(context, (SymbolRelation) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.SYMBOL_STYLE:
				if(context == grammarAccess.getSymbolStyleRule()) {
					sequence_SymbolStyle(context, (SymbolStyle) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.TEXT:
				if(context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.VAR_STATEMENT:
				if(context == grammarAccess.getVarStatementRule()) {
					sequence_VarStatement(context, (VarStatement) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.VERTICAL_LINE_TO:
				if(context == grammarAccess.getVerticalLineToRule()) {
					sequence_VerticalLineTo(context, (VerticalLineTo) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.VIEW_BOX:
				if(context == grammarAccess.getViewBoxRule()) {
					sequence_ViewBox(context, (ViewBox) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.WARNING_BOX:
				if(context == grammarAccess.getWarningBoxRule()) {
					sequence_WarningBox(context, (WarningBox) semanticObject); 
					return; 
				}
				else break;
			case MMDSLPackage.WHILE_LOOP:
				if(context == grammarAccess.getWhileLoopRule()) {
					sequence_WhileLoop(context, (WhileLoop) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XLIST_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXListLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSET_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSetLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_DECLARATION:
				if(context == grammarAccess.getXImportDeclarationRule()) {
					sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_SECTION:
				if(context == grammarAccess.getXImportSectionRule()) {
					sequence_XImportSection(context, (XImportSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AdditionExpression_AdditionExpression_1_0_0_0 op=OperatorAdd right=MultiplicationExpression)
	 */
	protected void sequence_AdditionExpression(EObject context, AdditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fileoperation=FileOperation | 
	 *         diroperation=DirOperation | 
	 *         simpleui=SimpleUI | 
	 *         modeloperation=ModelOperation | 
	 *         instanceoperation=InstanceOperation | 
	 *         attributeoperation=AttributeOperation
	 *     )
	 */
	protected void sequence_AlgorithmOperation(EObject context, AlgorithmOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID stmnt+=Statement*)
	 */
	protected void sequence_Algorithm(EObject context, Algorithm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndExpression_AndExpression_1_0_0_0 op=OperatorAnd right=EqualExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (true='true' | false='false' | variable=[Variable|QualifiedName] | valueString=STRING | valueRealNumber=RealNumber)
	 */
	protected void sequence_AtomicExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attrgetparams=AttrGetParams
	 */
	protected void sequence_AttributeGet(EObject context, AttributeGet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getAttributeGet_Attrgetparams()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getAttributeGet_Attrgetparams()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeGetAccess().getAttrgetparamsAttrGetParamsEnumRuleCall_2_0(), semanticObject.getAttrgetparams());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attributename=[Attribute|QualifiedName] (attributeget=AttributeGet | attributeset=AttributeSet))
	 */
	protected void sequence_AttributeOperation(EObject context, AttributeOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attrsetparams=AttrSetParams (valueString=STRING | valueRealNumber=RealNumber | valueVariable=[Variable|QualifiedName]))
	 */
	protected void sequence_AttributeSet(EObject context, AttributeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=Type access=AccessType?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (break='break' | continue='continue')
	 */
	protected void sequence_BreakContinue(EObject context, BreakContinue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cx=RealNumber cy=RealNumber r=Number)
	 */
	protected void sequence_Circle(EObject context, Circle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getCircle_Cx()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getCircle_Cx()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getCircle_Cy()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getCircle_Cy()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getCircle_R()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getCircle_R()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCircleAccess().getCxRealNumberParserRuleCall_3_0(), semanticObject.getCx());
		feeder.accept(grammarAccess.getCircleAccess().getCyRealNumberParserRuleCall_6_0(), semanticObject.getCy());
		feeder.accept(grammarAccess.getCircleAccess().getRNumberParserRuleCall_9_0(), semanticObject.getR());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=Type)
	 */
	protected void sequence_ClassAttribute(EObject context, ClassAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassAttribute_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassAttribute_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassAttribute_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassAttribute_Type()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassAttributeAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getClassAttributeAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID nameofclass=[Class|QualifiedName])
	 */
	protected void sequence_ClassInstanceCreate(EObject context, ClassInstanceCreate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceCreate_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceCreate_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceCreate_Nameofclass()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceCreate_Nameofclass()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassInstanceCreateAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getClassInstanceCreateAccess().getNameofclassClassQualifiedNameParserRuleCall_2_0_1(), semanticObject.getNameofclass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofclassinstance=[ClassInstanceCreate|QualifiedName]
	 */
	protected void sequence_ClassInstanceDelete(EObject context, ClassInstanceDelete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceDelete_Nameofclassinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceDelete_Nameofclassinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassInstanceDeleteAccess().getNameofclassinstanceClassInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofclassinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofclass=[Class|QualifiedName]
	 */
	protected void sequence_ClassInstanceGetAll(EObject context, ClassInstanceGetAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceGetAll_Nameofclass()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceGetAll_Nameofclass()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassInstanceGetAllAccess().getNameofclassClassQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofclass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofclassinstance=[ClassInstanceCreate|QualifiedName]
	 */
	protected void sequence_ClassInstanceGet(EObject context, ClassInstanceGet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceGet_Nameofclassinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceGet_Nameofclassinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassInstanceGetAccess().getNameofclassinstanceClassInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofclassinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofclassinstance=[ClassInstanceCreate|QualifiedName]
	 */
	protected void sequence_ClassInstanceSet(EObject context, ClassInstanceSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceSet_Nameofclassinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getClassInstanceSet_Nameofclassinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassInstanceSetAccess().getNameofclassinstanceClassInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofclassinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         classinstancecreate=ClassInstanceCreate | 
	 *         classinstancedelete=ClassInstanceDelete | 
	 *         classinstanceget=ClassInstanceGet | 
	 *         classinstanceset=ClassInstanceSet | 
	 *         classinstancegetall=ClassInstanceGetAll
	 *     )
	 */
	protected void sequence_ClassInstance(EObject context, ClassInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         parentclassname=[Class|QualifiedName]? 
	 *         symbolclass=[SymbolClass|QualifiedName]? 
	 *         (classattribute+=ClassAttribute | attribute+=Attribute | insertembedcode+=InsertEmbedCode | reference+=Reference)*
	 *     )
	 */
	protected void sequence_Class(EObject context, org.xtext.nv.dsl.mMDSL.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CompareExpression_CompareExpression_1_0_0_0 op=OperatorCompare right=AdditionExpression)
	 */
	protected void sequence_CompareExpression(EObject context, CompareExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (insertcontextitem=InsertContextItem | removecontextitem=RemoveContextItem)
	 */
	protected void sequence_ContextItem(EObject context, ContextItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersC+
	 */
	protected void sequence_CurveTo(EObject context, CurveTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dirname=STRING
	 */
	protected void sequence_DirCreate(EObject context, DirCreate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getDirCreate_Dirname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getDirCreate_Dirname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirCreateAccess().getDirnameSTRINGTerminalRuleCall_1_0(), semanticObject.getDirname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dirname=STRING
	 */
	protected void sequence_DirDelete(EObject context, DirDelete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getDirDelete_Dirname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getDirDelete_Dirname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirDeleteAccess().getDirnameSTRINGTerminalRuleCall_1_0(), semanticObject.getDirname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {DirGetWorking}
	 */
	protected void sequence_DirGetWorking(EObject context, DirGetWorking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dirname=STRING
	 */
	protected void sequence_DirList(EObject context, DirList semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getDirList_Dirname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getDirList_Dirname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirListAccess().getDirnameSTRINGTerminalRuleCall_1_0(), semanticObject.getDirname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dirsetworking=DirSetWorking | dirgetworking=DirGetWorking | dircreate=DirCreate | dirdelete=DirDelete | dirlist=DirList)
	 */
	protected void sequence_DirOperation(EObject context, DirOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dirname=STRING
	 */
	protected void sequence_DirSetWorking(EObject context, DirSetWorking semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getDirSetWorking_Dirname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getDirSetWorking_Dirname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirSetWorkingAccess().getDirnameSTRINGTerminalRuleCall_1_0(), semanticObject.getDirname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING text=STRING okbuttontext=STRING?)
	 */
	protected void sequence_EditBox(EObject context, EditBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cx=RealNumber cy=RealNumber rx=RealNumber ry=RealNumber)
	 */
	protected void sequence_Ellipse(EObject context, Ellipse semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Cx()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Cx()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Cy()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Cy()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Rx()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Rx()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Ry()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEllipse_Ry()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEllipseAccess().getCxRealNumberParserRuleCall_3_0(), semanticObject.getCx());
		feeder.accept(grammarAccess.getEllipseAccess().getCyRealNumberParserRuleCall_6_0(), semanticObject.getCy());
		feeder.accept(grammarAccess.getEllipseAccess().getRxRealNumberParserRuleCall_9_0(), semanticObject.getRx());
		feeder.accept(grammarAccess.getEllipseAccess().getRyRealNumberParserRuleCall_12_0(), semanticObject.getRy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersA+
	 */
	protected void sequence_EllipticalArc(EObject context, EllipticalArc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_EmbedCodeType(EObject context, EmbedCodeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEmbedCodeType_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEmbedCodeType_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmbedCodeTypeAccess().getNameValidIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID embedplatformtype=[EmbedPlatformType|QualifiedName] embedcodetype=[EmbedCodeType|QualifiedName]? embeddedcode=STRING)
	 */
	protected void sequence_EmbedCode(EObject context, EmbedCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_EmbedPlatformType(EObject context, EmbedPlatformType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEmbedPlatformType_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEmbedPlatformType_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmbedPlatformTypeAccess().getNameValidIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[Enumeration|QualifiedName]
	 */
	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEnumType_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEnumType_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumTypeAccess().getNameEnumerationQualifiedNameParserRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID enumvalues+=STRING+)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualExpression_EqualExpression_1_0_0_0 op=OperatorEqual right=CompareExpression)
	 */
	protected void sequence_EqualExpression(EObject context, EqualExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING text=STRING buttontype=ButtonType)
	 */
	protected void sequence_ErrorBox(EObject context, ErrorBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Title()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Text()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Buttontype()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getErrorBox_Buttontype()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getErrorBoxAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getErrorBoxAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getErrorBoxAccess().getButtontypeButtonTypeEnumRuleCall_6_0(), semanticObject.getButtontype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EventName algorithmname=[Algorithm|QualifiedName])
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEvent_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEvent_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getEvent_Algorithmname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getEvent_Algorithmname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameEventNameEnumRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getAlgorithmnameAlgorithmQualifiedNameParserRuleCall_6_0_1(), semanticObject.getAlgorithmname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=OrExpression
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getExpr_Expr()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getExpr_Expr()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprAccess().getExprOrExpressionParserRuleCall_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=STRING dest=STRING)
	 */
	protected void sequence_FileCopy(EObject context, FileCopy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getFileCopy_Src()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getFileCopy_Src()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getFileCopy_Dest()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getFileCopy_Dest()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFileCopyAccess().getSrcSTRINGTerminalRuleCall_2_0(), semanticObject.getSrc());
		feeder.accept(grammarAccess.getFileCopyAccess().getDestSTRINGTerminalRuleCall_4_0(), semanticObject.getDest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     filename=STRING
	 */
	protected void sequence_FileCreate(EObject context, FileCreate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getFileCreate_Filename()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getFileCreate_Filename()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFileCreateAccess().getFilenameSTRINGTerminalRuleCall_1_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     filename=STRING
	 */
	protected void sequence_FileDelete(EObject context, FileDelete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getFileDelete_Filename()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getFileDelete_Filename()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFileDeleteAccess().getFilenameSTRINGTerminalRuleCall_1_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filecopy=FileCopy | filedelete=FileDelete | filecreate=FileCreate | fileread=FileRead | filewrite=FileWrite)
	 */
	protected void sequence_FileOperation(EObject context, FileOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     filename=STRING
	 */
	protected void sequence_FileRead(EObject context, FileRead semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getFileRead_Filename()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getFileRead_Filename()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFileReadAccess().getFilenameSTRINGTerminalRuleCall_1_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filename=STRING text=STRING append='append'?)
	 */
	protected void sequence_FileWrite(EObject context, FileWrite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_FillColor(EObject context, FillColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fontstr=STRING
	 */
	protected void sequence_FontFamily(EObject context, FontFamily semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=INT stop=INT interval=INT (forblock+=Statement | breakcontinue+=BreakContinue)*)
	 */
	protected void sequence_ForLoop(EObject context, ForLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersHV+
	 */
	protected void sequence_HorizontalLineTo(EObject context, HorizontalLineTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_IncludeLibraryType(EObject context, IncludeLibraryType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getIncludeLibraryType_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getIncludeLibraryType_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeLibraryTypeAccess().getNameValidIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID includelibrarytype=[IncludeLibraryType|QualifiedName]?)
	 */
	protected void sequence_IncludeLibrary(EObject context, IncludeLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING text=STRING)
	 */
	protected void sequence_InfoBox(EObject context, InfoBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInfoBox_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInfoBox_Title()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInfoBox_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInfoBox_Text()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInfoBoxAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getInfoBoxAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID context=ValidID)
	 */
	protected void sequence_InsertContextItem(EObject context, InsertContextItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInsertContextItem_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInsertContextItem_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInsertContextItem_Context()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInsertContextItem_Context()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertContextItemAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInsertContextItemAccess().getContextValidIDParserRuleCall_3_0(), semanticObject.getContext());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     codesnippetname=[EmbedCode|QualifiedName]
	 */
	protected void sequence_InsertEmbedCode(EObject context, InsertEmbedCode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInsertEmbedCode_Codesnippetname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInsertEmbedCode_Codesnippetname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertEmbedCodeAccess().getCodesnippetnameEmbedCodeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getCodesnippetname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID menu=ValidID)
	 */
	protected void sequence_InsertMenuItem(EObject context, InsertMenuItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInsertMenuItem_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInsertMenuItem_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getInsertMenuItem_Menu()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getInsertMenuItem_Menu()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertMenuItemAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInsertMenuItemAccess().getMenuValidIDParserRuleCall_3_0(), semanticObject.getMenu());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classinstance=ClassInstance | relationinstance=RelationInstance)
	 */
	protected void sequence_InstanceOperation(EObject context, InstanceOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (menuitem=MenuItem | contextitem=ContextItem)
	 */
	protected void sequence_ItemOperation(EObject context, ItemOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersMLT+
	 */
	protected void sequence_LineTo(EObject context, LineTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x1=RealNumber y1=RealNumber x2=RealNumber y2=RealNumber)
	 */
	protected void sequence_Line(EObject context, Line semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getLine_X1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getLine_X1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getLine_Y1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getLine_Y1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getLine_X2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getLine_X2()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getLine_Y2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getLine_Y2()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLineAccess().getX1RealNumberParserRuleCall_3_0(), semanticObject.getX1());
		feeder.accept(grammarAccess.getLineAccess().getY1RealNumberParserRuleCall_6_0(), semanticObject.getY1());
		feeder.accept(grammarAccess.getLineAccess().getX2RealNumberParserRuleCall_9_0(), semanticObject.getX2());
		feeder.accept(grammarAccess.getLineAccess().getY2RealNumberParserRuleCall_12_0(), semanticObject.getY2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (whiletloop=WhileLoop | forloop=ForLoop)
	 */
	protected void sequence_LoopStatement(EObject context, LoopStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (insertmenuitem=InsertMenuItem | removemenuitem=RemoveMenuItem)
	 */
	protected void sequence_MenuItem(EObject context, MenuItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (class+=Class+ relation+=Relation* attribute+=Attribute* modeltype+=ModelType+)
	 */
	protected void sequence_Metamodel(EObject context, Metamodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_MethodName(EObject context, MethodName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getMethodName_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getMethodName_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodNameAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         enumeration+=Enumeration* 
	 *         symbolstyle+=SymbolStyle* 
	 *         symbolclass+=SymbolClass* 
	 *         symbolrelation+=SymbolRelation* 
	 *         metamodel=Metamodel 
	 *         algorithm+=Algorithm* 
	 *         event+=Event*
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID classname+=[Class|QualifiedName]+ relationname+=[Relation|QualifiedName]*)
	 */
	protected void sequence_Mode(EObject context, Mode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID modeltype=[ModelType|ID])
	 */
	protected void sequence_ModelCreate(EObject context, ModelCreate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelCreate_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelCreate_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelCreate_Modeltype()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelCreate_Modeltype()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelCreateAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getModelCreateAccess().getModeltypeModelTypeIDTerminalRuleCall_2_0_1(), semanticObject.getModeltype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     modelname=[ModelCreate|QualifiedName]
	 */
	protected void sequence_ModelDelete(EObject context, ModelDelete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelDelete_Modelname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelDelete_Modelname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelDeleteAccess().getModelnameModelCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     modelname=[ModelCreate|QualifiedName]
	 */
	protected void sequence_ModelDiscard(EObject context, ModelDiscard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelDiscard_Modelname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelDiscard_Modelname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelDiscardAccess().getModelnameModelCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     modelname=[ModelCreate|QualifiedName]
	 */
	protected void sequence_ModelIsLoaded(EObject context, ModelIsLoaded semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelIsLoaded_Modelname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelIsLoaded_Modelname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelIsLoadedAccess().getModelnameModelCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     modelname=[ModelCreate|QualifiedName]
	 */
	protected void sequence_ModelLoad(EObject context, ModelLoad semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelLoad_Modelname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelLoad_Modelname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelLoadAccess().getModelnameModelCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         modelcreate=ModelCreate | 
	 *         modeldelete=ModelDelete | 
	 *         modeldiscard=ModelDiscard | 
	 *         modelsave=ModelSave | 
	 *         modelload=ModelLoad | 
	 *         modelisloaded=ModelIsLoaded
	 *     )
	 */
	protected void sequence_ModelOperation(EObject context, ModelOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     modelname=[ModelCreate|QualifiedName]
	 */
	protected void sequence_ModelSave(EObject context, ModelSave semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getModelSave_Modelname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getModelSave_Modelname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelSaveAccess().getModelnameModelCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getModelname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID classname+=[Class|QualifiedName]+ relationname+=[Relation|QualifiedName]* modename+=Mode*)
	 */
	protected void sequence_ModelType(EObject context, ModelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersMLT+
	 */
	protected void sequence_MoveTo(EObject context, MoveTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationExpression_MultiplicationExpression_1_0_0_0 op=OperatorMultiply right=UnaryExpression)
	 */
	protected void sequence_MultiplicationExpression(EObject context, MultiplicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (add='+' | subtract='-')
	 */
	protected void sequence_OperatorAdd(EObject context, OperatorAdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     and='&&'
	 */
	protected void sequence_OperatorAnd(EObject context, OperatorAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getOperatorAnd_And()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getOperatorAnd_And()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatorAndAccess().getAndAmpersandAmpersandKeyword_0(), semanticObject.getAnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assign='=' | multyassign=OperatorMultyAssign)
	 */
	protected void sequence_OperatorAssign(EObject context, OperatorAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (greaterequal='>=' | lesserequal='<=' | greater='>' | lesser='<')
	 */
	protected void sequence_OperatorCompare(EObject context, OperatorCompare semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (equal='==' | notequal='!=')
	 */
	protected void sequence_OperatorEqual(EObject context, OperatorEqual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiply='*' | divide='/' | modulo='%')
	 */
	protected void sequence_OperatorMultiply(EObject context, OperatorMultiply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (addassign='+=' | subassign='-=' | multiassign='*=' | divassign='/=')
	 */
	protected void sequence_OperatorMultyAssign(EObject context, OperatorMultyAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     or='||'
	 */
	protected void sequence_OperatorOr(EObject context, OperatorOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getOperatorOr_Or()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getOperatorOr_Or()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatorOrAccess().getOrVerticalLineVerticalLineKeyword_0(), semanticObject.getOr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     not='!'
	 */
	protected void sequence_OperatorUnary(EObject context, OperatorUnary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getOperatorUnary_Not()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getOperatorUnary_Not()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatorUnaryAccess().getNotExclamationMarkKeyword_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrExpression_OrExpression_1_0_0_0 op=OperatorOr right=AndExpression)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         moveto=MoveTo | 
	 *         lineto=LineTo | 
	 *         horizontallineto=HorizontalLineTo | 
	 *         verticallineto=VerticalLineTo | 
	 *         curveto=CurveTo | 
	 *         smoothcurveto=SmoothCurveTo | 
	 *         quadraticbeziercurve=QuadraticBezierCurve | 
	 *         smoothquadraticbeziercurveto=SmoothQuadraticBezierCurveTo | 
	 *         ellipticalarc=EllipticalArc | 
	 *         closepath=ClosePath
	 *     )
	 */
	protected void sequence_PathData(EObject context, PathData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         rx=RealNumber 
	 *         ry=RealNumber 
	 *         xaxisrot=RealNumber 
	 *         largearcflag=Number 
	 *         sweepflag=Number 
	 *         x=RealNumber 
	 *         y=RealNumber
	 *     )
	 */
	protected void sequence_PathParametersA(EObject context, PathParametersA semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Rx()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Rx()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Ry()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Ry()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Xaxisrot()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Xaxisrot()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Largearcflag()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Largearcflag()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Sweepflag()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Sweepflag()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersA_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersAAccess().getRxRealNumberParserRuleCall_0_0(), semanticObject.getRx());
		feeder.accept(grammarAccess.getPathParametersAAccess().getRyRealNumberParserRuleCall_2_0(), semanticObject.getRy());
		feeder.accept(grammarAccess.getPathParametersAAccess().getXaxisrotRealNumberParserRuleCall_3_0(), semanticObject.getXaxisrot());
		feeder.accept(grammarAccess.getPathParametersAAccess().getLargearcflagNumberParserRuleCall_4_0(), semanticObject.getLargearcflag());
		feeder.accept(grammarAccess.getPathParametersAAccess().getSweepflagNumberParserRuleCall_5_0(), semanticObject.getSweepflag());
		feeder.accept(grammarAccess.getPathParametersAAccess().getXRealNumberParserRuleCall_6_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPathParametersAAccess().getYRealNumberParserRuleCall_7_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         x1=RealNumber 
	 *         y1=RealNumber 
	 *         x2=RealNumber 
	 *         y2=RealNumber 
	 *         x=RealNumber 
	 *         y=RealNumber
	 *     )
	 */
	protected void sequence_PathParametersC(EObject context, PathParametersC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X2()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y2()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersC_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersCAccess().getX1RealNumberParserRuleCall_0_0(), semanticObject.getX1());
		feeder.accept(grammarAccess.getPathParametersCAccess().getY1RealNumberParserRuleCall_1_0(), semanticObject.getY1());
		feeder.accept(grammarAccess.getPathParametersCAccess().getX2RealNumberParserRuleCall_2_0(), semanticObject.getX2());
		feeder.accept(grammarAccess.getPathParametersCAccess().getY2RealNumberParserRuleCall_3_0(), semanticObject.getY2());
		feeder.accept(grammarAccess.getPathParametersCAccess().getXRealNumberParserRuleCall_4_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPathParametersCAccess().getYRealNumberParserRuleCall_5_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     x=RealNumber
	 */
	protected void sequence_PathParametersHV(EObject context, PathParametersHV semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersHV_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersHV_X()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersHVAccess().getXRealNumberParserRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=RealNumber y=RealNumber)
	 */
	protected void sequence_PathParametersMLT(EObject context, PathParametersMLT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersMLT_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersMLT_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersMLT_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersMLT_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersMLTAccess().getXRealNumberParserRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPathParametersMLTAccess().getYRealNumberParserRuleCall_2_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x1=RealNumber y1=RealNumber x=RealNumber y=RealNumber)
	 */
	protected void sequence_PathParametersQ(EObject context, PathParametersQ semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_X1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_X1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_Y1()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_Y1()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersQ_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersQAccess().getX1RealNumberParserRuleCall_0_0(), semanticObject.getX1());
		feeder.accept(grammarAccess.getPathParametersQAccess().getY1RealNumberParserRuleCall_1_0(), semanticObject.getY1());
		feeder.accept(grammarAccess.getPathParametersQAccess().getXRealNumberParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPathParametersQAccess().getYRealNumberParserRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x2=RealNumber y2=RealNumber x=RealNumber y=RealNumber)
	 */
	protected void sequence_PathParametersS(EObject context, PathParametersS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_X2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_X2()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_Y2()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_Y2()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPathParametersS_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathParametersSAccess().getX2RealNumberParserRuleCall_0_0(), semanticObject.getX2());
		feeder.accept(grammarAccess.getPathParametersSAccess().getY2RealNumberParserRuleCall_1_0(), semanticObject.getY2());
		feeder.accept(grammarAccess.getPathParametersSAccess().getXRealNumberParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPathParametersSAccess().getYRealNumberParserRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pathdata+=PathData+
	 */
	protected void sequence_Path(EObject context, Path semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=RealNumber y=RealNumber)
	 */
	protected void sequence_Points(EObject context, Points semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPoints_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPoints_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getPoints_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getPoints_Y()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointsAccess().getXRealNumberParserRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointsAccess().getYRealNumberParserRuleCall_2_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     points+=Points+
	 */
	protected void sequence_Polygon(EObject context, Polygon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     points+=Points+
	 */
	protected void sequence_Polyline(EObject context, Polyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (atomic=AtomicExpression | expression=OrExpression)
	 */
	protected void sequence_PrimaryExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersQ+
	 */
	protected void sequence_QuadraticBezierCurve(EObject context, QuadraticBezierCurve semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=RealNumber y=RealNumber width=Number height=Number)
	 */
	protected void sequence_Rectangle(EObject context, Rectangle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_X()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_X()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Y()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Y()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Width()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Width()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Height()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRectangle_Height()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRectangleAccess().getXRealNumberParserRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getRectangleAccess().getYRealNumberParserRuleCall_6_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getRectangleAccess().getWidthNumberParserRuleCall_9_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getRectangleAccess().getHeightNumberParserRuleCall_12_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modeltypename=[ModelType|QualifiedName] classname=[Class|QualifiedName]?)
	 */
	protected void sequence_RefName(EObject context, RefName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID refname=RefName)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getReference_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getReference_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getReference_Refname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getReference_Refname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReferenceAccess().getRefnameRefNameParserRuleCall_3_0(), semanticObject.getRefname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         nameofrelation=[Relation|QualifiedName] 
	 *         classinstancefrom=[ClassInstanceCreate|QualifiedName] 
	 *         classinstanceto=[ClassInstanceCreate|QualifiedName]
	 *     )
	 */
	protected void sequence_RelationInstanceCreate(EObject context, RelationInstanceCreate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Name()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Nameofrelation()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Nameofrelation()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Classinstancefrom()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Classinstancefrom()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Classinstanceto()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceCreate_Classinstanceto()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationInstanceCreateAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRelationInstanceCreateAccess().getNameofrelationRelationQualifiedNameParserRuleCall_2_0_1(), semanticObject.getNameofrelation());
		feeder.accept(grammarAccess.getRelationInstanceCreateAccess().getClassinstancefromClassInstanceCreateQualifiedNameParserRuleCall_4_0_1(), semanticObject.getClassinstancefrom());
		feeder.accept(grammarAccess.getRelationInstanceCreateAccess().getClassinstancetoClassInstanceCreateQualifiedNameParserRuleCall_6_0_1(), semanticObject.getClassinstanceto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofrelationinstance=[RelationInstanceCreate|QualifiedName]
	 */
	protected void sequence_RelationInstanceDelete(EObject context, RelationInstanceDelete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceDelete_Nameofrelationinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceDelete_Nameofrelationinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationInstanceDeleteAccess().getNameofrelationinstanceRelationInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofrelationinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofrelation=[Relation|QualifiedName]
	 */
	protected void sequence_RelationInstanceGetAll(EObject context, RelationInstanceGetAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceGetAll_Nameofrelation()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceGetAll_Nameofrelation()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationInstanceGetAllAccess().getNameofrelationRelationQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofrelation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofrelationinstance=[RelationInstanceCreate|QualifiedName]
	 */
	protected void sequence_RelationInstanceGet(EObject context, RelationInstanceGet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceGet_Nameofrelationinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceGet_Nameofrelationinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationInstanceGetAccess().getNameofrelationinstanceRelationInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofrelationinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nameofrelationinstance=[RelationInstanceCreate|QualifiedName]
	 */
	protected void sequence_RelationInstanceSet(EObject context, RelationInstanceSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceSet_Nameofrelationinstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRelationInstanceSet_Nameofrelationinstance()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationInstanceSetAccess().getNameofrelationinstanceRelationInstanceCreateQualifiedNameParserRuleCall_1_0_1(), semanticObject.getNameofrelationinstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         relationinstancecreate=RelationInstanceCreate | 
	 *         relationinstancedelete=RelationInstanceDelete | 
	 *         relationinstanceget=RelationInstanceGet | 
	 *         relationinstanceset=RelationInstanceSet | 
	 *         relationinstancegetall=RelationInstanceGetAll
	 *     )
	 */
	protected void sequence_RelationInstance(EObject context, RelationInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         parentrelationname=[Relation|QualifiedName]? 
	 *         symbolrelation=[SymbolRelation|QualifiedName]? 
	 *         fromclassname=[Class|QualifiedName] 
	 *         toclassname=[Class|QualifiedName] 
	 *         (attribute+=Attribute | insertembedcode+=InsertEmbedCode)*
	 *     )
	 */
	protected void sequence_Relation(EObject context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     contextitem=[InsertContextItem|QualifiedName]
	 */
	protected void sequence_RemoveContextItem(EObject context, RemoveContextItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRemoveContextItem_Contextitem()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRemoveContextItem_Contextitem()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemoveContextItemAccess().getContextitemInsertContextItemQualifiedNameParserRuleCall_1_0_1(), semanticObject.getContextitem());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     menuitemname=[InsertMenuItem|QualifiedName]
	 */
	protected void sequence_RemoveMenuItem(EObject context, RemoveMenuItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getRemoveMenuItem_Menuitemname()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getRemoveMenuItem_Menuitemname()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemoveMenuItemAccess().getMenuitemnameInsertMenuItemQualifiedNameParserRuleCall_1_0_1(), semanticObject.getMenuitemname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         methodname=MethodName 
	 *         (includelibrarytype+=IncludeLibraryType | embedplatformtype+=EmbedPlatformType | embedcodetype+=EmbedCodeType)* 
	 *         includelibrary+=IncludeLibrary* 
	 *         embedcode+=EmbedCode* 
	 *         method=Method
	 *     )
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         insertembedcode=InsertEmbedCode | 
	 *         (
	 *             (
	 *                 rectangle=Rectangle | 
	 *                 circle=Circle | 
	 *                 ellipse=Ellipse | 
	 *                 line=Line | 
	 *                 polyline=Polyline | 
	 *                 polygon=Polygon | 
	 *                 path=Path | 
	 *                 text=Text
	 *             ) 
	 *             (symbolstyle=SymbolStyle | symbolstyleref=[SymbolStyle|QualifiedName])?
	 *         )
	 *     )
	 */
	protected void sequence_SVGCommand(EObject context, SVGCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifcondition=Expr ifblock+=Statement* ((elseifcondition+=Expr elseifblock+=Statement*)* elseblock+=Statement*)?)
	 */
	protected void sequence_SelectionStatement(EObject context, SelectionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         editbox=EditBox | 
	 *         infobox=InfoBox | 
	 *         errorbox=ErrorBox | 
	 *         warningbox=WarningBox | 
	 *         viewbox=ViewBox | 
	 *         itemoperation=ItemOperation
	 *     )
	 */
	protected void sequence_SimpleUI(EObject context, SimpleUI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersS+
	 */
	protected void sequence_SmoothCurveTo(EObject context, SmoothCurveTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersMLT+
	 */
	protected void sequence_SmoothQuadraticBezierCurveTo(EObject context, SmoothQuadraticBezierCurveTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selection=SelectionStatement | loop=LoopStatement | variable=Variable | algorithmoperation=AlgorithmOperation | insertembedcode=InsertEmbedCode)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_StrokeColor(EObject context, StrokeColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID globalstyle=[SymbolStyle|QualifiedName]? svgcommand+=SVGCommand*)
	 */
	protected void sequence_SymbolClass(EObject context, SymbolClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID globalstyle=[SymbolStyle|QualifiedName]? svgcommandsfrom+=SVGCommand* svgcommandsmiddle+=SVGCommand* svgcommandsto+=SVGCommand*)
	 */
	protected void sequence_SymbolRelation(EObject context, SymbolRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         fillcolor=FillColor? 
	 *         strokecolor=StrokeColor 
	 *         strokewidth=StrokeWidth 
	 *         fontfamily=FontFamily? 
	 *         fontsize=FontSize? 
	 *         insertembedcode+=InsertEmbedCode*
	 *     )
	 */
	protected void sequence_SymbolStyle(EObject context, SymbolStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=STRING 
	 *         x=RealNumber 
	 *         y=RealNumber 
	 *         fontfamily=FontFamily? 
	 *         fontsize=FontSize? 
	 *         fillcolor=FillColor?
	 *     )
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpletype=SimpleType | enumtype=EnumType)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=OperatorUnary? operand=PrimaryExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=Expr | 
	 *         algorithmoperation=AlgorithmOperation | 
	 *         class=[Class|QualifiedName] | 
	 *         attribute=[Attribute|QualifiedName] | 
	 *         reference=[Reference|QualifiedName] | 
	 *         symbolclass=[SymbolClass|QualifiedName] | 
	 *         symbolrelation=[SymbolRelation|QualifiedName] | 
	 *         symbolstyle=[SymbolStyle|QualifiedName] | 
	 *         embeddedcode=[EmbedCode|QualifiedName] | 
	 *         modeltype=[ModelType|QualifiedName]
	 *     )
	 */
	protected void sequence_VarStatement(EObject context, VarStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=ValidID (opassing=OperatorAssign varstatement=VarStatement)?) | 
	 *         (variable=[Variable|QualifiedName] opassing=OperatorAssign varstatement=VarStatement)
	 *     )
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=PathParametersHV+
	 */
	protected void sequence_VerticalLineTo(EObject context, VerticalLineTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING text=STRING)
	 */
	protected void sequence_ViewBox(EObject context, ViewBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getViewBox_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getViewBox_Title()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getViewBox_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getViewBox_Text()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewBoxAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getViewBoxAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING text=STRING buttontype=ButtonType)
	 */
	protected void sequence_WarningBox(EObject context, WarningBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Title()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Text()));
			if(transientValues.isValueTransient(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Buttontype()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MMDSLPackage.eINSTANCE.getWarningBox_Buttontype()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWarningBoxAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getWarningBoxAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getWarningBoxAccess().getButtontypeButtonTypeEnumRuleCall_6_0(), semanticObject.getButtontype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expr (whileblock+=Statement | breakcontinue+=BreakContinue)*)
	 */
	protected void sequence_WhileLoop(EObject context, WhileLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
