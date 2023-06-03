package com.terra.pjatk.aug.grammar.visitor.expression;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import lombok.RequiredArgsConstructor;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.*;

@RequiredArgsConstructor
public class NumberExpressionVisitor extends AugGrammarBaseVisitor<Integer> {


    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String MODULO = "%";


    private final ContextProvider contextProvider;

    @Override
    public Integer visitPrintable_num_expr(Printable_num_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting printable num expression: {}", ctx.getStart().getLine(), ctx.getText());
        return visitNum_expr(ctx.num_expr());
    }

    @Override
    public Integer visitNum_expr(Num_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting num expression: {}", ctx.getStart().getLine(), ctx.getText());
        if (ctx.num_expr() != null) {
            String operator = ctx.getChild(1).getText();
            int firstExprResult = visit(ctx.num_expr());
            int secondExprResult = visit(ctx.t_num_expr());
            return switch (operator) {
                case ADDITION -> sum(firstExprResult, secondExprResult);
                case SUBTRACTION -> subtract(firstExprResult, secondExprResult);
                default -> throw new IllegalArgumentException("line " + ctx.getStart().getLine() + " - Unexpected operator: " + operator);
            };
        }
        return visit(ctx.t_num_expr());
    }



    @Override
    public Integer visitT_num_expr(T_num_exprContext ctx) {
        T_num_exprContext t_num_expr = ctx.t_num_expr();
        if (t_num_expr != null) {
            String operator = ctx.getChild(1).getText();
            int firstExprResult = visit(t_num_expr);
            int secondExprResult = visit(ctx.f_num_expr());

            return switch (operator) {
                case MULTIPLICATION -> multiply(firstExprResult, secondExprResult);
                case DIVISION -> divide(firstExprResult, secondExprResult);
                case MODULO -> modulo(firstExprResult, secondExprResult);
                default -> throw new IllegalArgumentException("line " + ctx.getStart().getLine() + " - Unexpected operator: " + operator);
            };
        }
        return visit(ctx.f_num_expr());
    }


    @Override
    public Integer visitRead_int(Read_intContext ctx) {
        return contextProvider.getInputReader().readInteger();
    }

    @Override
    public Integer visitNegate(NegateContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting negate expression: {}", ctx.getStart().getLine(), ctx.getText());
        return -1 * visit(ctx.num_expr());
    }

    @Override
    public Integer visitSub_num_expr(Sub_num_exprContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting sub num expression: {}", ctx.getStart().getLine(), ctx.getText());
        return visit(ctx.num_expr());
    }

    @Override
    public Integer visitLength(LengthContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting length expression: {}", ctx.getStart().getLine(), ctx.getText());
        String param = ((String) contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr()));
        return param.length();
    }

    @Override
    public Integer visitPosition(PositionContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting position expression: {}", ctx.getStart().getLine(), ctx.getText());
        String str = (String) contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr(0));
        String str2 = (String) contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr(1));

        int position = str.indexOf(str2);
        if (position == -1) {
            return 0;
        } else {
            return position + 1;
        }
    }

    @Override
    public Integer visitNum(NumContext ctx) {
        contextProvider.getDebugger().log("line {} - Interpreting num expression: {}", ctx.getStart().getLine(), ctx.getText());
        return Integer.parseInt(ctx.NUM().getText());
    }

    @Override
    public Integer visitIdent(IdentContext ctx) {

        contextProvider.getDebugger().log("line {} - Interpreting numerical ident expression: {}", ctx.getStart().getLine(), ctx.getText());

        String ident = ctx.IDENT().getText();

        Integer value = (Integer) contextProvider.getMemoryManager().get(ident);

        if (value != null) return value;

        contextProvider.getDebugger().log("line {} - Variable not found . Creating new variable with default value: {}", ctx.getStart().getLine(), ctx.getText());

        contextProvider.getMemoryManager().add(ident, DataType.NUMBER);

        return (int) (contextProvider.getMemoryManager().get(ident));
    }


    private Integer sum(Integer first, Integer second) {
        contextProvider.getDebugger().log("Interpreting add expression: {} + {}", first, second);
        return first + second;
    }

    private Integer subtract(Integer first, Integer second) {
        contextProvider.getDebugger().log("Interpreting sub expression: {} - {}", first, second);
        return first - second;
    }

    private Integer multiply(Integer first, Integer second) {
        contextProvider.getDebugger().log("Interpreting mul expression: {} * {}", first, second);
        return first * second;
    }

    private Integer divide(Integer first, Integer second) {
        contextProvider.getDebugger().log("Interpreting div expression: {} / {}", first, second);
        return first / second;
    }

    private Integer modulo(Integer first, Integer second) {
        contextProvider.getDebugger().log("Interpreting mod expression: {} % {}", first, second);
        return first % second;
    }




}
