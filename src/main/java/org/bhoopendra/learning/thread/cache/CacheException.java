package org.bhoopendra.learning.thread.cache;

public class CacheException extends RuntimeException {
    public CacheException(final Throwable cause){
        super(cause);
    }

    public CacheException(final String message){
        super(message);
    }

    public CacheException(final String message,final Throwable cause){
        super(message,cause);
    }
}
