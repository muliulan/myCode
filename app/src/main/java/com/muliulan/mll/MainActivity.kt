package com.muliulan.mll

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val a = "1:2:3".split(":").toMutableList()

        Log.e("mll", a.toString())

        a.add("4")
        a.add("")
        a.add("5")



        Log.e("mll", a.joinToString(":"))
        Log.e("mll", a.toString())


    }


    fun text() {

    }
}