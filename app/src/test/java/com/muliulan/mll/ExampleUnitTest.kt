package com.muliulan.mll

import org.junit.Test

import org.junit.Assert.*
import java.util.ArrayList

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val arrayList = ArrayList<Int>()
        arrayList.add(3)
        arrayList.add(2)
        arrayList.add(1)

        arrayList.forEach {
            print(it)
        }


    }
}