package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationClient4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            FileInputStream fileInputStream = new FileInputStream("file.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            A2 a1 = new A2();
            a1.setA(100);
            objectOutputStream.writeObject(a1);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            A2 a2 = (A2)objectInputStream.readObject();
            System.out.println(a2.getA());
            System.out.println(a2.c);
        }
    }
}


class A2 implements Serializable{
    private int a;
    transient public int c=100;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}