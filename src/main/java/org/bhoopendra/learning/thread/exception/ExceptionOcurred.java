package org.bhoopendra.learning.thread.exception;

public class ExceptionOcurred {
	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = ()->{
			throw new RuntimeException();
		};

		Thread thread = new Thread(runnable,"thread1");

		thread.setUncaughtExceptionHandler((t,e)->{
			System.out.println(t.getName());
			System.out.println(e.getCause());
		});

		thread.start();
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10000);
	}

}
