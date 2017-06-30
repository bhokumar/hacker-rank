package org.bhoopendra.learning.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreRunnable implements Runnable {
	private Semaphore semaphore;
	public SemaphoreRunnable(final Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	@Override
	public void run() {
		SemaphoreCriticalSection criticalSection = new SemaphoreCriticalSection(this.semaphore);
		try {
			criticalSection.criticalSection();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
