package com.palvair.kotlin

class User(nom: String, val prenom: String?) {
    val nom = nom.toUpperCase()

    init {
        val prenomToDisplay = this.prenom ?: ""
        println("Utilisateur $prenomToDisplay $nom créé")
    }

    constructor(nom: String) : this(nom,null)
}


fun main(arg: Array<String>) {
    val user = User("Doe")
    println("nom = ${user.nom}")
    println("nom = ${user.prenom}")
    User("Doe", "John")
}