package org.teste

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0, "CLT")
    val funcionario2 = Funcionario("Maria", 1500.0, "PJ")
    val funcionario3 = Funcionario("Kolin", 4000.0, "CLT")

    val funcionariosSet1 = setOf(funcionario1, funcionario2)
    val funcionariosSet2 = setOf(funcionario3)

    println("INITIAL")
    val resultUnion = funcionariosSet1.union(funcionariosSet2)
    resultUnion.forEach { println(it) }

    println("SUBTRACT")
    val funcionariosSet3 = setOf(funcionario1, funcionario2, funcionario3)
    val resultSubtract = funcionariosSet3.subtract(funcionariosSet2)
    resultSubtract.forEach { println(it) }

    println("INTERSECT")
    val resultIntersect = funcionariosSet3.intersect(funcionariosSet2)
    resultIntersect.forEach { println(it) }

}