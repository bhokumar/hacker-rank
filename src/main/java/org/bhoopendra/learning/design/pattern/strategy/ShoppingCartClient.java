package org.bhoopendra.learning.design.pattern.strategy;

public class ShoppingCartClient {
    public static void main(String[] args){
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("item1",120);
        Item item2 = new Item("item2", 140);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("bhoopendra.akgec@gmail.com","password$123"));
        shoppingCart.pay(new CreditCardStrategy("Bhoopendra","duwiiuhf","uwhd","uhwq"));

    }
}
