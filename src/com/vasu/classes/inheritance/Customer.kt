package com.vasu.classes.inheritance


fun main(args: Array<String>) {
    val c = Customer(1, "vasu", 120)
    println(c.Id)
    println(c.name)
    println(c.score)
   // c.score = 200;
}

/**
 * All Kotlin classes are by default public and final, so cannot be inherited unless you open
 */
// Immutable class
class Customer(val Id: Int, val name: String, val score: Int) {
/*    val Id: Int
    val name: String
    val score: Int*/

/*    constructor(Id: Int, name: String, score: Int) { // secondary constructor
        this.Id = Id
        this.name = name
        this.score = score
    }*/
}