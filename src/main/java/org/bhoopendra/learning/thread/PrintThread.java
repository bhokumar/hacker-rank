package org.bhoopendra.learning.thread;

public class PrintThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("Print Thread running");
		}
	}

}
