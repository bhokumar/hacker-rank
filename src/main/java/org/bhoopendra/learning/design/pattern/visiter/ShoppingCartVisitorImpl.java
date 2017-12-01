package org.bhoopendra.learning.design.pattern.visiter;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        //if book price is greater than 50$ then give discount of 5$
        if (book.getPrice()>50){
            cost = book.getPrice()-5;
        }else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN : "+book.getIsbnNumber()+" with cost $"+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println("Fruit "+fruit.getName()+" costs $"+cost);
        return cost;
    }
}
