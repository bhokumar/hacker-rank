package org.bhoopendra.learning.thread.cache;

import java.util.HashMap;
import java.util.Map;

public class Memorizer<A, V> implements Computable<A, V> {
    private final Map<A, V> cache = new HashMap<>();
    final Computable<A, V> computer;

    public Memorizer(Computable<A, V> computer) {
        this.computer = computer;
    }

    @Override
    public synchronized V compute(final A arg)throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            System.out.println("Data in cache not found");
            result = computer.compute(arg);
            cache.put(arg, result);
        } else {
            System.out.println("Data found in cache!!");
        }
        return result;
    }
}
