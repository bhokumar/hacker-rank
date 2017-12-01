package org.bhoopendra.learning.design.pattern.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in windows!");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in windows!");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in windows!");
    }
}
