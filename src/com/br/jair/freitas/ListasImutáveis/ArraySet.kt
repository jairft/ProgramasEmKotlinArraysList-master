package com.br.jair.freitas.ListasImutáveis

fun main() {
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val marcos = Funcionario("Marcos", 3600.0, "PJ")
    val maria = Funcionario("Anna", 2800.0, "CLT")

    val funcionario1 = setOf(pedro, maria)
    val funcionario2 = setOf(marcos)

    // União dos dois conjuntos
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach {
        println(it)
    }
    println("~~~~~~~~~~~~~~~~~~~~")
    // tirar do conjunto o elemento comuns nos dois conjuntos
    val funcionario3 = setOf(pedro, maria, marcos)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach {
        println(it)
    }
    println("~~~~~~~~~~~~~~~~~~~~")
    // Mostra o elemento comum nos dois conjuntos
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach {
        println(it)
    }


}