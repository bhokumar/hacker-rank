package org.bhoopendra.learning.thread;

public class CopyThread implements Runnable {
	public void run(){
		for(int i=0;i<100;i++){
			if(Thread.currentThread().isDaemon()){
				System.out.println("Deomen Thread running!");
			}
			//System.out.println("Copy Thread running");
		}
	}
}
