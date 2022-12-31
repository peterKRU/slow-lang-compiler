package compiler;

// Generated from SlowLangV1Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlowLangV1Parser}.
 */
public interface SlowLangV1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterProgram(SlowLangV1Parser.ProgramContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitProgram(SlowLangV1Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#mainExecBlock}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMainExecBlock(SlowLangV1Parser.MainExecBlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#mainExecBlock}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMainExecBlock(SlowLangV1Parser.MainExecBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#classDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClassDecl(SlowLangV1Parser.ClassDeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#classDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClassDecl(SlowLangV1Parser.ClassDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#classBody}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterClassBody(SlowLangV1Parser.ClassBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#classBody}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitClassBody(SlowLangV1Parser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#fieldDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(SlowLangV1Parser.FieldDeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#fieldDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(SlowLangV1Parser.FieldDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#methodDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(SlowLangV1Parser.MethodDeclContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#methodDecl}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(SlowLangV1Parser.MethodDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#formalParams}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFormalParams(SlowLangV1Parser.FormalParamsContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#formalParams}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFormalParams(SlowLangV1Parser.FormalParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#block}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterBlock(SlowLangV1Parser.BlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#block}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitBlock(SlowLangV1Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterStatement(SlowLangV1Parser.StatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitStatement(SlowLangV1Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#ifStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SlowLangV1Parser.IfStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#ifStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SlowLangV1Parser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#whileStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SlowLangV1Parser.WhileStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#whileStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SlowLangV1Parser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#returnStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SlowLangV1Parser.ReturnStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#returnStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SlowLangV1Parser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterExpression(SlowLangV1Parser.ExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitExpression(SlowLangV1Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#logicalOrExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(SlowLangV1Parser.LogicalOrExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#logicalOrExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(SlowLangV1Parser.LogicalOrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#logicalAndExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(SlowLangV1Parser.LogicalAndExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#logicalAndExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(SlowLangV1Parser.LogicalAndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#equalityExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(SlowLangV1Parser.EqualityExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#equalityExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(SlowLangV1Parser.EqualityExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#relationalExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(SlowLangV1Parser.RelationalExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#relationalExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(SlowLangV1Parser.RelationalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#additiveExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(SlowLangV1Parser.AdditiveExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#additiveExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(SlowLangV1Parser.AdditiveExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#multiplicativeExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(SlowLangV1Parser.MultiplicativeExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#multiplicativeExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(SlowLangV1Parser.MultiplicativeExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#unaryExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SlowLangV1Parser.UnaryExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#unaryExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SlowLangV1Parser.UnaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#assignmentExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(SlowLangV1Parser.AssignmentExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#assignmentExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(SlowLangV1Parser.AssignmentExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#objectMethodCall}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterObjectMethodCall(SlowLangV1Parser.ObjectMethodCallContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#objectMethodCall}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitObjectMethodCall(SlowLangV1Parser.ObjectMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#functionCall}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SlowLangV1Parser.FunctionCallContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#functionCall}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SlowLangV1Parser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#primaryExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(SlowLangV1Parser.PrimaryExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#primaryExpr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(SlowLangV1Parser.PrimaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#prefixIncrDerc}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrefixIncrDerc(SlowLangV1Parser.PrefixIncrDercContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#prefixIncrDerc}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrefixIncrDerc(SlowLangV1Parser.PrefixIncrDercContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#postfixIncrDerc}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPostfixIncrDerc(SlowLangV1Parser.PostfixIncrDercContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#postfixIncrDerc}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPostfixIncrDerc(SlowLangV1Parser.PostfixIncrDercContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#objectCreation}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(SlowLangV1Parser.ObjectCreationContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#objectCreation}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(SlowLangV1Parser.ObjectCreationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SlowLangV1Parser#type}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterType(SlowLangV1Parser.TypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link SlowLangV1Parser#type}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitType(SlowLangV1Parser.TypeContext ctx);
}