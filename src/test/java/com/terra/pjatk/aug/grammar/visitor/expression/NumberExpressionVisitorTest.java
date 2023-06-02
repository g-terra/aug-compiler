package com.terra.pjatk.aug.grammar.visitor.expression;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ParseTreeArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.Mockito.*;

class NumberExpressionVisitorTest {

    private InputReader mockInputReader;
    private StringExpressionVisitor mockStringExpressionVisitor;
    private NumberExpressionVisitor numberVisitor;
    private MemoryManager memoryManager;

    @BeforeEach
    void setUp() {

        memoryManager = mock(AugMemoryManager.class);

        mockInputReader = mock(InputReader.class);

        mockStringExpressionVisitor = mock(StringExpressionVisitor.class);

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .inputReader(mockInputReader)
                .build();

        provider.registerVisitor(ExpressionType.STRING, mockStringExpressionVisitor);


        numberVisitor = new NumberExpressionVisitor(provider);

    }


    @ParameterizedTest(name = "{0} = {1}")
    @MethodSource("simpleExpressionProvider")
    public void should_return_result_of_given_simple_expressions(String expression, Integer expected) {

        // Act
        var result = visitNumExpr(expression);

        // Assert
        assertThat(result).isEqualTo(expected);

    }

    private static Stream<Arguments> simpleExpressionProvider() {
        return Stream.of(
                Arguments.of("1+2", 3),
                Arguments.of("1+2+3+4", 10),
                Arguments.of("1-2", -1),
                Arguments.of("1-2-3-4", -8),
                Arguments.of("1+2-3+4-5", -1),
                Arguments.of("3*2", 6),
                Arguments.of("1*2*3*4", 24),
                Arguments.of("4/2", 2),
                Arguments.of("4/2/2", 1),
                Arguments.of("4%2", 0),
                Arguments.of("4%2%2", 0),
                Arguments.of("4%3", 1),
                Arguments.of("4%3%2", 1),
                Arguments.of("4*(2+2)", 16),
                Arguments.of("4*(2+2)*(2+2)", 64),
                Arguments.of("4*(2+2)/2", 8),
                Arguments.of("5*(10+2)/(5+1)", 10),
                Arguments.of("1+2*3", 7)
        );
    }

    @ParameterizedTest(name = "{0}={2} | {1}")
    @MethodSource("variableExpressionProvider")
    public void should_return_result_of_given_expression_which_contains_variables(String expression, Map<String, Object> variables, Integer expected) {

        //arrange
        for (Map.Entry<String, Object> entry : variables.entrySet()) {
            when(memoryManager.get(entry.getKey())).thenReturn(entry.getValue());
        }

        // Act
        var result = visitNumExpr(expression);

        // Assert
        assertThat(result).isEqualTo(expected);

    }

    private static Stream<Arguments> variableExpressionProvider() {
        return Stream.of(
                Arguments.of("x+y", Map.of("x", 1, "y", 2), 3),
                Arguments.of("x+y+z", Map.of("x", 1, "y", 2, "z", 3), 6),
                Arguments.of("x-y", Map.of("x", 1, "y", 2), -1),
                Arguments.of("x-y-z", Map.of("x", 1, "y", 2, "z", 3), -4),
                Arguments.of("x+y-z", Map.of("x", 1, "y", 2, "z", 3), 0),
                Arguments.of("x*y", Map.of("x", 1, "y", 2), 2),
                Arguments.of("x*y*z", Map.of("x", 4, "y", 3, "z", 2), 24),
                Arguments.of("x/y", Map.of("x", 1, "y", 2), 0),
                Arguments.of("x/y/z", Map.of("x", 1000, "y", 10, "z", 10), 10),
                Arguments.of("x+y*z", Map.of("x", 1, "y", 2, "z", 3), 7),
                Arguments.of("x*y+z", Map.of("x", 1, "y", 2, "z", 3), 5),
                Arguments.of("x*y-z", Map.of("x", 1, "y", 2, "z", 3), -1),
                Arguments.of("x/y+z", Map.of("x", 1, "y", 2, "z", 3), 3),
                Arguments.of("x/y-z", Map.of("x", 1, "y", 2, "z", 3), -3),
                Arguments.of("x+y/z", Map.of("x", 1, "y", 2, "z", 3), 1),
                Arguments.of("(x-y)*z", Map.of("x", 1, "y", 2, "z", 3), -3),
                Arguments.of("(x+y)*z", Map.of("x", 1, "y", 2, "z", 3), 9),
                Arguments.of("(x-y)/z", Map.of("x", 1, "y", 2, "z", 3), -0),
                Arguments.of("(x+y)/z", Map.of("x", 1, "y", 2, "z", 3), 1),
                Arguments.of("(x+y)/(x-y)", Map.of("x", 5, "y", 1), 1)
        );
    }


    @Test
    public void should_fail_when_divide_by_zero() {

        when(memoryManager.get("x")).thenReturn(1);
        when(memoryManager.get("y")).thenReturn(0);

        var expression = "x/y";

        assertThatThrownBy(() -> visitNumExpr(expression))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("/ by zero");

    }

    @Test
    public void should_read_input_from_user() {
        // Arrange
        var expression = "readint";
        when(mockInputReader.readInteger()).thenReturn(1);

        // Act
        var result = visitNumExpr(expression);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_throw_exception_when_readint_gets_a_String() {
        // Arrange
        var expression = "readint;";

        when(mockInputReader.readInteger()).thenThrow(new NumberFormatException());

        // Act
        assertThatThrownBy(() -> visitNumExpr(expression))
                .isInstanceOf(RuntimeException.class);
    }


    @Test
    public void should_negate_value() {

        // Arrange
        when(memoryManager.get("x")).thenReturn(1);
        var expression1 = "-x";
        when(memoryManager.get("y")).thenReturn(-1);
        var expression2 = "-y";

        // Act
        var result1 = visitNumExpr(expression1);
        var result2 = visitNumExpr(expression2);

        // Assert
        assertThat(result1).isEqualTo(-1);
        assertThat(result2).isEqualTo(1);

    }

    @Test
    public void should_return_right_length_for_string() {
        //arrange
        var expression = "length(x)";
        when(mockStringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("x")))).thenReturn("hello");

        //act
        var result = visitNumExpr(expression);

        //assert
        assertThat(result).isEqualTo(5);

    }

    //should return right position  for given character in string
    @Test
    public void should_return_right_position_for_given_character_in_string() {

        //arrange
        var program = "position(x,\"e\")";
        when(mockStringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("x")))).thenReturn("hello");
        when(mockStringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("\"e\"")))).thenReturn("e");

        //act
        var result = visitNumExpr(program);

        //assert
        assertThat(result).isEqualTo(2);

    }

    @Test
    public void should_return_zero_if_char_is_not_in_the_string() {
        //arrange
        var expression = "position(x,\"a\")";
        when(mockStringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("x")))).thenReturn("hello");
        when(mockStringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("\"a\"")))).thenReturn("a");

        //act
        var result = visitNumExpr(expression);

        //assert
        assertThat(result).isEqualTo(0);

    }

    @Test
    public void should_create_variable_with_type_int_if_it_was_not_previous_declared_and_set_its_value_to_Zero() {

        // Arrange
        var expression = "x";
        when(memoryManager.get(expression)).thenReturn(null, 0);

        // Act
        var result = visitNumExpr(expression);

        // Assert
        verify(memoryManager).add("x", DataType.NUMBER);
        assertThat(result).isEqualTo(0);

    }


    private Integer visitNumExpr(String numberExpression) {
        return numberVisitor.visit(ProgramParser.parse(numberExpression).num_expr());
    }

}