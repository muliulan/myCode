package com.muliulan.mll.dong_nao

import android.util.SparseArray

/**
描述:    对象池
zhaochenshuo
2021/5/10
 */
abstract class ObjectPool<T>(initialCapacity: Int, maxCapacity: Int) {
    //空闲沲，用户从这个里面拿对象
    private var freePool: SparseArray<T>? = null

    //正在使用沲，用户正在使用的对象放在这个沲记录
    private var lentPool: SparseArray<T?>? = null

    //沲的最大值
    private val maxCapacity: Int
    private fun initalize(initialCapacity: Int) {
        lentPool = SparseArray()
        freePool = SparseArray()
        for (i in 0 until initialCapacity) {
            freePool!!.put(i, create())
        }
    }

    /**
     * 申请对象
     * @return
     */
    @Throws(Exception::class)
    fun acquire(): T? {
        var t: T? = null
        synchronized(freePool!!) {
            val freeSize = freePool!!.size()
            for (i in 0 until freeSize) {
                val key = freePool!!.keyAt(i)
                t = freePool!![key]
                if (t != null) {
                    lentPool!!.put(key, t)
                    freePool!!.remove(key)
                    return t
                }
            }
            //如果没对象可取了
            if (t == null && lentPool!!.size() + freeSize < maxCapacity) {
                //这里可以自己处理,超过大小
                if (lentPool!!.size() + freeSize == maxCapacity) {
                    throw Exception()
                }
                t = create()
                lentPool!!.put(lentPool!!.size() + freeSize, t)
            }
        }
        return t
    }

    /**
     * 回收对象
     * @return
     */
    fun release(t: T?) {
        if (t == null) {
            return
        }
        val key = lentPool!!.indexOfValue(t)
        //释放前可以把这个对象交给用户处理
        restore(t)
        freePool!!.put(key, t)
        lentPool!!.remove(key)
    }

    protected fun restore(t: T) {}
    protected abstract fun create(): T

    constructor(maxCapacity: Int) : this(maxCapacity / 2, maxCapacity) {}

    init {
        //初始化对象沲
        initalize(initialCapacity)
        this.maxCapacity = maxCapacity
    }
}