package com.muliulan.mll.code.`91-120`

class Main93 {

    fun aa(stones: IntArray): Int {

        var num = 0
        var size = stones.size
        stones.forEach {
            num += it
        }
        num /= 2
        val array = Array<BooleanArray>(size + 1) {
            BooleanArray(num + 1)
        }
        array[0][0] = true

        for (a in 0 until size) {
            for (b in 0 until num) {
                if (b < stones[a]) {
                    array[a + 1][b] = array[a][b]
                } else {
                    array[a + 1][b] = array[a][b] || array[a][b - stones[a]]
                }
            }
        }

        for (c in num downTo 0) {
            if (array[size][c]) {
                return num - 2 * c
            }
        }
        return 0
    }

}