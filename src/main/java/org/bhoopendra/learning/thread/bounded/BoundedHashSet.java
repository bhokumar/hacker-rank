package org.bhoopendra.learning.thread.bounded;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundedHashSet<T> {
    private Set<T> set;
    private Semaphore semaphore;

    public BoundedHashSet(final int bound) {
        this.set = Collections.synchronizedSet(new HashSet<>());
        this.semaphore = new Semaphore(bound);
    }

    public boolean add(final T item)throws InterruptedException{
        semaphore.acquire();
        boolean wasAdded = false;
        try{
            wasAdded= set.add(item);
            return wasAdded;
        }finally {
            if (!wasAdded){
                semaphore.release();
            }
        }
    }

    public boolean remove(final T object){
        boolean wasRemoved = set.remove(object);
        if (wasRemoved)
            semaphore.release();
        return wasRemoved;
    }
}
