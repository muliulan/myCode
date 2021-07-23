package com.muliulan.mll.designPatterns

import android.util.Log
import java.util.*

/**
name: zhaochenshuo
Date: 2021/7/16
 **/
class Pattern16 {

    /**
     * 一对多的关系,要1个对象改变状态时 它的所有依赖项都自动得到通知
     *
     * */

    fun aa() {
        val publisherImpl = PublisherImpl()
        val observerImpl = ObserverImpl()
        publisherImpl.add(observerImpl)
        publisherImpl.notify("wwww")
    }

}

interface Publisher {

    fun add(o: Observer)
    fun notify(s: String)
}

class PublisherImpl : Publisher {
    val arrayList = ArrayList<Observer>()
    override fun add(o: Observer) {
        arrayList.add(o)
    }

    override fun notify(s: String) {
        arrayList.forEach {
            it.notify(s)
        }
    }

}

interface Observer {
    fun notify(s: String)
}

class ObserverImpl : Observer {
    override fun notify(s: String) {
        Log.e("变化后的", s)

    }

}