package com.terra.pjatk.aug.grammar.memory;

import com.terra.pjatk.aug.domain.DataType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AugMemoryManager implements MemoryManager {

    private final Map<String, Object> memory = new HashMap<>();

    private final Map<String, DataType> types = new HashMap<>();

    private final Map<DataType, Object> defaultValues = Map.of(
            DataType.NUMBER, 0,
            DataType.STRING, ""
    );

    @Override
    public void add(String name, Object value, DataType type) {
        memory.put(name, value);
        types.put(name, type);
    }

    @Override
    public void add(String name, DataType type) {
        memory.put(name, defaultValues.get(type));
        types.put(name, type);
    }

    @Override
    public Object get(String name) {
        return memory.get(name);
    }

    @Override
    public Optional<DataType> getType(String name) {
        return Optional.ofNullable(types.get(name));
    }

    @Override
    public void remove(String variable) {
        memory.remove(variable);
        types.remove(variable);
    }

    @Override
    public void update(String name, Object value) {

        if (types.get(name) == DataType.NUMBER && value instanceof Integer) {
            memory.put(name, value);
        } else if (types.get(name) == DataType.STRING && value instanceof String) {
            memory.put(name, value);
        } else {
            throw new RuntimeException("Type mismatch");
        }

    }


}
