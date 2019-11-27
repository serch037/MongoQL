// Generated from /home/sergio/Documents/Projects/Learning/Antlr/MongoQL/src/com/mongoql/MongoQL.g4 by ANTLR 4.7.2
package com.mongoql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MongoQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MongoQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MongoQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(MongoQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#projAttrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjAttrs(MongoQLParser.ProjAttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#projList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjList(MongoQLParser.ProjListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#nestedField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedField(MongoQLParser.NestedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MongoQLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MongoQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(MongoQLParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MongoQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(MongoQLParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MongoQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MongoQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MongoQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoQLParser#orderByOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByOpt(MongoQLParser.OrderByOptContext ctx);
}