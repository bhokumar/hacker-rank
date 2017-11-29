package org.bhoopendra.learning.design.pattern.decorator;

public class DecoratorClient {

    public static void main(String[] args){
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("");

        final Car sportsLuxuryCar = new SportCar(new LuxaryCar(new BasicCar()));

        sportsLuxuryCar.assemble();
    }
}
