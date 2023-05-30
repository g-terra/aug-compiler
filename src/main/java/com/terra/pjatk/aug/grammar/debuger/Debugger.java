package com.terra.pjatk.aug.grammar.debuger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Debugger {

    private final boolean active;

    public Debugger(boolean active) {

        this.active = active;
    }

    public void log(String debugStatement, Object... args) {
        if (active) {
            log.info(debugStatement, args);
        }
    }
}
