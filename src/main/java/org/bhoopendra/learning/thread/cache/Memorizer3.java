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
        System.out.println("waiting to retrieve from cache!");
        Future<V> result = cache.get(arg);
        if (result==null){
            Callable<V> callable = ()->{
                System.out.println("expensive function being computed!");
                Thread.sleep(10000);
                return computer.compute(arg);
            };
            FutureTask<V> futureTask = new FutureTask<V>(callable);
            result =futureTask;
            cache.put(arg,futureTask);
            futureTask.run();
        }
        try{
            System.out.println("waiting to result to be computed!");
            return result.get();
        }catch (final ExecutionException e){
            throw new RuntimeException(e.getCause());
        }
    }
}
