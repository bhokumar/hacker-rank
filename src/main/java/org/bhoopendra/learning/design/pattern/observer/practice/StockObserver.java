package org.bhoopendra.learning.design.pattern.observer.practice;

import java.util.List;
import java.util.logging.Logger;

public class StockObserver implements Observer{
    private static final Logger LOGGER = Logger.getLogger(StockObserver.class.getName());
    private String observerName;

    public StockObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(List<Company> companies) {
        LOGGER.info(()->"Company details are : ");
        companies.stream().forEach(StockObserver::showDetails);
    }

    private static void showDetails(final Company company){
        LOGGER.info(()->"Company name : "+company.getName());
        LOGGER.info(()->"Company share price : $"+company.getPrice());
    }
}
