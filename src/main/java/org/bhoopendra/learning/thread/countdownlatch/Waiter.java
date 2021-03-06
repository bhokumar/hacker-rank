package org.bhoopendra.learning.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable{

	private CountDownLatch countDownLatch = null;
	
	public Waiter(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	
	@Override
	public void run() {
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("waiter released");
		
	}

}
