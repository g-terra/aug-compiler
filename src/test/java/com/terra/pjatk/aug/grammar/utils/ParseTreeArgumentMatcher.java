package com.terra.pjatk.aug.grammar.utils;

import org.antlr.v4.runtime.tree.ParseTree;
import org.mockito.ArgumentMatcher;

public class ParseTreeArgumentMatcher implements ArgumentMatcher<ParseTree> {

    private final String text;

    public ParseTreeArgumentMatcher(String text) {
        this.text = text;
    }

    @Override
    public boolean matches(ParseTree argument) {
        return argument != null && text.equals(argument.getText());
    }
}
