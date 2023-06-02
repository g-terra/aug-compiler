package com.terra.pjatk.aug.grammar.context;

import com.terra.pjatk.aug.grammar.visitor.expression.BoolExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.expression.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.relation.NumberRelationExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.expression.StringExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.relation.StringRelationExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.AssignStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.IfStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.statement.OutputStatementVisitor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AugGrammarContextProviderTest {

    @Test
    void should_return_instance_of_aug_grammar_visitor() {
        // Arrange
        var augGrammarVisitorProvider = AugGrammarContextProvider.builder().build();
        augGrammarVisitorProvider.registerVisitor(ExpressionType.STRING, new StringExpressionVisitor(augGrammarVisitorProvider));

        // Act
        var visitor = augGrammarVisitorProvider.getVisitor(ExpressionType.STRING);

        // Assert
        assertThat(visitor).isInstanceOf(StringExpressionVisitor.class);
    }

    @Test
    void should_return_default_visitor_when_given_type_does_not_exist() {
        // Arrange
        var provider = AugGrammarContextProvider.defaultSetup(false);

        // Assert
        assertThat(provider.getVisitor(ExpressionType.NUMBER)).isInstanceOf(NumberExpressionVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.STRING)).isInstanceOf(StringExpressionVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.OUTPUT)).isInstanceOf(OutputStatementVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.ASSIGN)).isInstanceOf(AssignStatementVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.NUMBER_RELATION)).isInstanceOf(NumberRelationExpressionVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.STRING_RELATION)).isInstanceOf(StringRelationExpressionVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.BOOL)).isInstanceOf(BoolExpressionVisitor.class);
        assertThat(provider.getVisitor(ExpressionType.IF_STATEMENT)).isInstanceOf(IfStatementVisitor.class);


        assertThat(provider.getDebugger()).isNotNull();
        assertThat(provider.getMemoryManager()).isNotNull();
        assertThat(provider.getOutputPrinter()).isNotNull();
    }

}