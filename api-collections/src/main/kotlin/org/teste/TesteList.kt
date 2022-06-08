package org.teste

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0, "CLT")
    val funcionario2 = Funcionario("Maria", 1500.0, "PJ")
    val funcionario3 = Funcionario("Kolin", 4000.0, "CLT")

    val funcionarios = listOf(funcionario1,funcionario2,funcionario3)

    funcionarios.forEach { println(it) }

    println("FILTER-GROUP")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}

    println("FILTER-MARIA")
    println(funcionarios.find { it.nome == "Maria" })

    println("FILTER-SORT")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("FILTER-SORTD")
    funcionarios
        .sortedByDescending { it.salario }
        .forEach{ println(it)}
}