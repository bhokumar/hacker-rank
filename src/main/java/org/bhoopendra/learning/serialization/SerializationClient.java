package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationClient {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Child child = new Child();
        try(FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

            // Serialization of object
            FileInputStream fileInputStream = new FileInputStream("file.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(child);

            // Deserialization of object
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Child child1 = (Child)objectInputStream.readObject();
        }
    }
}
