package com.muliulan.mll.designPatterns

/**
描述:
zhaochenshuo
2021/5/15
 */

class Design2 {

    /**
     *复杂对象的构造与其表示分离 以便同一构造过程可以创建不同的表示
     *使用场景
     *1 生成对象包含多个成员
     *2 生成对象的属性相互依赖,需要指定其生成顺序
     *3 对象的创建过程独立于创建该对象的类
     *4 需要隔离对象的创建和使用
     * */
    fun aa(){
        val director = Director()
        val conBuilder = ConBuilder()

        director.const(conBuilder)
        conBuilder.getResult()
    }

}

data class Product(val a: Int, val b: String) {
}

interface Builder {
    fun buildA(a: Int)
    fun buildB(s: String)
    fun getResult(): Product
}

class ConBuilder() : Builder {
    var ma: Int = 0
    var mb: String = ""
    //多个成员属性 不需要通过构造方法设置,每个成员属性都通过一个单独的方法设置
    override fun buildA(a: Int) {
        ma = a
    }

    override fun buildB(s: String) {
        mb = s
    }

    override fun getResult(): Product {
        return Product(ma, mb)
    }
}

class Director{
    fun const(builder: Builder){
        builder.buildA(11)
        builder.buildB("22")
    }
}
