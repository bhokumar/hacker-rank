package org.bhoopendra.learning.design.pattern.observer.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class StockGrabber implements Subject {
    private static final Logger LOGGER = Logger.getLogger(StockGrabber.class.getName());
    final List<Observer> observers;
    final List<Company> companies;

    public StockGrabber(final List<Company> companies) {
        this.companies = companies;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(final Observer observer) {
        observers.add(observer);
        LOGGER.info("New observer added");
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
        LOGGER.info("Observer has been deleted");
    }

    @Override
    public void notifyUpdate(List<Company> companies) {
        observers.stream().forEach(observer -> observer.update(companies));
    }

    public void changePrices(final Map<String, Long> companiesWithUpdatedPrice) {
        companiesWithUpdatedPrice
                .entrySet()
                .stream().forEach(t -> companies.stream()
                .filter(c -> t.getKey() == c.getName())
                .findFirst().ifPresent(c -> c.setPrice(t.getValue())));
        notifyUpdate(companies);
    }
}
