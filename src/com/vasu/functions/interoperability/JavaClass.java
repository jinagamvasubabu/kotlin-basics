package com.vasu.functions.interoperability;

/**
 * Interoperability:
 *
 * Kotlin provides the interoperability to call the Kotlin function from Java and vicerversa
 *
 * How does kotlin takes care of this:
 *
 * MySample.Kt
 * fun sampleFun() {
 *     println("sample");
 * }
 *
 * will be converted to
 *
 * class MySample {
 *     public static sampleFub() {
 *         System.out.println("sample");
 *     }
 * }
 *
 *
 * Ok, I got your question, what if Java doesn't have some feature what kotlin is having, lets say Default functions
 *
 * @JvmOverloads - Helps in this case
 */

public class JavaClass {
    public static void main(String[] args) {
        // System.out.println(KotlinClassKt.add(5,4));
         System.out.println(MyCustomKotlin.add(5,4));
         System.out.println(MyCustomKotlin.mul(5));
    }

    public static String sayHelloFromJavaFile() {
        return "Say Hello";
    }
}
