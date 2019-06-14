package com.palvair.kotlin.classes

class Constructors {

    constructor(i: Int) {
        println("Constrcuteur primaire execute en second. Parametre : $i")
    }

    init {
        println("Block d'initialisation execute en premier")
    }
}

fun main() {
    Constructors(5)
}