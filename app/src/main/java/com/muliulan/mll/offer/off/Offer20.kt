package com.muliulan.mll.offer.off

import android.util.Log
import com.muliulan.mll.offer.TextTwo
import java.util.*
import kotlin.collections.ArrayList

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer20 {

    /**
     * 从上往下打印出二叉树的每个结点，同一层的结点按照从左向右的顺序打印。
     *      8
     *    /    \
     *   6     10
     *  /  \   / \
     * 5   7  9  11
     * 则依次打印出8、6、10、5、7 、9、11.
     * */
    fun aa() {

        val one = TextTwo.ab()
        bb(one)
    }

    private fun bb(t: TextTwo) {
        val arrayList = ArrayList<TextTwo>()

        val linkedList = LinkedList<TextTwo>()
        linkedList.add(t)

        while (!linkedList.isEmpty()) {
            val poll = linkedList.poll()

            if (poll.l != null) {
                linkedList.add(poll.l!!)
            }
            if (poll.r != null) {
                linkedList.add(poll.r!!)
            }

            arrayList.add(poll)

        }
        var a=""
        arrayList.forEach {
            a+="${it.a} ,"
        }
        Log.e("mll zzz",a)
    }
}