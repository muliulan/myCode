package com.muliulan.mll.designPatterns

import android.util.Log

class Design8 {
    /**
     * 动态向一个现有对象添加新功能 不改变其结构
     * 给已有的不可修改的类 添加方法
     *
     * 适用于链表和树状结构
     * */


    fun aa() {
        val baseC = BaseC()
        val based = BaseD(baseC)
        based.execute()
    }

}

interface Comp {
    fun execute()
}
//被装饰的类
class BaseC : Comp {
    override fun execute() {
        Log.e("mlll", "basec")
    }
}
//装饰器
open class BaseD(comp: Comp) : Comp {
    val cp: Comp = comp
    override fun execute() {
        cp.execute()
    }
}

////具体装饰器
//class DecA(comp: Comp) : BaseD(comp) {
//    override fun execute() {
//        super.execute()
//
//    }
//
//}



