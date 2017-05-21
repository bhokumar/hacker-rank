package org.bhoopendra.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThread2 {
	Runnable worker = new  Runnable() {
		
		@Override
		public void run() throws ArithmeticException {
			
		}
	};
	
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	

}
