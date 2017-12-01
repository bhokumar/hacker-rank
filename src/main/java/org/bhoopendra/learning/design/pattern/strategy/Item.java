package org.bhoopendra.learning.design.pattern.strategy;

public class Item {
    private String upCode;
    private int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }

}
