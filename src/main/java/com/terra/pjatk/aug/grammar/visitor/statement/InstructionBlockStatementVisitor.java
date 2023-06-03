package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;

public class InstructionBlockStatementVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider contextProvider;

    public InstructionBlockStatementVisitor(
            ContextProvider contextProvider
    ) {
        this.contextProvider = contextProvider;
    }

    @Override
    public Object visitInstr_block(AugGrammarParser.Instr_blockContext ctx) {

        contextProvider.getDebugger().log("line - {}  Interpreting instruction block statement {}", ctx.start.getLine(), ctx.getText());

        Object result  = contextProvider.getVisitor(ExpressionType.INSTRUCTION).visit(ctx.instr());

        contextProvider.getDebugger().log("line - {}  Instruction block statement result: {}", ctx.stop.getLine(), result);

        return result;
    }

}
