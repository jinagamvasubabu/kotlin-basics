package com.vasu.templates

/*
   String Templates: Interpolation

   Now Kotlin avoids you to write `+` to concatenate or use StringBuilder to do modifications to the string

   Lets see by an Example

   Internally it converts to this

   new StringBuilder().append("Hi Good").append(" ").append("Morning").toString()

 */
fun main(args: Array<String>) {
    val str = "Hi Good"

    val now = "Morning"

    // without String Interpolation

    println(str+" "+now)

    // with String interpolation
    println("$str $now")
}