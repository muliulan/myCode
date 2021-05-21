package com.muliulan.mll.code.`61-90`

import android.util.Log

/**
描述:
zhaochenshuo
2021/5/11
 */

class Main72 {

    /**
     * 给你一个整数数组 perm ，它是前 n 个正整数的排列，且 n 是个 奇数 。
    它被加密成另一个长度为 n - 1 的整数数组 encoded ，满足 encoded[i] = perm[i] XOR perm[i + 1] 。
    比方说，如果 perm = [1,3,2] ，那么 encoded = [2,1] 。
    给你 encoded 数组，请你返回原始数组 perm 。题目保证答案存在且唯一。

     
    示例 1：
    输入：encoded = [3,1]
    输出：[1,2,3]
    解释：如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]

    示例 2：
    输入：encoded = [6,5,4,6]
    输出：[2,4,1,5,3]
     
     * */

    fun aa(): IntArray? {

        val encoded: IntArray= intArrayOf(3,1)

        val i = encoded.size + 1
        val perm = IntArray(i)

        //因为是顺序整数,找到所有的异或
        var aa = 0
        for (a in 1..i) {
            aa = aa xor a
        }

        //encoded中的元素是perm中两个元素的异或
        //encoded 的所有下标为奇数的元素的异或运算结果即为数组 perm 除了 perm[0] 以外的全部元素的异或运算结果
        var bb = 0
        for (b in 1 until i) {
            if (b % 2 != 0) {
                bb = bb xor encoded[b]
            }
        }
        perm[0] = aa xor bb

        for(a in 0 until encoded.size){

            val i1 = encoded[a]
            val i2 = perm[a] xor i1
            perm[a+1]=i2

        }
        return perm
    }


}