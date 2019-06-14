package com.palvair.kotlin.classes

class InitOrderDemo(name: String) {

    val firstProperty = "First property : $name".also { s -> println(s) }

    init {
        println("First initializer block : $name")
    }

    val secondProperty = "Second property : $name".also { s -> println(s) }

    init {
        println("Second initialize block : $name")
    }

}


fun main() {
    InitOrderDemo("foo")
}