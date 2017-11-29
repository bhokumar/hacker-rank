package org.bhoopendra.learning.design.pattern.decorator;

public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Sports car");
    }
}
