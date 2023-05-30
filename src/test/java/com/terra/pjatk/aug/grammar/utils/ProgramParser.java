package com.terra.pjatk.aug.grammar.utils;

import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ProgramParser {

    public static AugGrammarParser parse(String program) {

        CharStream codePointCharStream = CharStreams.fromString(program);
        AugGrammarLexer lexer = new AugGrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new AugGrammarParser(tokens);
    }
}
