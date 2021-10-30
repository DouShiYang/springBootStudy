package com.doushiyang.springBootStudy.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadLocalTest {


    private static void incrementSameThreadId() {
        try {
            for (int i = 0; i < 5; i++) {
                int i1 = ThreadLocalId.get();
                System.out.println(Thread.currentThread().getName() + "_" + i + ",threadId:" + i1);
            }
        } finally {
            ThreadLocalId.remove();
        }
    }


    public static void main(String[] args) {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("测试线程-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(5, 7, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(8), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.execute(ThreadLocalTest::incrementSameThreadId);
        pool.shutdown();
    }

}
