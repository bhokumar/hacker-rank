package org.bhoopendra.learning.design.pattern.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building glass house");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building pillars glass coating");
    }
}
