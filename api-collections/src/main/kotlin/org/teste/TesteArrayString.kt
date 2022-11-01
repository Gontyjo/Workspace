package org.teste

fun main() {
    val nomes = Array<String>(3){""}

    nomes[0] = "Mateus"
    nomes[1] = "Rodrigo"
    nomes[2] = "João"

    println("-------------------")
    for(nome in nomes){
        println(nome)
    }
    nomes.sortDescending()
    for(nome in nomes){
        println(nome)
    }
    println("-------------------")
    nomes.sort()
    for(nome in nomes){
        println(nome)
    }
    println("-------------------")
    nomes.shuffle()
    for(nome in nomes){
        println(nome)
    }
    println("-------------------")
    nomes.sort()
    nomes.forEach { println(it) }
    println("-------------------")
    val nomes2 = arrayOf("Maria", "Zaza", "Joana")
    nomes2.sort()
    nomes2.forEach { println(it) }
}