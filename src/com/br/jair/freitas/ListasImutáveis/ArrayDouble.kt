package com.br.jair.freitas.ListasImutáveis

fun main() {
    val salarios = doubleArrayOf(1100.0, 500.0, 2000.0, 1500.0)

    salarios.forEach {
        println(it)
    }
    println("---------------")
    salarios.forEachIndexed { index, valor ->
        salarios[index] = valor * 1.1
    }
    println("---------------")
    salarios.forEach {
        println(it)
    }
}