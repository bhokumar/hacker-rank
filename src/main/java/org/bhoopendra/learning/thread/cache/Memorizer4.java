package org.bhoopendra.learning.thread.cache;

import java.util.Map;
import java.util.concurrent.*;
import java.util.logging.Logger;

public class Memorizer4<A, V> implements Computable<A, V> {
    private static final Logger LOGGER = Logger.getLogger(Memorizer4.class.getName());
    private final Map<A, Future<V>> cache = new ConcurrentHashMap<>();
    private Computable<A, V> computer;

    public Memorizer4(Computable<A, V> computer) {
        this.computer = computer;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        LOGGER.info("Result being calculated!");
        while (true) {
            Future<V> result = cache.get(arg);
            if (result == null) {
                final Callable<V> eval = () -> computer.compute(arg);
                FutureTask<V> ft = new FutureTask<>(eval);
                result = cache.putIfAbsent(arg, ft);
                if (result == null) {
                    result = ft;
                    ft.run();
                }
            }
            try {
                return result.get();
            } catch (final CancellationException e) {
                cache.remove(arg);
            } catch (final ExecutionException e) {
                throw new CacheException(e.getCause());
            }
        }
    }
}
