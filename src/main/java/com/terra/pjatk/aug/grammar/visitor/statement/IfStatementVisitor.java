package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IfStatementVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider provider;

    @Override
    public Object visitIf_then_stat(AugGrammarParser.If_then_statContext ctx) {

        provider.getDebugger().log("line - {}  Interpreting if statement {}", ctx.start.getLine(), ctx.getText());

        boolean conditionResult = (boolean) provider.getVisitor(ExpressionType.BOOL).visit(ctx.bool_expr());

        provider.getDebugger().log("line - {}  Condition result: {}", ctx.start.getLine(), conditionResult);

        if (conditionResult) {
            return provider.getVisitor(ExpressionType.INSTRUCTION).visit(ctx.simple_instr());
        }

        return null;
    }

    @Override
    public Object visitIf_then_else_stat(AugGrammarParser.If_then_else_statContext ctx) {

        provider.getDebugger().log("line - {}  Interpreting if else statement {}", ctx.start.getLine(), ctx.getText());

        boolean conditionResult = (boolean) provider.getVisitor(ExpressionType.BOOL).visit(ctx.bool_expr());

        provider.getDebugger().log("line - {}  Condition result: {}", ctx.start.getLine(), conditionResult);

        if (conditionResult) {
            return provider.getVisitor(ExpressionType.INSTRUCTION).visit(ctx.simple_instr(0));
        } else {
            return provider.getVisitor(ExpressionType.INSTRUCTION).visit(ctx.simple_instr(1));
        }
    }

}
