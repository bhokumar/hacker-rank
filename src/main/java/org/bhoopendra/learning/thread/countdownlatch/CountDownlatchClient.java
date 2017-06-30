package org.bhoopendra.learning.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownlatchClient {

	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		new Thread(new Waiter(countDownLatch)).start();
		new Thread(new Decrementer(countDownLatch)).start();
	}

}
