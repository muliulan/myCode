package com.muliulan.mll.designPatterns

import java.util.*

class Design7 {

    /**
     * 将对象组合成树形结构来表示整个部分的层次结构
     *
     * */


}

abstract class Component {
    abstract fun operation()
}

class Left : Component() {
    override fun operation() {
    }

}

//组合
class Node : Component() {
    private val myChildren: List<Component> = ArrayList<Component>()
    override fun operation() {
        myChildren.forEach {
            it.operation()
        }
    }

}

