package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/3/1
 */

class Main22( ){

    /**
     * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
    实现 NumArray 类：
    NumArray(int[] nums) 使用数组 nums 初始化对象
    int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）

    示例：
    输入：
    ["NumArray", "sumRange", "sumRange", "sumRange"]
    [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
    输出：
    [null, 1, -1, -3]
    解释：
    NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
    numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
    numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
    numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
     * */
    fun aa():Int{
        val nnn: IntArray= intArrayOf(-2, 0, 3, -5, 2, -1)
        val i: Int=1
        val j: Int=2

        var num=0
        for (a in i..j){
            num+=nnn[a]

        }
        return num
    }
    //第二种方式
    fun bb() :Int{
        val i: Int=1
        val j: Int=2
        val nums: IntArray= intArrayOf(1, 2, 0, 1, 5)

        val intArray = IntArray(nums.size+1)

        for(a in 0 until nums.size){
            intArray[a+1]=intArray[a]+nums[a]
        }

       return intArray[j+1]-intArray[i]
    }

}