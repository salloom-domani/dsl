// Generated from d:\Tests\dsl\grammers\TEMParser.g4 by ANTLR 4.9.3

    package base;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TEMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TEMParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TEMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TEMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(TEMParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#pageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageBody(TEMParser.PageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(TEMParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(TEMParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#inputField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputField(TEMParser.InputFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(TEMParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#outputField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputField(TEMParser.OutputFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(TEMParser.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#controllerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerBody(TEMParser.ControllerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(TEMParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TEMParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(TEMParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(TEMParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TEMParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(TEMParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TEMParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(TEMParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TEMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TEMParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(TEMParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TEMParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(TEMParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEMParser#mathmaticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathmaticOperator(TEMParser.MathmaticOperatorContext ctx);
}