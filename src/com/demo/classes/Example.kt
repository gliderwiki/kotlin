package com.demo.classes

fun main() {
    class Example {
        fun printFunctionType() { println("Class method") }
    }

    fun Example.printFunctionType(i: Int) { println("Extension function") }

    Example().printFunctionType(1)
}