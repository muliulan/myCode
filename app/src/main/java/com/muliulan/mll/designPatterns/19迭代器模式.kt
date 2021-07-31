package com.muliulan.mll.designPatterns

/**
name: zhaochenshuo
Date: 2021/7/16
 **/
class Pattern19 {

    /**
     *提供一种对容器对象中进行访问,而又不暴露细节
     *
     * */


}

interface MyIterator {
    fun next(): Any
    fun hasNext(): Boolean
}

class Concrete : MyIterator {
    private val intArray = IntArray(10);

    override fun next(): Any {
        return intArray
    }

    override fun hasNext(): Boolean {
        return false
    }
}

interface Aggregate {
    fun create(): MyIterator
}

class MyConcreteAggregate : Aggregate {
    override fun create(): MyIterator {
        return Concrete()
    }
}


