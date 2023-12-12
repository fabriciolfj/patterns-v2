package com.github.patterns.command;

public class Lights {

    private boolean on;

    public void turnOn() {
        if (!on) {
            on = true;
        }

        System.out.println("lights on - {{ " + on +" }}");
    }

    public void turnOff() {
        if (on) {
            on = false;
        }

        System.out.println("lights off - {{ " + on +" }}");
    }
}
