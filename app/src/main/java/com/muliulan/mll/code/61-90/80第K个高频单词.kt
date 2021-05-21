package com.muliulan.mll.code.`61-90`

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import java.util.Collections.sort
import java.util.function.Function
import java.util.stream.Collectors
import kotlin.Comparator
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

/**
描述:
zhaochenshuo
2021/5/20
 */

class Main80 {

    /**
     *    return Arrays.stream(words)
    .parallel()
    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    .entrySet()
    .stream()
    .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue).reversed().thenComparing(Map.Entry::getKey))
    .limit(k)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());
     *
     * */

    @RequiresApi(Build.VERSION_CODES.N)
    fun aa(): List<String> {
        val words: Array<String> =
            arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is")
        val k: Int = 4

        val hashMap = HashMap<String, Int>()
        for (a in 0 until words.size) {
            val s = words[a]
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1)
        }

        val arrayList1 = ArrayList<String>()
        hashMap.forEach {
            arrayList1.add(it.key)
        }
        Collections.sort(arrayList1,{ word1, word2 ->
           if( hashMap.get(word1) == hashMap.get(word2)) word1.compareTo(word2) else hashMap.get(word2)!! - hashMap.get(word1)!!
        })



        return arrayList1.subList(0,k)
    }
}