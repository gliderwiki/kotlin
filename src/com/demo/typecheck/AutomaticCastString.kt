package com.demo.typecheck

fun getStringLength(obj: Any) : Int? {
    if (obj is String) {
        return obj.length
    }

    return null

}


fun main() {
    fun printLength(obj : Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a String"}")
    }

    printLength("Incomprehensibilities")
    printLength(3000)
    printLength(listOf(Any()))
}