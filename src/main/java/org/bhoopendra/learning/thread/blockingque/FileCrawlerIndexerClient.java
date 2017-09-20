package org.bhoopendra.learning.thread.blockingque;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileCrawlerIndexerClient {
    public static void main(String[] args) {
        final BlockingQueue<File> fileQueue = new ArrayBlockingQueue<>(10);
        final File[] roots = {new File("E:/code2/workspce7/hacker-rank")};
        Arrays.stream(roots).forEach(file->new Thread(new FileCrawler(fileQueue,filteredFile->true,file)).start());
        for (int i=0;i<5;i++){
            new Thread(new Indexer(fileQueue)).start();
        }
    }
}
