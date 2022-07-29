package com.muliulan.mll

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.utils.MllNotification
import kotlinx.android.synthetic.main.activity_main.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn3.setOnClickListener {
            MllNotification.ccc(this, Intent(this, BbbbActivity::class.java), "11", "22", 33)
        }

        User().aa()
    }


}

fun  User.aa(){
    Log.e("mll", "222")
}
class User {
    fun aa(){
        Log.e("mll", "111")
    }

//    var name by Delegates.observable("11") { prop, old, new ->
//        Log.e("mll", "$prop  $old   $new")
//    }
}
