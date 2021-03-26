package com.muliulan.mll.code.`31-60`

import java.util.*
import kotlin.collections.ArrayList

/**
描述:
zhaochenshuo
2021/3/23
 */

class Main38() : Iterator<Int> {


    /**
     * 给你一个嵌套的整型列表。请你设计一个迭代器，使其能够遍历这个整型列表中的所有整数。
    列表中的每一项或者为一个整数，或者是另一个列表。其中列表的元素也可能是整数或是其他列表。


    示例 1:
    输入: [[1,1],2,[1,1]]
    输出: [1,1,2,1,1]
    解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,1,2,1,1]。

    示例 2:
    输入: [1,[4,[6]]]
    输出: [1,4,6]
    解释: 通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,4,6]。
     * */

//    private var linkedList: LinkedList<Int> = LinkedList<Int>()
    private var arrayList: ArrayList<Int> = ArrayList()
    private var iterator: MutableIterator<Int>? = null

    init {
        val nestedList: List<NestedInteger> = ArrayList()
        aad(nestedList)
        //直接获取 ArrayList的迭代器
        iterator = arrayList.iterator()
    }

    private fun aad(list: List<NestedInteger>) {
        for (a in 0 until list.size) {
            val nestedInteger = list[a]
            if (nestedInteger.isInteger()) {
                arrayList.add(nestedInteger.getInteger())
            } else {
                aad(nestedInteger.getList())
            }
        }
    }

    override fun hasNext(): Boolean {
        return iterator?.hasNext()!!
    }

    override fun next(): Int {
        return iterator?.next()!!
    }


    class NestedInteger {
        //             // Constructor initializes an empty nested list.
//             constructor()
//
//             // Constructor initializes a single integer.
//             constructor(value: Int)
//
//             // @return true if this NestedInteger holds a single integer, rather than a nested list.
        fun isInteger(): Boolean {
            return false
        }

        //
//             // @return the single integer that this NestedInteger holds, if it holds a single integer
//             // Return null if this NestedInteger holds a nested list
        fun getInteger(): Int {
            return 0
        }

        //
//             // Set this NestedInteger to hold a single integer.
//             fun setInteger(value: Int): Unit
//
//             // Set this NestedInteger to hold a nested list and adds a nested integer to it.
//             fun add(ni: NestedInteger): Unit
//
//             // @return the nested list that this NestedInteger holds, if it holds a nested list
//             // Return null if this NestedInteger holds a single integer
        fun getList(): List<NestedInteger> {
            return ArrayList<NestedInteger>()
        }
    }


}