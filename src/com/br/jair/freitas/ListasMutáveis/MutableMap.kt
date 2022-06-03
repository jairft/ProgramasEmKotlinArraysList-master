package com.br.jair.freitas.ListasMutáveis

import com.br.jair.freitas.ListasImutáveis.Funcionario

fun main() {
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val marcos = Funcionario("Marcos", 3600.0, "PJ")
    val anna = Funcionario("Anna", 2800.0, "CLT")

    val repository = Repository<Funcionario>()

    repository.create(pedro.nome, pedro)
    repository.create(marcos.nome, marcos)
    repository.create(anna.nome, anna)

    println(repository.findById(pedro.nome))
    println("~~~~~~~~~~~~~~~~~~~~~~~~")
    repository.findAll().forEach {
        println(it)
    }
    println("~~~~~~~~~~~~~~~~~~~~~~~~")
    repository.remove(marcos.nome)
    repository.findAll().forEach {
        println(it)
    }
}