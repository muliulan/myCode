package com.muliulan.mll

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.utils.MllNotification
import kotlinx.android.synthetic.main.activity_main.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 1
        btn3.setOnClickListener {
            MllNotification.bbb(this, Intent(this, BbbbActivity::class.java), "11", "22", 1)
        }


    }


}

