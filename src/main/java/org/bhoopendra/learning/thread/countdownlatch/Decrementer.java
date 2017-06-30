package org.bhoopendra.learning.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

	CountDownLatch countDownLatch = null;
	public Decrementer(final CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(countDownLatch.getCount());
			countDownLatch.countDown();
			Thread.sleep(1000);
			
			System.out.println(countDownLatch.getCount());
			countDownLatch.countDown();
			Thread.sleep(1000);
			
			System.out.println(countDownLatch.getCount());
			countDownLatch.countDown();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
