package com.muliulan.mll.code.code_offer

/**
描述:
zhaochenshuo
2021/3/19
 */

class Off11() {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  

    示例 1：
    输入：[3,4,5,1,2]
    输出：1

    示例 2：
    输入：[2,2,2,0,1]
    输出：0
     *
     * */

    fun aa(): Int {

        val numbers: IntArray = intArrayOf(3, 4, 5, 6, 1, 2)

        var a = numbers[0]
        numbers.forEach {
            if (a > it) {
                a = it
            }

        }


//        var l = 0
//        var r = numbers.size-1
//        while (l < r) {
//            var c = l + (r - l) / 2
//            val cc = numbers[c]
//            val rr = numbers[r]
//            if (cc < rr) {
//                r = c
//            } else if (cc > rr) {
//                l=c+1
//            } else {
//                r--
//            }
//        }
//        return numbers[l]

        return a
    }
}