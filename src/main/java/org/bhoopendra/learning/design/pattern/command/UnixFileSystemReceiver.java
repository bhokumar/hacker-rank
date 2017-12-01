package org.bhoopendra.learning.design.pattern.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix OS!");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in unix OS!");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in unix OS!");
    }
}
