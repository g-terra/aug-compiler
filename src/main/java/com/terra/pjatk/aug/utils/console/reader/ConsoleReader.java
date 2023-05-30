package com.terra.pjatk.aug.utils.console.reader;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader implements InputReader {

    @SneakyThrows
    @Override
    public Integer readInteger() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.matches("\\d+")) {
            return Integer.parseInt(input);
        } else {
            throw new NumberFormatException();
        }
    }

    @SneakyThrows
    @Override
    public String readString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
