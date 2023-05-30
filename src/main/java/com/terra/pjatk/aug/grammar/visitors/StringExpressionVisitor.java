package com.terra.pjatk.aug.grammar.visitors;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.core.AugGrammarVisitor;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import lombok.Setter;


public class StringExpressionVisitor extends AugGrammarBaseVisitor<String> {


    private final MemoryManager memoryManager;
    private final Debugger debugger;
    private final InputReader inputReader;
    @Setter
    private AugGrammarVisitor<Integer> numberExpressionVisitor;

    public StringExpressionVisitor(
            MemoryManager memoryManager,
            Debugger debugger,
            InputReader inputReader
    ) {
        this.memoryManager = memoryManager;
        this.debugger = debugger;
        this.inputReader = inputReader;
    }

    @Override
    public String visitPrintable_str_expr(AugGrammarParser.Printable_str_exprContext ctx) {
        debugger.log("Visiting printable expression as str_expr. Expression: {}", ctx.str_expr().getText());
        return visitStr_expr(ctx.str_expr());
    }

    @Override
    public String  visitStr_expr(AugGrammarParser.Str_exprContext ctx) {
        return switch (ctx.children.get(0).getClass().getSimpleName()) {
            case "StringContext" -> visitString(ctx.string());
            case "IdentContext" -> visitIdent(ctx.ident());
            case "Read_strContext" -> visitRead_str(ctx.read_str());
            case "ConcatenateContext" -> visitConcatenate(ctx.concatenate());
            case "SubstringContext" -> visitSubstring(ctx.substring());
            default ->
                    throw new RuntimeException("Unexpected value: " + ctx.children.get(0).getClass().getSimpleName() + " at line: " + ctx.start.getLine());
        };
    }

    @Override
    public String visitRead_str(AugGrammarParser.Read_strContext ctx) {
        return inputReader.readString();
    }

    @Override
    public String visitConcatenate(AugGrammarParser.ConcatenateContext ctx) {
        return visit(ctx.str_expr(0)) + visit(ctx.str_expr(1));
    }

    @Override
    public String visitSubstring(AugGrammarParser.SubstringContext ctx) {

        String str = visitStr_expr(ctx.str_expr());
        int pos = numberExpressionVisitor.visit(ctx.num_expr(0));
        int length = numberExpressionVisitor.visit(ctx.num_expr(1));

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

        String value = (String) memoryManager.get(ident);
        if (value != null) return value;

        memoryManager.add(ident, DataType.STRING);
        return String.valueOf(memoryManager.get(ident));
    }
}
