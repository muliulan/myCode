package com.muliulan.mll.designPatterns

/**
name: zhaochenshuo
Date: 2021/7/2
 **/
class Pattern14() {

    /**
     * 多个算法,并使他们可以互换策略让算法独立于使用它的客户端变化
     *
     * 代替多个if.else
     *
     *
     * 上下文信息类:存放和执行需要使用的策略
     * 抽象策略类:定义策略的共有方法
     * 具体策略类:实现抽象策略类定义的共有方法
     * */


    fun aa() {
        var steat: Steat = StratA()
        steat.oper()

        steat=StratB()
        steat.oper()
    }

}

interface Steat {
    fun oper()
}

class StratA : Steat {
    override fun oper() {
        "执行策略A"
    }
}

class StratB : Steat {
    override fun oper() {
        "执行策略b"
    }

}


