package com.vasu.controlStatements.loop

fun main(args: Array<String>) {
    simpleLoop()
}

fun simpleLoop() {
    loop1@ for ( i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                break@loop1
            println("$i $j")
        }
    }
}