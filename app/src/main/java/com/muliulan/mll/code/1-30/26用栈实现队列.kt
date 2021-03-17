package com.muliulan.mll.code.`1-30`

import java.util.*

/**
描述:
zhaochenshuo
2021/3/5
 */

class Main26() {

    /**
     *你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：

    实现 MyQueue 类：

    void push(int x) 将元素 x 推到队列的末尾
    int pop() 从队列的开头移除并返回元素
    int peek() 返回队列开头的元素
    boolean empty() 如果队列为空，返回 true ；否则，返回 false
     

    说明：

    你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
    你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
     * */
    val a = Stack<Int>()
    val b = Stack<Int>()
    fun push(x: Int) {
        a.push(x)
    }

    fun pop(): Int {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop())
            }
        }
        return b.pop()
    }

    fun peek(): Int {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop())
            }
        }
        return b.peek()
    }

    fun empty(): Boolean {
        return a.isEmpty() && b.isEmpty()
    }


}