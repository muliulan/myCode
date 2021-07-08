package com.muliulan.mll.designPatterns

import android.util.Log

/**
name: zhaochenshuo
Date: 2021/7/2
 **/

class Pattern13 {

    /**
     * 第一算法的框架,将一些步骤放到子类中,让子类在不改变算法结构的情况下重新定义算法的默写步骤
     *
     * 抽象父类:提供一些通用的方法逻辑
     * 抽象子类:继承父类,根据需求重写父类算法步骤中的某些步骤
     * */

    fun aa(){
        val abstTemplate11 = AbstTemplate11()

        abstTemplate11.text1(1)
        abstTemplate11.text1(2)

    }

}


abstract class AbstTemplate {
    abstract fun text2()
    abstract fun text3()
    fun text1(i: Int) {
        if (i == 1) {
            text2()
        } else {
            text3()
        }
    }
}

class AbstTemplate11 : AbstTemplate() {
    override fun text2() {
        Log.e("mll", "子类自己单独的步骤")
    }

    override fun text3() {
        Log.e("mll", "子类自己单独的步骤")

    }

}



