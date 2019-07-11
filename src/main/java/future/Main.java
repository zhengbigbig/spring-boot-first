package future;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ExecutorService executor = Executors.newCachedThreadPool(); //线程池
        Future<Integer> result = executor.submit(() -> { // Lambda
            Random rand = new Random();
            for (int i = 0; i < 10000; i++) {
                rand.nextInt();
            }
            Thread.sleep(5000);
            return rand.nextInt();
        });
        Future<Integer> result2 = executor.submit(() -> {
            Random rand = new Random();
            for (int i = 0; i < 100000; i++) {
                rand.nextInt();
            }
            Thread.sleep(10000);
            return rand.nextInt();
        });
        System.out.println("主线程在执行任务");
        // 执行其他的任务
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        try {
            System.out.println("运行结果1: "+result.get());
            System.out.println("运行结果2: "+result2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("所有任务执行完毕");
    }
}
