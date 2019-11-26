package com.demo.loop

fun describe(obj : Any): String =
    when (obj) {
        1 -> "One"
        "hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "unknown"
    }

fun main() {
    println(describe(1))
    println(describe("hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

}
