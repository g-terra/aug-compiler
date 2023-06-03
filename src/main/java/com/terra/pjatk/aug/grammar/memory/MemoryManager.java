package com.terra.pjatk.aug.grammar.memory;

import com.terra.pjatk.aug.domain.DataType;

import java.util.Optional;

public interface MemoryManager {


    void add(String name, Object value, DataType type);

    void add(String name, DataType type);

    Object get(String name);

    Optional<DataType> getType(String name);

    void remove(String variable);

    void update(String name, Object value);
}
