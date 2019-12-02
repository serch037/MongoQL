package com.mongoql;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.io.BsonOutput;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.*;

public class QueryOBJ {
    String fromField;
    Bson projectionFields;
    Bson whereConditions;
    Bson orderByCondition;
    MongoDatabase database;
    public static void parse(String query) {
        MongoQLLexer lexer = new MongoQLLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MongoQLParser parser = new MongoQLParser(tokens);
        ParseTree tree = parser.query();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }

    public QueryOBJ(MongoDatabase database) {
        this.database = database;
    }

    public void doQuery() {
        MongoCollection<Document> collection = database.getCollection(fromField);
        MongoCursor<Document> cursorIterator = null;
        FindIterable<Document> cursor = null;
        // where Transform
        if (this.whereConditions == null) {
            cursor = collection.find();
        } else {
            cursor = collection.find(this.whereConditions);
        }

        // select transform
        if (this.projectionFields != null) {
            cursor = cursor.projection(this.projectionFields);
        }

        if (this.orderByCondition != null) {
            cursor = cursor.sort(this.orderByCondition);
        }
        cursorIterator = cursor.iterator();
//        cursor = collection.find(eq("runtime", 90)).projection(this.projectionFields).iterator();
        System.out.println("Printing " + database + " " + projectionFields + " " + whereConditions + " " + orderByCondition);
        while (cursorIterator.hasNext()) {
            System.out.println(cursorIterator.next());
        }
    }
}

class WherePredicate extends Predicate {
    String leftSide;
    String relOp;
    String rightSide;

    @Override
    public Bson toBson() {
        Bson newOp = null;
        Object rightNew = StringUtils.isNumeric(rightSide) ? Double.parseDouble(rightSide) : rightSide;
        switch (relOp) {
            case "=":
                return eq(leftSide, rightNew);
            case "!=":
                return ne(leftSide, rightNew);
            case "<=":
                return lte(leftSide, rightNew);
            case ">=":
                return gte(leftSide, rightNew);
            case "<":
                return lt(leftSide, rightNew);
            case ">":
                return gt(leftSide, rightNew);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        String newOp = "";
        //: '=' | '!=' | '<' | '<=' | '>' | '>=';
        switch (relOp) {
            case "=":
                newOp = "eq";
                break;
            case "!=":
                newOp = "neq";
                break;
            case "<=":
                newOp = "lte";
                break;
            case ">=":
                newOp = "gte";
                break;
            case "<":
                newOp = "lt";
                break;
            case ">":
                newOp = "gt";
                break;
        }
        return "{" + leftSide + ": {$" + newOp + ":" + rightSide + "}}";
    }
}


class WhereClause extends Predicate {
    String logOp;
    Bson leftPred;
    Bson rightPred;

    @Override
    public Bson toBson() {
        switch (logOp) {
            case "AND":
                return and(leftPred, rightPred);
            case "OR":
                return or(leftPred, rightPred);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return String.format("$%s:[%s,%s]", logOp, leftPred, rightPred);
    }
}

abstract class Predicate {
    public abstract Bson toBson();
}

class OrderByClause {
    String field;
    Boolean desc;

    @Override
    public String toString() {
        return String.format("%s:%s", field, !desc ? 1 : -1);
    }

    public Bson toBson(){
       if (desc){
           return descending(field);
       } else {
           return ascending(field);
       }
    }
}

