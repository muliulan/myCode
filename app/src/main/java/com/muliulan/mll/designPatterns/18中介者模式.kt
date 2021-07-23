package com.muliulan.mll.designPatterns

import android.util.Log

/**
name: zhaochenshuo
Date: 2021/7/16
 **/
class Pattern18{

    /**
     *中介者对象封装了 一组对象的交互 这组对象的交互交给中介者对象
     *
     *
     * */


    fun aa(){
        val mediatorImpl = MediatorImpl()

        val a = A(mediatorImpl)
        val b = B(mediatorImpl)

    }
}
interface  Mediator{
    fun apply(key:String)
}

class MediatorImpl:Mediator{
    override fun apply(key: String) {
        Log.e("mll","中介者对象执行")
    }
}

class A(m:Mediator){

    init {
        m.apply("aaaa")
    }
}
class B(m:Mediator){

    init {
        m.apply("bbbb")
    }
}

