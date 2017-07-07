package org.bhoopendra.learning.thread.sync;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class ThreadRangeAllocator implements Runnable {
    private String rangeName;
    private String userName;

    public ThreadRangeAllocator(String rangeName, String userName) {
        this.rangeName = rangeName;
        this.userName = userName;
    }

    @Override
    public void run() {
        CrticalSection crticalSection = new CrticalSection(this.rangeName);
        try {
            crticalSection.allocate(userName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
