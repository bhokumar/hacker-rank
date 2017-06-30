package org.bhoopendra.learning.thread.blockingque;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> blockingQueue;
	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
