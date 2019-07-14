package com.vasu.variables

/*
  In Kotlin everything is an object in the sense that we can call member functions and properties on any variable.
  Some of the types can have a special internal representation - for example, numbers, characters and booleans can be represented as primitive values at runtime - but to the user they look like ordinary classes

Data Types in Kotlin:
Boolean 1
Byte    8
Char    1
Short   16
Int     32
Long    64
Float   32
Double  64

Underscores for mode readability:
var one_million = 1_00_000

Val and var:
Val is Immutable in nature and var is Mutable.

Characters:
Characters are represented by the type `char`. They cannot be treated directly as Integers

Pending: Nothing
Reference:
https://kotlinlang.org/docs/reference/basic-types.html
https://medium.com/@agrawalsuneet/equality-in-kotlin-and-equals-d8373ef529f1
 */

fun main(args: Array<String>) {
    variableDemo()
    valAndVarDemo()
}

fun variableDemo() {
    val oneMillion = 1_00_000 // gives more readability
    val ssnNumber = 7777_90909_2323_2323 // Underscores will be ignored at compile time
    println(oneMillion)
    println(ssnNumber)
}

fun valAndVarDemo() {
    var iAmMutable = "changeMe"
    iAmMutable = "changed"
    val iAmImmutable = "changeMeIfYouCan"
    // iAmImmutable = "Not Able to change"
    println(iAmMutable)
    println(iAmImmutable)
}
