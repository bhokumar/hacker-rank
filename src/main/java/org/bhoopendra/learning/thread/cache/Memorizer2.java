package org.bhoopendra.learning.thread.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class Memorizer2<A,V> implements Computable<A,V> {
    private static final  Logger LOGGER = Logger.getLogger(Memorizer2.class.getName());
    private final Map<A,V> cache = new ConcurrentHashMap<>();
    private final Computable<A,V> computer;

    public Memorizer2(Computable<A, V> computer) {
        this.computer = computer;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result==null){
            LOGGER.info("Data in cache not found");
            result = computer.compute(arg);
            cache.put(arg,result);
        }else {
            LOGGER.info("Data found in cache");
        }
        return result;
    }
}
