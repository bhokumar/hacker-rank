package org.bhoopendra.learning.thread.executer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorClient {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable1= ()->{
			for(int i=0;i<10;i++){
				System.out.println(i+" runnable1");
			}
		};
		
		Runnable runnable2= ()->{
			for(int i=0;i<10;i++){
				System.out.println(i+" runnable2");
			}
		};

		
		Runnable runnable3= ()->{
			for(int i=0;i<10;i++){
				System.out.println(i+" runnable3");
			}
		};
		
		Runnable runnable4= ()->{
			for(int i=0;i<10;i++){
				System.out.println(i+" runnable4");
			}
		};
		
		Runnable runnable5= ()->{
			for(int i=0;i<10;i++){
				System.out.println(i+" runnable5");
			}
		};
		
		BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(20);
		blockingQueue.put(runnable1);
		blockingQueue.put(runnable2);
		blockingQueue.put(runnable3);
		blockingQueue.put(runnable4);
		blockingQueue.put(runnable5);

	ExecutorService executorService = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, blockingQueue);
		executorService.execute(runnable1);
		executorService.execute(runnable2);
		executorService.execute(runnable3);
		executorService.execute(runnable4);
		executorService.execute(runnable5);
	executorService.shutdown();
	}
}
