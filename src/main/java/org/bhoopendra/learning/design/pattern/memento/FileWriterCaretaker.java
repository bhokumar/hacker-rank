package org.bhoopendra.learning.design.pattern.memento;

public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
        this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undoLastSave(object);
    }
}
