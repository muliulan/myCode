package com.muliulan.mll

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
name: zhaochenshuo
Date: 2021/7/8
 **/
class KtText {

    suspend fun makeLoginRequest(jsonBody: String) {

        withContext(Dispatchers.Main) {
            ""
        }
    }


    suspend fun d(){
        makeLoginRequest("")
    }

}

class LoginViewModel() : ViewModel() {

    fun aa() {
        viewModelScope.launch {
            KtText().makeLoginRequest("")

        }

//        lifecycleOwner.lifecycleScope

    }

}

