package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.grammar.ProgramVisitor;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ParseTreeArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.visitor.expression.BoolExpressionVisitor;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

class IfStatementVisitorTest {

    IfStatementVisitor ifStatementVisitor;

    BoolExpressionVisitor boolExpressionVisitor;

    ProgramVisitor programVisitor;


    @BeforeEach
    void setUp() {

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(mock(MemoryManager.class))
                .inputReader(mock(InputReader.class))
                .build();

        programVisitor = mock(ProgramVisitor.class);
        boolExpressionVisitor = mock(BoolExpressionVisitor.class);

        provider.registerVisitor(ExpressionType.PROGRAM, programVisitor);
        provider.registerVisitor(ExpressionType.BOOL, boolExpressionVisitor);


        ifStatementVisitor = new IfStatementVisitor(provider);
    }


    @Test
    void should_visit_instruction_when_condition_is_true() {
        // Arrange
        when(boolExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("true")))).thenReturn(true);
        var statement = "if true then print(\"hello\");";

        // Act
        visitIfStatement(statement);

        // Assert
        verify(programVisitor).visit(argThat(new ParseTreeArgumentMatcher("print(\"hello\")")));

    }


    @Test
    void should_not_visit_instruction_when_condition_is_false() {
        // Arrange
        when(boolExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("false")))).thenReturn(false);
        var statement = "if false then print(\"hello\");";

        // Act
        visitIfStatement(statement);

        // Assert
        verify(programVisitor, never()).visit(argThat(new ParseTreeArgumentMatcher("print(\"hello\")")));

    }


    @Test
    void should_visit_instruction_when_condition_is_true_and_else_statement_is_present() {
        // Arrange
        when(boolExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("true")))).thenReturn(true);
        var statement = "if true then print(\"hello\") else print(\"world\");";

        // Act
        visitIfStatement(statement);

        // Assert
        verify(programVisitor).visit(argThat(new ParseTreeArgumentMatcher("print(\"hello\")")));

    }


    @Test
    void should_visit_else_instruction_when_condition_is_false_and_else_statement_is_present() {
        // Arrange
        when(boolExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("false")))).thenReturn(false);
        var statement = "if false then print(\"hello\") else print(\"world\");";

        // Act
        visitIfStatement(statement);

        // Assert
        verify(programVisitor).visit(argThat(new ParseTreeArgumentMatcher("print(\"world\")")));

    }

    private void visitIfStatement(String statement) {
        ifStatementVisitor.visit(ProgramParser.parse(statement).if_stat());
    }


}