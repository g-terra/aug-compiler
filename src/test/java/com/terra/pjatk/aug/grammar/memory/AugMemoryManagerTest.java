package com.terra.pjatk.aug.grammar.memory;

import com.terra.pjatk.aug.domain.DataType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AugMemoryManagerTest {

    @Test
    void should_add_variable() {
        // Arrange
        var memoryManager = new AugMemoryManager();

        // Act
        memoryManager.add("a", 1, DataType.NUMBER);

        // Assert
        assertThat(memoryManager.get("a")).isEqualTo(1);
    }

    @Test
    void should_add_num_variable_with_default_value() {
        // Arrange
        var memoryManager = new AugMemoryManager();

        // Act
        memoryManager.add("a", DataType.NUMBER);

        // Assert
        assertThat(memoryManager.get("a")).isEqualTo(0);
    }

    @Test
    void should_add_string_variable_with_default_value() {
        // Arrange
        var memoryManager = new AugMemoryManager();

        // Act
        memoryManager.add("a", DataType.STRING);

        // Assert
        assertThat(memoryManager.get("a")).isEqualTo("");
    }


    @Test
    void should_return_type_of_variable() {
        // Arrange
        var memoryManager = new AugMemoryManager();

        // Act
        memoryManager.add("a", 1, DataType.NUMBER);

        // Assert
        assertThat(memoryManager.getType("a")).contains(DataType.NUMBER);
    }

    @Test
    void should_return_empty_optional_when_variable_does_not_exist() {
        // Arrange
        var memoryManager = new AugMemoryManager();

        // Act
        var result = memoryManager.getType("a");

        // Assert
        assertThat(result).isEmpty();
    }

    @Test
    void should_remove_variable() {
        // Arrange
        var memoryManager = new AugMemoryManager();
        memoryManager.add("a", 1, DataType.NUMBER);

        // Act
        memoryManager.remove("a");

        // Assert
        assertThat(memoryManager.get("a")).isNull();
    }

    @Test
    void should_update_variable() {
        // Arrange
        var memoryManager = new AugMemoryManager();
        memoryManager.add("a", 1, DataType.NUMBER);

        // Act
        memoryManager.update("a", 2);

        // Assert
        assertThat(memoryManager.get("a")).isEqualTo(2);
    }

    @Test
    void should_throw_exception_when_type_mismatch() {
        // Arrange
        var memoryManager = new AugMemoryManager();
        memoryManager.add("a", 1, DataType.NUMBER);

        // Act


        // Assert
        assertThatThrownBy(() -> memoryManager.update("a", "2"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Type mismatch");
    }


}