package com.muliulan.mll.offer

//单链表用这个
data class Text(var a: Int) {
    var t: Text? = null


    companion object{

        fun get(){

            val text = Text(2)
            val text1 = Text(3)
            val text2 = Text(1)


            text.t=text1
            text1.t=text2
        }

    }

}