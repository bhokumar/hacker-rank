package org.bhoopendra.learning.thread.callable;

import java.util.concurrent.Callable;

public class ThreadTask implements Callable<Result> {
    @Override
    public Result call() throws Exception {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("OK");
        return result;
    }
}
