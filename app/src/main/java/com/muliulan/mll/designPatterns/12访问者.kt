package com.muliulan.mll.designPatterns

//行为型模式开始  责任链结束
class Pattern12 {


    fun aa() {
        val elementA = ElementA()

        val visito = Visito()
        elementA.accept(visito)
        visito.vA(elementA)
    }
}

interface Visitor {
    fun vA(ae: ElementA)
    fun vB(ae: ElementB)
}

class Visito : Visitor {
    override fun vA(ae: ElementA) {
        val a = ae.getA()
        ae.setA(11)
    }

    override fun vB(ae: ElementB) {
    }
}

interface Elem {
    fun accept(v: Visitor)
}

class ElementA : Elem {
    override fun accept(v: Visitor) {
        v.vA(this)
    }

    fun getA(): Int {
        return 1
    }

    fun setA(i: Int) {

    }
}

class ElementB : Elem {
    override fun accept(v: Visitor) {
        v.vB(this)
    }
}




