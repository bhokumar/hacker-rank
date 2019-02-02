package org.design.patterns.command;

public class OnCommand implements Command {
    private LightHandler lightHandler;

    public OnCommand(LightHandler lightHandler) {
        this.lightHandler = lightHandler;
    }

    @Override
    public void execute() {
        this.lightHandler.on();
    }
}
