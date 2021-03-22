package com.muliulan.mll.offer.off

import com.muliulan.mll.offer.Text
import java.util.*

/**
描述:
zhaochenshuo
2021/2/8
 */

class Offer5 {

    /**
    用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail 和deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。
     * */
    fun aa() {

        val one = Stack<Text>()
        val two = Stack<Text>()

        fun appendTail(t: Text) {
            one.add(t)
        }

        fun deleteHead(): Text {
            if (two.isEmpty()) {
                while (!two.isEmpty()) {
                    two.add(one.pop())
                }
            }


            return two.pop()
        }
    }

}