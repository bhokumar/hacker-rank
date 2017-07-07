package org.bhoopendra.learning.thread.sync.lock;

import java.util.concurrent.locks.Lock;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class RangeAllocater implements Runnable {
    private Lock lock;
    private String userName;

    public RangeAllocater(Lock lock, String userName) {
        this.lock = lock;
        this.userName = userName;
    }

    @Override
    public void run() {
        CriticalSection criticalSection = new CriticalSection(this.lock);
        try {
            criticalSection.alloacate(this.userName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
