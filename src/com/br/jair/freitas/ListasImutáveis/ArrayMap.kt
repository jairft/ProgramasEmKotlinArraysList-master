package com.br.jair.freitas.ListasImutáveis

fun main() {
    val pair: Pair<String, Double> = Pair("Pedro", 2000.0)
    val map1 = mapOf(pair)

    map1.forEach { k, v -> println("Chave: $k - Valor: $v")  }

    println("~~~~~~~~~~~~~~~~~~~~~~")
    val map2 = mapOf("João" to 3500.0, "Luzia" to 2300.0)
    map2.forEach { k, v -> println("Chave: $k - Valor: $v")  }

}