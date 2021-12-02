package com.muliulan.mll.code.`151-180`


/**
 *    @author : zhaoCS
 *    date    : 2021/11/193:42 下午
 *    desc    :
 */
class  Main152{
    fun integerReplacement(n: Int): Int {
// 如果 n 是偶数，则用 n / 2替换 n 。
// 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
        if(n==1) return 1
        if(n%2==0){
            return 1+integerReplacement(n/2)
        }
        return 2+Math.min(integerReplacement(n/2),integerReplacement(n/2+1))
    }
}