package org.bhoopendra.learning.serialization;

import java.io.Serializable;

public class Parent1 {

    public Parent1() {
        System.out.println("Parent1 constructor!");
    }

}

class Parent2 extends Parent1 implements Serializable{
    public Parent2() {
        System.out.println("Parent2 constructor!");
    }
}

class Child extends Parent2{
    public Child() {
        System.out.println("Child constructor!");
    }
}