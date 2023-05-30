package com.terra.pjatk.aug.grammar.visitor.provider;

import com.terra.pjatk.aug.grammar.core.AugGrammarVisitor;

public interface VisitorProvider {

    void addVisitor(ExpressionType expressionType, AugGrammarVisitor<?> visitor);

    AugGrammarVisitor<?> provide(ExpressionType expressionType);

    com.terra.pjatk.aug.grammar.memory.MemoryManager getMemoryManager();

    com.terra.pjatk.aug.grammar.debuger.Debugger getDebugger();

    com.terra.pjatk.aug.utils.console.reader.InputReader getInputReader();

    com.terra.pjatk.aug.utils.console.printer.OutputPrinter getOutputPrinter();
}
