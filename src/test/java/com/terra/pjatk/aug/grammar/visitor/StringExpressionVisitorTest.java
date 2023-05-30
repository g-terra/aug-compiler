package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.visitor.provider.AugGrammarVisitorProvider;
import com.terra.pjatk.aug.grammar.visitor.provider.ExpressionType;
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
import static org.mockito.Mockito.*;

class StringExpressionVisitorTest {
    private InputReader inputReader;
    private StringExpressionVisitor stringExpressionVisitor;
    private NumberExpressionVisitor numberExpressionVisitor;
    private MemoryManager memoryManager;

    @BeforeEach
    void setUp() {

        numberExpressionVisitor = Mockito.mock(NumberExpressionVisitor.class);
        inputReader = Mockito.mock(InputReader.class);
        memoryManager = Mockito.mock(AugMemoryManager.class);

        var provider = AugGrammarVisitorProvider.builder()
                .memoryManager(memoryManager)
                .inputReader(inputReader)
                .build();

        provider.addVisitor(ExpressionType.NUMBER, numberExpressionVisitor);

        stringExpressionVisitor = new StringExpressionVisitor(provider);

    }


    @Test
    public void should_return_result_of_given_simple_expressions() {

        // Act
        var result = visitStringExpression("\"Hello World\"");

        // Assert
        assertThat(result).isEqualTo("Hello World");

    }

    @Test
    public void should_return_value_from_given_variable() {
        // Arrange
        var expression = "x";
        when(memoryManager.get(expression)).thenReturn("Hello World");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_return_empty_string_when_variable_is_not_defined() {
        // Arrange
        var expression = "x";
        when(memoryManager.get(expression)).thenReturn(null, "");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        verify(memoryManager).add("x", DataType.STRING);
        assertThat(result).isEqualTo("");
    }


    @Test
    public void should_return_value_from_given_read_string() {
        // Arrange
        var expression = "readstr";
        when(inputReader.readString()).thenReturn("Hello World");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_return_value_from_given_concatenate() {
        // Arrange
        var expression = "concatenate(\"Hello \", \"World\")";

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @ParameterizedTest
    @MethodSource("nestedConcatenateExpressions")
    public void should_return_value_from_nested_concatenate(String expression, String expected) {

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> nestedConcatenateExpressions() {
        return Stream.of(
                Arguments.of("concatenate(\"Hello \", concatenate(\"World\", \"!\"))", "Hello World!"),
                Arguments.of("concatenate(concatenate(\"Hello \", \"World\"), \"!\")", "Hello World!"),
                Arguments.of("concatenate(concatenate(\"Hello \", \"World\"), concatenate(\"!\", \"!\"))", "Hello World!!"),
                Arguments.of("concatenate(concatenate(\"Hello \", concatenate(\"World\", \"!\")), \"!\")", "Hello World!!")
        );
    }

    @Test
    public void should_return_value_from_given_concatenate_with_variable() {
        // Arrange
        var expression = "concatenate(\"Hello \", x)";
        when(memoryManager.get("x")).thenReturn("World");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_return_value_from_given_concatenate_with_read_string_on_right_side() {
        // Arrange
        var expression = "concatenate(\"Hello \", readstr)";
        when(inputReader.readString()).thenReturn("World");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_return_value_from_given_concatenate_with_read_string_on_left_side() {
        // Arrange
        var expression = "concatenate(readstr, \" World\")";
        when(inputReader.readString()).thenReturn("Hello");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_return_value_from_given_concatenate_with_read_string_on_both_sides() {
        // Arrange
        var expression = "concatenate(readstr, readstr)";
        when(inputReader.readString()).thenReturn("Hello", " World");

        // Act
        var result = visitStringExpression(expression);

        // Assert
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void should_throw_exception_when_read_fails() {
        // Arrange
        var expression = "concatenate(readstr, \"x\")";
        when(inputReader.readString()).thenThrow(new RuntimeException("Error"));

        // Act
        assertThatThrownBy(() -> visitStringExpression(expression))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Error");
    }


    @ParameterizedTest(name = "should return \"{1}\" for {0}")
    @MethodSource("provideSubstringTestCases")
    public void testSubstring(String expression, int from, int to, String expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(from, to);
        var result = visitStringExpression(expression);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideSubstringTestCases() {
        return Stream.of(
                Arguments.of("substring(\"Hello, world!\", 1, 5);", 1, 5, "Hello"),
                Arguments.of("substring(\"Hello, world!\", 0, 5 );", 0, 5, ""),
                Arguments.of("substring(\"Hello, world!\", 50, 5);" , 50, 5, ""),
                Arguments.of("substring(\"Hello, world!\", 1, -5);" , 1, -5, ""),
                Arguments.of("substring(\"Hello, world!\", 10, 10);" , 10, 10, "rld!"),
                Arguments.of("substring(\"Hello, world!\", 10, 100);" , 13, 100, "!")
        );
    }


    private String visitStringExpression(String expression) {
        return stringExpressionVisitor.visit(ProgramParser.parse(expression).str_expr());
    }


}