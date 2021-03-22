package com.muliulan.mll.offer.off

import java.util.*

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer18 {

    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小数的min 函数。在该栈中，调用min、push 及pop的时间复杂度都是O(1)。
     *
     * */
    val stack = Stack<Int>()
    val minStack = Stack<Int>()
    var min = 99999
    fun push(a: Int) {
        stack.push(a)
        minStack.push(a)
        if (a < min) {
            min = a
        }
    }

    fun pop() {
        //返回栈顶的值 别把值删除了
        stack.pop()
        minStack.pop()
        //返回栈顶的值 不会删除
        min = minStack.peek()

    }

    fun getMin1(): Int {
        return min
    }


//    fun aa() {
//
//        stack.push(11)
//        stack.push(22)
//        stack.push(33)
//        stack.push(44)
//
//        stack.pop()
//        stack.peek()
//    }

}