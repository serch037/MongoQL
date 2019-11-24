// Generated from D:/Documents/ITC/8ITC/Compiladores/MongoQL/src/com/mongoql\MongoQL.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link MongoQLParser#subfield}.
	 * @param ctx the parse tree
	 */
	void enterSubfield(MongoQLParser.SubfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#subfield}.
	 * @param ctx the parse tree
	 */
	void exitSubfield(MongoQLParser.SubfieldContext ctx);
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
	 * Enter a parse tree produced by {@link MongoQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MongoQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MongoQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MongoQLParser.OperatorContext ctx);
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