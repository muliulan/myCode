package com.muliulan.mll

import android.util.Log

/**
 *    @author : zhaoCS
 *    desc    :
 */
class Fada {
    /**
     * Data(1, 3, "A"),
     * Data(2, 1, "B"),
     * Data(4, 2, "C"),
     * Data(4, 1, "D"),
     */
    val list = arrayListOf<ArrayList<MyData>>()

    fun aq() {
        val graph = arrayListOf(
            MyData(1, 2, "a"),
            MyData(1, 3, "b"),
            MyData(2, 3, "c"),
        )
        helper(arrayListOf(), graph, 3, 1)

        list.forEach {
            var a = ""
            it.forEach {
                a = "$a -- ${it.name}"
            }
        }
    }

    private fun helper(
        arrayList: ArrayList<MyData>,
        graph: ArrayList<MyData>,
        start: Int,
        target: Int
    ) {
        for (i in graph.indices) {
            if (graph[i].isAdd) {
                continue
            }
            if (graph[i].have == target && graph[i].to == start) {
                arrayList.add(graph[i])
                val mList = ArrayList<MyData>()
                mList.addAll(arrayList)

                list.add(mList)
                arrayList.clear()
                continue
            }
            if (graph[i].to == start) {
                arrayList.add(graph[i])
                graph[i].isAdd = true
                helper(arrayList, graph, graph[i].have,target)
            }
        }
    }

}

data class MyData(var have: Int, var to: Int, var name: String, var isAdd: Boolean = false)
