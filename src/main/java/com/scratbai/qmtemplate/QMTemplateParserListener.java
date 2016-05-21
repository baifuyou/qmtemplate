// Generated from /home/baifuyou/IdeaProjects/QMTemplate/src/main/resources/qmtemplate/QMTemplateParser.g4 by ANTLR 4.5.1
package com.scratbai.qmtemplate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QMTemplateParser}.
 */
public interface QMTemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(QMTemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(QMTemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#originText}.
	 * @param ctx the parse tree
	 */
	void enterOriginText(QMTemplateParser.OriginTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#originText}.
	 * @param ctx the parse tree
	 */
	void exitOriginText(QMTemplateParser.OriginTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#renderExpr}.
	 * @param ctx the parse tree
	 */
	void enterRenderExpr(QMTemplateParser.RenderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#renderExpr}.
	 * @param ctx the parse tree
	 */
	void exitRenderExpr(QMTemplateParser.RenderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void enterBlockEnd(QMTemplateParser.BlockEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void exitBlockEnd(QMTemplateParser.BlockEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#evlExpr}.
	 * @param ctx the parse tree
	 */
	void enterEvlExpr(QMTemplateParser.EvlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#evlExpr}.
	 * @param ctx the parse tree
	 */
	void exitEvlExpr(QMTemplateParser.EvlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#methodInvoke}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvoke(QMTemplateParser.MethodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#methodInvoke}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvoke(QMTemplateParser.MethodInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QMTemplateParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QMTemplateParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(QMTemplateParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(QMTemplateParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(QMTemplateParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(QMTemplateParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(QMTemplateParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(QMTemplateParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(QMTemplateParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(QMTemplateParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseIfExpr(QMTemplateParser.ElseIfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#elseIfExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseIfExpr(QMTemplateParser.ElseIfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(QMTemplateParser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(QMTemplateParser.ElseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void enterIfKey(QMTemplateParser.IfKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#ifKey}.
	 * @param ctx the parse tree
	 */
	void exitIfKey(QMTemplateParser.IfKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(QMTemplateParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(QMTemplateParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#elseKey}.
	 * @param ctx the parse tree
	 */
	void enterElseKey(QMTemplateParser.ElseKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#elseKey}.
	 * @param ctx the parse tree
	 */
	void exitElseKey(QMTemplateParser.ElseKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(QMTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(QMTemplateParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#eachExpr}.
	 * @param ctx the parse tree
	 */
	void enterEachExpr(QMTemplateParser.EachExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#eachExpr}.
	 * @param ctx the parse tree
	 */
	void exitEachExpr(QMTemplateParser.EachExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#each}.
	 * @param ctx the parse tree
	 */
	void enterEach(QMTemplateParser.EachContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#each}.
	 * @param ctx the parse tree
	 */
	void exitEach(QMTemplateParser.EachContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QMTemplateParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QMTemplateParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(QMTemplateParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(QMTemplateParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link QMTemplateParser#eachIndexExpr}.
	 * @param ctx the parse tree
	 */
	void enterEachIndexExpr(QMTemplateParser.EachIndexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QMTemplateParser#eachIndexExpr}.
	 * @param ctx the parse tree
	 */
	void exitEachIndexExpr(QMTemplateParser.EachIndexExprContext ctx);
}