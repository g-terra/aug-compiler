package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import lombok.RequiredArgsConstructor;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.*;

@RequiredArgsConstructor
public class NumberExpressionVisitor extends AugGrammarBaseVisitor<Integer> {

    private final ContextProvider contextProvider;

    @Override
    public Integer visitPrintable_num_expr(Printable_num_exprContext ctx) {
        contextProvider.getDebugger().log("Visiting printable expression as num_expr. Expression: {}", ctx.num_expr().getText());
        return visitNum_expr(ctx.num_expr());
    }

    @Override
    public Integer visitNum_expr(Num_exprContext ctx) {
        int result = visit(ctx.t_num_expr(0));
        for (int i = 1; i < ctx.t_num_expr().size(); i++) {
            String op = ctx.getChild(i * 2 - 1).getText(); // get the operator
            int value = visit(ctx.t_num_expr(i)); // get the value of the t_num_expr
            switch (op) {
                case "+" -> result += value;
                case "-" -> result -= value;
            }
        }
        return result;
    }

    @Override
    public Integer visitT_num_expr(T_num_exprContext ctx) {
        try {
            int result = visitF_num_expr(ctx.f_num_expr(0));
            for (int i = 1; i < ctx.f_num_expr().size(); i++) {
                String op = ctx.getChild(i * 2 - 1).getText();
                int value = visitF_num_expr(ctx.f_num_expr(i));
                switch (op) {
                    case "*" -> result *= value;
                    case "/" -> result /= value;
                    case "%" -> result %= value;
                }
            }
            return result;
        } catch (ClassCastException e) {
            throw new RuntimeException("Please check your expression. A numeric expression contains a non-integer value. Expression: " + ctx.getText() + " at line: " + ctx.start.getLine());
        }
    }

    @Override
    public Integer visitF_num_expr(F_num_exprContext ctx) {
        return switch (ctx.children.get(0).getClass().getSimpleName()) {
            case "NumContext" -> visitNum(ctx.num());
            case "IdentContext" -> visitIdent(ctx.ident());
            case "Read_intContext" -> visitRead_int(ctx.read_int());
            case "NegateContext" -> visitNegate(ctx.negate());
            case "ParenContext" -> visitParen(ctx.paren());
            case "LengthContext" -> visitLength(ctx.length());
            case "PositionContext" -> visitPosition(ctx.position());
            default -> throw new RuntimeException(
                    "Unexpected value: " + ctx.children.get(0).getClass().getSimpleName() + " at line: " + ctx.start.getLine()
            );
        };
    }

    @Override
    public Integer visitRead_int(Read_intContext ctx) {
        return contextProvider.getInputReader().readInteger();
    }

    @Override
    public Integer visitNegate(NegateContext ctx) {
        return -1 * visit(ctx.num_expr());
    }

    @Override
    public Integer visitParen(ParenContext ctx) {
        return visit(ctx.num_expr());
    }

    @Override
    public Integer visitLength(LengthContext ctx) {
        String param = ((String) contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr()));
        return param.length();
    }

    @Override
    public Integer visitPosition(PositionContext ctx) {
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
        return Integer.parseInt(ctx.NUM().getText());
    }

    @Override
    public Integer visitIdent(IdentContext ctx) {

        String ident = ctx.IDENT().getText();

        Integer value = (Integer) contextProvider.getMemoryManager().get(ident);

        if (value != null) return value;

        contextProvider.getMemoryManager().add(ident, DataType.NUMBER);

        return (int) (contextProvider.getMemoryManager().get(ident));
    }


}