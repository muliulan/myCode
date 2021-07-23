package com.muliulan.mll.designPatterns

/**
name: zhaochenshuo
Date: 2021/7/16
 **/
class Pattern17 {

    /**
     *  保存多个时刻的数据 用于恢复
     *
     *  */

    fun aa(){
        val originator = Originator()   //Originator
        val memento = originator.create()   //Memento

        originator.restore(memento)

    }
}

class Originator {
    var state = "原始对象" //打印当前状态

    fun create(): Memento {
        return Memento()
    }

    fun restore(m: Memento) {
        this.state = m.state
    }

}

class Memento {
    val state = "回复的对象" //打印当前状态

}

