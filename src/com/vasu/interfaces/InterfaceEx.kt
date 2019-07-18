package com.vasu.interfaces

interface Animal {
    fun eat(): String // abstract method
    val name: String
        get() = "By default it is an Animal"

    fun display(): String = "Default Display" // default method
}

class Dog : Animal {
    // override val name = "Its a Dog"
    override fun eat(): String {
        return "$name can eat"
    }
}

class Tiger : Animal {
    override val name = "Its a Tiger"
    override fun eat(): String {
        return "$name can eat"
    }

    fun canKill(): String {
        return "$name can kill"
    }
}

fun main(args: Array<String>) {
    val t = Tiger()
    val d = Dog()
    println(d.name)
    println(d.eat())
    println(d.display())
    println(t.name)
    println(t.canKill())
    println(t.display())
}