package com.muliulan.mll.shuju_jiegou

import android.util.Log
import java.util.*

/**
描述:  图论
zhaochenshuo
2021/4/12
 */
//传过来顶点的个数
class _7Graph(vSize: Int) {

    /**
     *   图表示
     *   v0 → v2 ← v4
     *    ↓  ↖
     *    v1 → v3
     *
     *
     *    二维数组表示
     *      v0    v1  v2  v3  v4
     *  v0  0      1   1   &   &
     *  v1  &      0   &   1   &
     *  v2  &      &   0   &   &
     *  v3  1      &   &   0   &
     *  v4  &      &   1   &   0
     * */

    //顶点
    private val vertices: IntArray = IntArray(vSize)

    //边的信息
    private val matrix: Array<IntArray> = Array(vSize) { IntArray(vSize) }

    //顶点的个数
    private val verticesSize = vSize

    //访问过的路径数组
    private val isVeited: BooleanArray = BooleanArray(vSize)

    private val Max_Weight = Int.MAX_VALUE

    init {
        for (a in 0 until verticesSize) {
            vertices[a] = a
        }
    }

    //v1 到v2的权重
    fun getWidget(v1: Int, v2: Int): Int {
        val i = matrix[v1][v2]
        return if (i == 0) {
            0
        } else if (i == Max_Weight) {
            -1
        } else {
            i
        }
    }

    //获取所有顶点
    fun getVertices(): IntArray {
        return vertices
    }

    //出度
    fun getOut(v: Int): Int {
        var num = 0
        for (a in 0 until verticesSize) {
            if (matrix[v][a] != 0 && matrix[v][a] != Max_Weight) {
                num++
            }

        }
        return num
    }

    //入度
    fun getIn(v: Int): Int {
        var num = 0
        for (a in 0 until verticesSize) {
            if (matrix[a][v] != 0 && matrix[a][v] != Max_Weight) {
                num++
            }

        }
        return num
    }

    //寻找第一个邻接点
    fun getFirst(v: Int): Int {
        for (a in 0 until verticesSize) {
            if (matrix[v][a] != 0 && matrix[v][a] != Max_Weight) {
                return a
            }
        }
        return -1
    }

    //获取顶点V的邻接点index的下一个邻接点
    fun getNext(v: Int, index: Int): Int {
        for (a in index + 1 until verticesSize) {
            if (matrix[v][a] != 0 && matrix[v][a] != Max_Weight) {
                return a
            }
        }
        return -1
    }

    //深度优先遍历
    fun dfs() {
        for (a in 0 until verticesSize) {
            if (!isVeited[a]) {
                dfs(a)
            }
        }
    }

    private fun dfs(i: Int) {
        isVeited[i] = true
        var first = getFirst(i)
        while (first != -1) {
            if (!isVeited[first]) {
                Log.e("mll", first.toString())
                dfs(first)
            }
            first = getNext(i, first)
        }

    }

    //广度优先遍历
    fun ffff() {
        for (a in 0 until verticesSize) {
            if (!isVeited[a]) {
                isVeited[a] = true
                ffff(a)
            }
        }
    }

    private fun ffff(i: Int) {
        val linkedList = LinkedList<Int>()

        val first = getFirst(i)
        if (first == -1) {
            return
        }
        if (!isVeited[i]) {
            Log.e("mll", first.toString())
            isVeited[i] = true
            linkedList.offer(first)
        }

        //下一个
        var next = getNext(i, first)
        while (next != -1) {
            if (!isVeited[i]) {
                Log.e("mll", first.toString())
                isVeited[i] = true
                linkedList.offer(first)
            }
            next = getNext(i, next)
        }

        while (!linkedList.isEmpty()) {
            ffff(linkedList.poll())
        }
    }


}