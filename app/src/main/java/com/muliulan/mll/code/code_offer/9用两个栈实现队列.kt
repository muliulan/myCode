package com.muliulan.mll.code.code_offer

import java.util.*

/**
描述:
zhaochenshuo
2021/3/19
 */

class Off9 {
    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

    示例 1：
    输入：
    ["CQueue","appendTail","deleteHead","deleteHead"]
    [[],[3],[],[]]
    输出：[null,null,3,-1]

    示例 2：
    输入：
    ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
    [[],[],[5],[2],[],[]]
    输出：[null,-1,null,null,5,2]
     *
     * */
    /**
     * Your CQueue object will be instantiated and called as such:
     * var obj = CQueue()
     * obj.appendTail(value)
     * var param_2 = obj.deleteHead()
     */
    val linkedList1 = LinkedList<Int>()
    val linkedList2 = LinkedList<Int>()
    fun appendTail(value: Int) {

        linkedList1.add(value)
    }

    fun deleteHead(): Int {
        if (linkedList1.isEmpty() && linkedList2.isEmpty()) {
            return -1
        }

        if (linkedList2.isEmpty()) {
            while (!linkedList1.isEmpty()) {
                linkedList2.add(linkedList1.pop())
            }
        }

        return linkedList2.pop()
    }

}