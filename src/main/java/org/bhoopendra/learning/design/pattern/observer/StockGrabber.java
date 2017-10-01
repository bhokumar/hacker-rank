package org.bhoopendra.learning.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {
		observers = new ArrayList<>();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		int indexObserver = observers.indexOf(deleteObserver);
		observers.remove(deleteObserver);
		System.out.println("Observer at index : " + indexObserver + " deleted");
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setIbmPrices(final double ibmPrices) {
		this.ibmPrice = ibmPrices;
		notifyObserver();
	}
	
	public void setApplePrices(final double applePrices) {
		this.applePrice = applePrices;
		notifyObserver();
	}
	
	public void setGooglePrices(final double googlePrices) {
		this.googlePrice = googlePrices;
		notifyObserver();
	}
}
