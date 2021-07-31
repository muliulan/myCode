package com.muliulan.mll.utils

import java.util.concurrent.CyclicBarrier

/**
name: zhaochenshuo
Date: 2021/7/30
 **/
class MyCyclicBarrier {

    /**
     *
    //同步操作锁
    private final ReentrantLock lock = new ReentrantLock();
    //线程拦截器
    private final Condition trip = lock.newCondition();
    //每次拦截的线程数
    private final int parties;
    //换代前执行的任务
    private final Runnable barrierCommand;
    //表示栅栏的当前代
    private Generation generation = new Generation();
    //计数器
    private int count;

    //静态内部类Generation
    private static class Generation {
    boolean broken = false;
    }
     *
     * */

    fun aa() {

        //4个线程都传过围栏,计数器重置为4,
        // Runnable 代表大家都到达围栏,在通过之前需要的执行的 可以为空
        val cyclicBarrier = CyclicBarrier(4, object : Runnable {
            override fun run() {


            }
        })

    }

}