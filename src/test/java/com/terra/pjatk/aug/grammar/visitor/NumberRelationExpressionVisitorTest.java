package com.terra.pjatk.aug.grammar.visitor;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class NumberRelationExpressionVisitorTest {
    private NumberExpressionVisitor numberExpressionVisitor;
    private NumberRelationExpressionVisitor numberRelationExpressionVisitor;
    private static final boolean DEBUG = true;

    @BeforeEach
    void setUp() {

        numberExpressionVisitor = Mockito.mock(NumberExpressionVisitor.class);
        InputReader inputReader = Mockito.mock(InputReader.class);
        MemoryManager memoryManager = Mockito.mock(AugMemoryManager.class);

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .debugger(new Debugger(DEBUG))
                .inputReader(inputReader)
                .build();

        provider.registerVisitor(ExpressionType.NUMBER, numberExpressionVisitor);

        numberRelationExpressionVisitor = new NumberRelationExpressionVisitor(provider);

    }

    @ParameterizedTest(name = "should return correct value for number equal expression: {0} = {1} = {2}")
    @CsvSource({
            "1, 2, false",
            "2, 1, false",
            "1, 1, true"
    })
    void shouldReturnCorrectValueForNumberEqualExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + "=" + right)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "should return correct value for number greater than expression: {0} > {1} = {2}")
    @CsvSource({
            "1, 2, false",
            "2, 1, true",
            "1, 1, false"
    })
    void shouldReturnCorrectValueForNumberGreaterThanExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + ">" + right)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "should return correct value for number greater than or equal expression: {0} >= {1} = {2}")
    @CsvSource({
            "1, 2, false",
            "2, 1, true",
            "1, 1, true"
    })
    void shouldReturnCorrectValueForNumberGreaterThanOrEqualExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + ">=" + right)).isEqualTo(expected);
    }


    @ParameterizedTest(name = "should return correct value for number less than expression: {0} < {1} = {2}")
    @CsvSource({
            "1, 2, true",
            "2, 1, false",
            "1, 1, false"
    })
    void shouldReturnCorrectValueForNumberLessThanExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + "<" + right)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "should return correct value for number less than or equal expression: {0} <= {1} = {2}")
    @CsvSource({
            "1, 2, true",
            "2, 1, false",
            "1, 1, true"
    })
    void shouldReturnCorrectValueForNumberLessThanOrEqualExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + "<=" + right)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "should return correct value for number not equal expression: {0} != {1} = {2}")
    @CsvSource({
            "1, 2, true",
            "2, 1, true",
            "1, 1, false"
    })

    void shouldReturnCorrectValueForNumberNotEqualExpression(Integer left, Integer right, Boolean expected) {
        when(numberExpressionVisitor.visit(any())).thenReturn(left, right);
        assertThat(visitRelation(left + "<>" + right)).isEqualTo(expected);
    }


    private Boolean visitRelation(String expression) {
        return numberRelationExpressionVisitor.visit(
                ProgramParser.parse(expression).num_rel_expr()
        );
    }
}
