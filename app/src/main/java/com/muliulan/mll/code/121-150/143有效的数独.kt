package com.muliulan.mll.code.`121-150`

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.set

/**
name: zhaochenshuo
Date: 2021/9/17
 **/
class Main143 {

    fun isValidSudoku(board: Array<CharArray>): Boolean {


        
        val hash11 = HashMap<Int, HashSet<Int>>()
        val hash22 = HashMap<Int, HashSet<Int>>()
        val hash33 = HashMap<Int, HashSet<Int>>()


        for (a in 0 until 9) {
            hash11[a] = HashSet<Int>()
            hash22[a] = HashSet<Int>()
            hash33[a] = HashSet<Int>()
        }

        for (a in 0 until board.size) {
            val charsList = board[a]
            for (b in 0 until charsList.size) {

                val c = charsList[b]
                if (c == '.') {
                    continue
                }

                val idx = c - '0'
                val i = a / 3 * 3 + b / 3

                if (hash11[a]!!.contains(idx) || hash22[b]!!.contains(idx) || hash33[i]!!.contains(idx)) {
                    return false
                }
                hash11[a]!!.add(idx)
                hash22[b]!!.add(idx)
                hash33[i]!!.add(idx)
            }

        }

        return true
    }

    
}