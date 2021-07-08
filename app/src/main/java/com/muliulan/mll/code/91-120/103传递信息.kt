package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/1
 **/
class Main103 {


    /**
     *
    输入：n = 5, relation = [[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]], k = 3
    输出：3
    解释：信息从小 A 编号 0 处开始，经 3 轮传递，到达编号 4。共有 3 种方案，分别是 0->2->0->4， 0->2->1->4， 0->2->3->4。
     * */

    var n1 = 0
    var k1 = 0
    var a = 0
    fun numWays(n: Int, relation: Array<IntArray>, k: Int): Int {
        n1 = n
        k1 = k
        val arrayList = ArrayList<ArrayList<Int>>()
        for(a in 0 until n){
            arrayList.add(ArrayList<Int>())
        }
        relation.forEach {
            arrayList[it[0]].add(it[1])
        }
        dfs(0, 0, arrayList)
        return a
    }

    fun dfs(index: Int, num: Int, arrayList: ArrayList<ArrayList<Int>>) {
        if (num == k1) {
            if (index == n1 - 1) {
                a++
            }
            return
        }
        val arrayList1 = arrayList[index]
        arrayList1.forEach {
            dfs(it, num + 1, arrayList)
        }

    }

}
