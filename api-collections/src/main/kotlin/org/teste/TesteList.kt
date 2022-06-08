package org.teste

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0)
    val funcionario2 = Funcionario("Maria", 1500.0)
    val funcionario3 = Funcionario("Kolin", 4000.0)

    val funcionarios = listOf(funcionario1,funcionario2,funcionario3)

    funcionarios.forEach { println(it) }

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

data class Funcionario(
    val nome:String,
    val salario:Double,
){
    override fun toString(): String =
            """
            -----------
            Nome: $nome
            Salario: $salario
            -----------
            """.trimIndent()
}