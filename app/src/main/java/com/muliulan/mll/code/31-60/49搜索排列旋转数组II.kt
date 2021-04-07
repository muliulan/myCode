package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/4/7
 */

class Main() {

    /**
     * 已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。
    在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转 ，
    使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
    例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。
    给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。

     

    示例 1：
    输入：nums = [2,5,6,0,0,1,2], target = 0
    输出：true

    示例 2：
    输入：nums = [2,5,6,0,0,1,2], target = 3
    输出：false
     * */
    fun aa(): Boolean {
        val nums: IntArray = intArrayOf(2, 5, 6, 0, 1, 2, 3)
        val target: Int = 3

        //方法1
//        nums.forEach {
//            if(it==target){
//                return true
//            }
//        }


        //方法2
//        var l = 0
//        var r = nums.size - 1
//
//        while (l <= r) {
//            var a = (l + r) / 2
//
//            if (nums[a] == target) {
//                return true
//            } else if (nums[l] == nums[a] && nums[r] == nums[a]) {
//                l++
//                r--
//            } else if (nums[l] <= nums[a]) {
//
//                if (nums[l] <= target && target <= nums[a]) {
//                    r = a - 1
//                } else {
//                    l = a + 1
//                }
//
//            } else {
//                if (nums[a] < target && target <= nums[nums.size - 1]) {
//                    l = a + 1
//                } else {
//                    r = a - 1
//                }
//            }
//        }
        return false
    }

}