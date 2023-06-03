package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import lombok.RequiredArgsConstructor;

import java.util.Objects;
import java.util.Optional;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.Assign_statContext;
import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.IdentContext;

@RequiredArgsConstructor
public class AssignStatementVisitor extends AugGrammarBaseVisitor<Object> {

    private final ContextProvider contextProvider;

    @Override
    public Object visitAssign_stat(Assign_statContext ctx) {

        contextProvider.getDebugger().log("line {} - Interpreting assign statement", ctx.start.getLine());
        String variableName = ctx.IDENT().getText();

        Object value = null;
        DataType type = null;

        if (Objects.nonNull(ctx.ident())) {
            contextProvider.getDebugger().log("line {} - Interpreting assign statement with ident", ctx.start.getLine());
            IdentContext identContext = ctx.ident();
            value = visitIdent(identContext);
            type = contextProvider.getMemoryManager().getType(identContext.IDENT().getText()).orElseThrow();
        }

        if (Objects.nonNull(ctx.num_expr())) {
            contextProvider.getDebugger().log("line {} - Interpreting assign statement with num_expr", ctx.start.getLine());
            value = contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());
            type = DataType.NUMBER;
        }

        if (Objects.nonNull(ctx.str_expr())) {
            contextProvider.getDebugger().log("line {} - Interpreting assign statement with str_expr", ctx.start.getLine());
            value = contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr());
            type = DataType.STRING;
        }


        contextProvider.getMemoryManager().add(variableName, value, type);
        contextProvider.getDebugger().log("line {} - Variable '{}' has been saved to memory with value '{}' of type '{}'",
                ctx.start.getLine(),
                variableName,
                value,
                type
        );


        return value;
    }

    @Override
    public Object visitIdent(IdentContext ctx) {

        contextProvider.getDebugger().log("line {} - Interpreting ident expression: {}", ctx.getStart().getLine(), ctx.getText());

        String variableName = ctx.IDENT().getText();

        Optional<DataType> type = contextProvider.getMemoryManager().getType(variableName);

        if (type.isEmpty()) {
            throw new RuntimeException("line " + ctx.getStart().getLine() + " - Variable '" + variableName + "' has not been initialized and type cannot be inferred");
        }

        return contextProvider.getMemoryManager().get(variableName);
    }

}
