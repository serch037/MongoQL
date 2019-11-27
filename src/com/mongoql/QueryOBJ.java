package com.mongoql;

import org.bson.io.BsonOutput;

public class QueryOBJ {
    String database;
    String projectionFields;
    String whereConditions;
    String orderByCondition;

    public void doQuery() {
        System.out.println("Printing " + database + " " + projectionFields + " " + whereConditions + " " + orderByCondition);
    }
}

class WherePredicate {
    String leftSide;
    String relOp;
    String rightSide;

    @Override
    public String toString() {
        String newOp = "";
        //: '=' | '!=' | '<' | '<=' | '>' | '>=';
        switch (relOp){
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
        return "{"+leftSide + ": {$"+newOp + ":"+rightSide + "}}";
    }
}

class WhereClause {
    String connector;
    WherePredicate[] predicates;
    WhereClause[] clauses;
}

