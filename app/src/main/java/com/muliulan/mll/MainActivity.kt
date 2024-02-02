package com.muliulan.mll

import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlin.properties.Delegates

//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : ComponentActivity() {

    private var name by Delegates.observable("1") { a, old, new ->

    }

//    private val mBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(mBinding.root)

    }

//    public inline fun <reified V : ViewBinding> vb() = viewBindingV1(V::class.java)
//
//    public inline fun <reified T : ViewBinding> viewBindingV1(clazz: Class<T>): FragmentViewBindingPropertyV1<Fragment, T> {
//        val bindMethod = clazz.getMethod("bind", View::class.java)
//        return FragmentViewBindingPropertyV1 {
//            bindMethod(null, it.requireView()) as T
//        }
//    }

}

// 基础接口
interface Base {
    fun printqqqq()
}

// 基础对象
class BaseImpl(val x: Int) : Base {
    override fun printqqqq() {
        print(x)
    }
}

// 被委托类
class Derived(b: Base) : Base by b {
    override fun printqqqq() {

    }
}

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printqqqq() // 最终调用了 Base#print()
}


