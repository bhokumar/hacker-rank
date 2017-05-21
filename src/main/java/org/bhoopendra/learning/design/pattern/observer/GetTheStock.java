package org.bhoopendra.learning.design.pattern.observer;

public class GetTheStock implements Runnable {
	
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock,double newPrice ) {
		this.stockGrabber = stockGrabber;
		this.startTime = newStartTime;
		this.stock = newStock;
		this.price = newPrice;
	}
	@Override
	public void run() {
		
	}

}
