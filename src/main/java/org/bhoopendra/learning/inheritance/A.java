package org.bhoopendra.learning.inheritance;

/**
 * Created by bhokumar on 7/12/2017.
 */
class A
{
    int i;

    static
    {
        System.out.println("Class A SIB");
    }

    {
        System.out.println("Class A IIB");
    }

    A()
    {
        System.out.println("Class A Constructor");
    }
}

class B extends A
{
    public B() {
        System.out.println("Class B IIB");
    }

    int j;
}

class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.i);
    }
}
