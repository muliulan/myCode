package com.muliulan.mll.offer.off

import com.muliulan.mll.offer.TextTwo

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer16 {


    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * */

    fun aa( t: TextTwo?){
        val a: TextTwo? = t?.left
        t?.left=t?.right
        t?.right=a

        aa(t?.left)
        aa(t?.right)

    }

}