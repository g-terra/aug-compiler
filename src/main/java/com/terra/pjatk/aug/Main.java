package com.terra.pjatk.aug;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
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
    }

    public static void main(String[] args) {

        handleArgs(args);

        try {
            String input = loadProgram();

            ParseTree tree = parseProgramToTree(input);

            ContextProvider provider = AugGrammarContextProvider.defaultSetup((boolean) params.get("debug"));

            provider.getVisitor(ExpressionType.INSTRUCTION).visit(tree);

        } catch (IOException e) {
            System.err.println("Failed to read file: " + params.get("prog"));
            e.printStackTrace();
        }
    }

    private static String loadProgram() throws IOException {
        String input;
        if (params.get("prog") == null) {
            if (params.get("sample") != null)
                input = getInputFromResources((int) params.get("sample"));
            else
                input = getInputFromResources(1);
        } else {
            input = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get((String) params.get("prog"))));
        }
        return input;
    }

    private static String getInputFromResources(int sampleNumber) throws IOException {
        String input;
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream("programs/sample" + sampleNumber + ".txt")) {
            if (is == null) {
                throw new IOException("Resource not found: " + params.get("prog"));
            }
            input = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
        return input;
    }

    private static ParseTree parseProgramToTree(String input) {
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

            if (arg.startsWith("-sample=")) {
                String[] parts = arg.split("=");
                if (parts.length != 2) {
                    System.err.println("Invalid argument: " + arg);
                    System.exit(1);
                }
                params.put("sample", Integer.parseInt(parts[1]));
                System.out.println("Using sample program: " + parts[1]);
            }

        }
    }
}
