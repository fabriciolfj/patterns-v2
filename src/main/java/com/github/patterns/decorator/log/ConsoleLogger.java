package com.github.patterns.decorator.log;

public class ConsoleLogger implements Logger {

    @Override
    public void log(final String message) {
        System.out.println(message);
    }
}
