package com.vasu.functions

/**
 *  Infix function
 *
 *  Infix functions can be a member function or a Extension function
 *
 *  Thumb rule is they should have only single parameter
 *
 *  have a prefix of infix
 *
 *  Offers more readability
 */
fun main(args: Array<String>) {
    val ten = Calculator(10)
    // val isItTrue = v.isGreaterThan(20)

    val value = ten times 20
    println("10 times 20 is $value")
}

class Calculator(val a: Int) {
    infix fun times(c: Int): Int {
        return a * c
    }
}