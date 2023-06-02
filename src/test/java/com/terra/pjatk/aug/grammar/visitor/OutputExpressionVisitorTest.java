package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.utils.TestOutputPrinter;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class OutputExpressionVisitorTest {

    OutputExpressionVisitor outputExpressionVisitor;

    TestOutputPrinter outputPrinter = new TestOutputPrinter();

    StringExpressionVisitor stringExpressionVisitor;

    NumberExpressionVisitor numberExpressionVisitor;

    @BeforeEach
    void setUp() {

        stringExpressionVisitor = Mockito.mock(StringExpressionVisitor.class);
        numberExpressionVisitor = Mockito.mock(NumberExpressionVisitor.class);

        var provider = AugGrammarContextProvider.builder()
                .outputPrinter(outputPrinter)
                .memoryManager(mock(MemoryManager.class))
                .inputReader(mock(InputReader.class))
                .build();

        provider.registerVisitor(ExpressionType.STRING,stringExpressionVisitor);
        provider.registerVisitor(ExpressionType.NUMBER, numberExpressionVisitor);


        outputExpressionVisitor = new OutputExpressionVisitor(provider);

    }


    @Test
    void should_print_string() {
        // Arrange
        var program = "print(\"hello\");";
        when(stringExpressionVisitor.visit(any())).thenReturn("hello");

        // Act
        visitOutputExpression(program);

        // Assert
        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("hello");
    }

    @Test
    void should_print_number() {
        // Arrange
        var program = "print(1);";
        when(numberExpressionVisitor.visit(any())).thenReturn(1);

        // Act
        visitOutputExpression(program);

        // Assert
        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("1");
    }

    @Test
    void should_throw_error_for_undefined_variable() {

        // Arrange
        var program = "print(x);";

        // Act & Assert
        assertThatThrownBy(() -> visitOutputExpression(program))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Undefined variable: x");

    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("printStringExprProvider")
    public void should_evaluate_input_as_string_exp(String expression) {

        // Act
        visitOutputExpression(expression);

        // Assert
        verify(stringExpressionVisitor).visit(any());
    }


    private static Stream<Arguments> printStringExprProvider() {
        return Stream.of(
                Arguments.of("print(\"hello\")"),
                Arguments.of("print(\"\")"),
                Arguments.of("print(concatenate(\"hello\",\"world\"))"),
                Arguments.of("print(substring(a,length(a),1));")
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("printNumExpProvider")
    public void should_evaluate_input_as_number_exp(String expression) {
        // Act
        visitOutputExpression(expression);

        // Assert
        verify(numberExpressionVisitor).visit(any());
    }


    private static Stream<Arguments> printNumExpProvider() {
        return Stream.of(
                Arguments.of("print(1)"),
                Arguments.of("print(2*x)"),
                Arguments.of("print(2*x+1)"),
                Arguments.of("print(2*x+1+2)"),
                Arguments.of("print(2*x+1+2+3)"),
                Arguments.of("print((2*x+1)+2+(3+4))"),
                Arguments.of("print(length(\"hello\"))"),
                Arguments.of("print(position(\"hello\",O))")
        );
    }


    private void visitOutputExpression(String expression) {
        outputExpressionVisitor.visit(ProgramParser.parse(expression).output_stat());
    }

}