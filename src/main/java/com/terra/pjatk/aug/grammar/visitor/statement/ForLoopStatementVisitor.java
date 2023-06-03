package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.visitor.InstructionVisitor;
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
        contextProvider.getDebugger().log( "line-{} - Interpreting for loop statement", ctx.start.getLine());
        contextProvider.getVisitor(ExpressionType.ASSIGN).visit(ctx.assign_stat());

        String variable = ctx.assign_stat().IDENT().getText();
        int value = (int) contextProvider.getMemoryManager().get(variable);

        int endValue = (int) contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());

        contextProvider.getDebugger().log( "line-{} - For loop statement will iterate from {} to {}", ctx.start.getLine(), value, endValue
        );


        int counter = 0;
        while ((int) contextProvider.getMemoryManager().get(variable) <= endValue) {

            contextProvider.getDebugger().log( "line-{} - Iteration number {}", ctx.start.getLine(), counter);

            try {
                contextProvider.getVisitor(ExpressionType.INSTRUCTION).visit(ctx.simple_instr());
            } catch (InstructionVisitor.BreakException e) {
                contextProvider.getDebugger().log( "line-{} - Break statement has been called", e.getLine());
                break;
            } catch (InstructionVisitor.ContinueException e) {
                contextProvider.getDebugger().log( "line-{} - Continue statement has been called", e.getLine());
            } finally {
                contextProvider.getDebugger().log( "line-{} - Incrementing variable {}", ctx.start.getLine(), variable);
                contextProvider.getMemoryManager().update(variable, (int) contextProvider.getMemoryManager().get(variable) + 1);
                counter++;
            }

        }

        contextProvider.getDebugger().log( "line-{} - For loop statement has been finished. Removing variable {}", ctx.start.getLine(), variable);
        contextProvider.getMemoryManager().remove(variable);
        contextProvider.getDebugger().log( "line-{} - Variable {} has been removed", ctx.start.getLine(), variable);

        return null;
    }


}
