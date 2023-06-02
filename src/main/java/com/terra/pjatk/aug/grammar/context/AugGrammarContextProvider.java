package com.terra.pjatk.aug.grammar.context;

import com.terra.pjatk.aug.grammar.ProgramVisitor;
import com.terra.pjatk.aug.grammar.core.AugGrammarVisitor;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.visitor.expression.BoolExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.expression.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.relation.NumberRelationExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.expression.StringExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.relation.StringRelationExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.AssignStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.IfStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.OutputStatementVisitor;
import com.terra.pjatk.aug.utils.console.printer.ConsolePrinter;
import com.terra.pjatk.aug.utils.console.printer.OutputPrinter;
import com.terra.pjatk.aug.utils.console.reader.ConsoleReader;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Builder
@AllArgsConstructor
public class AugGrammarContextProvider implements ContextProvider {


    @Singular
    private final Map<ExpressionType, AugGrammarVisitor<?>> visitors = new HashMap<>();

    @Getter
    @Setter
    private MemoryManager memoryManager;

    @Getter
    @Setter
    private Debugger debugger;

    @Getter
    @Setter
    private InputReader inputReader;

    @Getter
    @Setter
    private OutputPrinter outputPrinter;

    @Override
    public void registerVisitor(ExpressionType expressionType, AugGrammarVisitor<?> visitor) {
        visitors.put(expressionType, visitor);
    }

    @Override
    public AugGrammarVisitor<?> getVisitor(ExpressionType expressionType) {
        return visitors.get(expressionType);
    }

    public static AugGrammarContextProvider defaultSetup(boolean debug) {

        Debugger debugger = new Debugger(debug);
        ConsoleReader reader = new ConsoleReader();
        MemoryManager memoryManager = new AugMemoryManager();
        ConsolePrinter printer = new ConsolePrinter();


        AugGrammarContextProvider provider = AugGrammarContextProvider.builder()
                .debugger(debugger)
                .inputReader(reader)
                .memoryManager(memoryManager)
                .outputPrinter(printer).build();



        provider.registerVisitor(ExpressionType.PROGRAM, new ProgramVisitor(provider));
        provider.registerVisitor(ExpressionType.NUMBER, new NumberExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.STRING, new StringExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.OUTPUT, new OutputStatementVisitor(provider));
        provider.registerVisitor(ExpressionType.ASSIGN, new AssignStatementVisitor(provider));
        provider.registerVisitor(ExpressionType.NUMBER_RELATION, new NumberRelationExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.STRING_RELATION, new StringRelationExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.BOOL, new BoolExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.IF_STATEMENT, new IfStatementVisitor(provider));

        return provider;

    }
}
