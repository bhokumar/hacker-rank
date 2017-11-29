package org.bhoopendra.learning.design.pattern.decorator;

public class LuxaryCar extends CarDecorator {
    private Car car;

    public LuxaryCar(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    public void assemble() {
        System.out.println("Luxury Car!");
    }
}
