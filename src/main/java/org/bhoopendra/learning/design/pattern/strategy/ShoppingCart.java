package org.bhoopendra.learning.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public boolean removeItem(Item item){
        return items.remove(item);
    }

    public int calculateTotal(){
        return items.stream().mapToInt(item -> item.getPrice()).reduce(0,(sum,price)->sum+price);
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
