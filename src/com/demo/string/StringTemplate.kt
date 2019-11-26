package com.demo.string

fun main() {
    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"

    val price = """
${'$'}9.99
"""
    println(price)
}