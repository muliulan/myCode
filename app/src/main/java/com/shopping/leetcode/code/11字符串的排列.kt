package com.shopping.leetcode.code

import android.util.Log
import java.util.*

/**
描述:
zhaochenshuo
2021/2/10
 */

class Main11 {


    /**
     * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
    换句话说，第一个字符串的排列之一是第二个字符串的子串。

    示例1:
    输入: s1 = "ab" s2 = "eidbaooo"
    输出: True
    解释: s2 包含 s1 的排列之一 ("ba").

    示例2:
    输入: s1= "ab" s2 = "eidboaoo"
    输出: False
     

    注意：
    输入的字符串只包含小写字母
    两个字符串的长度都在 [1, 10,000] 之间
     * */
    fun aa(): Boolean {

        val s1 = "hello"
        val s2 = "dadoolelh"

        if(s1.length>s2.length){
            return false
        }
        val toCharArray1 = s1.toCharArray()
        val toCharArray2 = s2.toCharArray()

        val intArray1 = IntArray(26)
        val intArray2 = IntArray(26)

        for (f in 0..toCharArray1.size - 1) {
            //有值的地方+1
            ++intArray1[toCharArray1[f] - 'a']
            ++intArray2[toCharArray2[f] - 'a']
        }

        if (Arrays.equals(intArray1, intArray2)) {
            return true
        }

        for (ff in toCharArray1.size..toCharArray2.size - 1) {
            //窗体向右侧滑动有值的+1
            //之前左侧的值 -1

            ++intArray2[toCharArray2[ff] - 'a']
            --intArray2[toCharArray2[ff - toCharArray1.size] - 'a']

            if (Arrays.equals(intArray1, intArray2)) {
                return true
            }
        }

        return false
    }


}

