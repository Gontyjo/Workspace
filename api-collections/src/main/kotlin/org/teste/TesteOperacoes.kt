package org.teste

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("SALARIOS---------------------------")
    for (salario in salarios){
        println(salario)
    }

    println("MEDIA------------------------------")
    println("Media salarios: ${salarios.average()}")



    println("FILTERS----------------------------")
    salarios.forEach{ if(it > 2500.0){
        println(it)} }

    println("FILTERS----------------------------")
    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach { println(it) }
}