package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.utils.TestOutputPrinter;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.visitor.expression.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.expression.StringExpressionVisitor;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.Mockito.when;

public class AssignStatementVisitorTest {

    StringExpressionVisitor stringExpressionVisitor;

    NumberExpressionVisitor numberExpressionVisitor;

    AssignStatementVisitor assignStatementVisitor;

    MemoryManager memoryManager;

    InputReader inputReader;


    @BeforeEach
    void setUp() {

        inputReader = Mockito.mock(InputReader.class);
        memoryManager = Mockito.mock(AugMemoryManager.class);
        numberExpressionVisitor = Mockito.mock(NumberExpressionVisitor.class);
        stringExpressionVisitor = Mockito.mock(StringExpressionVisitor.class);

        var context = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .inputReader(inputReader)
                .debugger(new Debugger(false))
                .outputPrinter(new TestOutputPrinter())
                .build();

        context.registerVisitor(ExpressionType.NUMBER, new NumberExpressionVisitor(context));
        context.registerVisitor(ExpressionType.STRING, new StringExpressionVisitor(context));

        assignStatementVisitor = new AssignStatementVisitor(context);

    }

    @Test
    void should_assign_number() {
        // Arrange
        var statement = "a := 5;";
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", 5,DataType.NUMBER );
    }

    @Test
    void should_assign_string() {
        // Arrange
        var statement = "a := \"hello\";";
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", "hello",DataType.STRING );
    }

    @Test
    void should_assign_number_expression() {
        // Arrange
        var statement = "a := 5 + 5;";
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", 10,DataType.NUMBER );
    }


    @Test
    void should_assign_string_expression() {
        // Arrange
        var statement = "a := concatenate(\"hello\", \"world\");";
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", "helloworld",DataType.STRING );
    }


    @Test
    void should_assign_input() {
        // Arrange
        var statement = "a := readstr";
        when(inputReader.readString()).thenReturn("input");
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", "input",DataType.STRING );
    }

    @Test
    void should_assign_input_number() {
        // Arrange
        var statement = "a := readint";
        when(inputReader.readInteger()).thenReturn(5);
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", 5,DataType.NUMBER );
    }

    @Test
    void should_assign_input_number_expression() {
        // Arrange
        var statement = "a := readint + 5";
        when(inputReader.readInteger()).thenReturn(5);
        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("a", 10,DataType.NUMBER );
    }

    @Test
    void should_assign_a_variable_to_another_variable() {
        // Arrange
        var statement = "b := a;";
        when(memoryManager.getType("a")).thenReturn(Optional.of(DataType.NUMBER));
        when(memoryManager.get("a")).thenReturn(5);

        // Act
        visitAssignStatement(statement);

        // Assert
        Mockito.verify(memoryManager).add("b", 5,DataType.NUMBER );
    }






    private void visitAssignStatement(String expression) {
        assignStatementVisitor.visit(ProgramParser.parse(expression).assign_stat());
    }
}