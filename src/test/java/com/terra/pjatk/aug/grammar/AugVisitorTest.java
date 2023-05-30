package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.grammar.utils.TestOutputPrinter;
import com.terra.pjatk.aug.grammar.visitor.NumberExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.OutputExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.StringExpressionVisitor;
import com.terra.pjatk.aug.grammar.visitor.provider.AugGrammarVisitorProvider;
import com.terra.pjatk.aug.grammar.visitor.provider.ExpressionType;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


public class AugVisitorTest {

    private AugVisitor visitor;

    private MemoryManager memoryManager;

    @BeforeEach
    void setUp() {
        TestOutputPrinter mockOutputPrinter = new TestOutputPrinter();
        InputReader mockInputReader = Mockito.mock(InputReader.class);
        Debugger debugger = new Debugger(false);
        memoryManager = new AugMemoryManager();


        var provider = AugGrammarVisitorProvider.builder()
                .memoryManager(memoryManager)
                .outputPrinter(mockOutputPrinter)
                .debugger(debugger)
                .inputReader(mockInputReader)
                .build();

        provider.addVisitor(ExpressionType.NUMBER, new NumberExpressionVisitor(provider));
        provider.addVisitor(ExpressionType.STRING, new StringExpressionVisitor(provider));
        provider.addVisitor(ExpressionType.OUTPUT, new OutputExpressionVisitor(provider));

        visitor = new AugVisitor(provider);

    }

    @Test
    public void should_assign_number() {
        // Arrange
        var program = "x:=1";

        // Act
        visitor.visit(parseProgram(program).assign_stat());

        // Assert
        assertThat(memoryManager.get("x")).isEqualTo(1);
        assertThat(memoryManager.getType("x")).isEqualTo(Optional.of(DataType.NUMBER));
    }

    @Test
    public void should_assign_string() {
        // Arrange
        var program = "x:=\"abc\"";

        // Act
        visitor.visit(parseProgram(program).assign_stat());

        // Assert
        assertThat(memoryManager.get("x")).isEqualTo("abc");
        assertThat(memoryManager.getType("x")).isEqualTo(Optional.of(DataType.STRING));
    }

    @Test
    public void should_return_right_type_for_num_ident() {
        // Arrange
        var program = """
                x:=1;
                y:=x;
                 """;

        // Act
        visitor.visit(parseProgram(program).program());

        // Assert
        assertThat(memoryManager.getType("y")).isEqualTo(Optional.of(DataType.NUMBER));
    }

    @Test
    public void should_return_right_type_for_string_ident() {
        // Arrange
        var program = """
                x:="1";
                y:=x;
                 """;

        // Act
        visitor.visit(parseProgram(program).program());

        // Assert
        assertThat(memoryManager.getType("y")).isEqualTo(Optional.of(DataType.STRING));
    }


    public AugGrammarParser parseProgram(String program) {

        CharStream codePointCharStream = CharStreams.fromString(program);
        AugGrammarLexer lexer = new AugGrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new AugGrammarParser(tokens);
    }

}