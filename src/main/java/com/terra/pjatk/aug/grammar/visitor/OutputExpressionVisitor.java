package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.visitor.provider.ExpressionType;
import com.terra.pjatk.aug.grammar.visitor.provider.VisitorProvider;
import com.terra.pjatk.aug.utils.console.printer.OutputPrinter;

import java.util.Objects;

public class OutputExpressionVisitor extends AugGrammarBaseVisitor<Object> {


    private final OutputPrinter outputPrinter;
    private final VisitorProvider visitorProvider;

    public OutputExpressionVisitor(
            VisitorProvider visitorProvider
    ) {
        this.visitorProvider = visitorProvider;
        this.outputPrinter = visitorProvider.getOutputPrinter();
    }

    @Override
    public Object visitOutput_stat(AugGrammarParser.Output_statContext ctx) {
        outputPrinter.print(String.valueOf(visitPrintable_expr(ctx.printable_expr())));
        return null;
    }

    @Override
    public Object visitPrintable_expr(AugGrammarParser.Printable_exprContext ctx) {
        if (Objects.nonNull(ctx.printable_undef())) {
            return visitPrintable_undef(ctx.printable_undef());
        } else if (Objects.nonNull(ctx.printable_num_expr())) {
            return visitPrintable_num_expr(ctx.printable_num_expr());
        } else if (Objects.nonNull(ctx.printable_str_expr())) {
            return visitPrintable_str_expr(ctx.printable_str_expr());
        }
        return null;
    }

    @Override
    public Object visitPrintable_undef(AugGrammarParser.Printable_undefContext ctx) {
        throw new RuntimeException("Undefined variable: " + ctx.IDENT().getText());
    }

    @Override
    public Integer visitPrintable_num_expr(AugGrammarParser.Printable_num_exprContext ctx) {
        return (Integer) visitorProvider.provide(ExpressionType.NUMBER).visit(ctx.num_expr());
    }

    @Override
    public String visitPrintable_str_expr(AugGrammarParser.Printable_str_exprContext ctx) {
        return (String) visitorProvider.provide(ExpressionType.STRING).visit(ctx.str_expr());
    }


}
