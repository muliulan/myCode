package com.muliulan.mll

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.code.`61-90`.*
import com.muliulan.mll.dong_nao.ImageResize
import com.muliulan.mll.offer.TreeNode


//  ↖↑↗←↙↓↘→
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA = Main81().aa()
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


    }


}