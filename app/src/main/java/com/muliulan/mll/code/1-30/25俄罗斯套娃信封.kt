package com.muliulan.mll.code.`1-30`

import java.util.*

/**
描述:
zhaochenshuo
2021/3/4
 */

class Main25 {


    /**
     * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
    请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。

    说明:
    不允许旋转信封。

    示例:
    输入: envelopes = [[5,4],[6,4],[6,7],[2,7]]
    输出: 3
    解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
     * */

    fun aa(): Int {
        val envelopes: Array<IntArray> = arrayOf<IntArray>(
            intArrayOf(5, 4),
            intArrayOf(6, 4),
            intArrayOf(6, 7),
            intArrayOf(2, 3)
        )

        Arrays.sort(envelopes) { a, b ->

            if (a[0] != b[0]) {
                a[0] - b[0]
            } else {
                a[1] - b[1]
            }

        }

        val intA = IntArray(envelopes.size)
        Arrays.fill(intA, 1)
        var num = 0
        for (a in 1 until envelopes.size) {
            for (b in 0 until a) {
                if (envelopes[b][0] < envelopes[a][0] && envelopes[b][1] < envelopes[a][1]) {
                    intA[a] = Math.max(intA[b] + 1, intA[a])
                }
            }
            num = Math.max(num, intA[a])
        }
        return num
    }
}