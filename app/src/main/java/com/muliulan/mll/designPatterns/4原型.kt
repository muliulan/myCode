package com.muliulan.mll.designPatterns

import android.util.Log

class Design4 {

    /**
     * 创建原型对象 对原型进行复制 需要集成 Cloneable()接口
     * 使用场景 1需要保存原始状态 2复制的依赖 3同一个对象可能被多个修改者使用
     * */


        fun aa(){
        val da = Da()

        //复制新的对象
        val clone = da.clone()

    }

}

interface  Pro : Cloneable{
    override fun clone(): Any {
        return super.clone()
    }
}

class Da :Pro{
    public override fun clone(): Any {
        Log.e("mll","拷贝a")
        return super.clone() as Da
    }

}

