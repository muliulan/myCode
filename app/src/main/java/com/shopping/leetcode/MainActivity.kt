package com.shopping.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shopping.leetcode.code.Main22
import com.shopping.leetcode.code.Main23
import com.shopping.leetcode.offer.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()

        val codeAA = Offer30().aa()
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


    }


}