package org.bhoopendra.learning.design.pattern.memento;

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return "FileWriterUtil{" +
                "fileName='" + fileName + '\'' +
                ", content=" + content +
                '}';
    }

    public void write(String str){
        content.append(str);
    }

    public Memento save(){
        return new Memento(fileName,content);
    }

    public void undoLastSave(Object object){
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento{
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder stringBuilder) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
