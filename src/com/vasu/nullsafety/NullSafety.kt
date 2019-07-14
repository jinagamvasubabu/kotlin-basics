package com.vasu.nullsafety

/*
  In the world of Programming we often get Null Pointer Exceptions and sometimes we forget to handle and push to production

  So Kotlin tried enough to mitigate this problem to not to allow Nulls unless you specify `?`

  Let's see by an example

 */
fun main(args: Array<String>) {
    var canBeNullable: String?
    var cantBeNullable: String = "Hi I cannot be nullable"
    canBeNullable = null
    // strLen(canBeNullable)
    println(strLenAllowingNulls(canBeNullable))
    println(strLen(cantBeNullable))
}

fun strLen(str: String): Int {
    return str.length
}

fun strLenAllowingNulls(str: String?): Int {
    if (str != null) {
        return str.length
    }
    return 0
}