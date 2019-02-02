package org.design.patterns.command;

public class CommandClient {
    public static void main(String[] args) {
        // In command design pattern client only Invokes command instead of doing things by itself
        // Invoker of command will handle the execution of command by itself.
        // It Provides separation of concern hence supports single responsibility design principle.

        // Object that is holding task that need to be executed by command
        LightHandler bedRommlightHandler = new LightHandler();
        LightHandler kitchenlightHandler = new LightHandler();
        LightHandler halllightHandler = new LightHandler();

        // Object that is holding command but dont aware of what command it is
        Command command = new ToggleCommand(bedRommlightHandler);

        // Invoker object that decouple the invoker and actual command
        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);

    }
}
