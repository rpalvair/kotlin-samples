package com.palvair.kotlin.classes

class Person constructor(val firstname: String) {

    private val children: MutableList<Person> = arrayListOf()

    constructor(name:String, parent:Person):this(name) {
        parent.children.add(this)
    }

}