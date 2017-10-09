package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationClient3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            FileInputStream fileInputStream = new FileInputStream("file.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new D1());

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            D1 d = (D1)objectInputStream.readObject();

            System.out.println(d.a);
            System.out.println(d.b);
            System.out.println(d.c);
            System.out.println(d.d);
        }
    }
}



class A1{
    final int a=100;

    public A1(final int a) {
        System.out.println("Constructor A");
    }
}

class B1 extends A1 implements Serializable {
    final int b=200;

    public B1() {
        super(100);
        System.out.println("Constructor B");
    }
}

class C1 extends B1{
    final int c=300;

    public C1() {
        System.out.println("Constructor C");
    }
}

class D1 extends C1{
    final int d=400;

    public D1() {
        System.out.println("Constructor D");
    }
}




