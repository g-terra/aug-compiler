package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import lombok.extern.slf4j.Slf4j;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.*;

@Slf4j
public class ProgramVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider contextProvider;

    public ProgramVisitor(
            ContextProvider contextProvider
    ) {
        this.contextProvider = contextProvider;
    }

    @Override
    public Object visitProgram(ProgramContext ctx) {
        contextProvider.getDebugger().log("Starting interpretation of program");
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitAssign_stat(Assign_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.ASSIGN).visit(ctx);
    }

    @Override
    public Object visitOutput_stat(Output_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.OUTPUT).visit(ctx);
    }

    @Override
    public Object visitIf_stat(If_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.IF_STATEMENT).visit(ctx);
    }

    @Override
    public Object visitInstr_block(Instr_blockContext ctx) {
        return contextProvider.getVisitor(ExpressionType.INSTR_BLOCK).visit(ctx);
    }

}
