package org.example.OOD;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertSame;

class ThreadsafeSingletonTest {

    @Test
    void testMultithreadedAccess() throws InterruptedException, ExecutionException {
        Callable<ThreadsafeSingleton> task = ThreadsafeSingleton::getInstance;

        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            List<Future<ThreadsafeSingleton>> futures = IntStream.range(0, 10)
                    .mapToObj(i -> executor.submit(task))
                    .toList();

            ThreadsafeSingleton firstInstance = futures.getFirst().get();

            for (Future<ThreadsafeSingleton> future : futures) {
                ThreadsafeSingleton instance = future.get();
                assertSame(firstInstance, instance, "All instances from threads should be the same");
            }
        }
    }
}