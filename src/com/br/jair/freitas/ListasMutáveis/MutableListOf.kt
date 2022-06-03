package com.br.jair.freitas.ListasMutáveis

import com.br.jair.freitas.ListasImutáveis.Funcionario

fun main() {
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val marcos = Funcionario("Marcos", 3600.0, "PJ")
    val anna = Funcionario("Anna", 2800.0, "CLT")

    println("~~~~~~~~~~~ LIST ~~~~~~~~~~~~~")
    val funcionarios = mutableListOf(pedro, anna)
    funcionarios.forEach {
        println(it)
    }
    println("~~~~~~~~~~ 1° ~~~~~~~~~~")
    // adicionando mais um item a lista
    funcionarios.add(marcos)
    funcionarios.forEach {
        println(it)
    }
    println("~~~~~~~~~ 2° ~~~~~~~~~~~")
    // removendo um item da lista
    funcionarios.remove(pedro)
    funcionarios.forEach {
        println(it)
    }
    println("~~~~~~~~~~~ SET ~~~~~~~~~~~~~")
    val funcionarioSet = mutableSetOf(anna)
    funcionarioSet.forEach {
        println(it)
    }
    println("~~~~~~~~~~ 1° ~~~~~~~~~~")
    funcionarioSet.add(marcos)
    funcionarioSet.forEach {
        println(it)
    }
    println("~~~~~~~~~ 2° ~~~~~~~~~~~")
    funcionarioSet.remove(anna)
    funcionarioSet.forEach {
        println(it)
    }
}