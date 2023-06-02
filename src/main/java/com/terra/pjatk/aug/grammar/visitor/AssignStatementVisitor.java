package com.terra.pjatk.aug.grammar.visitor;

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
        String variableName = ctx.IDENT().getText();

        Object value = null;
        DataType type = null;

        if (Objects.nonNull(ctx.ident())) {
            IdentContext identContext = ctx.ident();
            value = visitIdent(identContext);
            type = contextProvider.getMemoryManager().getType(identContext.IDENT().getText()).orElseThrow();
        }

        if (Objects.nonNull(ctx.num_expr())) {
            value = contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());
            type = DataType.NUMBER;
        }

        if (Objects.nonNull(ctx.str_expr())) {
            value = contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr());
            type = DataType.STRING;
        }

        contextProvider.getMemoryManager().add(variableName, value, type);

        contextProvider.getDebugger().log("Variable '{}' has been assigned with value '{}' of type '{}'",
                variableName,
                value,
                type
        );

        return value;
    }

    @Override
    public Object visitIdent(IdentContext ctx) {

        String variableName = ctx.IDENT().getText();

        Optional<DataType> type = contextProvider.getMemoryManager().getType(variableName);

        if (type.isEmpty()) {
            throw new RuntimeException("Variable '" + variableName + "' is not defined");
        }

        return contextProvider.getMemoryManager().get(variableName);
    }

}
