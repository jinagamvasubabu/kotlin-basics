package com.vasu.tailrec
/*
   Recursion: Calling own function again and again with a base condition(s) to exit is called Recursion in simple terms
   We Often get StackOverflow Error because recursive functions are being called first and then compute the result as part of last step

   For Example:  println(sum(100000000))

   Kotlin wants to the solve this problem using `tailRec`. But how ?

   Tail Recursion is a technique to recursively call a function in which calculations are done first and then function is called.

   Conditions for to use TailRec:
   * Function call must be the last thing to execute in the function
   * Function must be marked with tailrec to tell the compiler to optimise the function call for tail recursion
   *

 See How it looks like when you decompile Kotlin class, it just converts the
 */
fun main(args: Array<String>) {
   // println(sum(100000000))
    println(sumRec(100000000)) // 1 crore
}

fun sum(n: Long): Long {
    return if (n == 0L) 0L
    else {
        n + sum(n - 1)
    }
}


tailrec fun sumRec(n: Long, output: Long = 0L): Long {
    return if (n == 0L) output
    else {
        sumRec(n - 1, output + n)
    }
}