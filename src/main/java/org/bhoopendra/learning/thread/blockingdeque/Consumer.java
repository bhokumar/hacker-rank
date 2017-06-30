package org.bhoopendra.learning.thread.blockingdeque;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{

	BlockingDeque<Integer> blockingDeque= null;
	public Consumer(BlockingDeque<Integer> blockingDeque) {
		this.blockingDeque = blockingDeque;
	}
	@Override
	public void run() {
		try {
			System.out.println(blockingDeque.takeFirst());
			System.out.println(blockingDeque.takeFirst());
			System.out.println(blockingDeque.takeFirst());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
