package com.muliulan.mll.offer.off

import com.muliulan.mll.offer.TextTwo

/**
描述:
zhaochenshuo
2021/3/19
 */

class Offer36 {

    /**
     * 输入一棵二叉树的根结点，求该树的深度。从根结点到叶子点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     * */

    fun aa(tt: TextTwo): Int {

        val ab = TextTwo.ab()

        val al = aa(tt.left!!)
        val ar = aa(tt.right!!)


        return if (al > ar) al + 1 else ar + 1
    }



}