package org.bhoopendra.learning.thread.callable;

import org.bhoopendra.learning.thread.cache.CacheClient;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class CallableClient {
    private static final Logger LOGGER = Logger.getLogger(CacheClient.class.getName());
    public static void main(String[] args) throws InterruptedException,ExecutionException,TimeoutException{
        final Callable<Result> resultTask = ()->{
            Thread.sleep(1000);
            Result result = new Result();
            result.setMessage("OK");
            result.setCode(200);
            return result;
        };

        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final Future<Result> result = executorService.submit(resultTask);
        LOGGER.info(result.get(1000,TimeUnit.MILLISECONDS).toString());
       Result result1 =  result.get();
       LOGGER.info(result1.getMessage());
       LOGGER.info(String.valueOf(result1.getCode()));
       executorService.shutdown();

    }
}
