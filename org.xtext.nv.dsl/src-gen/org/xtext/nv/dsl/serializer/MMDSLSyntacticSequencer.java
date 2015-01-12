package org.xtext.nv.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.nv.dsl.services.MMDSLGrammarAccess;

@SuppressWarnings("all")
public class MMDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MMDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CurveTo_CKeyword_0_0_or_CKeyword_0_1;
	protected AbstractElementAlias match_EllipticalArc_AKeyword_0_0_or_AKeyword_0_1;
	protected AbstractElementAlias match_HorizontalLineTo_HKeyword_0_0_or_HKeyword_0_1;
	protected AbstractElementAlias match_LineTo_LKeyword_0_0_or_LKeyword_0_1;
	protected AbstractElementAlias match_Mode_NoneKeyword_3_3_0_a;
	protected AbstractElementAlias match_Mode_NoneKeyword_3_3_0_p;
	protected AbstractElementAlias match_MoveTo_MKeyword_0_0_or_MKeyword_0_1;
	protected AbstractElementAlias match_QuadraticBezierCurve_QKeyword_0_0_or_QKeyword_0_1;
	protected AbstractElementAlias match_SelectionStatement___ElseKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4__q;
	protected AbstractElementAlias match_SmoothCurveTo_SKeyword_0_0_or_SKeyword_0_1;
	protected AbstractElementAlias match_SmoothQuadraticBezierCurveTo_TKeyword_0_0_or_TKeyword_0_1;
	protected AbstractElementAlias match_VerticalLineTo_VKeyword_0_0_or_VKeyword_0_1;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MMDSLGrammarAccess) access;
		match_CurveTo_CKeyword_0_0_or_CKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCurveToAccess().getCKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCurveToAccess().getCKeyword_0_1()));
		match_EllipticalArc_AKeyword_0_0_or_AKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEllipticalArcAccess().getAKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEllipticalArcAccess().getAKeyword_0_1()));
		match_HorizontalLineTo_HKeyword_0_0_or_HKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHorizontalLineToAccess().getHKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getHorizontalLineToAccess().getHKeyword_0_1()));
		match_LineTo_LKeyword_0_0_or_LKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLineToAccess().getLKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLineToAccess().getLKeyword_0_1()));
		match_Mode_NoneKeyword_3_3_0_a = new TokenAlias(true, true, grammarAccess.getModeAccess().getNoneKeyword_3_3_0());
		match_Mode_NoneKeyword_3_3_0_p = new TokenAlias(true, false, grammarAccess.getModeAccess().getNoneKeyword_3_3_0());
		match_MoveTo_MKeyword_0_0_or_MKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMoveToAccess().getMKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMoveToAccess().getMKeyword_0_1()));
		match_QuadraticBezierCurve_QKeyword_0_0_or_QKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getQuadraticBezierCurveAccess().getQKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getQuadraticBezierCurveAccess().getQKeyword_0_1()));
		match_SelectionStatement___ElseKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSelectionStatementAccess().getElseKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSelectionStatementAccess().getLeftCurlyBracketKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getSelectionStatementAccess().getRightCurlyBracketKeyword_1_4()));
		match_SmoothCurveTo_SKeyword_0_0_or_SKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSmoothCurveToAccess().getSKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getSmoothCurveToAccess().getSKeyword_0_1()));
		match_SmoothQuadraticBezierCurveTo_TKeyword_0_0_or_TKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSmoothQuadraticBezierCurveToAccess().getTKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getSmoothQuadraticBezierCurveToAccess().getTKeyword_0_1()));
		match_VerticalLineTo_VKeyword_0_0_or_VKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVerticalLineToAccess().getVKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getVerticalLineToAccess().getVKeyword_0_1()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_CurveTo_CKeyword_0_0_or_CKeyword_0_1.equals(syntax))
				emit_CurveTo_CKeyword_0_0_or_CKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EllipticalArc_AKeyword_0_0_or_AKeyword_0_1.equals(syntax))
				emit_EllipticalArc_AKeyword_0_0_or_AKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HorizontalLineTo_HKeyword_0_0_or_HKeyword_0_1.equals(syntax))
				emit_HorizontalLineTo_HKeyword_0_0_or_HKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LineTo_LKeyword_0_0_or_LKeyword_0_1.equals(syntax))
				emit_LineTo_LKeyword_0_0_or_LKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mode_NoneKeyword_3_3_0_a.equals(syntax))
				emit_Mode_NoneKeyword_3_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mode_NoneKeyword_3_3_0_p.equals(syntax))
				emit_Mode_NoneKeyword_3_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MoveTo_MKeyword_0_0_or_MKeyword_0_1.equals(syntax))
				emit_MoveTo_MKeyword_0_0_or_MKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuadraticBezierCurve_QKeyword_0_0_or_QKeyword_0_1.equals(syntax))
				emit_QuadraticBezierCurve_QKeyword_0_0_or_QKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SelectionStatement___ElseKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4__q.equals(syntax))
				emit_SelectionStatement___ElseKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SmoothCurveTo_SKeyword_0_0_or_SKeyword_0_1.equals(syntax))
				emit_SmoothCurveTo_SKeyword_0_0_or_SKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SmoothQuadraticBezierCurveTo_TKeyword_0_0_or_TKeyword_0_1.equals(syntax))
				emit_SmoothQuadraticBezierCurveTo_TKeyword_0_0_or_TKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerticalLineTo_VKeyword_0_0_or_VKeyword_0_1.equals(syntax))
				emit_VerticalLineTo_VKeyword_0_0_or_VKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'c' | 'C'
	 */
	protected void emit_CurveTo_CKeyword_0_0_or_CKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'A' | 'a'
	 */
	protected void emit_EllipticalArc_AKeyword_0_0_or_AKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'h' | 'H'
	 */
	protected void emit_HorizontalLineTo_HKeyword_0_0_or_HKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'l' | 'L'
	 */
	protected void emit_LineTo_LKeyword_0_0_or_LKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'none'*
	 */
	protected void emit_Mode_NoneKeyword_3_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'none'+
	 */
	protected void emit_Mode_NoneKeyword_3_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'm' | 'M'
	 */
	protected void emit_MoveTo_MKeyword_0_0_or_MKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Q' | 'q'
	 */
	protected void emit_QuadraticBezierCurve_QKeyword_0_0_or_QKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('else' '{' '}')?
	 */
	protected void emit_SelectionStatement___ElseKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'S' | 's'
	 */
	protected void emit_SmoothCurveTo_SKeyword_0_0_or_SKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'T' | 't'
	 */
	protected void emit_SmoothQuadraticBezierCurveTo_TKeyword_0_0_or_TKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'v' | 'V'
	 */
	protected void emit_VerticalLineTo_VKeyword_0_0_or_VKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
