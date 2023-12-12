package com.github.patterns.command;

public class ExecuteLightsOffCommand implements Command {

    private final Lights lights;

    public ExecuteLightsOffCommand(final Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOff();
    }
}
