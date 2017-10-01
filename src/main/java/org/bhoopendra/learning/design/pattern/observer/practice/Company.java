package org.bhoopendra.learning.design.pattern.observer.practice;

public class Company {
    private String name;
    private long price;

    public Company(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
