package com.muliulan.mll.designPatterns

import android.util.Log

class Pattern11 {


    /**
     * 提供对象的占位符 控制对对象的访问
     * 比如你没时间卖房,找个中介代理你卖房
     *
     *
     * 和装饰模式类型 一个是修改对象的行为,一个是控制访问
     *
     * */
    fun aa() {

        val proxy = Proxy()
        proxy.doSomeing()
    }
}


interface RealObj {
    fun doSomeing()
}
//被代理的
open class RealObjIml : RealObj {
    override fun doSomeing() {
        Log.e("mll", "开始")
    }
}

class Proxy : RealObjIml() {
    override fun doSomeing() {
        super.doSomeing()
        //进行代理操作或者额外操作

    }

}



