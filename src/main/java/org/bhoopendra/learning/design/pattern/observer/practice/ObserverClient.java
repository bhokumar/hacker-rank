package org.bhoopendra.learning.design.pattern.observer.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverClient {
    public static void main(String[] args) {
        List<Company> companies = List.of(new Company("APPLE", 165), new Company("IBM", 102), new Company("GOOGLE", 1068));
        final StockGrabber stockGrabber = new StockGrabber(companies);
        stockGrabber.register(new StockObserver("observer1"));
        stockGrabber.register(new StockObserver("observer2"));
        final Map<String, Long> companiesDetails = new HashMap<>();
        companiesDetails.put("APPLE", Long.valueOf(166));
        stockGrabber.changePrices(companiesDetails);
        companiesDetails.put("IBM", Long.valueOf(126));
        stockGrabber.changePrices(companiesDetails);
    }
}
