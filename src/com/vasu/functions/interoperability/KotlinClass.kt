@file:JvmName("MyCustomKotlin")

package com.vasu.functions.interoperability

fun main(args: Array<String>) {
    println(JavaClass.sayHelloFromJavaFile())
}

fun add(a: Int, b: Int): Int {
    return a + b
}

@JvmOverloads
fun mul(a: Int, b:Int=10): Int {
    return a*b
}