package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ForLoopStatementVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider contextProvider;

    @Override
    public Object visitFor_stat(AugGrammarParser.For_statContext ctx) {

        //get variable name from ctx.assign_stat
        contextProvider.getVisitor(ExpressionType.ASSIGN).visit(ctx.assign_stat());

        String variable = ctx.assign_stat().IDENT().getText();
        int value = (int) contextProvider.getMemoryManager().get(variable);

        int endValue = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());

        contextProvider.getDebugger().log( "for loop variable '{}' has been assigned with value '{}. Loop will end when it reaches value '{}')",
                variable,
                value,
                endValue
        );

        while ((int) contextProvider.getMemoryManager().get(variable) <= endValue) {
            contextProvider.getVisitor(ExpressionType.PROGRAM).visit(ctx.simple_instr());
            contextProvider.getMemoryManager().update(variable, (int) contextProvider.getMemoryManager().get(variable) + 1);
        }

        contextProvider.getMemoryManager().remove(variable);

        return null;
    }


}
