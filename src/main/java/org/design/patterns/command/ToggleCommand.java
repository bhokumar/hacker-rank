package org.design.patterns.command;

public class ToggleCommand implements Command{
    private LightHandler lightHandler;

    public ToggleCommand(LightHandler lightHandler) {
        this.lightHandler = lightHandler;
    }

    @Override
    public void execute() {
        this.lightHandler.toggle();
    }
}
