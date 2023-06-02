package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.tree.ParseTree;

@RequiredArgsConstructor
public class NumberRelationExpressionVisitor extends AugGrammarBaseVisitor<Boolean> {
    private final ContextProvider provider;

    @Override
    public Boolean visitNum_rel_expr(AugGrammarParser.Num_rel_exprContext ctx) {
        return switch (ctx.num_rel().getText()) {
            case ">" -> visitNum_gt_rel(ctx.num_rel().num_gt_rel());
            case ">=" -> visitNum_ge_rel(ctx.num_rel().num_ge_rel());
            case "<" -> visitNum_lt_rel(ctx.num_rel().num_lt_rel());
            case "<=" -> visitNum_le_rel(ctx.num_rel().num_le_rel());
            case "=" -> visitNum_eq_rel(ctx.num_rel().num_eq_rel());
            case "<>" -> visitNum_neq_rel(ctx.num_rel().num_neq_rel());
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getChild(1).getText());
        };

    }

    @Override
    public Boolean visitNum_eq_rel(AugGrammarParser.Num_eq_relContext ctx) {
        Integer[] numbers = getNumericalParts(ctx);
        boolean result = numbers[0].equals(numbers[1]);
        provider.getDebugger().log("Evaluating numerical \"equal\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return result;
    }


    @Override
    public Boolean visitNum_gt_rel(AugGrammarParser.Num_gt_relContext ctx) {
        Integer[] numbers = getNumericalParts(ctx);
        boolean result = numbers[0] > numbers[1];
        provider.getDebugger().log("Evaluating numerical \"greater than\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return  result;
    }

    @Override
    public Boolean visitNum_ge_rel(AugGrammarParser.Num_ge_relContext ctx) {
        Integer[] numbers = getNumericalParts(ctx);
        boolean result = numbers[0] >= numbers[1];
        provider.getDebugger().log("Evaluating numerical \"greater or equal than\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return result;
    }


    @Override
    public Boolean visitNum_lt_rel(AugGrammarParser.Num_lt_relContext ctx) {
        Integer[] numbers = getNumericalParts(ctx);
        boolean result = numbers[0] < numbers[1];
        provider.getDebugger().log("Evaluating numerical \"less than\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return result;
    }

    @Override
    public Boolean visitNum_le_rel(AugGrammarParser.Num_le_relContext ctx) {
        Integer[] numbers = getNumericalParts(ctx);
        boolean result = numbers[0] <= numbers[1];
        provider.getDebugger().log("Evaluating numerical \"less or equal than\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return result;
    }

    @Override
    public Boolean visitNum_neq_rel(AugGrammarParser.Num_neq_relContext ctx) {

        Integer[] numbers = getNumericalParts(ctx);
        boolean result = !numbers[0].equals(numbers[1]);
        provider.getDebugger().log("Evaluating numerical \"not equal\".Expression {}{}{} equals {}", numbers[0], ctx.getText() ,numbers[1], result);
        return result;

    }

    private Integer[] getNumericalParts(ParseTree ctx) {
        Integer left = (Integer) provider.getVisitor(ExpressionType.NUMBER).visit(ctx.getChild(0));
        Integer right = (Integer) provider.getVisitor(ExpressionType.NUMBER).visit(ctx.getChild(2));
        return new Integer[]{left, right};
    }
}

