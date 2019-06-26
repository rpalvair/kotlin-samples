package com.palvair.kotlin.classes.inheritance

open class Derived(p: Int) : Base(p) {

    override fun closed() {}

    final override fun opened() {}
}