package org.teste

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0, "CLT")
    val funcionario2 = Funcionario("Maria", 1500.0, "PJ")
    val funcionario3 = Funcionario("Kolin", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(funcionario1.nome, funcionario1)
    repositorio.create(funcionario2.nome, funcionario2)
    repositorio.create(funcionario3.nome, funcionario3)

    println("INITIAL")
    println(repositorio.findById(funcionario1.nome))

    println("MAP-REMOVE")
    repositorio.remove(funcionario1.nome)
    repositorio.findAll().forEach{ println(it)}

    println("MAP-FINDBY")
    println(repositorio.findById(funcionario3.nome))

    println("MAP-FINDALL")
    repositorio.findAll().forEach{ println(it)}
}