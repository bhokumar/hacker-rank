package org.bhoopendra.learning.thread.callable;

import org.bhoopendra.learning.thread.cache.CacheClient;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class CallableClient {
    private static final Logger LOGGER = Logger.getLogger(CacheClient.class.getName());
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        final Callable<Result> resultTask = ()->{
            Result result = new Result();
            result.setMessage("OK");
            result.setCode(200);
            return result;
        };
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final Future<Result> result = executorService.submit(resultTask);
       Result result1 =  result.get();
       LOGGER.info(result1.getMessage());
       LOGGER.info(String.valueOf(result1.getCode()));
       executorService.shutdown();
    }
}
