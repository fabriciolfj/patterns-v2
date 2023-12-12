package com.github.patterns.command;

public class InvokerCommand {

    private Command command;

    public void execute() {
        this.command.execute();
    }


    public void setCommand(Command command) {
        this.command = command;
    }
}
