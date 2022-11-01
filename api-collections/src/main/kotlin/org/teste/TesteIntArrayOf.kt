package org.teste

fun main() {
    val values = intArrayOf(3,8,9,2,10,30,4)

    values.forEach {
        println("$it array")
    }
    println("---------")
    values.sort()
    values.forEach {
        println("$it organizado >")
    }
    println("---------")
    values.sortDescending()
    values.forEach {
        println("$it organizado <")
    }
}