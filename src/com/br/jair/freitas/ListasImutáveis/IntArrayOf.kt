package com.br.jair.freitas.ListasImutáveis

fun main() {
    val lista = intArrayOf(4, 8, 9, 2, 3, 1)

    for (valor in lista){
        println(valor)
    }
    println("-------------------")
    lista.forEach {
        println(it)
    }
    println("-------------------")
    lista.sort()
    for (valor in lista){
        println(valor)
    }
}

