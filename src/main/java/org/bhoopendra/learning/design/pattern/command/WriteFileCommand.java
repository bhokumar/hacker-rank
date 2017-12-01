package org.bhoopendra.learning.design.pattern.command;

public class WriteFileCommand implements Command {
    private  FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
