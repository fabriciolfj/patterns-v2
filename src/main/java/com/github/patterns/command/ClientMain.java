package com.github.patterns.command;

public class ClientMain {

    public static void main(String[] args) {
        var lights = new Lights();
        var on = new ExecuteLightsOnCommand(lights);
        var remote = new InvokerCommand();
        remote.setCommand(on);

        remote.execute();
        remote.execute();

        var off = new ExecuteLightsOffCommand(lights);
        remote.setCommand(off);
        remote.execute();
    }
}
