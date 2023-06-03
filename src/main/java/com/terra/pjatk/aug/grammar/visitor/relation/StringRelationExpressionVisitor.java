package com.terra.pjatk.aug.grammar.visitor.relation;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class StringRelationExpressionVisitor extends AugGrammarBaseVisitor<Boolean> {

    private static final String EQUAL = "==";
    private static final String NOT_EQUAL = "!=";
    private final ContextProvider provider;

    @Override
    public Boolean visitStr_rel_expr(AugGrammarParser.Str_rel_exprContext ctx) {
        String left = (String) provider.getVisitor(ExpressionType.STRING).visit(ctx.getChild(0));
        String right = (String) provider.getVisitor(ExpressionType.STRING).visit(ctx.getChild(2));


        return switch (ctx.str_rel().getText()) {
            case EQUAL ->evalEqual(left, right);
            case NOT_EQUAL -> evalNotEqual(left, right);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getChild(1).getText());
        };
    }

    private boolean evalEqual(String left, String right) {
        provider.getDebugger().log("line {} - Interpreting string EQUAL expression: {} = {}", left, right);
        return left.equals(right);
    }

    private boolean evalNotEqual(String left, String right) {
        provider.getDebugger().log("line {} - Interpreting string NOT EQUAL expression: {} <> {}", left, right);
        return !left.equals(right);
    }

}
