package org.bhoopendra.learning.design.pattern.visiter;

import java.util.Arrays;
import java.util.List;

public class ShoppingClient {
    public static void main(String[] args){
        List<ItemElement> itemElements = Arrays.asList(new Book(20,"The fountain"),new Book(30,"NSTGH123"),new Fruit(50,2,"Banana"),new Fruit(100,5,"APPLE"));
        final ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        System.out.println("Total Cost : "+itemElements.stream().mapToInt(itemElement->itemElement.accept(shoppingCartVisitor)).reduce(0,(sum,item)->sum+item));
    }
}
