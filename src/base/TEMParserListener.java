// Generated from d:\Tests\dsl\grammers\TEMParser.g4 by ANTLR 4.9.3

    package base;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TEMParser}.
 */
public interface TEMParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TEMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TEMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TEMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(TEMParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(TEMParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#pageBody}.
	 * @param ctx the parse tree
	 */
	void enterPageBody(TEMParser.PageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#pageBody}.
	 * @param ctx the parse tree
	 */
	void exitPageBody(TEMParser.PageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(TEMParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(TEMParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(TEMParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(TEMParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#inputField}.
	 * @param ctx the parse tree
	 */
	void enterInputField(TEMParser.InputFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#inputField}.
	 * @param ctx the parse tree
	 */
	void exitInputField(TEMParser.InputFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(TEMParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(TEMParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#outputField}.
	 * @param ctx the parse tree
	 */
	void enterOutputField(TEMParser.OutputFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#outputField}.
	 * @param ctx the parse tree
	 */
	void exitOutputField(TEMParser.OutputFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(TEMParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(TEMParser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#controllerBody}.
	 * @param ctx the parse tree
	 */
	void enterControllerBody(TEMParser.ControllerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#controllerBody}.
	 * @param ctx the parse tree
	 */
	void exitControllerBody(TEMParser.ControllerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(TEMParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(TEMParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TEMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TEMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(TEMParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(TEMParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(TEMParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(TEMParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TEMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TEMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(TEMParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(TEMParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TEMParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TEMParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(TEMParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(TEMParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TEMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TEMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TEMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TEMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TEMParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TEMParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TEMParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TEMParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(TEMParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(TEMParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#mathmaticOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathmaticOperator(TEMParser.MathmaticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#mathmaticOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathmaticOperator(TEMParser.MathmaticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEMParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(TEMParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEMParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(TEMParser.CommentContext ctx);
}