package com.vasu.functions

/*

  Default and Named Parameters:
  Kotlin allows you to provide default values to your function arguments instead of specifying everytime when you know that
  its static and will not change often.

  Kotlin gives the flexibility to arrange the arguments order to your wish

 */


fun main(ars: Array<String>) {
    fun isEven(num: Int, evenMsg: String="is Even", oddMsg: String="is Odd"): String {
        if (num % 2 == 0) {
            return num.toString() + " " + evenMsg
        } else {
            return num.toString() + " " + oddMsg
        }
    }

    println(isEven(2, "is Even", "is odd"))
    println(isEven(5))
    println(isEven(evenMsg = "Even", oddMsg = "Odd", num = 3))
}


