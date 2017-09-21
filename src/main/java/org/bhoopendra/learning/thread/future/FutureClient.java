package org.bhoopendra.learning.thread.future;

import java.util.concurrent.*;

public class FutureClient {
    private FutureClient() {
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final Callable<String> worker = () -> {
            return "hello";
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> result = executorService.submit(worker);
        System.out.println("Asysnchronous result found!");
        System.out.println("################### Before worker execution done ######################");
        System.out.println("isDone status : "+result.isDone());
        System.out.println("cancled status : "+result.isCancelled());
        System.out.println("waiting to workers execution!");
        System.out.println(result.get());
        System.out.println("################### After worker execution done ######################");
        System.out.println("isDone status : "+result.isDone());
        System.out.println("cancled status : "+result.isCancelled());


        final Runnable runnable = ()-> {
            System.out.println("Runnable executed");
            try{
            Thread.sleep(10000);
            }catch (final InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

         Future<?> future = executorService.submit(runnable);
        System.out.println(future);
        executorService.shutdown();
        System.out.println("shutdown is called on service!");
    }
}
