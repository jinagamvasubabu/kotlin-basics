package com.vasu.ternary

/*
   In Kotlin they have removed the concept of Ternary Operation instead you can use if as an alternative to the ternary
 */
fun main(args: Array<String>) {
    println(max(2, 3))
    println(maxInOneLineStatement(2, 3))
}

fun max(a: Int, b: Int): Int {
    // return (a > b)?a:b - this doesn't work
    return if (a > b) a else b
}

fun maxInOneLineStatement(a: Int, b: Int): Int = if (a > b) a else b