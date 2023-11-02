package threads.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Available threads: " + threadCount);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, //Core Pool
                4, //Maximum Pool Size
                10, //keep alive
                TimeUnit.MILLISECONDS, // units for keep alive property
                new ArrayBlockingQueue<>(17)
        );
        for (int i = 0; i < 20; i++) {
            final int taskId = i;
            threadPoolExecutor.execute(() -> {
                System.out.println("Executing task " + taskId + " " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();

    }
}
