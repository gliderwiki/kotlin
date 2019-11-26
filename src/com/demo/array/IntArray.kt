package com.demo.array

fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    println(x[0])

    val arr1 = IntArray(5)
    for (ar in arr1) {
        print(ar)
    }

    println()

    val arr2 = IntArray(5) { 42 }
    for (ar in arr2) {
        print(ar)
    }

    println()

    var arr3 = IntArray(5) { it * 1 }
    for (ar in arr3) {
        print(ar)
    }
}