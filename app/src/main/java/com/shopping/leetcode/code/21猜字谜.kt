package com.shopping.leetcode.code

import android.util.Log
import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/2/26
 */

class Main21() {

    /**
     * 外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。
    字谜的迷面 puzzle 按字符串形式给出，如果一个单词 word 符合下面两个条件，那么它就可以算作谜底：
    单词 word 中包含谜面 puzzle 的第一个字母。
    单词 word 中的每一个字母都可以在谜面 puzzle 中找到。
    例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage", 和 "baggage"；而 "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）都不能作为谜底。
    返回一个答案数组 answer，数组中的每个元素 answer[i] 是在给出的单词列表 words 中可以作为字谜迷面 puzzles[i] 所对应的谜底的单词数目。

    示例：
    输入：
    words = ["aaaa","asas","able","ability","actt","actor","access"],
    puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
    输出：[1,1,3,2,4,0]
    解释：
    1 个单词可以作为 "aboveyz" 的谜底 : "aaaa"
    1 个单词可以作为 "abrodyz" 的谜底 : "aaaa"
    3 个单词可以作为 "abslute" 的谜底 : "aaaa", "asas", "able"
    2 个单词可以作为 "absoryz" 的谜底 : "aaaa", "asas"
    4 个单词可以作为 "actresz" 的谜底 : "aaaa", "asas", "actt", "access"
    没有单词可以作为 "gaswxyz" 的谜底，因为列表中的单词都不含字母 'g'。
     * */
    fun aa()  {
        val words: Array<String> =
            arrayOf("apple","pleas","please")
        val puzzles: Array<String> =
            arrayOf("aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy")

//        ["apple","pleas","please"]
//        ["aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"]

        val arrayList = ArrayList<Int>()

        for (a in 0 until puzzles.size) {
            val s = puzzles[a]
            val toCharArray = s.toCharArray()
            arrayList.add(a,0)


            words.forEach {
                val itChar = it.toCharArray()
                var iss=true
                 if(it.contains(toCharArray[0])){
                     for(b in 0 until itChar.size){
                         if(!s.contains(itChar[b])){
                             iss=false
                            break
                         }
                     }

                     if(iss){
                         arrayList[a]=arrayList[a]+1
                     }

                 }

            }

        }
        arrayList.toList()
        arrayList.forEach {
            Log.e("mllqqaaa",it.toString())
        }
    }

}