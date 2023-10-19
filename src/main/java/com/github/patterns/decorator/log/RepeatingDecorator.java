package com.github.patterns.decorator.log;

public class RepeatingDecorator implements Logger {

    private final Logger logger;
    private final int number;

    public RepeatingDecorator(final Logger logger, final int number) {
        this.logger = logger;
        this.number = number;
    }

    @Override
    public void log(String message) {
        for (int i = 0; i < number; i++) {
            logger.log(message);
        }
    }
}
