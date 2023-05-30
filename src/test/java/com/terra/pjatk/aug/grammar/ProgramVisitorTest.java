package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.utils.TestOutputPrinter;
import com.terra.pjatk.aug.grammar.visitor.AssignStatementVisitor;
import com.terra.pjatk.aug.grammar.visitor.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.OutputExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.StringExpressionVisitor;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


public class ProgramVisitorTest {

    private ProgramVisitor visitor;

    private TestOutputPrinter outputPrinter;

    private InputReader inputReader;


    @BeforeEach
    void setUp() {
        outputPrinter = new TestOutputPrinter();
        inputReader = Mockito.mock(InputReader.class);
        Debugger debugger = new Debugger(false);
        MemoryManager memoryManager = new AugMemoryManager();

        var provider = AugGrammarContextProvider.builder()
                .memoryManager(memoryManager)
                .outputPrinter(outputPrinter)
                .debugger(debugger)
                .inputReader(inputReader)
                .build();

        provider.registerVisitor(ExpressionType.NUMBER, new NumberExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.STRING, new StringExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.OUTPUT, new OutputExpressionVisitor(provider));
        provider.registerVisitor(ExpressionType.ASSIGN, new AssignStatementVisitor(provider));
        visitor = new ProgramVisitor(provider);

    }

    @Test
    public void should_perform_sum_of_2_variables_and_print_result() {
        var program = """
                x:=1;
                y:=2;
                z:=1+2;
                print(z);
                """;
        runProgram(program);

        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("3");
    }


    @Test
    public void should_get_two_inputs_from_user_and_concatenate() {

        var program = """
                inputA:=readstr;
                inputB:=readstr;
                print(concatenate(inputA,inputB));
                """;

        when(inputReader.readString()).thenReturn("hello " , "world!");

        runProgram(program);

        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("hello world!");

    }

    private void runProgram(String program) {
        visitor.visit(ProgramParser.parse(program).program());
    }


}