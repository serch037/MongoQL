package com.mongoql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "SELECT a.b, c.d, f FROM movies WHERE a.b <= 10 OR c.d = 2;";
        MongoQLLexer lexer = new MongoQLLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MongoQLParser parser = new MongoQLParser(tokens);
        ParseTree tree = parser.query();
        MongoQLBaseVisitor
        // write your code here
    }
}
