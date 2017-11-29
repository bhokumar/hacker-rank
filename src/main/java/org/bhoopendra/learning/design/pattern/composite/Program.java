package org.bhoopendra.learning.design.pattern.composite;

public class Program {
    public static void main(String[] args){
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();

        graphic1.addComponent(ellipse1);
        graphic1.addComponent(ellipse2);
        graphic1.addComponent(ellipse3);

        graphic2.addComponent(ellipse4);

        graphic3.addComponent(ellipse1);
        graphic3.addComponent(graphic1);

        graphic3.print();
    }
}
