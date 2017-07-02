package org.bhoopendra.learning.thread.pnc;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerClient {

	public static void main(String[] args) {
		Queue<Integer> sharedQueue = new LinkedList<>();
		new Thread(new Producer(sharedQueue, 4), "Producer").start();
		new Thread(new Consumer(sharedQueue), "Consumer").start();
	}

}

class Producer implements Runnable {
	private Queue<Integer> sharedQueue = null;
	private int maxSize = 0;

	public Producer(final Queue<Integer> sharedQueue, final int maxSize) {
		this.sharedQueue = sharedQueue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void produce(final int item) throws InterruptedException {
		synchronized (sharedQueue) {
			while (this.sharedQueue.size() == maxSize) {
				System.out.println("Shared Queue is full Thread " + Thread.currentThread().getName()
						+ "is waiting for item to be consumed");
				sharedQueue.wait();
				Thread.sleep(10000);
			}
			System.out.println("produced item : "+item);
			sharedQueue.add(item);
			sharedQueue.notifyAll();
		}
	}
}

class Consumer implements Runnable {

	private Queue<Integer> sharedQueue;

	public Consumer(final Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (sharedQueue) {
			while (sharedQueue.size() == 0) {
				System.out.println("shared Queue is empty Thread " + Thread.currentThread().getName()
						+ " is waiting for item to be produced");
				sharedQueue.wait();
			}
			System.out.println("Consumed item : "+sharedQueue.remove());
			sharedQueue.notifyAll();
		}
	}

}
