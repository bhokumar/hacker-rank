package org.bhoopendra.learning.design.pattern.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}

