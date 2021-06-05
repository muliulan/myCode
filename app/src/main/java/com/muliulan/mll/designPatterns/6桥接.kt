package com.muliulan.mll.designPatterns

class Design6 {

    /**
     * 使用抽象来进行组合或者聚合 而不在使用集成
     * 对一个对象进行实体与行为的分离,将多层集成改成组合或者聚合的方式
     * */

    fun aa(){
        val detaA = DetaA(DetailBA())

    }

}

abstract class AbsBeh {
    abstract fun text1()
    abstract fun text2()
}

//abstract class AbsEntity(a: AbsBeh) {
//    abstract fun request()
//}


class DetailBA :AbsBeh(){
    override fun text1() {
    }

    override fun text2() {
    }
}


class DetaA(a: AbsBeh)  {
    init {
        a.text1()
    }
}

class DetaB(a: AbsBeh)   {
    init {
        a.text2()
    }
}

