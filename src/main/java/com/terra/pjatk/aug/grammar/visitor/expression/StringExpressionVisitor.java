package com.terra.pjatk.aug.grammar.visitor.expression;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class StringExpressionVisitor extends AugGrammarBaseVisitor<String> {

    private final ContextProvider contextProvider;

    @Override
    public String visitRead_str(AugGrammarParser.Read_strContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting read string expression: {}", ctx.getStart().getLine(), ctx.getText());
        return contextProvider.getInputReader().readString();
    }

    @Override
    public String visitConcatenate(AugGrammarParser.ConcatenateContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting concatenate expression: {}", ctx.getStart().getLine(), ctx.getText());
        return visit(ctx.str_expr(0)) + visit(ctx.str_expr(1));
    }

    @Override
    public String visitSubstring(AugGrammarParser.SubstringContext ctx) {

        contextProvider.getDebugger().log("line {} - Interpreting substring expression: {}", ctx.getStart().getLine(), ctx.getText());

        String str = visitStr_expr(ctx.str_expr());
        int pos = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr(0));
        int length = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr(1));

        contextProvider.getDebugger().log("line {} - substring: {} pos: {} length: {}", ctx.getStart().getLine(), str, pos, length);

        if (pos < 1 || pos > str.length() || length <= 0) return "";

        if (pos + length - 1 > str.length()) return str.substring(pos - 1);

        return str.substring(pos - 1, pos + length - 1);
    }

    @Override
    public String visitString(AugGrammarParser.StringContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting string expression: {}", ctx.getStart().getLine(), ctx.getText());
        return ctx.STRING().getText().replace("\"", "");
    }

    @Override
    public String visitIdent(AugGrammarParser.IdentContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting string ident expression: {}", ctx.getStart().getLine(), ctx.getText());

        String ident = ctx.IDENT().getText();

        String value = (String) contextProvider.getMemoryManager().get(ident);
        if (value != null) return value;

        contextProvider.getDebugger().log("line {} - Variable not found . Creating new variable with default value: {}", ctx.getStart().getLine(), ctx.getText());

        contextProvider.getMemoryManager().add(ident, DataType.STRING);
        return String.valueOf(contextProvider.getMemoryManager().get(ident));
    }
}
