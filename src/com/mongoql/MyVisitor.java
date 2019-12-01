package com.mongoql;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.mongodb.client.model.Projections.*;


public class MyVisitor extends MongoQLBaseVisitor {

    MongoDatabase database;

    MyVisitor() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://USER:PASS@mflix-fomos.mongodb.net/test?retryWrites=true&w=majority");
        database = mongoClient.getDatabase("sample_mflix");
    }

    @Override
    public Object visitQuery(MongoQLParser.QueryContext ctx) {
        QueryOBJ queryOBJ = new QueryOBJ(database);
//        MongoCollection<Document> collection= database.getCollection("movies");
        queryOBJ.fromField = (String) visit(ctx.fromClause());
        queryOBJ.projectionFields = (Bson) visit(ctx.selectClause());
        var tmpWhere = visit(ctx.whereClause());
        if (tmpWhere != null) {
            queryOBJ.whereConditions = (Bson) visit(ctx.whereClause());
        }
        queryOBJ.doQuery();
        System.out.println("Done");
//        MongoCursor<Document> cursor = collection.find(eq("rated","UNRATED")).projection(fields(excludeId(),include("title","rated","_id"))).iterator();
//        while (cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }
//        visit(ctx.fromClause());
//        visit(ctx.whereClause());
//        visit(ctx.orderByClause());
        //queryOBJ.doQuery();
        return null;
    }

    @Override
    public Object visitFromClause(MongoQLParser.FromClauseContext ctx) {
        return ctx.collection().ID().toString();
    }

    @Override
    public Object visitSelectClause(MongoQLParser.SelectClauseContext ctx) {
        System.out.println(visit(ctx.projAttrs()));
        return fields(excludeId(), include((List<String>) visit(ctx.projAttrs())));
//        return super.visitSelectClause(ctx);
    }


    @Override
    public Object visitProjList(MongoQLParser.ProjListContext ctx) {
        ArrayList<String> a = new ArrayList<>();
        switch (ctx.getChildCount()) {
            case 1:
//                a += (visit(ctx.nestedField()));
                a.add((String) visit(ctx.nestedField()));
                break;
            case 3:
                a.add((String) visit(ctx.nestedField()));
                a.addAll((Collection<? extends String>) visit(ctx.projList()));
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
        if (ctx.getChildCount() > 0) {
            return (Bson) visit(ctx.exprList());
        }
        return null;
    }

    @Override
    public Object visitExprList(MongoQLParser.ExprListContext ctx) {
        if (ctx.getChild(0).getText().equals("(")) {
            return visit(ctx.exprList(0));
        } else if (ctx.expr() != null) {
            return visit(ctx.expr());
        } else {
            WhereClause wc = new WhereClause();
            wc.leftPred = (Bson) visit(ctx.exprList(0));
            wc.rightPred = (Bson) visit(ctx.exprList(1));
            wc.logOp = ctx.getChild(1).toString();
//            System.out.println(wc);
            return wc.toBson();
        }
    }

    @Override
    public Object visitExpr(MongoQLParser.ExprContext ctx) {
        WherePredicate wp = new WherePredicate();
        wp.relOp = ctx.RELOP().toString();
        wp.leftSide = visit(ctx.nestedField()).toString();
        wp.rightSide = visit(ctx.value()).toString();
//        System.out.println(wp);
        return wp.toBson();
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
        return (ctx.getChild(0));
    }

    @Override
    public Object visitOrderByClause(MongoQLParser.OrderByClauseContext ctx) {
        if (ctx.orderByFields() != null) {
//            System.out.println(visit(ctx.orderByFields()));
            return String.format("{%s}", visit(ctx.orderByFields()));
        }
        return super.visitOrderByClause(ctx);
    }

    @Override
    public Object visitOrderByFields(MongoQLParser.OrderByFieldsContext ctx) {
        OrderByClause oc = new OrderByClause();
        oc.field = visit(ctx.nestedField()).toString();
        oc.desc = ctx.orderByOpt() != null && ctx.orderByOpt().getText().equals("DESC");

        if (ctx.orderByFields() != null) {
            String nested = visit(ctx.orderByFields()).toString();
            return String.format("%s,%s", oc, nested);
        } else {
            return oc.toString();
        }
    }
}

class Movies {

}