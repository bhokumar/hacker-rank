package org.design.patterns.command;

/**
 * @author bhoopendra
 */
public class OffCommand implements Command {
    private LightHandler lightHandler;

    public OffCommand(LightHandler lightHandler) {
        this.lightHandler = lightHandler;
    }

    @Override
    public void execute() {
        this.lightHandler.off();
    }
}
