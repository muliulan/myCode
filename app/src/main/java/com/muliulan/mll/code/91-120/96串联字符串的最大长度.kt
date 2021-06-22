package com.muliulan.mll.code.`91-120`

class Main96 {

    //    fun aa(): Int {
//        val arr: List<String> = arrayListOf("a", "abc", "d", "de", "def")
//        val arrayList = ArrayList<String>()
//        arr.forEach {
//            if (cc(it)) {
//                arrayList.add(it)
//            }
//        }
//        if (arrayList.size == 1) {
//            return arrayList[0].length
//        }
//        var num = 0
//        var sss = ""
//        arrayList.forEach { ita ->
//            sss = ita
//            arrayList.forEach { itb ->
//                if (ita != itb) {
//                    val dd = cc(sss + itb)
//                    if (dd) {
//                        sss += itb
//                    }
//                    num = Math.max(num, sss.length)
//                }
//            }
//        }
//        return num
//    }
    fun aa(): Int {
        val arr: List<String> = arrayListOf("a", "abc", "d", "de", "def")

        val size = arr.size
        var ans = 0
        val i = 1 shl size
        var s=""
        for (a in 1 until i) {
            s=""
            for(b in 0 until arr.size){
               


            }

        }



        return 1
    }

    fun cc(string: String): Boolean {
        val intArray = IntArray(26)
        string.forEach {
            val c = it.toInt() - 'a'.toInt()
            if (intArray[c] != 0) {
                return false
            }
            intArray[c] = intArray[c]++
        }
        return true
    }

}