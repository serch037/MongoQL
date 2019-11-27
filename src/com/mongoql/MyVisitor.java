package com.mongoql;

public class MyVisitor extends MongoQLBaseVisitor {
    public QueryOBJ queryOBJ;

    MyVisitor() {
        queryOBJ = new QueryOBJ();
    }

    @Override
    public Object visitQuery(MongoQLParser.QueryContext ctx) {
        //visit(ctx.selectClause());
        //visit(ctx.fromClause());
        visit(ctx.whereClause());
        //queryOBJ.doQuery();
        return null;
    }

    @Override
    public Object visitFromClause(MongoQLParser.FromClauseContext ctx) {
        queryOBJ.database = ctx.collection().ID().toString();
        return super.visitFromClause(ctx);
    }

    @Override
    public Object visitSelectClause(MongoQLParser.SelectClauseContext ctx) {
        //System.out.println(visit(ctx.projAttrs()));
        queryOBJ.projectionFields = (visit(ctx.projAttrs())).toString();
        return super.visitSelectClause(ctx);
    }


    @Override
    public Object visitProjList(MongoQLParser.ProjListContext ctx) {
        String a = "";
        switch (ctx.getChildCount()) {
            case 1:
                a += (visit(ctx.nestedField()));
                break;
            case 3:
                a += (visit(ctx.nestedField()));
                a += ", ";
                a += visit(ctx.projList());
                break;
        }
        return a;
    }

    @Override
    public Object visitNestedField(MongoQLParser.NestedFieldContext ctx) {
        String a = "";
        switch (ctx.getChildCount()) {
            case 1:
                a += visit(ctx.getChild(0));
                break;
            case 3:
                a += visit(ctx.getChild(0));
                a += ".";
                a += visit(ctx.getChild(2));
                break;
        }
        return a;
    }

    @Override
    public Object visitWhereClause(MongoQLParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public Object visitExprList(MongoQLParser.ExprListContext ctx) {
        System.out.println(ctx.LOGOP());
//        System.out.println(ctx.getChild(0).getClass());
        for (int i = 0; i < ctx.getChildCount() ; i++) {
            System.out.println(ctx.getChild(i).getClass());
        }
        System.out.println();
        return super.visitExprList(ctx);
    }

    @Override
    public Object visitExpr(MongoQLParser.ExprContext ctx) {
        WherePredicate wp = new WherePredicate();
        wp.relOp = ctx.RELOP().toString();
        wp.leftSide = visit(ctx.nestedField()).toString();
        wp.rightSide = visit(ctx.value()).toString();
        //System.out.println(wp);
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitField(MongoQLParser.FieldContext ctx) {
        return ctx.ID();
    }

    @Override
    public Object visitValue(MongoQLParser.ValueContext ctx) {
        if (ctx.getChild(0) instanceof MongoQLParser.NestedFieldContext) {
           return visit(ctx.getChild(0));
        }
        return(ctx.getChild(0));
    }
}
