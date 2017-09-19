package org.bhoopendra.learning.inheritance;

public class Test {
    public static void main(String[] args) {
        A1 a1 = new B2();
        System.out.println(a1.i);
    }
}

class A1{
    int a=10;
    static int i=100;
}

class B2 extends  A1{
    int a=12;
    static int i=200;
}

