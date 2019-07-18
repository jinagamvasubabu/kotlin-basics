package com.vasu.classes.visibility

/**
 * Visibility:
 *
 * public : By default public in nature for functions, classes it will be public final by default
 * protected: Allowed only in the subClasses
 * private: Only with in the class
 * internal: Allowed only with in the module
 */
fun main(args: Array<String>) {
    val e = Employee(employeeName = "Vishwa", organisationName = "Licious", salary = 40000000L, taxes = 10)
    e.employeeName = "Vishwanath GV"
    e.organisationName = "Licious Pvt ltd"
    // e.salary = 100000000L private cannot be visible
    // e.taxes = 20 protected can be modified only in the subclass not in the object
    println(e.toString())
}

open class Salary {
    private var salary: Long
    protected var taxes: Long
    public var organisationName: String
    public var employeeName: String

    constructor(salary: Long, taxes: Long, organisationName: String, employeeName: String) {
        this.salary = salary
        this.taxes = taxes
        this.organisationName = organisationName
        this.employeeName = employeeName
    }

    fun getEmpName(): String {
        return employeeName
    }

    override fun toString(): String {
        return "${this.employeeName},${this.organisationName},  ${this.salary}, ${this.taxes}";
    }
    // one way to update it
    /*fun setSalary(updatedSalary: Long): Unit {
        this.salary = updatedSalary
    }*/

}

class Employee : Salary {
    constructor(salary: Long, taxes: Long, organisationName: String, employeeName: String) : super(salary, taxes, organisationName, employeeName)
}

