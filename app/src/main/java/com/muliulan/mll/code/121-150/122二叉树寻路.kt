package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/7/29
 **/
class Main122 {

    /**
     *
     * 11
     *
     *                  1
     *            3          2
     *          4    5       6   7
     *       15,14 13,12   11,10  9,8
     *
     * **/
    fun pathInZigZagTree(label: Int): List<Int> {
        val arrayList = ArrayList<Int>()


        val mll = ArrayList<IntArray>()

        var hang = 1
        var size_h = 1



        while (true) {
            val intArray = IntArray(size_h)
            if (hang == 1) {
                intArray[0] = 1
            } else {

                if(hang%2==0){
                    val i = mll[hang - 1].size + 1
                    for(a in i+size_h-1 downTo  i){


                    }

                }else{


                }

            }
            mll.add(intArray)

            hang++
            size_h *= 2
        }



        return arrayList
    }

}