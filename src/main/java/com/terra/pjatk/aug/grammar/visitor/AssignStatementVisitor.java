package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.context.ContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;

import java.util.Objects;
import java.util.Optional;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.Assign_statContext;
import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.IdentContext;

public class AssignStatementVisitor extends AugGrammarBaseVisitor<Object> {


    ContextProvider contextProvider;
    private final MemoryManager memoryManager;

    private final Debugger debugger;

    public AssignStatementVisitor(ContextProvider contextProvider) {
        this.contextProvider = contextProvider;
        this.memoryManager = contextProvider.getMemoryManager();
        this.debugger = contextProvider.getDebugger();
    }

    @Override
    public Object visitAssign_stat(Assign_statContext ctx) {
        String variableName = ctx.IDENT().getText();

        Object value = null;
        DataType type = null;

        if (Objects.nonNull(ctx.ident())) {
            IdentContext identContext = ctx.ident();
            value = visitIdent(identContext);
            type = memoryManager.getType(identContext.IDENT().getText()).orElseThrow();
        }

        if (Objects.nonNull(ctx.num_expr())) {
            value = contextProvider.getVisitor(ExpressionType.NUMBER).visit(ctx.num_expr());
            type = DataType.NUMBER;
        }

        if (Objects.nonNull(ctx.str_expr())) {
            value = contextProvider.getVisitor(ExpressionType.STRING).visit(ctx.str_expr());
            type = DataType.STRING;
        }

        memoryManager.add(variableName, value, type);

        debugger.log("Variable '{}' has been assigned with value '{}' of type '{}'",
                variableName,
                value,
                type
        );

        return value;
    }

    @Override
    public Object visitIdent(IdentContext ctx) {

        String variableName = ctx.IDENT().getText();

        Optional<DataType> type = memoryManager.getType(variableName);

        if (type.isEmpty()) {
            throw new RuntimeException("Variable '" + variableName + "' is not defined");
        }

        return memoryManager.get(variableName);
    }

}
