package com.terra.pjatk.aug.grammar.visitor.relation;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ParseTreeArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.visitor.expression.StringExpressionVisitor;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.when;

class StringRelationExpressionVisitorTest {


    private StringExpressionVisitor stringExpressionVisitor;

    private StringRelationExpressionVisitor stringRelationExpressionVisitor;

    @BeforeEach
    void setUp() {

        stringExpressionVisitor = Mockito.mock(StringExpressionVisitor.class);
        InputReader inputReader = Mockito.mock(InputReader.class);
        MemoryManager memoryManager = Mockito.mock(AugMemoryManager.class);

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .inputReader(inputReader)
                .build();

        provider.registerVisitor(ExpressionType.STRING, stringExpressionVisitor);

        stringRelationExpressionVisitor = new StringRelationExpressionVisitor(provider);

    }


    @ParameterizedTest(name = "should return {2} when {0} == {1} is given")
    @CsvSource(
            value = {
                    "\"Hello World\",\"Hello World\", true",
                    "\"Hello World\",\"Hello\", false",
                    "\"Hello World\",\"World\", false",
                    "\"Hello World\",\"\", false",
                    "\"Hello World\",\"Hello World \", false",
                    "\"Hello World\",\" Hello World\", false",
            }
    )
    public void should_return_correct_value_for_equality(String left, String right, boolean expectedResult) {

        // Arrange
        when(stringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher(left)))).thenReturn(left);
        when(stringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher(right)))).thenReturn(right);

        // Act
        var result = visitStringRelation(left + "==" + right);

        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }


    @ParameterizedTest(name = "should return {2} when {0} != {1} is given")
    @CsvSource(
            value = {
                    "\"Hello World\",\"Hello World\", false",
                    "\"Hello World\",\"Hello\", true",
                    "\"Hello World\",\"World\", true",
                    "\"Hello World\",\"\", true",
                    "\"Hello World\",\"Hello World \", true",
                    "\"Hello World\",\" Hello World\", true",
            }
    )
    public void should_return_correct_value_for_inequality(String left, String right, boolean expectedResult) {

        // Arrange
        when(stringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher(left)))).thenReturn(left);
        when(stringExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher(right)))).thenReturn(right);

        // Act
        var result = visitStringRelation(left + "!=" + right);

        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }

    private boolean visitStringRelation(String relation) {
        return stringRelationExpressionVisitor.visit(ProgramParser.parse(relation).str_rel_expr());
    }


}