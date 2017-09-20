package org.bhoopendra.learning.thread.blockingque;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

public class FileCrawler implements Runnable {
    private BlockingQueue<File> fileQueue;
    private FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    private void crawl(final File fileRoot) throws InterruptedException {
        final File[] fileEntries = fileRoot.listFiles(fileFilter);
        if (fileEntries != null) {
            for (File entry : fileEntries) {
                if (entry.isDirectory()) {
                    crawl(entry);
                } else if (!alreadyIndexed(entry)) {
                    fileQueue.put(entry);
                }
            }
        }
    }

    private boolean alreadyIndexed(final File file) {
        return fileQueue.contains(file);
    }

    @Override
    public void run() {
        try {
            crawl(root);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}
