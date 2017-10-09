package org.bhoopendra.learning.reflection;

import java.io.Serializable;

@Deprecated
public class InspectionObject extends Pare implements Serializable,Cloneable {
    private String name;
    private int id;

    public InspectionObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public InspectionObject() {
    }

    private void method1(){
        System.out.println("method1");
    }

    private void method2(){
        System.out.println("method1");
    }

    private void method3(){
        System.out.println("method1");
    }

    static class Child{

    }
}

class Pare{

}