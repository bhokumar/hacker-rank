package org.bhoopendra.learning.design.pattern.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }

    public void buildWindows() {
        System.out.println("Building glass windows!");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    public void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
