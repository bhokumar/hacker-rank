package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationClient2 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try(FileOutputStream  fileOutputStream = new FileOutputStream("file.txt");
            FileInputStream fileInputStream = new FileInputStream("file.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new D());

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           D d = (D)objectInputStream.readObject();

            System.out.println(d.a);
            System.out.println(d.b);
            System.out.println(d.c);
            System.out.println(d.d);
        }
    }
}

class A{
    final int a=100;

    public A() {
        System.out.println("Constructor A");
    }
}

class B extends A implements Serializable {
    final int b=200;

    public B() {
        System.out.println("Constructor B");
    }
}

class C extends B{
    final int c=300;

    public C() {
        System.out.println("Constructor C");
    }
}

class D extends C{
    final int d=400;

    public D() {
        System.out.println("Constructor D");
    }
}
