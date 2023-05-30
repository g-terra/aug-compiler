package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.core.AugGrammarBaseVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.visitor.provider.ExpressionType;
import com.terra.pjatk.aug.grammar.visitor.provider.VisitorProvider;
import com.terra.pjatk.aug.utils.console.printer.OutputPrinter;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.Optional;

import static com.terra.pjatk.aug.grammar.core.AugGrammarParser.*;

@Slf4j
public class AugVisitor extends AugGrammarBaseVisitor<Object> {
    @Getter
    private final Debugger debugger;

    @Getter
    private final OutputPrinter outputPrinter;

    @Getter
    private final InputReader inputReader;
    private final VisitorProvider visitorProvider;

    private final MemoryManager memoryManager;

    public AugVisitor(
            VisitorProvider visitorProvider
    ) {

        this.outputPrinter = visitorProvider.getOutputPrinter();
        this.memoryManager = visitorProvider.getMemoryManager();
        this.debugger = visitorProvider.getDebugger();
        this.inputReader = visitorProvider.getInputReader();
        this.visitorProvider = visitorProvider;
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
            value = visitNum_expr(ctx.num_expr());
            type = DataType.NUMBER;
        }

        if (Objects.nonNull(ctx.str_expr())) {
            value = visitStr_expr(ctx.str_expr());
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

    @Override
    public Object visitOutput_stat(Output_statContext ctx) {
        return visitorProvider.provide(ExpressionType.OUTPUT).visit(ctx);
    }

    @Override
    public Object visitNum_expr(AugGrammarParser.Num_exprContext ctx) {
        return visitorProvider.provide(ExpressionType.NUMBER).visit(ctx);
    }

    @Override
    public Object visitStr_expr(AugGrammarParser.Str_exprContext ctx) {
        return visitorProvider.provide(ExpressionType.STRING).visit(ctx);
    }

}
