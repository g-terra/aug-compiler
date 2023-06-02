package com.terra.pjatk.aug.grammar.visitor;

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
    public String visitPrintable_str_expr(AugGrammarParser.Printable_str_exprContext ctx) {
        contextProvider.getDebugger().log("Visiting printable expression as str_expr. Expression: {}", ctx.str_expr().getText());
        return visitStr_expr(ctx.str_expr());
    }

    @Override
    public String visitRead_str(AugGrammarParser.Read_strContext ctx) {
        return contextProvider.getInputReader().readString();
    }

    @Override
    public String visitConcatenate(AugGrammarParser.ConcatenateContext ctx) {
        return visit(ctx.str_expr(0)) + visit(ctx.str_expr(1));
    }

    @Override
    public String visitSubstring(AugGrammarParser.SubstringContext ctx) {

        String str = visitStr_expr(ctx.str_expr());
        int pos = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr(0));
        int length = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr(1));

        if (pos < 1 || pos > str.length() || length <= 0) return "";

        if (pos + length - 1 > str.length()) return str.substring(pos - 1);

        return str.substring(pos - 1, pos + length - 1);
    }

    @Override
    public String visitString(AugGrammarParser.StringContext ctx) {
        return ctx.STRING().getText().replace("\"", "");
    }

    @Override
    public String visitIdent(AugGrammarParser.IdentContext ctx) {

        String ident = ctx.IDENT().getText();

        String value = (String) contextProvider.getMemoryManager().get(ident);
        if (value != null) return value;

        contextProvider.getMemoryManager().add(ident, DataType.STRING);
        return String.valueOf(contextProvider.getMemoryManager().get(ident));
    }
}
