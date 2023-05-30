package com.terra.pjatk.aug.grammar;

import com.terra.pjatk.aug.domain.DataType;
import com.terra.pjatk.aug.grammar.core.AugGrammarLexer;
import com.terra.pjatk.aug.grammar.core.AugGrammarParser;
import com.terra.pjatk.aug.grammar.debuger.Debugger;
import com.terra.pjatk.aug.grammar.memory.AugMemoryManager;
import com.terra.pjatk.aug.grammar.memory.MemoryManager;
import com.terra.pjatk.aug.utils.console.printer.OutputPrinter;
import com.terra.pjatk.aug.utils.console.reader.InputReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;


public class AugVisitorTest {

    private AugVisitor visitor;
    private InputReader mockInputReader;
    private TestOutputPrinter mockOutputPrinter;

    private MemoryManager memoryManager;

    public static class TestOutputPrinter implements OutputPrinter {

        final List<String> messages = new ArrayList<>();

        public List<String> getMessages() {
            return messages;
        }

        @Override
        public void print(String message) {
            messages.add(message);
        }
    }

    @BeforeEach
    void setUp() {
        mockOutputPrinter = new TestOutputPrinter();
        mockInputReader = Mockito.mock(InputReader.class);
        Debugger debugger = new Debugger(false);
        memoryManager = new AugMemoryManager();
        visitor = new AugVisitor(
                mockInputReader,
                mockOutputPrinter,
                memoryManager,
                debugger
        );


    }

    @Test
    public void should_assign_number() {
        // Arrange
        var program = "x:=1";

        // Act
        visitor.visit(parseProgram(program).assign_stat());

        // Assert
        assertThat(memoryManager.get("x")).isEqualTo(1);
        assertThat(memoryManager.getType("x")).isEqualTo(Optional.of(DataType.NUM));
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
        assertThat(memoryManager.getType("y")).isEqualTo(Optional.of(DataType.NUM));
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





    @Test
    public void should_concatenate_two_strings() {

        var program = """
                x:="hello";
                y:=" world";
                z:=concatenate(x,y);
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(memoryManager.get("z")).isEqualTo("hello world");
        assertThat(memoryManager.getType("z")).isEqualTo(Optional.of(DataType.STRING));

    }

    @Test
    public void should_concatenate_two_strings_with_empty_string() {

        var program = """
                x:="hello";
                y:="";
                z:=concatenate(x,y);
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(memoryManager.get("z")).isEqualTo("hello");
        assertThat(memoryManager.getType("z")).isEqualTo(Optional.of(DataType.STRING));

    }

    @Test
    public void should_read_string_from_input() {

        var program = """
                x:=readstr;
                """;

        when(mockInputReader.readString()).thenReturn("hello");

        visitor.visit(parseProgram(program).program());

        assertThat(memoryManager.get("x")).isEqualTo("hello");
        assertThat(memoryManager.getType("x")).isEqualTo(Optional.of(DataType.STRING));
    }

    @ParameterizedTest(name = "should return \"{1}\" for {0}")
    @MethodSource("provideSubstringTestCases")
    public void testSubstring(String program, String expected) {
        visitor.visit(parseProgram(program).program());
        assertThat(memoryManager.get("x")).isEqualTo(expected);
    }

    private static Stream<Arguments> provideSubstringTestCases() {
        return Stream.of(
                Arguments.of("x:=substring(\"Hello, world!\", 1, 5);", "Hello"),
                Arguments.of("x:=substring(\"Hello, world!\", 0, 5 );", ""),
                Arguments.of("x:=substring(\"Hello, world!\", 50, 5);", ""),
                Arguments.of("x:=substring(\"Hello, world!\", 1, -5);", ""),
                Arguments.of("x:=substring(\"Hello, world!\", 10, 10);", "rld!")
        );
    }

    @Test
    void should_throw_error_for_undefined_variable() {

        var program = "print(x);";

        assertThatThrownBy(() -> visitor.visit(parseProgram(program).program()))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Undefined variable: x");
    }

    @Test
    public void should_print_string() {

        var program = """
                x:="hello";
                print(x);
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(mockOutputPrinter.getMessages().get(0)).isEqualTo("hello");
    }

    @Test
    public void should_print_number() {

        var program = """
                x:=1;
                print(x);
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(mockOutputPrinter.getMessages().get(0)).isEqualTo("1");
    }

    @Test
    public void should_print_result_from_number_expr() {

        var program = """
                x:=1;
                print(2*x);
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(mockOutputPrinter.getMessages().get(0)).isEqualTo("2");
    }

    @Test
    public void should_print_result_from_string_expr() {

        var program = """
                x:="hello";
                print(concatenate(x," world"));
                """;

        visitor.visit(parseProgram(program).program());

        assertThat(mockOutputPrinter.getMessages().get(0)).isEqualTo("hello world");
    }

    public AugGrammarParser parseProgram(String program) {

        CharStream codePointCharStream = CharStreams.fromString(program);
        AugGrammarLexer lexer = new AugGrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new AugGrammarParser(tokens);
    }

}