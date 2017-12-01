package org.bhoopendra.learning.design.pattern.command;

public class FileSystemClient {
    public static void main(String[] args){
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker1 = new FileInvoker(writeFileCommand);
        fileInvoker1.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker2 = new FileInvoker(closeFileCommand);
        fileInvoker2.execute();
    }
}
