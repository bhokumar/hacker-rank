package org.bhoopendra.learning.thread.sync.lock;

import java.util.concurrent.locks.Lock;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class CriticalSection {
    private Lock lock;

    public CriticalSection(Lock lock) {
        this.lock = lock;
    }

    public void alloacate(final String userName) throws InterruptedException {
        lock.lock();
        System.out.println("Request thread name "+ Thread.currentThread().getName()+" "+userName + " is doing allocation");
        Thread.sleep(10000);
        System.out.println("Request thread name "+ Thread.currentThread().getName()+" "+userName + " has done its allocation");
        lock.unlock();
    }
}
