package com.mongoql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        String input = "SELECT a.b, c.d.e, f, z FROM movies WHERE e.f <= z.d OR g.h = 2 AND (a != 'b' OR z < 10 OR f = TRUE OR t = FALSE AND ((x < y) OR (f < d)));";
//        String input = "SELECT a.b, c.d.e, f, z FROM movies WHERE a.b < 1 AND e.f <= z.d OR (x < y OR f < d) ORDER BY a.b DESC, c.d ASC;";
        String input = "SELECT title,rated,year,runtime FROM movies WHERE runtime=90 OR rated=R AND year >= 2000;";
        MongoQLLexer lexer = new MongoQLLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MongoQLParser parser = new MongoQLParser(tokens);
        ParseTree tree = parser.query();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
        // write your code here
    }
}
