package com.vasu.controlStatements

/*
   Kotlin allows you to write `If` and `when` as expression instead of statement. For example, you can assign the result of
   an if-else expression to a variable
 */
fun main(args: Array<String>) {
    ifAsExpression()
    println(whenAsExpression(1))
    println(whenAsExpression("Hello"))
    println(whenAsExpression(12))
    println(whenAsExpression(12L))
}

fun ifAsExpression() {
    val a = 5
    val b = 6
    val max:Int = if (a > b) a else b
    println("max($a, $b) = $max")
}

fun whenAsExpression(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Int -> false                        // 4
        else -> "42"                              // 5
    }
    return result
}