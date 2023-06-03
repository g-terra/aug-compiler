package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.grammar.context.AugGrammarContextProvider;
import com.terra.pjatk.aug.grammar.context.ExpressionType;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.InstructionArgumentMatcher;
import com.terra.pjatk.aug.grammar.utils.ProgramParser;
import com.terra.pjatk.aug.grammar.utils.TestOutputPrinter;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


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

        AugGrammarContextProvider provider = AugGrammarContextProvider.defaultSetup(false);

        provider.setOutputPrinter(outputPrinter);
        provider.setInputReader(inputReader);
        provider.setDebugger(debugger);
        provider.setMemoryManager(memoryManager);

        provider.registerVisitor(ExpressionType.PROGRAM, spy(new ProgramVisitor(provider)));

        visitor = (ProgramVisitor) provider.getVisitor(ExpressionType.PROGRAM);

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


    @Test
    public void should_get_correct_print_with_if_statement_else() {
        var program = """
                x:=1;
                y:=2;
                if x<y then print("x is less than y") else print("x is greater than y");
                """;
        runProgram(program);

        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("x is less than y");
    }

    @Test
    public void should_get_correct_print_with_if_statement() {
        var program = """
                if true then print("passed");
                """;
        runProgram(program);

        assertThat(outputPrinter.getMessages()).size().isEqualTo(1);
        assertThat(outputPrinter.getMessages().get(0)).isEqualTo("passed");
    }

    //should verify that block statement is separately from other statements
    @Test
    public void should_get_correct_print_with_if_statement_with_block() {
        // Arrange
        var program = "begin print(\"hello\"); print(\"world\"); end; print(\"outside\");";

        // Act
        runProgram(program);

        // Assert
        verify(visitor).visitInstr(argThat(new InstructionArgumentMatcher<>("print(\"hello\");print(\"world\");")));
        verify(visitor).visitSimple_instr(argThat(new InstructionArgumentMatcher<>("print(\"outside\")")));
    }

    private void runProgram(String program) {
        visitor.visit(ProgramParser.parse(program).program());
    }


}