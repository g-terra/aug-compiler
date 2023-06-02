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

        boolean conditionResult = (boolean) provider.getVisitor(ExpressionType.BOOL).visit(ctx.bool_expr());

        if (conditionResult) {
            return provider.getVisitor(ExpressionType.PROGRAM).visit(ctx.simple_instr());
        }

        return null;
    }

    @Override
    public Object visitIf_then_else_stat(AugGrammarParser.If_then_else_statContext ctx) {

        boolean conditionResult = (boolean) provider.getVisitor(ExpressionType.BOOL).visit(ctx.bool_expr());

        if (conditionResult) {
            return provider.getVisitor(ExpressionType.PROGRAM).visit(ctx.simple_instr(0));
        } else {
            return provider.getVisitor(ExpressionType.PROGRAM).visit(ctx.simple_instr(1));
        }
    }

}
