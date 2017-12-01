package org.bhoopendra.learning.design.pattern.memento;

public class FileWriterClient {
    public static void main(String[] args){
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of data");
        System.out.println(fileWriterUtil+"\n\n");

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second Set of Data\n");
        System.out.println(fileWriterUtil+"\n\n");

        fileWriterCaretaker.undo(fileWriterUtil);
        System.out.println(fileWriterUtil+"\n\n");
    }
}
