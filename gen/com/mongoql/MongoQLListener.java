// Generated from /home/sergio/Documents/Projects/Learning/Antlr/MongoQL/src/com/mongoql/MongoQL.g4 by ANTLR 4.7.2
package com.mongoql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MongoQLParser}.
 */
public interface MongoQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MongoQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MongoQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(MongoQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(MongoQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#projAttrs}.
	 * @param ctx the parse tree
	 */
	void enterProjAttrs(MongoQLParser.ProjAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#projAttrs}.
	 * @param ctx the parse tree
	 */
	void exitProjAttrs(MongoQLParser.ProjAttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#projList}.
	 * @param ctx the parse tree
	 */
	void enterProjList(MongoQLParser.ProjListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#projList}.
	 * @param ctx the parse tree
	 */
	void exitProjList(MongoQLParser.ProjListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#nestedField}.
	 * @param ctx the parse tree
	 */
	void enterNestedField(MongoQLParser.NestedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#nestedField}.
	 * @param ctx the parse tree
	 */
	void exitNestedField(MongoQLParser.NestedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MongoQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MongoQLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MongoQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MongoQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(MongoQLParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(MongoQLParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MongoQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MongoQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MongoQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MongoQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#orderByOpt}.
	 * @param ctx the parse tree
	 */
	void enterOrderByOpt(MongoQLParser.OrderByOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#orderByOpt}.
	 * @param ctx the parse tree
	 */
	void exitOrderByOpt(MongoQLParser.OrderByOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(MongoQLParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(MongoQLParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MongoQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MongoQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#logOp}.
	 * @param ctx the parse tree
	 */
	void enterLogOp(MongoQLParser.LogOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#logOp}.
	 * @param ctx the parse tree
	 */
	void exitLogOp(MongoQLParser.LogOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(MongoQLParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(MongoQLParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MongoQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MongoQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MongoQLParser.ValueContext ctx);
}