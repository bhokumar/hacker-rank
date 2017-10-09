package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationUtils {

    public static Object serializeObject(final Object object) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("file4")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        }
        return object;
    }

    public static Object deSerializeObject() throws IOException,ClassNotFoundException {
        Object o =null;
        try (FileInputStream fileInputStream = new FileInputStream("file4")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            o= objectInputStream.readObject();
        }
        return o;
    }

    public static Object deSerializeMaintainSingleton() throws IOException,ClassNotFoundException {
        Object o =null;
        try (FileInputStream fileInputStream = new FileInputStream("file4")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            o= objectInputStream.readObject();
        }
        return o;
    }
}
