package com.muliulan.mll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.muliulan.mll.code.`31-60`.Main32

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()

        val codeAA = Main32().aa()
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