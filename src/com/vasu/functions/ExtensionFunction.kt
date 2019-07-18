package com.vasu.functions

/**
 * Extension Functions:
 *
 * Adds new function to the classes
 *  - can add functions to a class with out declaring it
 *  - New functions will act exactly like a static function of a class
 *
 *
 *
 */
fun main(args: Array<String>) {
    val s1 = Student(1,"Santhosh", 120)
    val s2 = Student(1,"Vishwa", 240)
    val s3 = Student(1,"Badri", 100)

    println("${s1.name} is ${s1.isHePassed()}")
    println("${s2.name} is ${s1.isHePassed()}")
    println("${s3.name} is ${s1.isHePassed()}")

    println("${s1.name} is ${s1.isHeScholar()}")
    println("${s2.name} is ${s2.isHeScholar()}")
    println("${s3.name} is ${s3.isHeScholar()}")


    println("${s1.name}  is Now  ${s1.name.joinWithLicious(s1.name)}")
}

fun Student.isHeScholar(): String = if(this.score > 120) "Scholar" else "Not a Scholar"

fun String.joinWithLicious(str: String): String =  "${str} Licious"


class Student {
    var Id: Int
    var name: String
    var score: Int

    constructor(Id: Int, name: String, score: Int) {
        this.Id = Id
        this.name = name
        this.score = score
    }

    fun isHePassed(): String = if(this.score >= 100) "passed" else "Failed"

}