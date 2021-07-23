package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/10
 **/
class Main111 {
    data class Aaz(val value: String, val timestamp: Int) {

    }

    val hashMap = HashMap<String, ArrayList<Aaz>>()
    fun set(key: String, value: String, timestamp: Int) {
        if (hashMap.containsKey(key)) {
            hashMap[key]?.add(Aaz(value, timestamp))
        } else {
            val arrayList = ArrayList<Aaz>()
            arrayList.add(Aaz(value, timestamp))
            hashMap[key] = arrayList
        }
    }

    fun get(key: String, timestamp: Int): String {
        var value = ""
        var timest = 0

        if (hashMap.containsKey(key)) {
            val arrayList = hashMap[key]
            arrayList?.forEach {

                val s = it.value
                val s1 = it.timestamp
                if (s1 <= timestamp) {
                    value = s
                    timest = Math.max(s1, timest)
                }
            }
        }
        return value
    }
}
