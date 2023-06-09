package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.visitor.InstructionVisitor;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ParseTreeArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

class InstructionBlockStatementVisitorTest {

    InstructionVisitor instructionVisitor;

    InstructionBlockStatementVisitor instructionBlockStatementVisitor;
    @BeforeEach
    void setUp() {
        var provider = AugGrammarContextProvider.builder()
                .memoryManager(mock(MemoryManager.class))
                .inputReader(mock(InputReader.class))
                .debugger(mock(Debugger.class))
                .build();

        instructionVisitor = mock(InstructionVisitor.class);

        provider.registerVisitor(ExpressionType.INSTRUCTION, instructionVisitor);

        instructionBlockStatementVisitor = new InstructionBlockStatementVisitor(provider);
    }


    @Test
    void should_visit_instruction_block() {
        // Arrange
        var statement = "begin print(\"hello\"); print(\"world\"); end;";

        // Act
        visitInstructionBlockStatement(statement);

        // Assert
        verify(instructionVisitor).visit(argThat(new ParseTreeArgumentMatcher("print(\"hello\");print(\"world\");")));

    }

    private void visitInstructionBlockStatement(String statement) {
        instructionBlockStatementVisitor.visit(ProgramParser.parse(statement).program());
    }

}