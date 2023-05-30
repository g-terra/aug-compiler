package com.terra.pjatk.aug.grammar.visitor.provider;

import com.terra.pjatk.aug.grammar.visitor.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.OutputExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.StringExpressionVisitor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AugGrammarVisitorProviderTest {

    @Test
    void should_return_instance_of_aug_grammar_visitor() {
        // Arrange
        var augGrammarVisitorProvider = AugGrammarVisitorProvider.builder().build();
        augGrammarVisitorProvider.addVisitor(ExpressionType.STRING, new StringExpressionVisitor(augGrammarVisitorProvider));

        // Act
        var visitor = augGrammarVisitorProvider.provide(ExpressionType.STRING);

        // Assert
        assertThat(visitor).isInstanceOf(StringExpressionVisitor.class);
    }

    @Test
    void should_return_default_visitor_when_given_type_does_not_exist() {
        // Arrange
        var provider = AugGrammarVisitorProvider.defaultSetup(false);

        // Assert
        assertThat(provider.provide(ExpressionType.NUMBER)).isInstanceOf(NumberExpressionVisitor.class);
        assertThat(provider.provide(ExpressionType.STRING)).isInstanceOf(StringExpressionVisitor.class);
        assertThat(provider.provide(ExpressionType.OUTPUT)).isInstanceOf(OutputExpressionVisitor.class);

        assertThat(provider.getDebugger()).isNotNull();
        assertThat(provider.getMemoryManager()).isNotNull();
        assertThat(provider.getOutputPrinter()).isNotNull();
    }

}