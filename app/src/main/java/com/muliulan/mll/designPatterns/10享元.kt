package com.muliulan.mll.designPatterns

import android.util.Log

class Pattern10 {

    /**
     * 通过共享多个对象的相同状态,让我们在有限的内存中存入更多对象
     *
     *仿真大对象重复创建损坏资源,通过共享对象池来复用
     * */

}

//享元类
interface Flyweight {
    fun operation(state: Int)
}

//享元工厂类
class FlyFactory {
    fun getFly(s: String) {
        if (s == "1") {
            Log.e("mll", "1")
        }
        if (s == "2") {
            Log.e("mll", "2")
        }
    }
}

//共享具体类
class ConcreteFl : Flyweight {
    override fun operation(state: Int) {


    }

}



