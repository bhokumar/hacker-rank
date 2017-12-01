package org.bhoopendra.learning.design.pattern.command;

public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public Command getCommand(){
        return command;
    }

    public void execute(){
        command.execute();
    }
}
