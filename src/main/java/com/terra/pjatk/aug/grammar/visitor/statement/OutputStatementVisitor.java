package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class OutputStatementVisitor extends AugGrammarBaseVisitor<Object> {


    private final ContextProvider contextProvider;

    @Override
    public Object visitOutput_stat(AugGrammarParser.Output_statContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting output statement", ctx.start.getLine());
        contextProvider.getOutputPrinter().print(String.valueOf(visitPrintable_expr(ctx.printable_expr())));
        return null;
    }

    @Override
    public Object visitPrintable_expr(AugGrammarParser.Printable_exprContext ctx) {

        if (Objects.nonNull(ctx.printable_undef())) {

            //to handle false positives such as for loop variable
            String variableName = ctx.printable_undef().IDENT().getText();
            if (contextProvider.getMemoryManager().getType(variableName).isPresent()) {

                DataType type = contextProvider.getMemoryManager().getType(variableName).get();

                if (type == DataType.NUMBER) {
                    return visitPrintable_num_expr((AugGrammarParser.Printable_num_exprContext) ctx.getRuleContext());
                }

                if (type == DataType.STRING) {
                    return visitPrintable_str_expr((AugGrammarParser.Printable_str_exprContext) ctx.getRuleContext());
                }

            }
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
        contextProvider.getDebugger().log("line {} - Interpreting printable as undefined variable {}", ctx.start.getLine(), ctx.IDENT().getText());
        throw new RuntimeException("Undefined variable: " + ctx.IDENT().getText());
    }

    @Override
    public Integer visitPrintable_num_expr(AugGrammarParser.Printable_num_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting printable as number expression {}", ctx.start.getLine(), ctx.getText());
        return (Integer) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());
    }

    @Override
    public String visitPrintable_str_expr(AugGrammarParser.Printable_str_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting printable as string expression {}", ctx.start.getLine(), ctx.getText());
        return (String) contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr());
    }

}
