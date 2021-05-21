package com.muliulan.mll.designPatterns

/**
描述: 单利
zhaochenshuo
2021/5/13
 */

class Design1 {


    /**
     * 允许存在一个实例
     * 提供一个机制让任何实体可以访问该实例
     *
     * 使用场景
     * 控制某些共享资源(比如数据库或者文件)的访问.同时读写一个超大的文件
     *
     * ThreadLocal 与其synchronized加锁的方式不同，它完全不提供锁，而使用以空间换时间的手段，为每个线程提供变量的独立副本，以保障线程安全。
     *
     * */



}