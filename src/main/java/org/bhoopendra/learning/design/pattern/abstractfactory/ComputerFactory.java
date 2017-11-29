package org.bhoopendra.learning.design.pattern.abstractfactory;

public class ComputerFactory {
    public static Computer getComputer(final ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}

