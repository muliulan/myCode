package com.muliulan.mll.offer.off

import android.util.Log
import com.muliulan.mll.offer.TextTwo
import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer22_ {

    /**
     * 输入一棵二叉树和一个整数， 打印出二叉树中结点值的和为输入整数的所有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * */
    val all = ArrayList<ArrayList<Int>>()
    fun aa() {

        val ab = TextTwo.ab()
        val a = 19

        bb(ab, a, ArrayList<Int>())

        var aa = ""
        all.forEach {
            aa += it
        }
        Log.e("mllaaa", aa)
    }

    private fun bb(textTwo: TextTwo?, a: Int, list: ArrayList<Int>) {
        if (textTwo == null) return
        var b=a
        list.add(textTwo.a)
        b-=textTwo.a

        if (b == 0 && textTwo.l == null && textTwo.r == null) {
            all.add(list)
        } else if (b > 0) {
            bb(textTwo.l, b, list)
            bb(textTwo.r, b, list)
        }
        list.remove(list.size - 1)
    }
}