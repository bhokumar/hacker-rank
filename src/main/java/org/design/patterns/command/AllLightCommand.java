package org.design.patterns.command;

import java.util.List;

public class AllLightCommand implements Command {
    private List<LightHandler> lightHandlers;

    public AllLightCommand(List<LightHandler> lightHandlers) {
        this.lightHandlers = lightHandlers;
    }

    @Override
    public void execute() {
        this.lightHandlers.forEach(lightHandler -> lightHandler.toggle());
    }
}
