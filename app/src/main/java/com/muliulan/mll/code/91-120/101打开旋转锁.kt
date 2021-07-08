package com.muliulan.mll.code.`91-120`

import java.util.*

class Main101 {


    fun aa(): Int {
        val target: String = "0202"
        val deadends: Array<String> = arrayOf("0201", "0101", "0102", "1212", "2002")

        deadends.forEach {
            if(it=="0000"){
                return -1
            }
        }

        var step = 0
        val visited  = HashSet<String>()

        var linkedList1 = LinkedList<String>()
        linkedList1.offer("0000")
        var linkedList2 = LinkedList<String>()


        while (!linkedList1.isEmpty()) {
            val poll = linkedList1.poll()
            if(poll==target){
                return step
            }
            val bb1 = bb(poll)
            for (s in bb1) {
                if(!deadends.contains(s) && !visited.contains(s)){
                    linkedList2.offer(s)
                    visited.add(s)
                }
            }
            if(linkedList1.isEmpty()){
                linkedList1=linkedList2
                linkedList2 = LinkedList<String>()
                step++
            }
        }
        return -1
    }

    /**
     * 0001 0010 0100 1000
     * 0009 0090 0900 9000
     * */
    private fun bb(s: String): List<String> {
        val arrayList = ArrayList<String>()

        for (a in 0 until s.length) {
            var stringBuffer = StringBuffer(s)
            stringBuffer.setCharAt(a, if (stringBuffer[a] == '0') '9' else (stringBuffer[a].toInt() - 1).toChar())
            arrayList.add(stringBuffer.toString())

            stringBuffer = StringBuffer(s)
            stringBuffer.setCharAt(a, if (stringBuffer[a] == '9') '0' else (stringBuffer[a].toInt() + 1).toChar())
            arrayList.add(stringBuffer.toString())
        }
        return arrayList
    }

}