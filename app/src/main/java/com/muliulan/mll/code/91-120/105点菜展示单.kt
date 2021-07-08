package com.muliulan.mll.code.`91-120`

import java.util.*
import kotlin.collections.ArrayList

/**
name: zhaochenshuo
Date: 2021/7/6
 **/
class Main105 {


    fun aa(): List<List<String>> {

        val orders = ArrayList<ArrayList<String>>()
        orders.add(arrayListOf<String>("David", "3", "Ceviche"))
        orders.add(
            arrayListOf<String>("Corina", "10", "Beef Burrito")
        )
        orders.add(
            arrayListOf<String>("David", "3", "Fried Chicken")
        )
        orders.add(
            arrayListOf<String>("Carla", "5", "Water")
        )
        orders.add(
            arrayListOf<String>("Carla", "5", "Ceviche")
        )
        orders.add(
            arrayListOf<String>("Rous", "3", "Ceviche")
        )


        val list = ArrayList<ArrayList<String>>()

        val arrayList = ArrayList<String>()

        val hashMap = HashMap<String, Int>()
        orders.forEach {
            if (!hashMap.containsKey(it[2])) {
                hashMap.put(it[2], 0)
            }
        }
        hashMap.forEach {
            arrayList.add(it.key)
        }


        arrayList.sortWith { a, b ->
            val aa = if (a.length > b.length) {
                b.length
            } else {
                a.length
            }
            var v = a.length - b.length
            for (ac in 0 until aa) {
                if (a[ac].toInt() != b[ac].toInt()) {
                    v = a[0].toInt() - b[0].toInt()
                    break
                }
            }
            v
        }

        arrayList.add(0, "Table")
        list.add(arrayList)

        orders.sortWith { a, b ->
            a[1].toInt() - b[1].toInt()
        }


        var intArray = IntArray(arrayList.size)
        var intlist = ArrayList<IntArray>()
        var a = ""
        orders.forEach {
            if (it[1] != a) {
                a = it[1]
                intArray = IntArray(arrayList.size)
                intArray[0] = it[1].toInt()
                intlist.add(intArray)
            }
            intArray[bb(arrayList, it[2])] = intArray[bb(arrayList, it[2])] + 1
        }


        intlist.forEach {
            val arrayList1 = ArrayList<String>()
            list.add(arrayList1)
            it.forEach {
                arrayList1.add(it.toString())
            }
        }
        return list
    }

    fun bb(list: ArrayList<String>, s: String): Int {
        for (a in 1 until list.size) {
            if (list[a] == s) {
                return a
            }
        }
        return -1
    }

}