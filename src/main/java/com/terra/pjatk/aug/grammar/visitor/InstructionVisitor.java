package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.*;

@Slf4j
public class InstructionVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider contextProvider;

    public InstructionVisitor(
            ContextProvider contextProvider
    ) {
        this.contextProvider = contextProvider;
    }

    @Override
    public Object visitProgram(ProgramContext ctx) {
        try {
            contextProvider.getDebugger().log("Starting interpretation of program");
            return super.visitProgram(ctx);
        } catch (ExitException e) {
            contextProvider.getDebugger().log("Exit statement");
            return "exited";
        }
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
        return contextProvider.getVisitor(ExpressionType.INSTRUCTION_BLOCK).visit(ctx);
    }

    @Override
    public Object visitFor_stat(For_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.FOR_LOOP_STATEMENT).visit(ctx);
    }

    @Override
    public Object visitBreak_stat(Break_statContext ctx) {
        throw new BreakException(ctx.start.getLine());
    }

    @Override
    public Object visitContinue_stat(Continue_statContext ctx) {
        throw new ContinueException(ctx.start.getLine());
    }

    @Override
    public Object visitExit_stat(Exit_statContext ctx) {
        throw new ExitException(ctx.start.getLine());
    }


    public static class BreakException extends RuntimeException {

        private final int line;
        public BreakException(int line) {
            super("Break statement");
            this.line = line;
        }

        public int getLine() {
            return line;
        }
    }

    public static class ContinueException extends RuntimeException {
        private final int line;
        public ContinueException(int line) {
            super("Continue statement");
            this.line = line;
        }

        public int getLine() {
            return line;
        }
    }

    public static class ExitException extends RuntimeException {

        private final int line;
        public ExitException(int line) {
            super("Exit statement");
            this.line = line;
        }

        public int getLine() {
            return line;
        }
    }
}
