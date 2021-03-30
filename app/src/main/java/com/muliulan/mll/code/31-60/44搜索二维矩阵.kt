package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/3/30
 */

class Main44() {

    /**
     * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

    每行中的整数从左到右按升序排列。
    每行的第一个整数大于前一行的最后一个整数。
     
    示例 1：
    输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    输出：true
     *
     * */

    fun searchMatrix(): Boolean {
        val matrix: Array<IntArray> = arrayOf(intArrayOf(123))
        val target: Int = 1
        for (a in 0 until matrix.size) {
            val ints = matrix[a]
            val i = ints[0]
            val i1 = ints[ints.size - 1]
            if (target >= i && target <= i1) {
                for(b in 0 until ints.size){
                    if(target==ints[b]){
                        return true
                    }
                }
            }
        }
        return false
    }

}