package com.terra.pjatk.aug.grammar.utils;

import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.mockito.ArgumentMatcher;

@RequiredArgsConstructor
public class InstructionArgumentMatcher<T extends ParserRuleContext> implements ArgumentMatcher<T> {

    private final String text;

    @Override
    public boolean matches(T t) {
        if (t == null) {
            return false;
        }
        var argumentText = t.getText();
        return text.equals(argumentText);
    }
}
