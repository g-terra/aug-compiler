package com.terra.pjatk.aug;

import com.terra.pjatk.aug.grammar.AugVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.utils.console.printer.ConsolePrinter;
import com.terra.pjatk.aug.utils.console.reader.ConsoleReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Main {

    public static final Map<String, Object> params = new java.util.HashMap<>();

    //initialize default values
    static {
        params.put("debug", false);
        params.put("prog", "prog1.txt");
    }

    public static void main(String[] args) {


        handleArgs(args);

        try {
            // Read the input file.
            String input;
            try (InputStream is = Main.class.getClassLoader().getResourceAsStream("programs/" + params.get("prog"))) {
                if (is == null) {
                    throw new IOException("Resource not found: " + params.get("prog"));
                }
                input = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }

            // Create a lexer and parser for the input.
            AugGrammarLexer lexer = new AugGrammarLexer(CharStreams.fromString(input));
            AugGrammarParser parser = new AugGrammarParser(new CommonTokenStream(lexer));

            // Parse the input to create a parse tree.
            ParseTree tree = parser.program();

            Debugger debugger = new Debugger((boolean) params.get("debug"));



            AugVisitor visitor = new AugVisitor(
                    new ConsoleReader(),
                    new ConsolePrinter(),
                    new AugMemoryManager(),
                    debugger
            );


            visitor.visit(tree);

        } catch (IOException e) {
            System.err.println("Failed to read file: " + params.get("prog"));
            e.printStackTrace();
        }
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
