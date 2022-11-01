package org.teste

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0, "CLT")
    val funcionario2 = Funcionario("Maria", 1500.0, "PJ")
    val funcionario3 = Funcionario("Kolin", 4000.0, "CLT")

    println("INITIAL-LIST")
    val funcionarios = mutableListOf(funcionario1,funcionario2)
    funcionarios.forEach { println(it) }

    println("LIST-ADD ${funcionario3.nome}")
    funcionarios.add(funcionario3)
    funcionarios.forEach { println(it) }

    println("LIST-REMOVE ${funcionario1.nome}")
    funcionarios.remove(funcionario1)
    funcionarios.forEach { println(it) }

    println("INITIAL-SET")
    val funcionarioSet = mutableSetOf(funcionario1)
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(funcionario2)
    funcionarioSet.add(funcionario3)
    funcionarioSet.forEach { println(it) }

    println("SET-REMOVE ${funcionario2.nome}")
    funcionarioSet.remove(funcionario2)
    funcionarioSet.forEach { println(it) }
}