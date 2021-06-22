package com.muliulan.mll.designPatterns

//结构性模式开始  代理结束
class Design5 {
    /**
     * 将类的接口转换为客户期望的另一个接口,适配器可以将不兼容的两个类一起协同工作
     * 使用 原有类或者接口无法修改又要加入新功能
     *
     *
     * 实现了不同接口功能之间的转换,为组件快速服用提供了直接的解决方法
     * */


}

abstract class Targ {
    abstract fun fil(s: String): String
}

open class Timpl1 : Targ() {
    override fun fil(s: String): String {
        return "111"
    }
}

class Adapter : Timpl1() {
    init {
        val other = Other()
        other.replace("2222")
    }

    override fun fil(s: String): String {
        return "2222"
    }
}

class Other {
    fun replace(s: String): String {
        return s + "oooooo"
    }
}
