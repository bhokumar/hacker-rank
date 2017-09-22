package org.bhoopendra.learning.thread.cache;

import java.util.Map;
import java.util.concurrent.*;

public class Memorizer3<A,V> implements Computable<A,V> {
    private final Map<A,Future<V>> cache = new ConcurrentHashMap<>();
    private Computable<A,V> computer;

    public Memorizer3(Computable<A, V> computer) {
        this.computer = computer;
    }

    @Override
    public V compute(A arg) throws InterruptedException{
        Future<V> result = cache.get(arg);
        if (result==null){
            Callable<V> callable = ()->computer.compute(arg);
            FutureTask<V> futureTask = new FutureTask<V>(callable);
            result =futureTask;
            cache.put(arg,futureTask);
            futureTask.run();
        }
        try{
            return result.get();
        }catch (final ExecutionException e){
            throw new RuntimeException(e.getCause());
        }
    }
}
