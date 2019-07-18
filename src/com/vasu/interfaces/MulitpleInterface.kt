package com.vasu.interfaces

/*
*
* Java doesn't support multiple inheritance because it gives
*
* // First Parent class
class Parent1
{
    void fun()
    {
        System.out.println("Parent1");
    }
}

// Second Parent Class
class Parent2
{
    void fun()
    {
        System.out.println("Parent2");
    }
}

// Error : Test is inheriting from multiple
// classes
class Test extends Parent1, Parent2
{
   public static void main(String args[])
   {
       Test t = new Test();
       t.fun();
   }
}

because of Diamond problem, one way to solve this problem is using default methods in interfaces



*
*
* */

interface A {
    fun callMe() {
        println("From interface A")
    }
}
interface B  {
    fun callMe() {
        println("From interface B")
    }
}
class C: A, B {
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}
fun main(args: Array<String>) {
    val obj = C()
    obj.callMe()
}
