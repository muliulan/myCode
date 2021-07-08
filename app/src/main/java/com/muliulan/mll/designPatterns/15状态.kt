package com.muliulan.mll.designPatterns

import android.util.Log

/**
name: zhaochenshuo
Date: 2021/7/2
 **/

class Pattern15 {

    /**
     * 一个对象在其内部状态改变时,改变它的行为,看起来视乎修改了自己的类一样
     *
     * 抽象状态类:可以是一个接口或抽象类,用于定义状态更新的操作
     * 集体状态类:实现抽象状态类,根据需求指定对应状态后的变化
     * */

    fun aa() {
        val statea = StateA()
        statea.aa()

        statea.handle(11)
        statea.aa()
    }
}

interface State {
    fun handle(i: Int)
}

class StateA : State {
    var a = 0
    override fun handle(i: Int) {
        a = i
    }

    fun aa() {
        Log.e("mll", a.toString())
    }

}