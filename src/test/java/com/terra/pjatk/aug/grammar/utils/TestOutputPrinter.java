package com.terra.pjatk.aug.grammar.utils;

import com.terra.pjatk.aug.utils.console.printer.OutputPrinter;

import java.util.ArrayList;
import java.util.List;

public class TestOutputPrinter implements OutputPrinter {

    final List<String> messages = new ArrayList<>();

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public void print(String message) {
        messages.add(message);
    }
}
