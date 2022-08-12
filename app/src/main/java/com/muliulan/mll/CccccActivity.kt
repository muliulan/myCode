package com.muliulan.mll

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import java.util.*

/**
name: zhaochenshuo
Date: 2021/8/24
 **/
class CccccActivity : AppCompatActivity(), CoroutineScope by MainScope() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ccc)

        text1.text="ccccccccccccc"

    }


    @RequiresApi(Build.VERSION_CODES.N)
    fun findRepeatedDnaSequences(s: String): List<String> {

        val arrayList = ArrayList<String>()
        val hashMap = HashMap<String, Int>()

        val l=10
        val sms=s.length
        for(a in 0 until sms-10){
            val substring = s.substring(a, a + l)
            hashMap[substring] = hashMap.getOrDefault(substring,0)+1
            if(hashMap[substring] ==2){
                arrayList.add(substring)
            }
        }
        return arrayList
    }

}