package com.muliulan.mll.code.`91-120`

import java.util.*

class Main99 {

    fun aa(): Array<String> {
        val s: String="abb"
        val arrayList = ArrayList<String>()
        aa(s, arrayList, "")

        val list = ArrayList<String>()
        arrayList.forEach {
            var aaa=""
           val toCharArray = it.toCharArray()
            toCharArray.forEach {
                aaa+=  s[it.toString().toInt()]
            }
            list.add(aaa)
        }

        val mylist = ArrayList<String>()

        list.forEach {
            if(!mylist.contains(it)){
                mylist.add(it)
            }
        }


        return Array<String>(mylist.size) {
            mylist[it]
        }
    }

    fun aa(s: String, list: ArrayList<String>, text: String) {
        var mm = text
        if (text.length == s.length) {
            list.add(text)
        } else {
            for (a in 0 until s.length) {
                if (!mm.contains(a.toString())) {
                    aa(s, list, mm + a)
                }
            }
        }
    }


}