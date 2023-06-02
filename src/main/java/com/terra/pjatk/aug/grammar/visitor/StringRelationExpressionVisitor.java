package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.tree.ParseTree;


@RequiredArgsConstructor
public class StringRelationExpressionVisitor extends AugGrammarBaseVisitor<Boolean> {

    private final ContextProvider provider;


    @Override
    public Boolean visitStr_rel_expr(AugGrammarParser.Str_rel_exprContext ctx) {
        return switch (ctx.str_rel().getText()) {
            case "==" -> visitStr_eq_rel(ctx.str_rel().str_eq_rel());
            case "!=" -> visitStr_neq_rel(ctx.str_rel().str_neq_rel());
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getChild(1).getText());
        };
    }

    @Override
    public Boolean visitStr_eq_rel(AugGrammarParser.Str_eq_relContext ctx) {
        String[] strings = getStringParts(ctx);
        return strings[0].equals(strings[1]);
    }

    @Override
    public Boolean visitStr_neq_rel(AugGrammarParser.Str_neq_relContext ctx) {
        String[] strings = getStringParts(ctx);
        return !strings[0].equals(strings[1]);
    }

    private String[] getStringParts(ParseTree ctx) {
        String left = (String) provider.getVisitor(ExpressionType.STRING).visit(ctx.getChild(0));
        String right = (String) provider.getVisitor(ExpressionType.STRING).visit(ctx.getChild(2));
        return new String[]{left, right};
    }
}
