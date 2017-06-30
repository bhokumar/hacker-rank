package org.bhoopendra.learning.thread.exception;

public class ExceptionOcurred {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = ()->{
			throw new RuntimeException();
		};
		Thread thread = new Thread(runnable,"thread1");
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName());
			}
		});
		thread.start();
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10000);
	}

}
