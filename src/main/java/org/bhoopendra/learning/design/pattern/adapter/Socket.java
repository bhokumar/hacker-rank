package org.bhoopendra.learning.design.pattern.adapter;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
