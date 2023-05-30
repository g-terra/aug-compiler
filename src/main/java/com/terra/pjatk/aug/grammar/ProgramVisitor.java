package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
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
    public Object visitAssign_stat(Assign_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.ASSIGN).visit(ctx);
    }

    @Override
    public Object visitIdent(IdentContext ctx) {
        return contextProvider.getVisitor(ExpressionType.ASSIGN).visit(ctx);
    }

    @Override
    public Object visitOutput_stat(Output_statContext ctx) {
        return contextProvider.getVisitor(ExpressionType.OUTPUT).visit(ctx);
    }

    @Override
    public Object visitNum_expr(AugGrammarParser.Num_exprContext ctx) {
        return contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx);
    }

    @Override
    public Object visitStr_expr(AugGrammarParser.Str_exprContext ctx) {
        return contextProvider.getVisitor(ExpressionType.STRING).visit(ctx);
    }

}
