package com.vasu.ranges

/*
   Kotlin allows you to easily create ranges and iterate over numbers with an arbitrary steps

   .. - (Allows you to iterate range of values)
   downTo - (Iterate in reverse order)
   step - Iterate by steps
   until - exclude last element while iterating


   Let's see by an example

 */
fun main(args: Array<String>) {
    var r1 = 1..5 // range 1,2,3,4,5

    var r2 = 50 downTo 1 // 50 .... 1

    var r3 = 5 downTo 1 step 2 //

    var r4 = 1  until 5 // Exclude last element

    for (i in r1) print("$i ")
    println()
    for (i in r2) print("$i ")
    println()
    for (i in r3) print("$i ")
    println()
    for (i in r4) print("$i ")
    println()
}