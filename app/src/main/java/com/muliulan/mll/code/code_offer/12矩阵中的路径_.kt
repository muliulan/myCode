package com.muliulan.mll.code.code_offer

/**
描述:
zhaochenshuo
2021/3/20
 */

class Off12 {

    /**
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
     * 每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
     * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。

    [["a","b","c","e"],
    ["s","f","c","s"],
    ["a","d","e","e"]]

    但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。

     
    示例 1：
    输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    输出：true

    示例 2：
    输入：board = [["a","b"],["c","d"]], word = "abcd"
    输出：false
     * */

    fun aa(): Boolean {
        val board: Array<CharArray> = arrayOf(
            charArrayOf('a', 'b', 'c', 'e'), charArrayOf('s', 'f', 'c', 's'),
            charArrayOf('a', 'd', 'e', 'e')
        )
        val word: String = "abcced"

        val toCharArray = word.toCharArray()
        var h = -1//横坐标
        var l = -1//竖坐标


        if(toCharArray.size==1){
            board.forEach {
                it.forEach {
                    if(it ==toCharArray[0]){
                        return true
                    }
                }
            }
            return false
        }

        for (a in 0 until toCharArray.size) {

            val ac = toCharArray[a]

            if (a == 0) {
                val bb = bb(ac, board, word)
                if (bb != "") {
                    val split = bb.split(" ")
                    h = split[0].toInt()
                    l = split[1].toInt()
                    board[h][l] = '-'
                } else {
                    return false
                }
            } else {
                if (h != 0) {
                    if (board[h - 1][l] == ac) {
                        h--
                        board[h][l] = '-'
                        continue
                    }
                }

                if (h < board.size - 1) {
                    if (board[h + 1][l] == ac) {
                        h++
                        board[h][l] = '-'
                        continue
                    }
                }

                if (l != 0) {
                    if (board[h][l - 1] == ac) {
                        l--
                        board[h][l] = '-'
                        continue
                    }

                }
                if (l < board[0].size - 1) {
                    if (board[h][l + 1] == ac) {
                        l++
                        board[h][l] = '-'
                        continue
                    }
                }
                return false
            }


        }
        return true
    }

    private fun bb(mc: Char, board: Array<CharArray>, word: String): String {

        var h = 0
        var l = 0
        for (b in 0 until board.size) {
            val chars = board[b]

            for (c in 0 until chars.size) {
                val cc = chars[c]
                if (mc == cc) {
                    h = b
                    l = c

                    if (h != 0) {
                        if (board[h - 1][l] == word[1]) {
                            return "$h $l"
                        }
                    }

                    if (h < board.size - 1) {
                        if (board[h + 1][l] == word[1]) {
                            return "$h $l"
                        }
                    }

                    if (l != 0) {
                        if (board[h][l - 1] == word[1]) {
                            return "$h $l"
                        }

                    }
                    if (l < chars.size - 1) {
                        if (board[h][l + 1] == word[1]) {
                            return "$h $l"
                        }
                    }

                }
            }
        }
        return ""
    }
}