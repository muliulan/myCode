package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/5/27
 */

class Main85 {

    //4   (0 1 0 0)
    fun aa(): Int {
        val x: Int = 1
        val y: Int = 4

        var bx = bb(x)
        var by = bb(y)
        if (bx.length != by.length) {
            if (bx.length - by.length > 0) {
                for (a in 0 until bx.length - by.length) {
                    by += "0"
                }

            } else {
                for (a in 0 until by.length - bx.length) {
                    bx += "0"
                }
            }

        }

        var num = 0;
        for (a in 0 until bx.length) {
            if (bx[a] != by[a]) {
                num++
            }
        }

        return num
    }

    fun bb(x: Int): String {
        if(x==0){
            return "0"
        }
        var mx = x
        var s = ""
        while (mx > 1) {

            val i = mx % 2
            s += i
            mx /= 2
        }
        return s + "1"
    }

}