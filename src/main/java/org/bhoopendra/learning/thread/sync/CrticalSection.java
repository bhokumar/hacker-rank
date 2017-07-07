package org.bhoopendra.learning.thread.sync;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class CrticalSection {
    private String rangeName;

    public CrticalSection(String rangeName) {
        this.rangeName = rangeName;
    }

    public void allocate(final String userName) throws InterruptedException {
        synchronized (this.rangeName){
            System.out.println(userName+" allocating rage");
            Thread.sleep(10000);
            System.out.println(userName+" is done with arage allocation");
        }
    }
}
