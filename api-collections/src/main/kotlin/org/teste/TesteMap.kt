package org.teste

fun main() {
    val pa1r: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pa1r)

    map1.forEach{ (key, value) -> println("Chave: $key - Valor: $value")}

    val map2 = mapOf(
        "Pedro" to 2000.0,
        "Maria" to 3000.0,
    )
    map2.forEach{ (key, value) -> println("Chave: $key - Valor: $value")}
}