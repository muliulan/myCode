package com.muliulan.mll.utils

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 *    @author : zhaoCS
 *    date    : 2022/4/1110:08 上午
 *    desc    : 多地方使用同一个接口   代理+委托实现
 */

////////////////////////////////固定写法//////////////////////////////////////
internal inline fun <reified T : Any> noOpDelegate(): T = noOpDelegateInternal()

internal inline fun <reified T : Any> noOpDelegateInternal(): T {
    val javaClass = T::class.java
    return Proxy.newProxyInstance(
        javaClass.classLoader, arrayOf(javaClass)
    ) { _, _, _ -> } as T
}
//////////////////////////////////////////////////////////////////////

interface Azz {
    fun aa()
    fun bb()
    fun cc()
}

class Jhhh {
    fun aa(a: Azz) {
    }

    fun bb() {
        //第一种
        aa(object : Azz {
            override fun aa() {
            }
            override fun bb() {
            }
            override fun cc() {
            }
        })
        //第二种
        aa(object : Azz by noOpDelegate() {
            override fun aa() {
                //使用代理可以只实现1个或者都不实现
            }
        })

    }


}

