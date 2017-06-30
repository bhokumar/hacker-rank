package org.bhoopendra.learning.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread2 implements Runnable{

	private CyclicBarrier  cyclicBarier = null;
	public Thread2(CyclicBarrier cyclicBarier) {
		this.cyclicBarier = cyclicBarier;
	}
	
	@Override
	public void run() {
		try {
			cyclicBarier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("Thread2 has released");
	}

}
