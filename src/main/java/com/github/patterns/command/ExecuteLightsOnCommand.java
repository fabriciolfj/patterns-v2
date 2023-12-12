package com.github.patterns.command;

public class ExecuteLightsOnCommand implements Command {

    private final Lights lights;

    public ExecuteLightsOnCommand(final Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }
}
