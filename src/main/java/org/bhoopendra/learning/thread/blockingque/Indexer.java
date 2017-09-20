package org.bhoopendra.learning.thread.blockingque;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class Indexer implements Runnable {
    private BlockingQueue<File> fileQueue;

    public Indexer(BlockingQueue<File> fileQueue) {
        this.fileQueue = fileQueue;
    }


    @Override
    public void run() {
        try {
            while (true) {
                indexFile(fileQueue.take());
            }
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void indexFile(final File indexedFile) {
        System.out.println(indexedFile.getAbsolutePath() + indexedFile.getName() + "has been indexed");
    }
}
