package com.shopping.leetcode.code

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/18
 */

class Main12() {

    /**
     * 在仅包含 0 和 1 的数组 A 中，一次 K 位翻转包括选择一个长度为 K 的（连续）子数组，同时将子数组中的每个 0 更改为 1，而每个 1 更改为 0。
    返回所需的 K 位翻转的最小次数，以便数组没有值为 0 的元素。如果不可能，返回 -1。
     

    示例 1：
    输入：A = [0,1,0], K = 1
    输出：2
    解释：先翻转 A[0]，然后翻转 A[2]。

    示例 2：
    输入：A = [1,1,0], K = 2
    输出：-1
    解释：无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。

    示例 3：
    输入：A = [0,0,0,1,0,1,1,0], K = 3
    输出：3
    解释：
    翻转 A[0],A[1],A[2]: A变成 [1,1,1,1,0,1,1,0]
    翻转 A[4],A[5],A[6]: A变成 [1,1,1,1,1,0,0,0]
    翻转 A[5],A[6],A[7]: A变成 [1,1,1,1,1,1,1,1]
     * */

    //这个方式可以通过
    fun a(): Int {
        var A: IntArray = intArrayOf( 0,0,0,1,0,1,1,0 )
        var K: Int = 3

        var num = 0

        //第一种
        for (b in 0 until A.size) {
            if (A[b] == 0 && b + K > A.size) {
                return -1
            }

            if (A[b] == 0) {
                num++

                for (c in b until b + K) {
                    A[c] = if (A[c] == 0) 1 else 0
                }

            }
//            var ll = ""
//            A.forEach {
//                ll += ", $it"
//            }
//            Log.e("mll", ll)
        }

        //第二种
//        val intArray = IntArray(A.size)
//        for (b in 0 until A.size - K + 1) {
//
//            if ((A[b] + intArray[b]) % 2 == 0) {
//                num++
//                for (c in b until b + K) {
//                    intArray[c]++
//                }
//            }
//
//        }
//
//        for (b in 0 until A.size){
//
//            if ((A[b] + intArray[b]) % 2 == 0){
//                return -1
//            }
//        }

        return num
    }


    fun aa(): Int {
        var A: IntArray = intArrayOf(1, 1, 0, 1, 1, 0)
        var K: Int = 3

        if (A.size < K) {
            return -1
        }

        if (K == 1) {
            A.forEach {
                if (it == 0) {
                    num++
                }
            }
            return num
        }

        //0 1 2
        var g = if (K == 1) 1 else K - 1
        var l = 0
        var r =l+ K


//        while(){
//
//            if(A[l]==0){
//                l=-1
//                for(aa in l until r){
//                    A[l]=if(A[l]==0) 1 else 0
//                    if(A[l]==0 && l==-1){
//                        l=aa
//                        r=l+K
//                    }
//                }
//            }else{
//                l++
//                r++
//            }
//
//        }





//        while (l < A.size) {
//
//            l = bb(l, r, K, A)
//
//            r = l + g
//            if (l == -1) {
//                return -1
//            }
//
//            if (r >= A.size) {
//                r = A.size - 1
//                for (q in l..r) {
//                    if (A[q] == 0) {
//                        return -1
//                    } else {
//                        return num
//                    }
//                }
//            }
//
//            var ll = ""
//            A.forEach {
//                ll += ", $it"
//            }
//            Log.e("mll", ll)
//        }
        return num
    }

    private var num: Int = 0
    private fun bb(l: Int, r: Int, k: Int, A: IntArray): Int {

        var g = if (k == 1) 1 else k - 1
        var newl = l + k
        for (q in l..r) {
            val i = A[q]
            if (i == 0) {
                num++
                if (q + g >= A.size) {
                    return -1
                }
                var bb = true
                for (s in q..q + g) {

                    A[s] = if (A[s] == 0) 1 else 0
                    if (A[s] == 0 && bb) {
                        newl = s
                        bb = false
                    }
                }
                return newl
            }

        }
        return newl
    }


}