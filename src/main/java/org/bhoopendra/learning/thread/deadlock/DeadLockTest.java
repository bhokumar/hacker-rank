package org.bhoopendra.learning.thread.deadlock;

public class DeadLockTest {
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	
	public static void main(String[] args) {
		new CustomThread1().start();
		new CustomThread2().start();
	}
	
	static class CustomThread1 extends Thread{
		public void run(){
			synchronized (lock1) {
				System.out.println(Thread.currentThread().getName()+" is holding lock on object lock1");
				try {
					System.out.println(Thread.currentThread().getName()+" is waiting to acquire lock on object lock2");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println(Thread.currentThread().getName()+" is holding lock on object lock2");
				}
			}
			
		}
	}
	
	static class CustomThread2 extends Thread{
		public void run(){
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName()+" is holding lock on object lock2");
				try {
					System.out.println(Thread.currentThread().getName()+" is waiting to acquire lock on object lock1");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName()+" is holding lock on object lock1");
				}
			}
			
		}
	}

}
