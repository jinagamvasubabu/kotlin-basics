package com.vasu.controlStatements.loop

fun main(args: Array<String>) {
    labeledContinueForLoop()
}

fun labeledContinueForLoop() {
    loop1@ for ( i in 1..4) {
        for (j in 1..4) {
            if (i == 2 && j == 2)
                continue@loop1
            println("$i $j")
        }
    }
}