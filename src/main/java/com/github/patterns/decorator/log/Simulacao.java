package com.github.patterns.decorator.log;

public class Simulacao {

    public static void main(String[] args) {
        var logger = new ConsoleLogger();
        var repeat = new RepeatingDecorator(logger, 3);
        repeat.log("teste");
    }
}
