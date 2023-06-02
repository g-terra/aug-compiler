package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;


public class BoolExpressionVisitorTest {


    private StringRelationExpressionVisitor stringRelationExpressionVisitor;

    private NumberRelationExpressionVisitor numberRelationExpressionVisitor;

    private BoolExpressionVisitor boolExpressionVisitor;
    private static final boolean DEBUG = true;


    @BeforeEach
    void setUp() {

        stringRelationExpressionVisitor = Mockito.mock(StringRelationExpressionVisitor.class);
        numberRelationExpressionVisitor = Mockito.mock(NumberRelationExpressionVisitor.class);

        InputReader inputReader = Mockito.mock(InputReader.class);
        MemoryManager memoryManager = Mockito.mock(AugMemoryManager.class);

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .debugger(new Debugger(DEBUG))
                .inputReader(inputReader)
                .build();

        provider.registerVisitor(ExpressionType.STRING_RELATION, stringRelationExpressionVisitor);
        provider.registerVisitor(ExpressionType.NUMBER_RELATION, numberRelationExpressionVisitor);


        boolExpressionVisitor = new BoolExpressionVisitor(provider);

    }


    @Test
    public void should_return_true_for_true() {
        assertThat(visitBoolExpression("true")).isEqualTo(true);
    }

    @Test
    public void should_return_false_for_false() {
        assertThat(visitBoolExpression("false")).isEqualTo(false);
    }

    @ParameterizedTest(name = "should return correct value for bool \"or\" expression: {0} or {1} = {2}")
    @CsvSource({
            "true, true, true",
            "true, false, true",
            "false, true, true",
            "false, false, false"
    })
    void shouldReturnCorrectValueForBoolOrExpression(Boolean left, Boolean right, Boolean expected) {
        assertThat(visitBoolExpression(left + " or " + right)).isEqualTo(expected);
    }

    //tests for 'and' operator
    @ParameterizedTest(name = "should return correct value for bool \"and\" expression: {0} and {1} = {2}")
    @CsvSource({
            "true, true, true",
            "true, false, false",
            "false, true, false",
            "false, false, false"
    })
    void shouldReturnCorrectValueForBoolAndExpression(Boolean left, Boolean right, Boolean expected) {
        assertThat(visitBoolExpression(left + " and " + right)).isEqualTo(expected);
    }


    @ParameterizedTest(name = "should return correct value for bool \"and/or\" expression: {0} = {1}")
    @CsvSource(
            {
                    "true or true or true, true",
                    "true or true or false, true",
                    "true or false or true, true",
                    "true or false or false, true",
                    "false or true or true, true",
                    "false or true or false, true",
                    "false or false or true, true",
                    "false or false or false, false",
                    "false and false and false, false",
                    "false and false and true, false",
                    "false and true and false, false",
                    "false and true and true, false",
                    "true and false and false, false",
                    "true and false and true, false",
                    "true and true and false, false",
                    "true and true and true, true",
                    "true or true and true, true",
                    "true or true and false, true",
                    "true or false and true, true",
                    "true or false and false, true",
                    "false or true and true, true",
                    "false or true and false, false",
                    "false or false and true, false",
                    "false or false and false, false",
                    "true and true or true, true",
                    "true and true or false, true",
                    "true and false or true, true",
                    "true and false or false, false",
                    "false and true or true, true",
                    "false and true or false, false",
                    "false and false or true, true",
                    "false and false or false, false"
            }
    )
    void shouldReturnCorrectValueForBoolAndOrExpression(String expression, Boolean expected) {
        assertThat(visitBoolExpression(expression)).isEqualTo(expected);
    }

    @Test
    void should_negate_bool_expression() {
        assertThat(visitBoolExpression("not true")).isEqualTo(false);
        assertThat(visitBoolExpression("not false")).isEqualTo(true);
    }

    @ParameterizedTest(name = "should assert correctly for expression: {0} = {1}")
    @CsvSource({
            "(true or false) and true , true",
            "(true or false) and false , false",
            "(true or false) and (true or false) , true",
            "(true or false) and (false or false) , false",
            "(true or false) and (true or false) and (true or false) , true",
            "((true or false) and (true or false) or (true or false) and (true or false)) , true",
    })
    void shouldAssertCorrectlyForBoolExpression(String expression, Boolean expected) {
        assertThat(visitBoolExpression(expression)).isEqualTo(expected);
    }

    @Test
    void should_handle_string_relation_expression() {
        when(stringRelationExpressionVisitor.visit(Mockito.any())).thenReturn(true);
        assertThat(visitBoolExpression("\"test\" == \"test\"")).isEqualTo(true);
    }

    @Test
    void should_handle_number_relation_expression() {
        when(numberRelationExpressionVisitor.visit(Mockito.any())).thenReturn(true);
        assertThat(visitBoolExpression("1 = 1")).isEqualTo(true);
    }

    @Test
    void should_handle_number_relation_with_string_relation(){
        when(numberRelationExpressionVisitor.visit(Mockito.any())).thenReturn(true);
        when(stringRelationExpressionVisitor.visit(Mockito.any())).thenReturn(true);
        assertThat(visitBoolExpression("1 = 1 and \"test\" == \"test\"")).isEqualTo(true);
    }

    private boolean visitBoolExpression(String expression) {
        return boolExpressionVisitor.visit(ProgramParser.parse(expression).bool_expr());
    }

}
