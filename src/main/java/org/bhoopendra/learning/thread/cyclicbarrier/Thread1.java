package org.bhoopendra.learning.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread1 implements Runnable {
	CyclicBarrier cyclicBarier = null;

	public Thread1(final CyclicBarrier barrier) {
		this.cyclicBarier = barrier;
	}

	@Override
	public void run() {
		try {
			cyclicBarier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("Thread1 has released");
	}

}
