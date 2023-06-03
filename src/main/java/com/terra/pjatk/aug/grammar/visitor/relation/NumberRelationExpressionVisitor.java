package com.terra.pjatk.aug.grammar.visitor.relation;

import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NumberRelationExpressionVisitor extends AugGrammarBaseVisitor<Boolean> {

    private static final String EQUAL = "=";
    private static final String NOT_EQUAL = "<>";
    private static final String GREATER_THAN = ">";
    private static final String GREATER_OR_EQUAL_THAN = ">=";
    private static final String LESS_THAN = "<";
    private static final String LESS_OR_EQUAL_THAN = "<=";

    private final ContextProvider provider;

    @Override
    public Boolean visitNum_rel_expr(AugGrammarParser.Num_rel_exprContext ctx) {


        provider.getDebugger().log("line {} - Interpreting number relation expression: {}", ctx.getStart().getLine(), ctx.getText());

        Integer left = (Integer) provider.getVisitor(ExpressionType.NUMBER).visit(ctx.getChild(0));
        Integer right = (Integer) provider.getVisitor(ExpressionType.NUMBER).visit(ctx.getChild(2));

        return switch (ctx.num_rel().getText()) {
            case EQUAL -> evalEqual(left, right);
            case NOT_EQUAL -> evalNotEqual(left, right);
            case GREATER_THAN -> evalGreaterThan(left, right);
            case GREATER_OR_EQUAL_THAN -> evalGreaterOrEqualThan(left, right);
            case LESS_THAN -> evalLessThan(left, right);
            case LESS_OR_EQUAL_THAN -> evalLessOrEqualThan(left, right);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getChild(1).getText());
        };
    }

    private boolean evalEqual(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical EQUAl expression: {} = {}", left, right);
        return left.equals(right);
    }

    private boolean evalNotEqual(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical NOT EQUAL expression: {} <> {}", left, right);
        return !left.equals(right);
    }

    private boolean evalGreaterThan(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical GREATER THAN expression: {} > {}", left, right);
        return left > right;
    }

    private boolean evalGreaterOrEqualThan(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical GREATER OR EQUAL THAN expression: {} >= {}", left, right);
        return left >= right;
    }

    private boolean evalLessThan(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical LESS THAN expression: {} < {}", left, right);
        return left < right;
    }

    private boolean evalLessOrEqualThan(Integer left, Integer right) {
        provider.getDebugger().log("line {} - Interpreting numerical LESS OR EQUAL THAN expression: {} <= {}", left, right);
        return left <= right;
    }

}

