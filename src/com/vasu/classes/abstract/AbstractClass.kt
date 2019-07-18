package com.vasu.classes.abstract


/**
 * Abstract Classes by default open
 *
 *
 */
abstract class Person(name: String, SSN: String) {
    abstract fun displayPerson(): String
}


class Employee(private val name: String, private val SSN: String): Person(name, SSN) {
    override fun displayPerson(): String {
        return "Name: $name , SSN: $SSN"
    }
}

fun main(args: Array<String>) {
    val e = Employee("Vishwa", "12345")
    print(e.displayPerson())
}