package com.muliulan.mll

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed
import kotlinx.coroutines.launch

/**
 *    @author : zhaoCS
 *    date    : 2022/6/7 4:47 下午
 *    desc    :
 */
class MainViewModel : ViewModel() {

    private val _effect = Channel<Effect>()
    val effe = _effect.receiveAsFlow()


    fun showT(txt: String) {
        setEffect { Effect.ShowToast(txt) }
    }

    private fun setEffect(function: () -> Effect) {
        viewModelScope.launch {
            _effect.send(function())
        }
    }

    fun aa() {


    }


}

sealed class Effect {
    data class ShowToast(val txt: String) : Effect()
}
