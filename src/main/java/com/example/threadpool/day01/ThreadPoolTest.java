//package com.example.threadpool.day01;
//
///**
// * @Author: zhd
// * @Description
// * @Date: 2021/7/19 10:46
// * @Version: 1.0.0
// **/
//
//import org.junit.Test;
//
//import java.util.concurrent.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
///**
// * 线程池的初步学习
// * 1.Executor
// * 2.ThreadPoolExecutor
// */
//public class ThreadPoolTest {
//    /**
//     * newFixedThreadPool
//     * 当
//     */
//    @Test
//    public void executorTest() {
//        //总线程数，会产生OOM
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++) {
//            int finalI1 = i;
//            executor.execute(() -> System.out.println(finalI1 + "-----当前的线程为:" + Thread.currentThread()));
//        }
//
//        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//
//        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//    }
//
//    @Test
//    public void threadPool() {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
//        threadPoolExecutor.execute(() -> {
//            System.out.println();
//        });
//    }
//
//    public class NameThreadFactory implements ThreadFactory {
//
//        private final AtomicInteger mThreadNum = new AtomicInteger(1);
//
//        @Override
//        public Thread newThread(Runnable r) {
//            Thread thread = new Thread(r, "my-thread-" + mThreadNum.getAndIncrement());
//            System.out.println(thread.getName() + "已经运行!");
//            return null;
//        }
//    }
//}
