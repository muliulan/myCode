package com.muliulan.mll

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.code.`91-120`.Main91


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA = Main91().aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")
//        val offerAA = Offer6().aa()
//        Log.e("mll_offerAA", "$offerAA   ${System.currentTimeMillis() - currentTimeMillis}")
//        Log.e("mll_codeaaaaaa","${System.nanoTime()}      ${  System.currentTimeMillis()}")


//        val fd = contentResolver.openFileDescriptor(uri, "r")
//        if (fd != null) {
//            val bitmap = BitmapFactory.decodeFileDescriptor(fd.fileDescriptor)
//            fd.close()
//            imageView.setImageBitmap(bitmap)
//        }

//         Dsssss(). coinChange(intArrayOf(1,2,5),11)


//        val arrayList = ArrayList<Int>()
//        arrayList.add(3)
//        arrayList.add(2)
//        arrayList.add(1)
//
//        arrayList.forEach {
//            Log.e("mll_codeAA",it.toString())
//        }
        val mddd : Mddd ?= null
        Log.e("mll_codeAA",(mddd?.a==1).toString())
    }

    class Mddd(){
        var a=1
    }
}