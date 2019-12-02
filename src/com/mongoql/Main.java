package com.mongoql;

import de.undercouch.bson4jackson.deserializers.BsonCalendarDeserializer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        String input = "SELECT a.b, c.d.e, f, z FROM movies WHERE e.f <= z.d OR g.h = 2 AND (a != 'b' OR z < 10 OR f = TRUE OR t = FALSE AND ((x < y) OR (f < d)));";
//        String input = "SELECT a.b, c.d.e, f, z FROM movies WHERE a.b < 1 AND e.f <= z.d OR (x < y OR f < d) ORDER BY a.b DESC, c.d ASC;";
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        String line = null;
//        /*
        while (sc.hasNextLine()) {
            line = new String(sc.nextLine());
            out.append(line);
            if (StringUtils.endsWith(out, ";")) {
                QueryOBJ.parse(out.toString());
                out = new StringBuilder();
            }
        }
//         */
//        String input = "SELECT title,rated,year,runtime FROM movies WHERE runtime=90 OR rated=R AND year >= 2000 ORDER BY year DESC, runtime;";
//        String input = "SELECT imdb.votes FROM movies WHERE imdb.votes < 10;";
//        QueryOBJ.parse(input);
    }
}
