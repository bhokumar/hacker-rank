package org.bhoopendra.learning.inheritance;

public class Base {
    public void f1(){}
    public int f2(){
       return 0;
    }
}

class Derived {

    private final Base base = new Base();

    public void f1() {
        base.f1();
    }

    public int f2() {
        return base.f2();
    }
}