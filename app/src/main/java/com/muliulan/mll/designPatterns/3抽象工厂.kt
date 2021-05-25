package com.muliulan.mll.designPatterns

/**
描述:
zhaochenshuo
2021/5/22
 */

class Design {

    /**
     * 定义:提供一个用于重建的对象的接口,无须指定实现类
     *
     * 对象的创建和使用过程分离
     *
     * */

    fun aa() {
        val a = Get().get(Text1())
        val b = Get().get(Text2())
    }
}

abstract class Abs {
    abstract fun text1(): Int
}

class Text1 : Abs() {
    override fun text1(): Int {
        return 1
    }
}

class Text2 : Abs() {
    override fun text1(): Int {
        return 1
    }
}

class Get {
    fun get(a: Abs): Int {
        return a.text1()
    }

}

