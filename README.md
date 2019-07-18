# What is Kotlin all about??
### What:
Kotlin is a statically typed programming language developed by JetBrains(who has introduced Intellij and Webstorm to us) that targets the JVM, Android, JavaScript and Native( In Experimental mode).

### Why:
Because kotlin is:
  - concise
  - Can cut 40% lines of code (Rough estimates)
  - Type safe
  - Support for Non-Nullable types (to reduce NPE's)
  - Smart casting
  - Higher order functions
  - Extension functions
  - Coroutines (Async Programming without using RxJava nor Scary creepy threads)
  - Kotlin Scripting
  - Good Support with Frameworks like (Spring, Vert.x etc)
  - Interoperability with java
  - Lambdas with receivers provide the ability to write expressive code as well as facilitating creation of DSL.
  - Kotlin is free to use (OpenSource)
  - Kotlin is Object oriented and Functional Programming or Mix

```
Really Amazing!!! Isnt it??? But what if your project is already built on Java????
```
Dont Worry :-) Kotlin provides the interoperability to support kotlin in your java project. In other words, I can say class by class you can convert Java to Kotlin.
You can use Java to Kotlin converter to convert your code with slight modifications if needed any. 

[Java to Kotlin Converter](https://try.kotlinlang.org/#/Kotlin%20in%20Action/Chapter%207/7.1/1_1_PointPlusMember.kt)

### Where can I use Kotlin:
Kotlin can be used for any kind of development, be it server-side, client-side web or Android. 
With Kotlin/Native currently in the works, support for other platforms such as embedded systems, macOS and iOS is coming.
People are using Kotlin for mobile and server-side applications, client-side with JavaScript or JavaFX, and data science, just to name a few possibilities.
 -- From Kotilin Offical doc: https://kotlinlang.org/docs/reference/faq.html  


### Why it became popular now a days ?
Because Google officially announced Kotlin will be the First-class language for Android
Source: https://www.theverge.com/2017/5/17/15654988/google-jet-brains-kotlin-programming-language-android-development-io-2017

### Inspiration for Kotlin?
Actually Kotlin is inspired from existing languages like Java, C#, Scala, Groovy. I feel Kotlin is easier to learn and onboard faster.

#### How to Install and Run a HelloWorld?
Installation:
Install first Java JDK (Kotlin currently in Java8) (https://discuss.kotlinlang.org/t/kotlin-support-for-java-9-and-java-10/8054/11)
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

### With IDE: (Intellij)
Kotlin installation is very easy if you are using any IDE like Intellij because Kotlin already bundled with it. You can download http://www.jetbrains.com/idea/download/index.html
Community Edition(Free for community) or Ultimate (Paid one though). 
Please find the below Gif for more info.

### Without IDE:
If you wanted to use Kotlin without Intellij then you need to download Kotlin compiler from https://github.com/JetBrains/kotlin/releases/tag/v1.3.41 (Latest release is 1.3.41)
Manual Install
    Unzip the standalone compiler into a directory and optionally add the bin directory to the system path. 
    The bin directory contains the scripts needed to compile and run Kotlin on Windows, OS X and Linux.
HomeBrew:
    $ brew update
    $ brew install kotlin
    
HelloWorld Program:
```
fun main(args: Array<String>) {
    println("Hello, World!")
}
```

Execute: 
$ kotlinc hello.kt -include-runtime -d hello.jar 
    -d option to include the runtime in the resultant jar to run as a jar

### REPL: (Read-Eval-Print loop)
After Successful installation of Kotlinc, go to terminal and type Kotlinc and write `println("Hello World")` and type `:quit` to exit

References:
-- From Kotilin Offical doc: https://kotlinlang.org/docs/reference/faq.html  
https://www.theverge.com/2017/5/17/15654988/google-jet-brains-kotlin-programming-language-android-development-io-2017