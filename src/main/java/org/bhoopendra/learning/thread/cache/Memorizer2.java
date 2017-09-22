package org.bhoopendra.learning.thread.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memorizer2<A,V> implements Computable<A,V> {
    private final Map<A,V> cache = new ConcurrentHashMap<>();
    private final Computable<A,V> computer;

    public Memorizer2(Computable<A, V> computer) {
        this.computer = computer;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result==null){
            System.out.println("Data in cache not found");
            result = computer.compute(arg);
            cache.put(arg,result);
        }else {
            System.out.println("Data found in cache");
        }
        return result;
    }
}
