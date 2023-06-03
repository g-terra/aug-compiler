package com.terra.pjatk.aug.grammar.visitor.expression;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BoolExpressionVisitor extends AugGrammarBaseVisitor<Boolean> {

    private final ContextProvider contextProvider;

    @Override
    public Boolean visitBool_expr(AugGrammarParser.Bool_exprContext ctx) {

        if(ctx.bool_expr() != null){
            contextProvider.getDebugger().log("line {} - Interpreting \"or\" expression: {}", ctx.getStart().getLine(), ctx.getText());
            return visit(ctx.bool_expr()) || visit(ctx.t_bool_expr());
        }

        return visit(ctx.t_bool_expr());
    }

    @Override
    public Boolean visitT_bool_expr(AugGrammarParser.T_bool_exprContext ctx) {

        if(ctx.t_bool_expr() != null){
            contextProvider.getDebugger().log("line {} - Interpreting \"and\" expression: {}", ctx.getStart().getLine(), ctx.getText());
            return visit(ctx.t_bool_expr()) && visit(ctx.f_bool_expr());
        }

        return visit(ctx.f_bool_expr());
    }

    @Override
    public Boolean visitFalse(AugGrammarParser.FalseContext ctx) {
        return false;
    }

    @Override
    public Boolean visitTrue(AugGrammarParser.TrueContext ctx) {
        return true;
    }

    @Override
    public Boolean visitSub_bool_expr(AugGrammarParser.Sub_bool_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting sub bool expression: {}", ctx.getStart().getLine(), ctx.getText());
        return visit(ctx.bool_expr());
    }

    @Override
    public Boolean visitNot_expr(AugGrammarParser.Not_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting \"not\" expression: {}", ctx.getStart().getLine(), ctx.getText());
        return !visit(ctx.bool_expr());
    }

    @Override
    public Boolean visitNum_rel_expr(AugGrammarParser.Num_rel_exprContext ctx) {
        return (Boolean) contextProvider.getVisitor(ExpressionType.NUMBER_RELATION).visit(ctx);
    }

    @Override
    public Boolean visitStr_rel_expr(AugGrammarParser.Str_rel_exprContext ctx) {
        return (Boolean) contextProvider.getVisitor(ExpressionType.STRING_RELATION).visit(ctx);
    }
}
