package com.terra.pjatk.aug.grammar.context;

import com.terra.pjatk.aug.grammar.core.AugGrammarVisitor;

public interface ContextProvider {

    void registerVisitor(ExpressionType expressionType, AugGrammarVisitor<?> visitor);

    AugGrammarVisitor<?> getVisitor(ExpressionType expressionType);

    com.terra.pjatk.aug.grammar.memory.MemoryManager getMemoryManager();

    com.terra.pjatk.aug.grammar.debuger.Debugger getDebugger();

    com.terra.pjatk.aug.utils.console.reader.InputReader getInputReader();

    com.terra.pjatk.aug.utils.console.printer.OutputPrinter getOutputPrinter();
}
