package com.demo.loop

fun main() {
    val items = listOf("a", "b", "c")
    var index = 0;
    while (index < items.size) {
        println("item as $index is ${items[index]}")
        index++
    }
}