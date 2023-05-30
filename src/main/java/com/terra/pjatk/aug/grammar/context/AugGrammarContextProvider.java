package com.terra.pjatk.aug.grammar.context;

import com.terra.pjatk.aug.grammar.core.AugGrammarVisitor;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.visitor.AssignStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.OutputExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.StringExpressionVisitor;
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
    private MemoryManager memoryManager;

    @Getter
    private Debugger debugger;

    @Getter
    private InputReader inputReader;

    @Getter
    private OutputPrinter outputPrinter;

    @Override
    public void registerVisitor(ExpressionType expressionType, AugGrammarVisitor<?> visitor) {
        visitors.put(expressionType, visitor);
    }

    @Override
    public AugGrammarVisitor<?> getVisitor(ExpressionType expressionType) {
        return visitors.get(expressionType);
    }

    public static ContextProvider defaultSetup(boolean debug) {

        Debugger debugger = new Debugger(debug);
        ConsoleReader reader = new ConsoleReader();
        MemoryManager memoryManager = new AugMemoryManager();
        ConsolePrinter printer = new ConsolePrinter();


        ContextProvider provider = AugGrammarContextProvider.builder()
                .debugger(debugger)
                .inputReader(reader)
                .memoryManager(memoryManager)
                .outputPrinter(printer).build();



        provider.registerVisitor(ExpressionType.NUMBER, new NumberExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.STRING, new StringExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.OUTPUT, new OutputExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.ASSIGN, new AssignStatementVisitor(provider));

        return provider;

    }
}
