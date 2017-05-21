package org.bhoopendra.learning.design.pattern.observer;

public class GrabStocks {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver stockObserver = new StockObserver(stockGrabber);
		StockObserver stockObserve2 = new StockObserver(stockGrabber);
			stockGrabber.setApplePrices(1000.25);
			stockGrabber.setGooglePrices(500.36);
			stockGrabber.setIbmPrices(125.12);
			
			stockGrabber.unregister(stockObserve2);
			
			stockGrabber.setApplePrices(1000.25);
			
	}
}
