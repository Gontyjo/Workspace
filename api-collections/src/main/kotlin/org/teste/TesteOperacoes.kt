package org.teste

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("SALARIOS---------------------------")
    for (salario in salarios){
        println(salario)
    }

    println("OPERACOES--------------------------")
    println("Media salarios: ${salarios.average()}")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")

    println("FILTERS----------------------------")
    salarios.forEach{ if(it > 2500.0){
        println(it)} }

    println("FILTERS----------------------------")
    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach { println(it) }

    println("FILTERS----------------------------")
    println("${salarios.count { it in 2000.0..5000.0}} salarios entre 2000/5000")

    println("FILTERS----------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("FILTERS----------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 100.0 })
}