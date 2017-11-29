package org.bhoopendra.learning.design.pattern.abstractfactory;

public class Client {
    public static void main(String[] args){
        Computer pc = ComputerFactory.getComputer(new PCFactory("DDR3","NORMAL","OCTA CORE"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("DDR4","SDD","HEXA CORE"));
        System.out.println(pc);
        System.out.println(server);
    }
}
