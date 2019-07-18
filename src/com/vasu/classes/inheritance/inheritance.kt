package com.vasu.classes.inheritance

open class Animal {
    var color: String = ""
    open fun eat() {
        println("can Eat")
    }
}


class Dog : Animal() {
    var breed: String = ""

    fun bark() {
        println("$breed can bark")
    }

    override fun eat() {
      println("$breed can eat")
    }
}

fun main(args: Array<String>) {
   val dog = Dog()
    dog.color = "black"
    dog.breed = "lab"
    dog.eat()
    dog.bark()
}