package com.terra.pjatk.aug.grammar.visitor.statement;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.visitor.InstructionVisitor;
import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ParseTreeArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.visitor.expression.NumberExpressionVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ForLoopStatementVisitorTest {


    InstructionVisitor instructionVisitor;

    NumberExpressionVisitor numberExpressionVisitor;

    AssignStatementVisitor assignStatementVisitor;

    ForLoopStatementVisitor forLoopStatementVisitor;

    MemoryManager memoryManager;



    @BeforeEach
    void setUp() {

        memoryManager = new AugMemoryManager();

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .debugger(mock(Debugger.class))
                .build();

        instructionVisitor = mock(InstructionVisitor.class);
        numberExpressionVisitor = mock(NumberExpressionVisitor.class);
        assignStatementVisitor = mock(AssignStatementVisitor.class);


        provider.registerVisitor(ExpressionType.INSTRUCTION, instructionVisitor);
        provider.registerVisitor(ExpressionType.NUMBER, numberExpressionVisitor);
        provider.registerVisitor(ExpressionType.ASSIGN, assignStatementVisitor);


        forLoopStatementVisitor = new ForLoopStatementVisitor(provider);
    }

    @Test
    void should_call_instruction_expected_num_of_times(){
        // Arrange
        var statement = "for i:= 0 to 10 do print(\"hello\");";
        memoryManager.add("i", 1, DataType.NUMBER);
        when(numberExpressionVisitor.visit(argThat(new ParseTreeArgumentMatcher("10")))).thenReturn(10);

        // Act
        visitForLoopStatement(statement);

        // Assert
        verify(instructionVisitor, times(10)).visit(argThat(new ParseTreeArgumentMatcher("print(\"hello\")")));
    }

    private void visitForLoopStatement(String statement) {
        forLoopStatementVisitor.visit(ProgramParser.parse(statement).for_stat());
    }


}
