package org.bhoopendra.learning.design.pattern.builder;

public class BuilderClient {
    public static void main(String[] args){
        Computer computer = new Computer.ComputerBuilder("DDR3","RAM").setBluetoothEnabled(true).build();
        System.out.println(computer);
    }
}
