package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/4/9
 */

class Main51 {

    /**
     * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,4,4,5,6,7] 在变化后可能得到：
    若旋转 4 次，则可以得到 [4,5,6,7,0,1,4]
    若旋转 7 次，则可以得到 [0,1,4,4,5,6,7]
    注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
    给你一个可能存在 重复 元素值的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。


    示例 1：
    输入：nums = [1,3,5]
    输出：1

    示例 2：
    输入：nums = [2,2,2,0,1]
    输出：0
     *
     * */

    fun aa(): Int {
        val nums: IntArray = intArrayOf(4, 5, 6, 7, 0, 1, 2)


        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val a = (r + l) / 2

            if (nums[a] > nums[r]) {
                l = a + 1
            } else if (nums[a] < nums[r]) {
                r = a
            } else {
                r -= 1
            }
        }

        return nums[l]
    }

}