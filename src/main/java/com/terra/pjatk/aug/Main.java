package com.terra.pjatk.aug;

import com.terra.pjatk.aug.grammar.AugVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.visitor.provider.AugGrammarVisitorProvider;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Main {

    public static final Map<String, Object> params = new java.util.HashMap<>();

    static {
        params.put("debug", false);
        params.put("prog", "prog1.txt");
    }

    public static void main(String[] args) {

        handleArgs(args);

        try {
            String input;
            try (InputStream is = Main.class.getClassLoader().getResourceAsStream("programs/" + params.get("prog"))) {
                if (is == null) {
                    throw new IOException("Resource not found: " + params.get("prog"));
                }
                input = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }

            ParseTree tree = getParseTree(input);

            AugVisitor visitor = new AugVisitor(
                    AugGrammarVisitorProvider.defaultSetup((boolean) params.get("debug"))
            );

            visitor.visit(tree);

        } catch (IOException e) {
            System.err.println("Failed to read file: " + params.get("prog"));
            e.printStackTrace();
        }
    }

    private static ParseTree getParseTree(String input) {
        AugGrammarLexer lexer = new AugGrammarLexer(CharStreams.fromString(input));
        AugGrammarParser parser = new AugGrammarParser(new CommonTokenStream(lexer));
        return parser.program();
    }

    private static void handleArgs(String[] args) {
        for (String arg : args) {
            if (arg.equals("-debug")) {
                params.put("debug", true);
            }

            if (arg.startsWith("-prog=")) {
                String[] parts = arg.split("=");
                if (parts.length != 2) {
                    System.err.println("Invalid argument: " + arg);
                    System.exit(1);
                }
                params.put("prog", parts[1]);
                System.out.println("Using program file: " + parts[1]);
            }

        }
    }
}
