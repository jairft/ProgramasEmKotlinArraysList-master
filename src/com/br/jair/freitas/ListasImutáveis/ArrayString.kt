package com.br.jair.freitas.ListasImutáveis

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Jair"
    nomes[1] = "Caleb"
    nomes[2] = "Nicodemos"

    nomes.forEach {
        println(it)
    }
    println("---------------")
    nomes.sort()
    for (valor in nomes){
        println(valor)
    }
    println("---------------")
    val nomes2 = arrayOf("Mateus", "Anna", "Carlos", "Jair")
    nomes2.forEach {
        println(it)
    }
    println("---------------")
    nomes2.sort()
    for (valor in nomes2){
        println(valor)
    }
}