package org.teste

fun main() {
    val values = IntArray(5)
    values[0] = 4
    values[1] = 2
    values[2] = 5
    values[3] = 7
    values[4] = 8

    for(i in values){
       println("$i com for padrao")
    }
    println("------------------")
    values.forEach {valor ->
        println("$valor com foreach")
    }
    println("------------------")
    for (index in values.indices){
        println("${values[index]} com index")
    }
    println("------------------")
    values.sort()
    for (valor in values){
        println("$valor organizado >")
    }
    println("------------------")
    values.sortDescending()
    for (valor in values){
        println("$valor organizado <")
    }
}