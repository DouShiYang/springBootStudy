package com.doushiyang.springBootStudy.test;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * 我们给每个线程生成一个ID。
 * 一旦设置，线程生命周期内不可变化。
 * 容器活动期间不可以生成重复的ID
 */
public class ThreadLocalId {

    private static final AtomicInteger nexId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nexId.getAndIncrement();
        }
    };


    public static int get() {
        return threadId.get();
    }

    public static void remove() {
        threadId.remove();
    }
}
