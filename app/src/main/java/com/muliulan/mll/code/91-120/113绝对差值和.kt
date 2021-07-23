package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/14
 **/
class Main113 {

    fun aa(): Int {

        //nums1 = [1,10,4,4,2,7],
        //nums2 = [9,3,5,1,7,4]
        //         8 7 1 3 5 3

        //8 7 1
        val nums1: IntArray = intArrayOf(1, 28, 21)
        val nums2: IntArray = intArrayOf(9, 21, 20)


        val aaa = 1000000007
        val intArray = IntArray(nums1.size)

        for (a in 0 until nums1.size) {
            intArray[a] = Math.abs(nums1[a] - nums2[a])
        }

        var max = 0
        var index = 0
        for (a in 0 until intArray.size) {
            if (max < intArray[a]) {
                max = intArray[a]
                index = a
            }
        }
        if (max == 0) {
            return 0
        }


        var min = 999
        for (a in 0 until nums1.size) {
            val i = nums2[index]
            min = Math.min(min, Math.abs(nums1[a] - i))
        }

        var old_num = 0
        intArray.forEach {
            old_num += it
        }

        var num = 0
        for (a in 0 until intArray.size) {
            var i = intArray[a]
            if (a == index) {
                i = min
            }
            num += i
        }

        return Math.min(old_num, num) % aaa
    }

    fun bb(): Int {
        val nums1: IntArray = intArrayOf(1, 10, 4, 4, 2, 7)
        val nums2: IntArray = intArrayOf(9, 3, 5, 1, 7, 4)
//        [1,10,4,4,2,7]
//        [9,3,5,1,7,4]
//         8 7 1 3 5 3

        val aaa = 1000000007

        val intArray = IntArray(nums1.size)
        val new_nums1 = nums1.clone()
        new_nums1.sort()

        for (a in 0 until nums2.size) {

            val a1 = nums1[a]
            val a2 = nums2[a]
            val n = Math.abs(a2 - a1)//8

            var l = 0
            var r = new_nums1.size - 1
            while (l < r) {
                val index = (l + (l - r)) / 2
                new_nums1[index]

            }


//            for (b in 0 until nums1.size) {
//                if (a != b) {
//                    val abs = Math.abs(nums1[b] - a2)
//                    val i = n - abs
//                    if (i >= 0 && i <= n && intArray[a]<i) {
//                        intArray[a] = i
//                    }
//                }
//
//            }
        }

        var max = 0
        intArray.forEach {
            max = Math.max(max, it)
        }

        var bb = 0
        for (a in 0 until nums1.size) {
            bb += Math.abs(nums1[a] - nums2[a])
        }
        return (bb - max) % aaa

    }

}