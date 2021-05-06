package com.muliulan.mll.shuju_jiegou

/**
描述:
zhaochenshuo
2021/4/9
 */

class _5AVLTree {


    /**
     * 平衡二叉树
     *
     *          a                      c
     *        /  \                   /  \
     *       b    c    -> 左旋     a     e
     *          /  \             /  \
     *         d    e           b    d
     *
     *
     * 不平衡的树要现做平衡
     *  左平衡 两次旋转
     *      9                   9                   10
     *       \                  \                  /  \
     *        11     ->右旋      10    ->左旋      9   11
     *       /                    \
     *     10                     11
     *
     *
     * */


    fun aa(arr: IntArray, le: Int = 0, ri: Int = arr.size - 1) {
        var left: Int = le
        var right: Int = ri
        val x = arr[left]
        var type = true

        L1@//标签
        while (left < right) {
            if (type) {
                //从右向左
                for (a in right downTo left) {
                    if (arr[a] <= x) {
                        arr[left++] = arr[a]
                        right = a
                        type = !type
                        continue@L1 //回到L1的位置
                    }
                }
                //如果上面的if没有进入 就让两个指针重合
                left = right
            } else {
                //从左到右
                for (a in left until right) {
                    if (arr[a] >= x) {
                        arr[right--] = arr[a]
                        left = a
                        type = !type
                        continue@L1 //回到L1的位置
                    }
                }
                //如果上面的if没有进入 就让两个指针重合
                left = right
            }
        }
        //把最后找到的值 放入中间位置
        arr[left] = x
        aa(arr, le, left - 1)
        aa(arr, left + 1, ri)
    }
}