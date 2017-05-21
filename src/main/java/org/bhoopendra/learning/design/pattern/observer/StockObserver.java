package org.bhoopendra.learning.design.pattern.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	private static int observerIdTracker = 0;
	private int observerId;
	private Subject stockGrabber;

	public StockObserver stockObserver;

	public StockObserver(final StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		System.out.println("Observer with Observer Id : " + this.observerId+"\n");
		this.stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;

		printThePrices();
	}

	public void printThePrices() {
		System.out.println("######################################");
		System.out.println("Price for Ibm is : " + ibmPrice);
		System.out.println("Price for Apple is : " + applePrice);
		System.out.println("Price for Google is : " + googlePrice);

	}

}
